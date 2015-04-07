/*
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
grammar FormulaScript;

options {
	language = Java;
}

import Formula;


/* */

// use command line option : -package kr.simula.formula.antlr



@parser::header {
	
	import kr.simula.formula.script.*;
	import kr.simula.formula.script.statement.*;
}

@parser::members {
  	
}


@lexer::header {
}




/* *************************************
 * Formula Script
 *************************************** */

formulaScript returns [Script script]
	: { $script = (Script)handler.block(ScriptTokens.SCRIPT); }
		(importStatement 	{ $script.append($importStatement.stmt); })*
		blockContents[$script]
		EOF
	  { handler.endBlock();}
	;

/* *************************************
 * import
 *************************************** */
importStatement	returns [Statement stmt]
	: 'import' qualifiedName END_OF_STMT
	;

/* *************************************
 * declare
 *************************************** */
variableDecl	returns [VariableDeclStatement stmt]
	: type IDENT 	
	{ 
		Ref varRef = handler.declare(ScriptTokens.VAR, $type.typeClz ,$IDENT.text); 
		$stmt = (VariableDeclStatement)handler.statement(ScriptTokens.VAR_DECL, varRef);
	}
	( ':=' formulaExpressionBase {	$stmt.setValueNode($formulaExpressionBase.result); })?
	END_OF_STMT
	;

type returns [Class<?> typeClz]
	: (IDENT 	{ $typeClz = handler.type($IDENT.text); })  
	| (qualifiedName { $typeClz = handler.type($qualifiedName.text); }) 
	;



blockContents [Block stmtHolder]
	: 
	(
		ifStatement				{ $stmtHolder.append($ifStatement.ifstmt); }
		| foreachStatement		{ $stmtHolder.append($foreachStatement.stmt); }
		| assignStatement		{ $stmtHolder.append($assignStatement.stmt); }
		| methodCallStatement	{ $stmtHolder.append($methodCallStatement.stmt); }
		| variableDecl 			{ $stmtHolder.append($variableDecl.stmt); }
	)*
	;
	
/* *************************************
 * statements
 *************************************** */

ifStatement returns [IfStatement ifstmt]
	: 'if' '(' logicalExpression ')' 
		{
			$ifstmt = (IfStatement)handler.statement(ScriptTokens.IF, $logicalExpression.result); 
		}
		'{'  blockContents[$ifstmt]? '}'
	( 'elseif' '(' logicalExpression ')'
		{
			IfStatement.ElseIf elseIfStmt = $ifstmt.createElseIf($logicalExpression.result);
		} 
		'{' blockContents[elseIfStmt]? '}'
	)*
	( 'else' 
		{
			IfStatement.Else elseStmt = $ifstmt.checkOutElse();
		}
		'{' blockContents[elseStmt]? '}'
		
	)?
	;

decodeStatement  returns [Statement stmt]
	: 'decode' '(' IDENT|qualifiedName ')' '{'
		(
			BOOLEAN 			//{ $result = handler.literal( ExprTokens.LIT_BOOLEAN, $BOOLEAN.text); }
			| STRING_LITERAL	//{ $result = handler.literal( ExprTokens.LIT_STRING,  strip($STRING_LITERAL.text)); }
			| NUMBER			//{ $result = handler.literal( ExprTokens.LIT_NUMBER, $NUMBER.text); }
		) ':'
	 	formulaTerm
	'}'
	;

foreachStatement returns [Statement stmt]
	: 'foreach' '(' loopCondition ')' '{'
		//block?
	'}'
	;
	
loopCondition 
	: IDENT 
	(
		( ':' var=IDENT )
		| ('=' from=NUMBER ':' to=NUMBER)
	)	
	;

methodCallStatement  returns [Statement stmt]
	: methodCallExp END_OF_STMT { $stmt = handler.statement(ScriptTokens.MTHODE_CALL, $methodCallExp.result); }
	;
	
/* *************************************
 * assign
 *************************************** */
assignStatement  returns [Statement stmt]
	: (IDENT|qualifiedName) ':=' ( formulaExpressionBase | decodeStatement )
	END_OF_STMT
	; 
 
//assignBodyExpr
//	: ':=' ( formulaExpressionBase | decodeStatement )
//	; 
	

/* *********************************************
	Lexer rules
********************************************* */
END_OF_STMT :	';' ;

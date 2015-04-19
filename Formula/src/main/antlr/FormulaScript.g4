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
	import kr.simula.formula.util.*;
}

@parser::members {
  	
}


@lexer::header {
}


/* *************************************
 * Formula Script
 *************************************** */

formulaScript returns [Module module]
	: { $module = (Module)handler.block(ScriptTokens.MODULE); }
		(importStatement 	{ $module.append($importStatement.stmt); })*
		(functionDecl 		{ $module.append($functionDecl.fnBlock); })*
		blockContents[$module]
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
 * declare variable
 *************************************** */
variableDecl	returns [VariableDeclStatement stmt]
	: type IDENT 	
	{ 
		Ref varRef = handler.declare(ScriptTokens.VAR_DECL, $type.typeClz ,$IDENT.text); 
		$stmt = (VariableDeclStatement)handler.statement(ScriptTokens.VAR_DECL, varRef);
	}
	( '<-' formulaExpressionBase {	$stmt.setValueNode($formulaExpressionBase.result); })?
	END_OF_STMT
	;

type returns [Class<?> typeClz]
	: (IDENT 	{ $typeClz = handler.type($IDENT.text); })  
	| (qualifiedName { $typeClz = handler.type($qualifiedName.text); }) 
	('[' ']' 	{ $typeClz = handler.arrayType($typeClz); })?
	;


/* *************************************
 * declare function
 *************************************** */
functionDecl	returns [BlockStatement fnBlock]
	: { List<Ref> args = new LinkedList<Ref>(); }
	type IDENT '(' (argsDecl[args] )?  ')' '{'
	{ 
		$fnBlock = handler.declareFn($type.typeClz ,$IDENT.text, args); 
	}
	(blockContents[$fnBlock])?
	(retrunStmt[$fnBlock])?
	'}'
		{	handler.endBlock(); }
	;

argsDecl [List<Ref> args]
	: 
	(
		type IDENT { $args.add( handler.declare(ScriptTokens.ARG_DECL, $type.typeClz ,$IDENT.text)); }
		(
			',' type IDENT { $args.add( handler.declare(ScriptTokens.ARG_DECL, $type.typeClz ,$IDENT.text)); }
		)*
		
	)
	;

retrunStmt	[BlockStatement fnBlock] 
	: { Node arg = null; }
		'return' ( formulaExpressionBase { arg = $formulaExpressionBase.result; } )?
	{ 
		$fnBlock.append( handler.statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
	}
	';'
	;
/* *************************************
 * load function
 *************************************** */

 
 
blockContents [Block stmtHolder]
	: 
	(
		ifStatement				{ $stmtHolder.append($ifStatement.ifstmt); }
		| foreachStatement		{ $stmtHolder.append($foreachStatement.foreachStmt); }
		| assignStatement		{ $stmtHolder.append($assignStatement.stmt); }
		| methodCallStatement	{ $stmtHolder.append($methodCallStatement.stmt); }
		| functionCallStatement	{ $stmtHolder.append($functionCallStatement.stmt); }
		| variableDecl 			{ $stmtHolder.append($variableDecl.stmt); }
	)*
	;
	
/* *************************************
 * statements
 *************************************** */

ifStatement returns [IfStatement ifstmt]
	: 'if' '(' logicalExpression ')' 
		{
			$ifstmt = (IfStatement)handler.statementBlock(ScriptTokens.IF, $logicalExpression.result); 
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
		{	handler.endBlock(); }
	;


foreachStatement returns [BlockStatement foreachStmt]
	: 'foreach' '(' loopCondition ')' 
		{
			$foreachStmt = handler.statementBlock(ScriptTokens.FOREACH, $loopCondition.condition); 
		}
		'{' blockContents[$foreachStmt]? '}'
		{	handler.endBlock(); }
	;
	
loopCondition 	returns [LoopConditionStatement condition]
	: type IDENT 
	{ 
		Ref varRef = handler.declare(ScriptTokens.VAR_DECL, $type.typeClz ,$IDENT.text); 
		$condition = (LoopConditionStatement)handler.statement(ScriptTokens.LOOP_COND_DECL, varRef);
	}
	(
		( 'in' var=IDENT 
			{
				Ref iteratorRef = handler.refer( $var.text);
				$condition.setIteratorRef(iteratorRef);
			}
		)
		| ('=' from=NUMBER ':' to=NUMBER
			{
				Range range = Range.create($from.text, $to.text);
				$condition.setRange(range);
			}
		)
	)	
	;


methodCallStatement  returns [Statement stmt]
	: methodCallExp END_OF_STMT { $stmt = handler.statement(ScriptTokens.MTHODE_CALL_STMT, $methodCallExp.result); }
	;
	
functionCallStatement  returns [Statement stmt]
	: funcCallExp END_OF_STMT { $stmt = handler.statement(ScriptTokens.FUNCTION_CALL_STMT, $funcCallExp.result); }
	;
	
	
/* *************************************
 * assign
 *************************************** */
assignStatement  returns [Statement stmt]
	: 
	(
		leftAssign 	{ $stmt = $leftAssign.stmt ; }
		| rightAssign { $stmt = $rightAssign.stmt ; }
	)
	END_OF_STMT
	; 
 
leftAssign  returns [Statement stmt]
	: { Ref settable = null; }
	(
		IDENT 			{ settable = handler.refer( $IDENT.text);}
		| qualifiedName	{ settable = $qualifiedName.result;}
	) 
	'<-' formulaExpressionBase
	{ $stmt = handler.statement(ScriptTokens.ASSIGN_STMT, settable, $formulaExpressionBase.result); }
	; 
 
rightAssign  returns [Statement stmt]
	: { Ref settable = null; }
	formulaExpressionBase 
	'->'
	(
		IDENT			{ settable = handler.refer( $IDENT.text);}
		| qualifiedName	{ settable = $qualifiedName.result;}
	)
	{ $stmt = handler.statement(ScriptTokens.ASSIGN_STMT, settable, $formulaExpressionBase.result); }
	; 
 

/* *********************************************
	Lexer rules
********************************************* */
END_OF_STMT :	';' ;

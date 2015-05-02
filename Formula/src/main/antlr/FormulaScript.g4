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
	superClass = kr.simula.formula.core.antlr.FormulaHandlerParser;
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
	: { $module = (Module)block(ScriptTokens.MODULE); }
		(importStatement )*
		(paramDef	{ $module.append($paramDef.result); })*
		blockContents[$module]
		EOF
	  { endScope();}
	;


/* *************************************
 * import
 *************************************** */
importStatement	
	: 'importJava' qualifiedName END_OF_STMT
		{ importJava($qualifiedName.result); }
	;

paramDef	returns [Statement result]
	: 'paramdef' IDENT 'as' type
	END_OF_STMT
	{ $result = statement(PARAM_DECL_STMT, declare(PARAM_DECL, $type.typeClz ,$IDENT.text) ); }
	;


/* *************************************
 * declare variable
 *************************************** */
variableDecl	returns [VariableDeclStatement stmt]
	: type IDENT  
	{ 
		Ref varRef = declare(ScriptTokens.VAR_DECL, $type.typeClz ,$IDENT.text); 
		$stmt = (VariableDeclStatement)statement(ScriptTokens.VAR_DECL, varRef);
	}
	( '<-' formulaExpressionBase {	$stmt.setValueNode($formulaExpressionBase.result); })?
	END_OF_STMT
	;
/*
mapDecl	returns [VariableDeclStatement stmt]
	: 'map' IDENT  
	{ 
		Ref varRef = declare(VAR_DECL, java.util.Map.class ,$IDENT.text); 
		$stmt = (VariableDeclStatement)statement(ScriptTokens.VAR_DECL, varRef);
	}
	( map {	$stmt.setValueNode($map.result); }  )
	END_OF_STMT
	;
*/

/* *************************************
 * declare function
 *************************************** */
functionDecl	returns [BlockStatement fnBlock]
	: 
	{ 
		List<Ref> args = new LinkedList<Ref>(); 
		beginScope();
		Class<?> typeClz = Object.class;
	}
	'fndef' IDENT 
		( ( '(' ')' ) |  ( '(' argsDecl[args] ')' ) )
		( (':' type { typeClz = $type.typeClz; } '{' ) | ( '{' )  )
		{ $fnBlock = declareFn(typeClz ,$IDENT.text, args); }
		(blockContents[$fnBlock])
		(retrunStmt[$fnBlock])?
	'}'
		{	endScope(); }
	;

argsDecl [List<Ref> args]
	: 
	(
		type IDENT { $args.add( declare(ScriptTokens.ARG_DECL, $type.typeClz ,$IDENT.text)); }
		(
			',' type IDENT { $args.add( declare(ScriptTokens.ARG_DECL, $type.typeClz ,$IDENT.text)); }
		)*
		
	)
	;

retrunStmt	[BlockStatement fnBlock] 
	: { Node arg = null; }
		'return' ( formulaExpressionBase { arg = $formulaExpressionBase.result; } )?
	{ 
		$fnBlock.append( statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
	}
	';'
	;
/*
typeDecl
	: 'typedef' typeName = IDENT '{' 
		( type fieldName = IDENT 
			( ':' ( 
				( formulaTerm {  } ) 
				| ( lambdaDecl )
				)	
			)?
		
		)
		(',' type IDENT 
			( ':' 	
				( ( formulaTerm ) | ( lambdaDecl ) )
			)?
		)* 
	'}'
	END_OF_STMT?
	;
 */


//{ settable = refer( $IDENT.text);}
// { $stmt = statement(ScriptTokens.ASSIGN_STMT, settable, $formulaTerm.result); }
//$formulaTerm.result;

blockContents [Block stmtHolder]
	: 
	(
		ifStatement				{ $stmtHolder.append($ifStatement.ifstmt); }
		| foreachStatement		{ $stmtHolder.append($foreachStatement.foreachStmt); }
		| assignStatement		{ $stmtHolder.append($assignStatement.stmt); }
		| methodCallStatement	{ $stmtHolder.append($methodCallStatement.stmt); }
		| functionCallStatement	{ $stmtHolder.append($functionCallStatement.stmt); }
		| variableDecl 			{ $stmtHolder.append($variableDecl.stmt); }
		| functionDecl 			{ $stmtHolder.append($functionDecl.fnBlock); }
		//| typeDecl
	)*
	;




/* *************************************
 * statements
 *************************************** */

ifStatement returns [IfStatement ifstmt]
	: 	
	'if' { beginScope(); } 
		'(' logicalExpression ')' 
		{
			$ifstmt = (IfStatement)statementBlock(ScriptTokens.IF, $logicalExpression.result); 
		}
		'{'  blockContents[$ifstmt] '}'
	( 'elseif' '(' logicalExpression ')'
		{
			IfStatement.ElseIf elseIfStmt = $ifstmt.createElseIf($logicalExpression.result);
		} 
		'{' blockContents[elseIfStmt] '}'
	)*
	( 'else' 
		{
			IfStatement.Else elseStmt = $ifstmt.checkOutElse();
		}
		'{' blockContents[elseStmt] '}'
		
	)?
		{	endScope(); }
	;


foreachStatement returns [BlockStatement foreachStmt]
	: 'foreach'  
		{	beginScope(); }
		'(' loopCondition  ')' 
		{
			$foreachStmt = statementBlock(ScriptTokens.FOREACH, $loopCondition.condition); 
		}
		'{' blockContents[$foreachStmt] '}'
		';'?
		{	endScope(); }
	;
	
	
loopCondition 	returns [LoopConditionStatement condition]
	: type IDENT 
	{ 
		Ref varRef = declare(ScriptTokens.VAR_DECL, $type.typeClz ,$IDENT.text); 
		$condition = (LoopConditionStatement)statement(ScriptTokens.LOOP_COND_DECL, varRef);
	}
	'in'
		(  iterableTerm 
			{
				$condition.setIteratorRef($iterableTerm.result);
			}
		)
	;



methodCallStatement  returns [Statement stmt]
	: methodCallExp END_OF_STMT { $stmt = statement(ScriptTokens.MTHODE_CALL_STMT, $methodCallExp.result); }
	;
	
functionCallStatement  returns [Statement stmt]
	: funcCallExp END_OF_STMT { $stmt = statement(ScriptTokens.FUNCTION_CALL_STMT, $funcCallExp.result); }
	;

/*
 * Override arguments
 */
arguments  returns [List<Node> nodeList]
	: { $nodeList = new LinkedList<Node>(); }
		( 
			(arg2 = operatorExpression { $nodeList.add($arg2.result); })
		)
		(',' 
			(arg2 = operatorExpression { $nodeList.add($arg2.result); })
		)*
	;


/*
 * Override formulaTerm
 */
formulaTerm returns [Node result]
	: literalTerm 			{ $result = $literalTerm.result; }
	| qualifiedName		{ $result = $qualifiedName.result; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| arrayRef			{ $result = $arrayRef.result; }
	| array 			{ $result = $array.result; }
	| map				{ $result = $map.result; }
	| recordProto			{ $result = $recordProto.result; }
	| lambdaDecl		{ $result = $lambdaDecl.lambda; }
	;


/*
	Lambda Argument
*/
lambdaDecl returns [Lambda lambda]
	: 
	{ 
		List<Ref> args = new LinkedList<Ref>(); 
		beginScope();
		Class<?> typeClz = Object.class;
	}
	'fndef' 
		( ( '(' ')' ) |  ( '(' argsDecl[args] ')' ) )
		( (':' type { typeClz = $type.typeClz; } '{' ) | ( '{' )  )
		{ $lambda = lambda( LAMBDA , args, typeClz); }
		(blockContents[$lambda])
		(retrunStmt[$lambda])?
	'}'
		{	endScope(); }
	;


recordProto 	returns [Gettable result]
	: (('R{') | ('r{')) 
		{ 
			List<?> fieldList = new LinkedList(); 
			beginScope();
		}
		recordField[fieldList]
		(',' recordField[fieldList] )* 
		{ 
			endScope();
			$result = declareProto(RECORD, fieldList); 
		}
	'}'
	;
	
recordField  [List<?> fieldList]
	: 
		( type IDENT 
			{ protoField(RECORD, fieldList, $type.typeClz, $IDENT.text, null ); }
		)
		| ( type IDENT ':' recordFieldValue 
			{ protoField(RECORD, fieldList, $type.typeClz, $IDENT.text, $recordFieldValue.result ); }
		)
	;
	
	
recordFieldValue returns [Node result]
	: literalTerm 			{ $result = $literalTerm.result; }
	| array 			{ $result = $array.result; }
	| map				{ $result = $map.result; }
	| recordProto			{ $result = $recordProto.result; }
	| lambdaDecl		{ $result = $lambdaDecl.lambda; }
	;


type returns [Class<?> typeClz]
	: (IDENT 	{ $typeClz = type($IDENT.text); })  
	| (qualifiedName { $typeClz = type($qualifiedName.text); }) 
	('[' ']' 	{ $typeClz = arrayType($typeClz); })?
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
	
	; 
 
leftAssign  returns [Statement stmt]
	: { Ref settable = null; }
	(
		IDENT 			{ settable = refer( $IDENT.text);}
		| qualifiedName	{ settable = $qualifiedName.result;}
		| arrayRef 		{ settable = $arrayRef.result;}
	) 
	'<-' formulaExpressionBase
	END_OF_STMT
	{ $stmt = statement(ScriptTokens.ASSIGN_STMT, settable, $formulaExpressionBase.result); }
	
	; 
 
rightAssign  returns [Statement stmt]
	: { Ref settable = null; }
	formulaExpressionBase 
	'->'
	(
		IDENT			{ settable = refer( $IDENT.text);}
		| qualifiedName	{ settable = $qualifiedName.result;}
		| arrayRef 		{ settable = $arrayRef.result;}
	)
	END_OF_STMT
	{ $stmt = statement(ScriptTokens.ASSIGN_STMT, settable, $formulaExpressionBase.result); }
	; 
 

/* *********************************************
	Lexer rules
********************************************* */
END_OF_STMT :	';' ;

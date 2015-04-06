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
	import kr.simula.formula.script.build.*;
}

@parser::members {
  	
}


@lexer::header {
}




/* *************************************
 * Formula Script
 *************************************** */

formulaScript
	: importStatement*
		variableDecl*
	;

block [Block stmtHolder]
	: 
	(
		ifStatement				{ $stmtHolder.append($ifStatement); }
		| foreachStatement		{ $stmtHolder.append($foreachStatement); }
		| assignStatement		{ $stmtHolder.append($assignStatement); }
		| methodCallStatement	{ $stmtHolder.append($methodCallStatement); }
	)*
	;
	
/* *************************************
 * statements
 *************************************** */

ifStatement 
	: 'if' '(' logicalExpression ')' '{'  block? '}'
	( 'elseif' '(' logicalExpression ')' '{' block? '}')*
	( 'else' '{' block? '}')?
	;

decodeStatement 
	: 'decode' '(' IDENT|qualifiedName ')' '{'
		(
			BOOLEAN 			//{ $result = handler.literal( ExprTokens.LIT_BOOLEAN, $BOOLEAN.text); }
			| STRING_LITERAL	//{ $result = handler.literal( ExprTokens.LIT_STRING,  strip($STRING_LITERAL.text)); }
			| NUMBER			//{ $result = handler.literal( ExprTokens.LIT_NUMBER, $NUMBER.text); }
		) ':'
	 	formulaTerm
	'}'
	;

foreachStatement 
	: 'foreach' '(' loopCondition ')' '{'
		block?
	'}'
	;
	
loopCondition
	: IDENT 
	(
		( ':' var=IDENT )
		| ('=' from=NUMBER ':' to=NUMBER)
	)	
	;

methodCallStatement
	: methodCallExp END_OF_STMT
	;
	
/* *************************************
 * assign
 *************************************** */
assignStatement
	: (IDENT|qualifiedName) ':=' ( formulaExpressionBase | decodeStatement )
	END_OF_STMT
	; 
 
assignBodyExpr
	: ':=' ( formulaExpressionBase | decodeStatement )
	; 
/* *************************************
 * import
 *************************************** */
importStatement
	: 'import' qualifiedName END_OF_STMT
	;

/* *************************************
 * declare
 *************************************** */
variableDecl
	: type IDENT assignBodyExpr?
	END_OF_STMT
	;

type : IDENT | qualifiedName ;



/* *********************************************
	Lexer rules
********************************************* */
END_OF_STMT :	';' ;

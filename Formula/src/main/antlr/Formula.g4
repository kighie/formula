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
grammar Formula;

options {
	language = Java;
	superClass = kr.simula.formula.core.antlr.FormulaHandlerParser;
}

// use command line option : -package kr.simula.formula.antlr

@parser::header {
//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;
	import kr.simula.formula.util.*;
}


@parser::members {
	public String strip( String text ) {
    	if( text != null && text.length() >= 2 ) {
    		text = text.substring( 1, text.length() - 1 );
    		text = text.replaceAll( "\'", "'" );
    		text = text.replaceAll( "\"", "\\\"" );
    	}
    	return text;
	}
}

/*
@rulecatch {
	
	catch (RecognitionException re) {
	    throw re;
	}  
	catch (BuildException dsle) {
		TokenStream cts = (TokenStream)input;
		dsle.setToken(cts.get(cts.index()));
	    throw dsle;
	}
}
*/

@lexer::header {
//	package kr.simula.formula.antlr;
}


tokens {
  	NEGATION
}


/* *************************************
 * Formula Expression
 *************************************** */

formulaExpression returns [Node result]
	: 
	( '=' '(' formulaExpressionBase ')' { $result = $formulaExpressionBase.result ; } )
	| ( '=' formulaExpressionBase { $result = $formulaExpressionBase.result ; } )
	;

formulaExpressionBase returns [Node result]
	: 
	(
	operatorExpression { $result = $operatorExpression.result ; }
	| funcCallExp { $result =  $funcCallExp.result ; }
	| methodCallExp { $result =  $methodCallExp.result ; }
	) 
	;

funcCallExp returns [Gettable result]
	: 
	(IDENT '(' ')'  { $result = functionCall($IDENT.text, null) ;} )
	| (IDENT '(' arguments ')'  { $result = functionCall($IDENT.text, $arguments.nodeList) ;} )
	;

methodCallExp returns [Node result]
	: 
		( qualifiedName'.' IDENT 	'(' ')'	
			{ $result = methodCall($qualifiedName.result, $IDENT.text, null) ; }
		)
		| ( qualifiedName'.' IDENT 	'(' arguments ')'	
			{ $result = methodCall($qualifiedName.result, $IDENT.text, $arguments.nodeList) ; }
		)
	;

arguments  returns [List<Node> nodeList]
	: { $nodeList = new LinkedList<Node>(); }
		(arg2 = operatorExpression { $nodeList.add($arg2.result); })
		(',' arg2 = operatorExpression { $nodeList.add($arg2.result); } )*
	;


/*
	Lambda Argument
*/
lambdaArg returns [Lambda result]
	: 
		(
			( IDENT )
			| ( '(' IDENT ( ',' IDENT )* ')')
		)
		'->'
		
	;

/*
	Condition Argument

conditionArg returns [Lambda result]
	: 
	( 
		'='  op2 = literalTerm {$result = lambda(OP_EQ, null, $op2.result); }
		|'is'  op2 = literalTerm {$result = lambda(OP_EQ, null, $op2.result); }
		|'!=' op2 = literalTerm {$result = lambda(OP_NOT_EQ, null, $op2.result); }
		|'<>' op2 = literalTerm {$result = lambda(OP_NOT_EQ, null, $op2.result); }
		|'is' 'not' op2 = literalTerm {$result = lambda(OP_NOT_EQ, null, $op2.result); }
		|'>'  op2 = literalTerm {$result = lambda(OP_GT, null, $op2.result); }
		|'>=' op2 = literalTerm {$result = lambda(OP_EQ_GT, null, $op2.result); }
		|'<'  op2 = literalTerm {$result = lambda(OP_LT, null, $op2.result); }
		|'<=' op2 = literalTerm {$result = lambda(OP_EQ_LT, null, $op2.result); }
	)
	;
*/


literalTerm  returns [Node result]
	: BOOLEAN 			{ $result = literal( LIT_BOOLEAN, $BOOLEAN.text); }
	| STRING_LITERAL	{ $result = literal( LIT_STRING,  strip($STRING_LITERAL.text)); }
	| NUMBER			{ $result = literal( LIT_NUMBER, $NUMBER.text); }
	| NULL				{ $result = literal( LIT_NULL, null); }
	| IDENT				{ $result = refer( $IDENT.text); }
	;


iterableTerm returns [Node result]
	: IDENT 			{ $result = refer( $IDENT.text); }
	| qualifiedName		{ $result = $qualifiedName.result; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| arrayRef 			{ $result = $arrayRef.result; }
	| array 			{ $result = $array.result; }
	;


formulaTerm returns [Node result]
	: literalTerm 			{ $result = $literalTerm.result; }
	| qualifiedName		{ $result = $qualifiedName.result; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| arrayRef			{ $result = $arrayRef.result; }
	| array 			{ $result = $array.result; }
	| map				{ $result = $map.result; }
	;

arrayRef   returns [Ref result]
	: qualifiedName { $result = $qualifiedName.result; }
	 ( '[' 
		(NUMBER 	{ $result = referIndexed( $result , literal( LIT_NUMBER, $NUMBER.text) ); } 
		| id2 = IDENT		{ $result = referIndexed( $result , refer( $id2.text) ); } 
		| id3 = STRING_LITERAL	{ $result = referIndexed( $result , literal( LIT_STRING, strip($id3.text)) ); } 
		)
	 ']')*
	;
	
array   returns [Gettable result]
	: '['	{ List<Node> elements = new LinkedList<Node>(); }
		( 
			( formulaTerm 		{ elements.add($formulaTerm.result); } )
			| ( from=NUMBER ':' to=NUMBER  { Range.setRange(elements, $from.text, $to.text) ; } )
		)
		(','
			( formulaTerm 		{ elements.add($formulaTerm.result); } )
			| ( from=NUMBER ':' to=NUMBER  { Range.setRange(elements, $from.text, $to.text) ; } ) 
		)* 	
	  ']'
	  {	$result = array(elements); }
	;
	
map   returns [Gettable result]
	: '{' 	{ $result = map(SIMPLE_MAP); String key;}
		(
			( ( IDENT {key = $IDENT.text; } ) | (STRING_LITERAL {key = strip($STRING_LITERAL.text); }) ) 
			':' formulaTerm	
				{ mapEntry( $result, null, key, $formulaTerm.result ); }
			(',' 
				(( IDENT {key = $IDENT.text; } ) | (STRING_LITERAL {key = strip($STRING_LITERAL.text); })) 
				 ':' formulaTerm 
				{ mapEntry( $result, null, key, $formulaTerm.result ); }
			)*
		)?
	  '}'
	;


qualifiedName returns [Ref result]
	: IDENT 	{ $result = refer( $IDENT.text); }
	('.' IDENT	{ $result = refer( $result, $IDENT.text); } )* 
	;

/* *****************************
 * Numeric Expression
 ******************************/

unary  returns [Node result]
	:  { boolean negative = false; }
		( '-' { negative = true; } )? ( 
		formulaTerm { $result = $formulaTerm.result;  }
		| '(' operatorExpression ')' { $result = $operatorExpression.result;  }
		) 
		{ 
			if(negative){
				$result = operator(OP_NUM_NEGATION, $result );
			} 
		}
	;

percent  returns [Node result]
	:	unary 	{ $result = $unary.result;  }
    	('%' {$result = operator(OP_PERCENT, $result); } )?
    ;

    
exponential returns [Node result]
    :	percent 	{ $result = $percent.result;  }
    	(
    		'^'		op2 = percent  	{$result = operator(OP_POW, $result, $op2.result); }
    	)*
    ;
    
multiplicative returns [Node result]
    :	exponential 	{ $result = $exponential.result;  }
    	(
    		'*' 		op2 = exponential 	{$result = operator(OP_MULTI, $result, $op2.result); }
    		| '/' 		op2 = exponential  	{$result = operator(OP_DIVIDE, $result, $op2.result); }
//    		| '%'		op2 = exponential  	{$result = operator(OP_MOD, $result, $op2.result); }
    	)*
    ;
    
additiveExpression returns [Node result]
    :   multiplicative { $result = $multiplicative.result;  }
    ( 
    	'+' 	op2 = multiplicative	{$result = operator(OP_PLUS, $result, $op2.result); }
    	| '-' 	op2 = multiplicative	{$result = operator(OP_MINUS, $result, $op2.result); }
    )*
    ;
    
/*
	String Expression
*/

stringExpression returns [Node result]
    :   additiveExpression { $result = $additiveExpression.result;  }
    ( 
    	'&' op2 = additiveExpression {$result = operator(OP_CONCAT, $result, $op2.result); }
    )* 
    ;
  
/*
	Logical Expression
*/
comparison returns [Node result]
	: stringExpression  { $result = $stringExpression.result;  }
	( 
		'='  op2 = stringExpression {$result = operator(OP_EQ, $result, $op2.result); }
		|'is'  op2 = stringExpression {$result = operator(OP_EQ, $result, $op2.result); }
		|'!=' op2 = stringExpression {$result = operator(OP_NOT_EQ, $result, $op2.result); }
		|'<>' op2 = stringExpression {$result = operator(OP_NOT_EQ, $result, $op2.result); }
		|'is' 'not' op2 = stringExpression {$result = operator(OP_NOT_EQ, $result, $op2.result); }
		|'>'  op2 = stringExpression {$result = operator(OP_GT, $result, $op2.result); }
		|'>=' op2 = stringExpression {$result = operator(OP_EQ_GT, $result, $op2.result); }
		|'<'  op2 = stringExpression {$result = operator(OP_LT, $result, $op2.result); }
		|'<=' op2 = stringExpression {$result = operator(OP_EQ_LT, $result, $op2.result); }
	)*
	;
	
notExpression returns [Node result]
	: 
	(
		comparison { $result = $comparison.result;  }
		| 'not' comparison {$result = operator(OP_NOT, $comparison.result); }
		
	)
	;
	
logicalExpression returns [Node result]
	: notExpression { $result = $notExpression.result;  }
	( 
		'and' 	op2 = operatorExpression {$result = operator(OP_AND, $result, $op2.result); }
		|'or' 	op2 = operatorExpression {$result = operator(OP_OR, $result, $op2.result); }
		
	)*
	;
    
operatorExpression returns [Node result]
	: logicalExpression { $result = $logicalExpression.result;  }
	;
    
    
/* *********************************************
	Lexer rules
********************************************* */
fragment DIGIT	: '0'..'9' ;

/* LATIN ALPAHBETs, $, _ and Korean charset*/
fragment LETTER
    : 	'$'
    	| 'A'..'Z' 
    	| '_' | 'a'..'z'
    	| '\uAC00'..'\uD7AF'
    	| '\u3130'..'\u318F'
//       | '\u1100'..'\u11FF'
    ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;

STRING_LITERAL
	:	( '"' ( ~('"'|'\r'|'\n') )* '"' )
		| ( '\'' ( ~('\''|'\r'|'\n') )* '\'' )
	;

NULL : ('null'|'nil'|'NULL') ;

BOOLEAN :	('true' | 'false' | 'TRUE' | 'FALSE') ;
IDENT :  LETTER (LETTER|DIGIT)* ;

WS  :  WhiteSpace -> skip; //[ \t\r\n\u000C]+ -> skip ;


MULTILINE_COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' .*? EOL -> skip
    ;

fragment WhiteSpace       
	:  ('\u0020' 
	| '\u0009' 
	| '\u000C'
	| '\u000D'  
	| '\u000A') 
	;

fragment EOL 	
	:	(	( '\r\n' ) // DOS
		|	'\r'    // OSX
		|	'\n'    // Unix 
		)
	;

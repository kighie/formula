// Generated from Formula.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, NUMBER=28, STRING_LITERAL=29, NULL=30, BOOLEAN=31, 
		IDENT=32, WS=33, MULTILINE_COMMENT=34, LINE_COMMENT=35, NEGATION=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'{'", "'}'", "'='", "'^'", "'<='", "'&'", 
		"'('", "'is'", "'*'", "','", "'.'", "':'", "'['", "'>='", "'<'", "']'", 
		"'>'", "'or'", "'<>'", "'%'", "')'", "'and'", "'+'", "'not'", "'-'", "NUMBER", 
		"STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_conditionArg = 5, RULE_literalTerm = 6, 
		RULE_iterableTerm = 7, RULE_formulaTerm = 8, RULE_arrayRef = 9, RULE_array = 10, 
		RULE_map = 11, RULE_qualifiedName = 12, RULE_unary = 13, RULE_percent = 14, 
		RULE_exponential = 15, RULE_multiplicative = 16, RULE_additiveExpression = 17, 
		RULE_stringExpression = 18, RULE_comparison = 19, RULE_notExpression = 20, 
		RULE_logicalExpression = 21, RULE_operatorExpression = 22;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "conditionArg", "literalTerm", "iterableTerm", "formulaTerm", 
		"arrayRef", "array", "map", "qualifiedName", "unary", "percent", "exponential", 
		"multiplicative", "additiveExpression", "stringExpression", "comparison", 
		"notExpression", "logicalExpression", "operatorExpression"
	};

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  	private FormulaHandler handler;
	  	
	  	public void setHandler(FormulaHandler formulaHandler){
	  		this.handler = formulaHandler;
	  	}
	  	

		public String strip( String text ) {
	    	if( text != null && text.length() >= 3 ) {
	    		text = text.substring( 1, text.length() - 1 );
	    		text = text.replaceAll( "\'", "'" );
	    		text = text.replaceAll( "\"", "\\\"" );
	    	}
	    	return text;
		}

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaExpressionContext extends ParserRuleContext {
		public Node result;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public FormulaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaExpression(this);
		}
	}

	public final FormulaExpressionContext formulaExpression() throws RecognitionException {
		FormulaExpressionContext _localctx = new FormulaExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formulaExpression);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(46); match(T__22);
				setState(47); match(T__18);
				setState(48); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(49); match(T__4);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(52); match(T__22);
				setState(53); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaExpressionBaseContext extends ParserRuleContext {
		public Node result;
		public OperatorExpressionContext operatorExpression;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public FormulaExpressionBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaExpressionBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaExpressionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaExpressionBase(this);
		}
	}

	public final FormulaExpressionBaseContext formulaExpressionBase() throws RecognitionException {
		FormulaExpressionBaseContext _localctx = new FormulaExpressionBaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(61); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(64); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).methodCallExp.result ; 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallExpContext extends ParserRuleContext {
		public Gettable result;
		public Token IDENT;
		public ArgumentsContext arguments;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public FuncCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFuncCallExp(this);
		}
	}

	public final FuncCallExpContext funcCallExp() throws RecognitionException {
		FuncCallExpContext _localctx = new FuncCallExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(70); match(T__18);
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(71); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(74); match(T__4);
			 ((FuncCallExpContext)_localctx).result =  handler.functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), ((FuncCallExpContext)_localctx).arguments.nodeList) ;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallExpContext extends ParserRuleContext {
		public Node result;
		public QualifiedNameContext qualifiedName;
		public Token IDENT;
		public ArgumentsContext arguments;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public MethodCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodCallExp(this);
		}
	}

	public final MethodCallExpContext methodCallExp() throws RecognitionException {
		MethodCallExpContext _localctx = new MethodCallExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(79); match(T__14);
			setState(80); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(82); match(T__18);
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(86); match(T__4);
			 ((MethodCallExpContext)_localctx).result =  handler.methodCall(parent, methodName, ((MethodCallExpContext)_localctx).arguments.nodeList) ; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Node> nodeList;
		public OperatorExpressionContext operatorExpression;
		public OperatorExpressionContext arg2;
		public ConditionArgContext arg3;
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public ConditionArgContext conditionArg(int i) {
			return getRuleContext(ConditionArgContext.class,i);
		}
		public List<ConditionArgContext> conditionArg() {
			return getRuleContexts(ConditionArgContext.class);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).nodeList =  new LinkedList<Node>(); 
			setState(104);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__18) | (1L << T__12) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(90); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__15) | (1L << T__11) | (1L << T__10) | (1L << T__8) | (1L << T__6))) != 0)) {
					{
					setState(99);
					switch (_input.LA(1)) {
					case T__15:
						{
						setState(92); match(T__15);
						{
						setState(93); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__25:
					case T__22:
					case T__20:
					case T__17:
					case T__11:
					case T__10:
					case T__8:
					case T__6:
						{
						{
						setState(96); ((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionArgContext extends ParserRuleContext {
		public Lambda result;
		public LiteralTermContext op2;
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public ConditionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterConditionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitConditionArg(this);
		}
	}

	public final ConditionArgContext conditionArg() throws RecognitionException {
		ConditionArgContext _localctx = new ConditionArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(106); match(T__22);
				setState(107); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(110); match(T__17);
				setState(111); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(114); match(T__25);
				setState(115); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(118); match(T__6);
				setState(119); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(122); match(T__17);
				setState(123); match(T__1);
				setState(124); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(127); match(T__8);
				setState(128); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(131); match(T__11);
				setState(132); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(135); match(T__10);
				setState(136); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(139); match(T__20);
				setState(140); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTermContext extends ParserRuleContext {
		public Node result;
		public Token BOOLEAN;
		public Token STRING_LITERAL;
		public Token NUMBER;
		public Token IDENT;
		public TerminalNode NULL() { return getToken(FormulaParser.NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FormulaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public LiteralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLiteralTerm(this);
		}
	}

	public final LiteralTermContext literalTerm() throws RecognitionException {
		LiteralTermContext _localctx = new LiteralTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literalTerm);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(151); match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(153); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
				 ((LiteralTermContext)_localctx).result =  handler.refer( (((LiteralTermContext)_localctx).IDENT!=null?((LiteralTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterableTermContext extends ParserRuleContext {
		public Node result;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayContext array;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IterableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterIterableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitIterableTerm(this);
		}
	}

	public final IterableTermContext iterableTerm() throws RecognitionException {
		IterableTermContext _localctx = new IterableTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iterableTerm);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  handler.refer( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168); ((IterableTermContext)_localctx).array = array();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).array.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaTermContext extends ParserRuleContext {
		public Node result;
		public LiteralTermContext literalTerm;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayRefContext arrayRef;
		public ArrayContext array;
		public MapContext map;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FormulaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formulaTerm);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191); ((FormulaTermContext)_localctx).map = map();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).map.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayRefContext extends ParserRuleContext {
		public Ref result;
		public Token IDENT;
		public Token NUMBER;
		public Token id2;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(197); match(T__12);
			setState(202);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(198); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.literal( ExprTokens.LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(200); ((ArrayRefContext)_localctx).id2 = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public Gettable result;
		public FormulaTermContext formulaTerm;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(T__12);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(208); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
			 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(210); match(T__15);
				setState(211); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				((ArrayContext)_localctx).result =  handler.array(elements); 
			setState(220); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public Gettable result;
		public Token IDENT;
		public FormulaTermContext formulaTerm;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(T__24);
			 ((MapContext)_localctx).result =  handler.map(ExprTokens.SIMPLE_MAP);
			setState(224); ((MapContext)_localctx).IDENT = match(IDENT);
			setState(225); match(T__13);
			setState(226); ((MapContext)_localctx).formulaTerm = formulaTerm();
			 handler.mapEntry( _localctx.result, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ); 
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(228); match(T__15);
				setState(229); ((MapContext)_localctx).IDENT = match(IDENT);
				setState(230); match(T__13);
				setState(231); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 handler.mapEntry( _localctx.result, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ); 
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public Ref result;
		public Token IDENT;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243); match(T__14);
					setState(244); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public Node result;
		public FormulaTermContext formulaTerm;
		public OperatorExpressionContext operatorExpression;
		public FormulaTermContext formulaTerm() {
			return getRuleContext(FormulaTermContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(254);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(252); match(T__0);
				 negative = true; 
				}
			}

			setState(264);
			switch (_input.LA(1)) {
			case T__24:
			case T__12:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(256); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__18:
				{
				setState(259); match(T__18);
				setState(260); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(261); match(T__4);
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).operatorExpression.result;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 
						if(negative){
							((UnaryContext)_localctx).result =  handler.operator(ExprTokens.OP_NUM_NEGATION, _localctx.result );
						} 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentContext extends ParserRuleContext {
		public Node result;
		public UnaryContext unary;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(272);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(270); match(T__5);
				((PercentContext)_localctx).result =  handler.operator(ExprTokens.OP_PERCENT, _localctx.result); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialContext extends ParserRuleContext {
		public Node result;
		public PercentContext percent;
		public PercentContext op2;
		public List<PercentContext> percent() {
			return getRuleContexts(PercentContext.class);
		}
		public PercentContext percent(int i) {
			return getRuleContext(PercentContext.class,i);
		}
		public ExponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(276); match(T__21);
				setState(277); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeContext extends ParserRuleContext {
		public Node result;
		public ExponentialContext exponential;
		public ExponentialContext op2;
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
		}
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__16) {
				{
				setState(295);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(287); match(T__16);
					setState(288); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__26:
					{
					setState(291); match(T__26);
					setState(292); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Node result;
		public MultiplicativeContext multiplicative;
		public MultiplicativeContext op2;
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				setState(310);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(302); match(T__2);
					setState(303); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__0:
					{
					setState(306); match(T__0);
					setState(307); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public Node result;
		public AdditiveExpressionContext additiveExpression;
		public AdditiveExpressionContext op2;
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(317); match(T__19);
				setState(318); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Node result;
		public StringExpressionContext stringExpression;
		public StringExpressionContext op2;
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(365);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(328); match(T__22);
						setState(329); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(332); match(T__17);
						setState(333); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(336); match(T__25);
						setState(337); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(340); match(T__6);
						setState(341); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(344); match(T__17);
						setState(345); match(T__1);
						setState(346); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(349); match(T__8);
						setState(350); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(353); match(T__11);
						setState(354); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(357); match(T__10);
						setState(358); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(361); match(T__20);
						setState(362); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public Node result;
		public ComparisonContext comparison;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			switch (_input.LA(1)) {
			case T__24:
			case T__18:
			case T__12:
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(370); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__1:
				{
				setState(373); match(T__1);
				setState(374); ((NotExpressionContext)_localctx).comparison = comparison();
				((NotExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT, ((NotExpressionContext)_localctx).comparison.result); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public Node result;
		public NotExpressionContext notExpression;
		public OperatorExpressionContext op2;
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(389);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(381); match(T__3);
						setState(382); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__7:
						{
						setState(385); match(T__7);
						setState(386); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorExpressionContext extends ParserRuleContext {
		public Node result;
		public LogicalExpressionContext logicalExpression;
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitOperatorExpression(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
			 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3F\n\3\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5W\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6f\n\6\f\6\16\6i\13\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ed\n\r\f\r\16\r\u00f0\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00f9\n\16\f\16\16\16\u00fc\13"+
		"\16\3\17\3\17\3\17\5\17\u0101\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u010b\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0113\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u011b\n\21\f\21\16\21\u011e\13\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u012a\n\22\f\22"+
		"\16\22\u012d\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u0139\n\23\f\23\16\23\u013c\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0144\n\24\f\24\16\24\u0147\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0170\n\25\f\25\16\25\u0173\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u017c\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0188\n\27\f\27\16\27\u018b\13\27\3\30"+
		"\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\2\2\u01af\2:\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bO\3\2\2\2\n[\3\2\2\2\f\u0091"+
		"\3\2\2\2\16\u009d\3\2\2\2\20\u00ad\3\2\2\2\22\u00c4\3\2\2\2\24\u00c6\3"+
		"\2\2\2\26\u00d0\3\2\2\2\30\u00e0\3\2\2\2\32\u00f3\3\2\2\2\34\u00fd\3\2"+
		"\2\2\36\u010e\3\2\2\2 \u0114\3\2\2\2\"\u011f\3\2\2\2$\u012e\3\2\2\2&\u013d"+
		"\3\2\2\2(\u0148\3\2\2\2*\u017b\3\2\2\2,\u017d\3\2\2\2.\u018c\3\2\2\2\60"+
		"\61\7\7\2\2\61\62\7\13\2\2\62\63\5\4\3\2\63\64\7\31\2\2\64\65\b\2\1\2"+
		"\65;\3\2\2\2\66\67\7\7\2\2\678\5\4\3\289\b\2\1\29;\3\2\2\2:\60\3\2\2\2"+
		":\66\3\2\2\2;\3\3\2\2\2<=\5.\30\2=>\b\3\1\2>F\3\2\2\2?@\5\6\4\2@A\b\3"+
		"\1\2AF\3\2\2\2BC\5\b\5\2CD\b\3\1\2DF\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2"+
		"\2\2F\5\3\2\2\2GH\7\"\2\2HJ\7\13\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KL\3"+
		"\2\2\2LM\7\31\2\2MN\b\4\1\2N\7\3\2\2\2OP\5\32\16\2PQ\b\5\1\2QR\7\17\2"+
		"\2RS\7\"\2\2ST\b\5\1\2TV\7\13\2\2UW\5\n\6\2VU\3\2\2\2VW\3\2\2\2WX\3\2"+
		"\2\2XY\7\31\2\2YZ\b\5\1\2Z\t\3\2\2\2[j\b\6\1\2\\]\5.\30\2]g\b\6\1\2^_"+
		"\7\16\2\2_`\5.\30\2`a\b\6\1\2af\3\2\2\2bc\5\f\7\2cd\b\6\1\2df\3\2\2\2"+
		"e^\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"j\\\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lm\7\7\2\2mn\5\16\b\2no\b\7\1\2o\u0092"+
		"\3\2\2\2pq\7\f\2\2qr\5\16\b\2rs\b\7\1\2s\u0092\3\2\2\2tu\7\4\2\2uv\5\16"+
		"\b\2vw\b\7\1\2w\u0092\3\2\2\2xy\7\27\2\2yz\5\16\b\2z{\b\7\1\2{\u0092\3"+
		"\2\2\2|}\7\f\2\2}~\7\34\2\2~\177\5\16\b\2\177\u0080\b\7\1\2\u0080\u0092"+
		"\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083\5\16\b\2\u0083\u0084\b\7\1\2"+
		"\u0084\u0092\3\2\2\2\u0085\u0086\7\22\2\2\u0086\u0087\5\16\b\2\u0087\u0088"+
		"\b\7\1\2\u0088\u0092\3\2\2\2\u0089\u008a\7\23\2\2\u008a\u008b\5\16\b\2"+
		"\u008b\u008c\b\7\1\2\u008c\u0092\3\2\2\2\u008d\u008e\7\t\2\2\u008e\u008f"+
		"\5\16\b\2\u008f\u0090\b\7\1\2\u0090\u0092\3\2\2\2\u0091l\3\2\2\2\u0091"+
		"p\3\2\2\2\u0091t\3\2\2\2\u0091x\3\2\2\2\u0091|\3\2\2\2\u0091\u0081\3\2"+
		"\2\2\u0091\u0085\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008d\3\2\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0094\7!\2\2\u0094\u009e\b\b\1\2\u0095\u0096\7\37\2\2"+
		"\u0096\u009e\b\b\1\2\u0097\u0098\7\36\2\2\u0098\u009e\b\b\1\2\u0099\u009a"+
		"\7 \2\2\u009a\u009e\b\b\1\2\u009b\u009c\7\"\2\2\u009c\u009e\b\b\1\2\u009d"+
		"\u0093\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00ae"+
		"\b\t\1\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\b\t\1\2\u00a3\u00ae\3\2\2\2"+
		"\u00a4\u00a5\5\6\4\2\u00a5\u00a6\b\t\1\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8"+
		"\5\b\5\2\u00a8\u00a9\b\t\1\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\5\26\f\2"+
		"\u00ab\u00ac\b\t\1\2\u00ac\u00ae\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a1"+
		"\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\b\n\1\2\u00b1\u00c5\3\2\2"+
		"\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\b\n\1\2\u00b4\u00c5\3\2\2\2\u00b5"+
		"\u00b6\5\6\4\2\u00b6\u00b7\b\n\1\2\u00b7\u00c5\3\2\2\2\u00b8\u00b9\5\b"+
		"\5\2\u00b9\u00ba\b\n\1\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\5\24\13\2\u00bc"+
		"\u00bd\b\n\1\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\b"+
		"\n\1\2\u00c0\u00c5\3\2\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\b\n\1\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4\u00b5\3\2"+
		"\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00cc\7\21\2"+
		"\2\u00c8\u00c9\7\36\2\2\u00c9\u00cd\b\13\1\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"\u00cd\b\13\1\2\u00cc\u00c8\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\7\24\2\2\u00cf\25\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1"+
		"\u00d2\b\f\1\2\u00d2\u00d3\5\22\n\2\u00d3\u00da\b\f\1\2\u00d4\u00d5\7"+
		"\16\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\b\f\1\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\f\1\2\u00de"+
		"\u00df\7\24\2\2\u00df\27\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\b\r\1"+
		"\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5\5\22\n\2\u00e5"+
		"\u00ee\b\r\1\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7"+
		"\20\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\b\r\1\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e6\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2"+
		"\31\3\2\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00fa\b\16\1\2\u00f5\u00f6\7\17"+
		"\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f9\b\16\1\2\u00f8\u00f5\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\33\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\b\17\1\2\u00fe\u00ff\7\35\2\2\u00ff"+
		"\u0101\b\17\1\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010a\3"+
		"\2\2\2\u0102\u0103\5\22\n\2\u0103\u0104\b\17\1\2\u0104\u010b\3\2\2\2\u0105"+
		"\u0106\7\13\2\2\u0106\u0107\5.\30\2\u0107\u0108\7\31\2\2\u0108\u0109\b"+
		"\17\1\2\u0109\u010b\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0105\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\17\1\2\u010d\35\3\2\2\2\u010e\u010f\5\34"+
		"\17\2\u010f\u0112\b\20\1\2\u0110\u0111\7\30\2\2\u0111\u0113\b\20\1\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114\u0115\5\36\20"+
		"\2\u0115\u011c\b\21\1\2\u0116\u0117\7\b\2\2\u0117\u0118\5\36\20\2\u0118"+
		"\u0119\b\21\1\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011b\u011e\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d!\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0120\5 \21\2\u0120\u012b\b\22\1\2\u0121\u0122\7\r\2\2"+
		"\u0122\u0123\5 \21\2\u0123\u0124\b\22\1\2\u0124\u012a\3\2\2\2\u0125\u0126"+
		"\7\3\2\2\u0126\u0127\5 \21\2\u0127\u0128\b\22\1\2\u0128\u012a\3\2\2\2"+
		"\u0129\u0121\3\2\2\2\u0129\u0125\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c#\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\5\"\22\2\u012f\u013a\b\23\1\2\u0130\u0131\7\33\2\2\u0131\u0132"+
		"\5\"\22\2\u0132\u0133\b\23\1\2\u0133\u0139\3\2\2\2\u0134\u0135\7\35\2"+
		"\2\u0135\u0136\5\"\22\2\u0136\u0137\b\23\1\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0130\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b%\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\5$\23\2\u013e\u0145\b\24\1\2\u013f\u0140\7\n\2\2\u0140\u0141\5$\23\2"+
		"\u0141\u0142\b\24\1\2\u0142\u0144\3\2\2\2\u0143\u013f\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\'\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\5&\24\2\u0149\u0171\b\25\1\2\u014a\u014b\7"+
		"\7\2\2\u014b\u014c\5&\24\2\u014c\u014d\b\25\1\2\u014d\u0170\3\2\2\2\u014e"+
		"\u014f\7\f\2\2\u014f\u0150\5&\24\2\u0150\u0151\b\25\1\2\u0151\u0170\3"+
		"\2\2\2\u0152\u0153\7\4\2\2\u0153\u0154\5&\24\2\u0154\u0155\b\25\1\2\u0155"+
		"\u0170\3\2\2\2\u0156\u0157\7\27\2\2\u0157\u0158\5&\24\2\u0158\u0159\b"+
		"\25\1\2\u0159\u0170\3\2\2\2\u015a\u015b\7\f\2\2\u015b\u015c\7\34\2\2\u015c"+
		"\u015d\5&\24\2\u015d\u015e\b\25\1\2\u015e\u0170\3\2\2\2\u015f\u0160\7"+
		"\25\2\2\u0160\u0161\5&\24\2\u0161\u0162\b\25\1\2\u0162\u0170\3\2\2\2\u0163"+
		"\u0164\7\22\2\2\u0164\u0165\5&\24\2\u0165\u0166\b\25\1\2\u0166\u0170\3"+
		"\2\2\2\u0167\u0168\7\23\2\2\u0168\u0169\5&\24\2\u0169\u016a\b\25\1\2\u016a"+
		"\u0170\3\2\2\2\u016b\u016c\7\t\2\2\u016c\u016d\5&\24\2\u016d\u016e\b\25"+
		"\1\2\u016e\u0170\3\2\2\2\u016f\u014a\3\2\2\2\u016f\u014e\3\2\2\2\u016f"+
		"\u0152\3\2\2\2\u016f\u0156\3\2\2\2\u016f\u015a\3\2\2\2\u016f\u015f\3\2"+
		"\2\2\u016f\u0163\3\2\2\2\u016f\u0167\3\2\2\2\u016f\u016b\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172)\3\2\2\2"+
		"\u0173\u0171\3\2\2\2\u0174\u0175\5(\25\2\u0175\u0176\b\26\1\2\u0176\u017c"+
		"\3\2\2\2\u0177\u0178\7\34\2\2\u0178\u0179\5(\25\2\u0179\u017a\b\26\1\2"+
		"\u017a\u017c\3\2\2\2\u017b\u0174\3\2\2\2\u017b\u0177\3\2\2\2\u017c+\3"+
		"\2\2\2\u017d\u017e\5*\26\2\u017e\u0189\b\27\1\2\u017f\u0180\7\32\2\2\u0180"+
		"\u0181\5.\30\2\u0181\u0182\b\27\1\2\u0182\u0188\3\2\2\2\u0183\u0184\7"+
		"\26\2\2\u0184\u0185\5.\30\2\u0185\u0186\b\27\1\2\u0186\u0188\3\2\2\2\u0187"+
		"\u017f\3\2\2\2\u0187\u0183\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a-\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d"+
		"\5,\27\2\u018d\u018e\b\30\1\2\u018e/\3\2\2\2\37:EJVegj\u0091\u009d\u00ad"+
		"\u00c4\u00cc\u00da\u00ee\u00fa\u0100\u010a\u0112\u011c\u0129\u012b\u0138"+
		"\u013a\u0145\u016f\u0171\u017b\u0187\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
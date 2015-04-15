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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		NUMBER=25, STRING_LITERAL=26, NULL=27, BOOLEAN=28, IDENT=29, WS=30, MULTILINE_COMMENT=31, 
		LINE_COMMENT=32, NEGATION=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'['", "'>='", "'<'", "']'", "'='", "'^'", 
		"'>'", "'or'", "'<='", "'<>'", "'%'", "'&'", "'('", "'is'", "')'", "'and'", 
		"'*'", "'+'", "'not'", "','", "'-'", "'.'", "NUMBER", "STRING_LITERAL", 
		"NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", 
		"NEGATION"
	};
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_conditionArg = 5, RULE_literalTerm = 6, 
		RULE_formulaTerm = 7, RULE_arrayRef = 8, RULE_arrayDecl = 9, RULE_qualifiedName = 10, 
		RULE_unary = 11, RULE_percent = 12, RULE_exponential = 13, RULE_multiplicative = 14, 
		RULE_additiveExpression = 15, RULE_stringExpression = 16, RULE_comparison = 17, 
		RULE_notExpression = 18, RULE_logicalExpression = 19, RULE_operatorExpression = 20;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "conditionArg", "literalTerm", "formulaTerm", "arrayRef", 
		"arrayDecl", "qualifiedName", "unary", "percent", "exponential", "multiplicative", 
		"additiveExpression", "stringExpression", "comparison", "notExpression", 
		"logicalExpression", "operatorExpression"
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
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(42); match(T__17);
				setState(43); match(T__9);
				setState(44); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(45); match(T__7);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(48); match(T__17);
				setState(49); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(54); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(57); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(60); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
			setState(65); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(66); match(T__9);
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(70); match(T__7);
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
			setState(73); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(75); match(T__0);
			setState(76); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(78); match(T__9);
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(82); match(T__7);
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
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__3) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(86); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__8) | (1L << T__2))) != 0)) {
					{
					setState(95);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(88); match(T__2);
						{
						setState(89); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__22:
					case T__20:
					case T__19:
					case T__17:
					case T__15:
					case T__13:
					case T__12:
					case T__8:
						{
						{
						setState(92); ((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(99);
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
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(102); match(T__17);
				setState(103); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(106); match(T__8);
				setState(107); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(110); match(T__22);
				setState(111); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(114); match(T__12);
				setState(115); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(118); match(T__8);
				setState(119); match(T__3);
				setState(120); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(123); match(T__15);
				setState(124); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(127); match(T__20);
				setState(128); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(131); match(T__19);
				setState(132); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(135); match(T__13);
				setState(136); ((ConditionArgContext)_localctx).op2 = literalTerm();
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
			setState(151);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(149); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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

	public static class FormulaTermContext extends ParserRuleContext {
		public Node result;
		public LiteralTermContext literalTerm;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
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
		enterRule(_localctx, 14, RULE_formulaTerm);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
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
		enterRule(_localctx, 16, RULE_arrayRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(IDENT);
			setState(168); match(T__21);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(170); match(T__18);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public List<LiteralTermContext> literalTerm() {
			return getRuleContexts(LiteralTermContext.class);
		}
		public LiteralTermContext literalTerm(int i) {
			return getRuleContext(LiteralTermContext.class,i);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArrayDecl(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(T__21);
			setState(173); literalTerm();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(174); match(T__2);
				setState(175); literalTerm();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181); match(T__18);
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
		enterRule(_localctx, 20, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185); match(T__0);
					setState(186); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 22, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(196);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(194); match(T__1);
				 negative = true; 
				}
			}

			setState(206);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(198); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__9:
				{
				setState(201); match(T__9);
				setState(202); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(203); match(T__7);
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
		enterRule(_localctx, 24, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(214);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(212); match(T__11);
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
		enterRule(_localctx, 26, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(218); match(T__16);
				setState(219); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(226);
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
		enterRule(_localctx, 28, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__5) {
				{
				setState(237);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(229); match(T__5);
					setState(230); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__23:
					{
					setState(233); match(T__23);
					setState(234); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(241);
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
		enterRule(_localctx, 30, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__1) {
				{
				setState(252);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(244); match(T__4);
					setState(245); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(248); match(T__1);
					setState(249); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(256);
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
		enterRule(_localctx, 32, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(259); match(T__10);
				setState(260); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(267);
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
		enterRule(_localctx, 34, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(307);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(270); match(T__17);
						setState(271); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(274); match(T__8);
						setState(275); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(278); match(T__22);
						setState(279); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(282); match(T__12);
						setState(283); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(286); match(T__8);
						setState(287); match(T__3);
						setState(288); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(291); match(T__15);
						setState(292); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(295); match(T__20);
						setState(296); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(299); match(T__19);
						setState(300); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(303); match(T__13);
						setState(304); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 36, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			switch (_input.LA(1)) {
			case T__9:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(312); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__3:
				{
				setState(315); match(T__3);
				setState(316); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 38, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(331);
					switch (_input.LA(1)) {
					case T__6:
						{
						setState(323); match(T__6);
						setState(324); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__14:
						{
						setState(327); match(T__14);
						setState(328); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(335);
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
		enterRule(_localctx, 40, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4"+
		"\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13"+
		"\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00b3\n\13\f\13"+
		"\16\13\u00b6\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00bf\n\f\f\f\16"+
		"\f\u00c2\13\f\3\r\3\r\3\r\5\r\u00c7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00d1\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00e1\n\17\f\17\16\17\u00e4\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ff\n"+
		"\21\f\21\16\21\u0102\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010a\n"+
		"\22\f\22\16\22\u010d\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u0136\n\23\f\23\16\23\u0139\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0142\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u014e\n\25\f\25\16\25\u0151\13\25\3\26\3\26\3\26\3\26"+
		"\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\33\33\37"+
		"\37\u016e\2\66\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bK\3\2\2\2\nW\3\2\2\2\f\u008d"+
		"\3\2\2\2\16\u0099\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9\3\2\2\2\24\u00ae\3"+
		"\2\2\2\26\u00b9\3\2\2\2\30\u00c3\3\2\2\2\32\u00d4\3\2\2\2\34\u00da\3\2"+
		"\2\2\36\u00e5\3\2\2\2 \u00f4\3\2\2\2\"\u0103\3\2\2\2$\u010e\3\2\2\2&\u0141"+
		"\3\2\2\2(\u0143\3\2\2\2*\u0152\3\2\2\2,-\7\t\2\2-.\7\21\2\2./\5\4\3\2"+
		"/\60\7\23\2\2\60\61\b\2\1\2\61\67\3\2\2\2\62\63\7\t\2\2\63\64\5\4\3\2"+
		"\64\65\b\2\1\2\65\67\3\2\2\2\66,\3\2\2\2\66\62\3\2\2\2\67\3\3\2\2\289"+
		"\5*\26\29:\b\3\1\2:B\3\2\2\2;<\5\6\4\2<=\b\3\1\2=B\3\2\2\2>?\5\b\5\2?"+
		"@\b\3\1\2@B\3\2\2\2A8\3\2\2\2A;\3\2\2\2A>\3\2\2\2B\5\3\2\2\2CD\7\37\2"+
		"\2DF\7\21\2\2EG\5\n\6\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\23\2\2IJ\b\4"+
		"\1\2J\7\3\2\2\2KL\5\26\f\2LM\b\5\1\2MN\7\32\2\2NO\7\37\2\2OP\b\5\1\2P"+
		"R\7\21\2\2QS\5\n\6\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\23\2\2UV\b\5\1"+
		"\2V\t\3\2\2\2Wf\b\6\1\2XY\5*\26\2Yc\b\6\1\2Z[\7\30\2\2[\\\5*\26\2\\]\b"+
		"\6\1\2]b\3\2\2\2^_\5\f\7\2_`\b\6\1\2`b\3\2\2\2aZ\3\2\2\2a^\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fX\3\2\2\2fg\3\2\2\2g\13"+
		"\3\2\2\2hi\7\t\2\2ij\5\16\b\2jk\b\7\1\2k\u008e\3\2\2\2lm\7\22\2\2mn\5"+
		"\16\b\2no\b\7\1\2o\u008e\3\2\2\2pq\7\4\2\2qr\5\16\b\2rs\b\7\1\2s\u008e"+
		"\3\2\2\2tu\7\16\2\2uv\5\16\b\2vw\b\7\1\2w\u008e\3\2\2\2xy\7\22\2\2yz\7"+
		"\27\2\2z{\5\16\b\2{|\b\7\1\2|\u008e\3\2\2\2}~\7\13\2\2~\177\5\16\b\2\177"+
		"\u0080\b\7\1\2\u0080\u008e\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0083\5\16"+
		"\b\2\u0083\u0084\b\7\1\2\u0084\u008e\3\2\2\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0087\5\16\b\2\u0087\u0088\b\7\1\2\u0088\u008e\3\2\2\2\u0089\u008a\7"+
		"\r\2\2\u008a\u008b\5\16\b\2\u008b\u008c\b\7\1\2\u008c\u008e\3\2\2\2\u008d"+
		"h\3\2\2\2\u008dl\3\2\2\2\u008dp\3\2\2\2\u008dt\3\2\2\2\u008dx\3\2\2\2"+
		"\u008d}\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008e\r\3\2\2\2\u008f\u0090\7\36\2\2\u0090\u009a\b\b\1\2\u0091"+
		"\u0092\7\34\2\2\u0092\u009a\b\b\1\2\u0093\u0094\7\33\2\2\u0094\u009a\b"+
		"\b\1\2\u0095\u0096\7\35\2\2\u0096\u009a\b\b\1\2\u0097\u0098\7\37\2\2\u0098"+
		"\u009a\b\b\1\2\u0099\u008f\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0093\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c"+
		"\5\16\b\2\u009c\u009d\b\t\1\2\u009d\u00a8\3\2\2\2\u009e\u009f\5\26\f\2"+
		"\u009f\u00a0\b\t\1\2\u00a0\u00a8\3\2\2\2\u00a1\u00a2\5\6\4\2\u00a2\u00a3"+
		"\b\t\1\2\u00a3\u00a8\3\2\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\b\t\1\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2"+
		"\2\2\u00a7\u00a4\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab"+
		"\7\5\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ad\7\b\2\2\u00ad\23\3\2\2\2\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b4\5\16\b\2\u00b0\u00b1\7\30\2\2\u00b1\u00b3\5"+
		"\16\b\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\b"+
		"\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00c0\b\f\1\2\u00bb\u00bc"+
		"\7\32\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00bf\b\f\1\2\u00be\u00bb\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\b\r\1\2\u00c4\u00c5\7\31\2\2"+
		"\u00c5\u00c7\b\r\1\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00d0"+
		"\3\2\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\b\r\1\2\u00ca\u00d1\3\2\2\2"+
		"\u00cb\u00cc\7\21\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\7\23\2\2\u00ce\u00cf"+
		"\b\r\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b\r\1\2\u00d3\31\3\2\2\2\u00d4\u00d5\5\30\r"+
		"\2\u00d5\u00d8\b\16\1\2\u00d6\u00d7\7\17\2\2\u00d7\u00d9\b\16\1\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00db\5\32\16"+
		"\2\u00db\u00e2\b\17\1\2\u00dc\u00dd\7\n\2\2\u00dd\u00de\5\32\16\2\u00de"+
		"\u00df\b\17\1\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\35\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00f1\b\20\1\2\u00e7\u00e8"+
		"\7\25\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00ea\b\20\1\2\u00ea\u00f0\3\2\2"+
		"\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed\5\34\17\2\u00ed\u00ee\b\20\1\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\5\36\20\2\u00f5\u0100\b\21\1\2\u00f6\u00f7\7\26\2"+
		"\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\b\21\1\2\u00f9\u00ff\3\2\2\2\u00fa"+
		"\u00fb\7\31\2\2\u00fb\u00fc\5\36\20\2\u00fc\u00fd\b\21\1\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101!\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0104\5 \21\2\u0104\u010b\b\22\1\2\u0105\u0106\7\20\2\2\u0106\u0107"+
		"\5 \21\2\u0107\u0108\b\22\1\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2\2"+
		"\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c#\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5\"\22\2\u010f\u0137\b\23\1\2\u0110"+
		"\u0111\7\t\2\2\u0111\u0112\5\"\22\2\u0112\u0113\b\23\1\2\u0113\u0136\3"+
		"\2\2\2\u0114\u0115\7\22\2\2\u0115\u0116\5\"\22\2\u0116\u0117\b\23\1\2"+
		"\u0117\u0136\3\2\2\2\u0118\u0119\7\4\2\2\u0119\u011a\5\"\22\2\u011a\u011b"+
		"\b\23\1\2\u011b\u0136\3\2\2\2\u011c\u011d\7\16\2\2\u011d\u011e\5\"\22"+
		"\2\u011e\u011f\b\23\1\2\u011f\u0136\3\2\2\2\u0120\u0121\7\22\2\2\u0121"+
		"\u0122\7\27\2\2\u0122\u0123\5\"\22\2\u0123\u0124\b\23\1\2\u0124\u0136"+
		"\3\2\2\2\u0125\u0126\7\13\2\2\u0126\u0127\5\"\22\2\u0127\u0128\b\23\1"+
		"\2\u0128\u0136\3\2\2\2\u0129\u012a\7\6\2\2\u012a\u012b\5\"\22\2\u012b"+
		"\u012c\b\23\1\2\u012c\u0136\3\2\2\2\u012d\u012e\7\7\2\2\u012e\u012f\5"+
		"\"\22\2\u012f\u0130\b\23\1\2\u0130\u0136\3\2\2\2\u0131\u0132\7\r\2\2\u0132"+
		"\u0133\5\"\22\2\u0133\u0134\b\23\1\2\u0134\u0136\3\2\2\2\u0135\u0110\3"+
		"\2\2\2\u0135\u0114\3\2\2\2\u0135\u0118\3\2\2\2\u0135\u011c\3\2\2\2\u0135"+
		"\u0120\3\2\2\2\u0135\u0125\3\2\2\2\u0135\u0129\3\2\2\2\u0135\u012d\3\2"+
		"\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138%\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5$\23\2"+
		"\u013b\u013c\b\24\1\2\u013c\u0142\3\2\2\2\u013d\u013e\7\27\2\2\u013e\u013f"+
		"\5$\23\2\u013f\u0140\b\24\1\2\u0140\u0142\3\2\2\2\u0141\u013a\3\2\2\2"+
		"\u0141\u013d\3\2\2\2\u0142\'\3\2\2\2\u0143\u0144\5&\24\2\u0144\u014f\b"+
		"\25\1\2\u0145\u0146\7\24\2\2\u0146\u0147\5*\26\2\u0147\u0148\b\25\1\2"+
		"\u0148\u014e\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5*\26\2\u014b\u014c"+
		"\b\25\1\2\u014c\u014e\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0149\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150)\3"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\5(\25\2\u0153\u0154\b\26\1\2\u0154"+
		"+\3\2\2\2\34\66AFRacf\u008d\u0099\u00a7\u00b4\u00c0\u00c6\u00d0\u00d8"+
		"\u00e2\u00ef\u00f1\u00fe\u0100\u010b\u0135\u0137\u0141\u014d\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
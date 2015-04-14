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
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, NUMBER=23, STRING_LITERAL=24, 
		NULL=25, BOOLEAN=26, IDENT=27, WS=28, MULTILINE_COMMENT=29, LINE_COMMENT=30, 
		NEGATION=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'>='", "'<'", "'='", "'^'", "'>'", "'or'", 
		"'<='", "'<>'", "'%'", "'&'", "'('", "'is'", "')'", "'and'", "'*'", "'+'", 
		"'not'", "','", "'-'", "'.'", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
		"IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_conditionArg = 5, RULE_literalTerm = 6, 
		RULE_formulaTerm = 7, RULE_qualifiedName = 8, RULE_unary = 9, RULE_percent = 10, 
		RULE_exponential = 11, RULE_multiplicative = 12, RULE_additiveExpression = 13, 
		RULE_stringExpression = 14, RULE_comparison = 15, RULE_notExpression = 16, 
		RULE_logicalExpression = 17, RULE_operatorExpression = 18;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "conditionArg", "literalTerm", "formulaTerm", "qualifiedName", 
		"unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"stringExpression", "comparison", "notExpression", "logicalExpression", 
		"operatorExpression"
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
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38); match(T__17);
				setState(39); match(T__9);
				setState(40); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(41); match(T__7);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(44); match(T__17);
				setState(45); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(50); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(53); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(56); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
			setState(61); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(62); match(T__9);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(66); match(T__7);
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
			setState(69); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(71); match(T__0);
			setState(72); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(74); match(T__9);
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(75); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(78); match(T__7);
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
			setState(96);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__3) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(82); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__8) | (1L << T__2))) != 0)) {
					{
					setState(91);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(84); match(T__2);
						{
						setState(85); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__20:
					case T__19:
					case T__18:
					case T__17:
					case T__15:
					case T__13:
					case T__12:
					case T__8:
						{
						{
						setState(88); ((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(95);
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
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(98); match(T__17);
				setState(99); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(102); match(T__8);
				setState(103); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(106); match(T__20);
				setState(107); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(110); match(T__12);
				setState(111); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(114); match(T__8);
				setState(115); match(T__3);
				setState(116); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(119); match(T__15);
				setState(120); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(123); match(T__19);
				setState(124); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(127); match(T__18);
				setState(128); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(131); match(T__13);
				setState(132); ((ConditionArgContext)_localctx).op2 = literalTerm();
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
			setState(147);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(141); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(145); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 16, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165); match(T__0);
					setState(166); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 18, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(176);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(174); match(T__1);
				 negative = true; 
				}
			}

			setState(186);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(178); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__9:
				{
				setState(181); match(T__9);
				setState(182); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(183); match(T__7);
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
		enterRule(_localctx, 20, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(194);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(192); match(T__11);
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
		enterRule(_localctx, 22, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(198); match(T__16);
				setState(199); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(206);
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
		enterRule(_localctx, 24, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__5) {
				{
				setState(217);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(209); match(T__5);
					setState(210); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__21:
					{
					setState(213); match(T__21);
					setState(214); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(221);
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
		enterRule(_localctx, 26, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__1) {
				{
				setState(232);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(224); match(T__4);
					setState(225); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(228); match(T__1);
					setState(229); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(236);
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
		enterRule(_localctx, 28, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(239); match(T__10);
				setState(240); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(247);
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
		enterRule(_localctx, 30, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(287);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(250); match(T__17);
						setState(251); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(254); match(T__8);
						setState(255); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(258); match(T__20);
						setState(259); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(262); match(T__12);
						setState(263); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(266); match(T__8);
						setState(267); match(T__3);
						setState(268); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(271); match(T__15);
						setState(272); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(275); match(T__19);
						setState(276); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(279); match(T__18);
						setState(280); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(283); match(T__13);
						setState(284); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 32, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			switch (_input.LA(1)) {
			case T__9:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(292); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__3:
				{
				setState(295); match(T__3);
				setState(296); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 34, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(311);
					switch (_input.LA(1)) {
					case T__6:
						{
						setState(303); match(T__6);
						setState(304); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__14:
						{
						setState(307); match(T__14);
						setState(308); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 36, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\5\4C\n\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\5\6c\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0096\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\13\3\13\3\13\5\13\u00b3"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bd\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f"+
		"\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00dc\n\16\f\16\16\16\u00df\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u00eb\n\17\f\17\16\17\u00ee\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0122\n\21\f\21\16\21"+
		"\u0125\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013a\n\23\f\23\16\23"+
		"\u013d\13\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\2\u015b\2\62\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bG\3\2\2\2"+
		"\nS\3\2\2\2\f\u0089\3\2\2\2\16\u0095\3\2\2\2\20\u00a3\3\2\2\2\22\u00a5"+
		"\3\2\2\2\24\u00af\3\2\2\2\26\u00c0\3\2\2\2\30\u00c6\3\2\2\2\32\u00d1\3"+
		"\2\2\2\34\u00e0\3\2\2\2\36\u00ef\3\2\2\2 \u00fa\3\2\2\2\"\u012d\3\2\2"+
		"\2$\u012f\3\2\2\2&\u013e\3\2\2\2()\7\7\2\2)*\7\17\2\2*+\5\4\3\2+,\7\21"+
		"\2\2,-\b\2\1\2-\63\3\2\2\2./\7\7\2\2/\60\5\4\3\2\60\61\b\2\1\2\61\63\3"+
		"\2\2\2\62(\3\2\2\2\62.\3\2\2\2\63\3\3\2\2\2\64\65\5&\24\2\65\66\b\3\1"+
		"\2\66>\3\2\2\2\678\5\6\4\289\b\3\1\29>\3\2\2\2:;\5\b\5\2;<\b\3\1\2<>\3"+
		"\2\2\2=\64\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>\5\3\2\2\2?@\7\35\2\2@B\7\17"+
		"\2\2AC\5\n\6\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\21\2\2EF\b\4\1\2F\7\3"+
		"\2\2\2GH\5\22\n\2HI\b\5\1\2IJ\7\30\2\2JK\7\35\2\2KL\b\5\1\2LN\7\17\2\2"+
		"MO\5\n\6\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\21\2\2QR\b\5\1\2R\t\3\2\2"+
		"\2Sb\b\6\1\2TU\5&\24\2U_\b\6\1\2VW\7\26\2\2WX\5&\24\2XY\b\6\1\2Y^\3\2"+
		"\2\2Z[\5\f\7\2[\\\b\6\1\2\\^\3\2\2\2]V\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bT\3\2\2\2bc\3\2\2\2c\13\3\2\2\2d"+
		"e\7\7\2\2ef\5\16\b\2fg\b\7\1\2g\u008a\3\2\2\2hi\7\20\2\2ij\5\16\b\2jk"+
		"\b\7\1\2k\u008a\3\2\2\2lm\7\4\2\2mn\5\16\b\2no\b\7\1\2o\u008a\3\2\2\2"+
		"pq\7\f\2\2qr\5\16\b\2rs\b\7\1\2s\u008a\3\2\2\2tu\7\20\2\2uv\7\25\2\2v"+
		"w\5\16\b\2wx\b\7\1\2x\u008a\3\2\2\2yz\7\t\2\2z{\5\16\b\2{|\b\7\1\2|\u008a"+
		"\3\2\2\2}~\7\5\2\2~\177\5\16\b\2\177\u0080\b\7\1\2\u0080\u008a\3\2\2\2"+
		"\u0081\u0082\7\6\2\2\u0082\u0083\5\16\b\2\u0083\u0084\b\7\1\2\u0084\u008a"+
		"\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\5\16\b\2\u0087\u0088\b\7\1\2"+
		"\u0088\u008a\3\2\2\2\u0089d\3\2\2\2\u0089h\3\2\2\2\u0089l\3\2\2\2\u0089"+
		"p\3\2\2\2\u0089t\3\2\2\2\u0089y\3\2\2\2\u0089}\3\2\2\2\u0089\u0081\3\2"+
		"\2\2\u0089\u0085\3\2\2\2\u008a\r\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u0096"+
		"\b\b\1\2\u008d\u008e\7\32\2\2\u008e\u0096\b\b\1\2\u008f\u0090\7\31\2\2"+
		"\u0090\u0096\b\b\1\2\u0091\u0092\7\33\2\2\u0092\u0096\b\b\1\2\u0093\u0094"+
		"\7\35\2\2\u0094\u0096\b\b\1\2\u0095\u008b\3\2\2\2\u0095\u008d\3\2\2\2"+
		"\u0095\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\17"+
		"\3\2\2\2\u0097\u0098\5\16\b\2\u0098\u0099\b\t\1\2\u0099\u00a4\3\2\2\2"+
		"\u009a\u009b\5\22\n\2\u009b\u009c\b\t\1\2\u009c\u00a4\3\2\2\2\u009d\u009e"+
		"\5\6\4\2\u009e\u009f\b\t\1\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\5\b\5\2\u00a1"+
		"\u00a2\b\t\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009a\3\2"+
		"\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a6"+
		"\7\35\2\2\u00a6\u00ac\b\n\1\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7\35\2"+
		"\2\u00a9\u00ab\b\n\1\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b2\b\13\1\2\u00b0\u00b1\7\27\2\2\u00b1\u00b3\b\13\1\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00bc\3\2\2\2\u00b4\u00b5\5\20\t\2"+
		"\u00b5\u00b6\b\13\1\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9"+
		"\5&\24\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\b\13\1\2\u00bb\u00bd\3\2\2\2"+
		"\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\b\13\1\2\u00bf\25\3\2\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c4\b\f\1\2\u00c2"+
		"\u00c3\7\r\2\2\u00c3\u00c5\b\f\1\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00ce\b\r\1\2\u00c8\u00c9"+
		"\7\b\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\b\r\1\2\u00cb\u00cd\3\2\2\2"+
		"\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\30\r\2\u00d2"+
		"\u00dd\b\16\1\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6"+
		"\b\16\1\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\5\30\r\2"+
		"\u00d9\u00da\b\16\1\2\u00da\u00dc\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d7"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\33\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00ec\b\17"+
		"\1\2\u00e2\u00e3\7\24\2\2\u00e3\u00e4\5\32\16\2\u00e4\u00e5\b\17\1\2\u00e5"+
		"\u00eb\3\2\2\2\u00e6\u00e7\7\27\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9"+
		"\b\17\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e6\3\2\2\2"+
		"\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\35"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f7\b\20\1"+
		"\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\b\20\1\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\5\36\20\2\u00fb\u0123\b\21\1\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\5\36\20"+
		"\2\u00fe\u00ff\b\21\1\2\u00ff\u0122\3\2\2\2\u0100\u0101\7\20\2\2\u0101"+
		"\u0102\5\36\20\2\u0102\u0103\b\21\1\2\u0103\u0122\3\2\2\2\u0104\u0105"+
		"\7\4\2\2\u0105\u0106\5\36\20\2\u0106\u0107\b\21\1\2\u0107\u0122\3\2\2"+
		"\2\u0108\u0109\7\f\2\2\u0109\u010a\5\36\20\2\u010a\u010b\b\21\1\2\u010b"+
		"\u0122\3\2\2\2\u010c\u010d\7\20\2\2\u010d\u010e\7\25\2\2\u010e\u010f\5"+
		"\36\20\2\u010f\u0110\b\21\1\2\u0110\u0122\3\2\2\2\u0111\u0112\7\t\2\2"+
		"\u0112\u0113\5\36\20\2\u0113\u0114\b\21\1\2\u0114\u0122\3\2\2\2\u0115"+
		"\u0116\7\5\2\2\u0116\u0117\5\36\20\2\u0117\u0118\b\21\1\2\u0118\u0122"+
		"\3\2\2\2\u0119\u011a\7\6\2\2\u011a\u011b\5\36\20\2\u011b\u011c\b\21\1"+
		"\2\u011c\u0122\3\2\2\2\u011d\u011e\7\13\2\2\u011e\u011f\5\36\20\2\u011f"+
		"\u0120\b\21\1\2\u0120\u0122\3\2\2\2\u0121\u00fc\3\2\2\2\u0121\u0100\3"+
		"\2\2\2\u0121\u0104\3\2\2\2\u0121\u0108\3\2\2\2\u0121\u010c\3\2\2\2\u0121"+
		"\u0111\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011d\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"!\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5 \21\2\u0127\u0128\b\22\1\2"+
		"\u0128\u012e\3\2\2\2\u0129\u012a\7\25\2\2\u012a\u012b\5 \21\2\u012b\u012c"+
		"\b\22\1\2\u012c\u012e\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u0129\3\2\2\2"+
		"\u012e#\3\2\2\2\u012f\u0130\5\"\22\2\u0130\u013b\b\23\1\2\u0131\u0132"+
		"\7\22\2\2\u0132\u0133\5&\24\2\u0133\u0134\b\23\1\2\u0134\u013a\3\2\2\2"+
		"\u0135\u0136\7\n\2\2\u0136\u0137\5&\24\2\u0137\u0138\b\23\1\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c%\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013e\u013f\5$\23\2\u013f\u0140\b\24\1\2\u0140\'\3\2\2\2\33\62=BN]_b"+
		"\u0089\u0095\u00a3\u00ac\u00b2\u00bc\u00c4\u00ce\u00db\u00dd\u00ea\u00ec"+
		"\u00f7\u0121\u0123\u012d\u0139\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
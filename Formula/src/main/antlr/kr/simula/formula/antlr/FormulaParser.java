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
		BOOLEAN=25, IDENT=26, WS=27, COMMENT=28, MULTILINE_COMMENT=29, NEGATION=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'>='", "'<'", "'='", "'>'", "'^'", "'or'", 
		"'<='", "'<>'", "'%'", "'&'", "'('", "'is'", "')'", "'and'", "'*'", "'+'", 
		"'not'", "','", "'-'", "'.'", "NUMBER", "STRING_LITERAL", "BOOLEAN", "IDENT", 
		"WS", "COMMENT", "MULTILINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_formulaTerm = 5, RULE_qualifiedName = 6, 
		RULE_unary = 7, RULE_percent = 8, RULE_exponential = 9, RULE_multiplicative = 10, 
		RULE_additiveExpression = 11, RULE_stringExpression = 12, RULE_comparison = 13, 
		RULE_notExpression = 14, RULE_logicalExpression = 15, RULE_operatorExpression = 16;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "formulaTerm", "qualifiedName", "unary", "percent", "exponential", 
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
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(34); match(T__17);
				setState(35); match(T__9);
				setState(36); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(37); match(T__7);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(40); match(T__17);
				setState(41); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(46); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(49); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(52); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
			setState(57); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(58); match(T__9);
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(62); match(T__7);
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
			setState(65); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(67); match(T__0);
			setState(68); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(70); match(T__9);
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(74); match(T__7);
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
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
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
			setState(89);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__3) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(78); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(80); match(T__2);
					setState(81); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
					 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
					}
					}
					setState(88);
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

	public static class FormulaTermContext extends ParserRuleContext {
		public Node result;
		public Token BOOLEAN;
		public Token STRING_LITERAL;
		public Token NUMBER;
		public Token IDENT;
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
		public TerminalNode STRING_LITERAL() { return getToken(FormulaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
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
		enterRule(_localctx, 10, RULE_formulaTerm);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); ((FormulaTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((FormulaTermContext)_localctx).BOOLEAN!=null?((FormulaTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); ((FormulaTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((FormulaTermContext)_localctx).STRING_LITERAL!=null?((FormulaTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); ((FormulaTermContext)_localctx).NUMBER = match(NUMBER);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((FormulaTermContext)_localctx).NUMBER!=null?((FormulaTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); ((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  handler.refer( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 12, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112); match(T__0);
					setState(113); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(123);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(121); match(T__1);
				 negative = true; 
				}
			}

			setState(133);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(125); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__9:
				{
				setState(128); match(T__9);
				setState(129); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(130); match(T__7);
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
		enterRule(_localctx, 16, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(141);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(139); match(T__11);
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
		enterRule(_localctx, 18, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(145); match(T__15);
				setState(146); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(153);
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
		enterRule(_localctx, 20, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__5) {
				{
				setState(164);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(156); match(T__5);
					setState(157); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__21:
					{
					setState(160); match(T__21);
					setState(161); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
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
		enterRule(_localctx, 22, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__1) {
				{
				setState(179);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(171); match(T__4);
					setState(172); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(175); match(T__1);
					setState(176); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
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
		enterRule(_localctx, 24, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(186); match(T__10);
				setState(187); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(194);
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
		enterRule(_localctx, 26, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__13) | (1L << T__12) | (1L << T__8))) != 0)) {
				{
				setState(234);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(197); match(T__17);
					setState(198); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(201); match(T__8);
					setState(202); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(205); match(T__20);
					setState(206); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(209); match(T__12);
					setState(210); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(213); match(T__8);
					setState(214); match(T__3);
					setState(215); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(218); match(T__16);
					setState(219); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(222); match(T__19);
					setState(223); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(226); match(T__18);
					setState(227); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(230); match(T__13);
					setState(231); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(238);
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
		enterRule(_localctx, 28, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			switch (_input.LA(1)) {
			case T__9:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(239); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__3:
				{
				setState(242); match(T__3);
				setState(243); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 30, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(258);
					switch (_input.LA(1)) {
					case T__6:
						{
						setState(250); match(T__6);
						setState(251); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__14:
						{
						setState(254); match(T__14);
						setState(255); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(262);
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
		enterRule(_localctx, 32, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"W\n\6\f\6\16\6Z\13\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\b\7\bv\n\b\f\b"+
		"\16\by\13\b\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0088"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ed\n\17\f\17\16\17\u00f0\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0105\n\21\f\21\16\21\u0108\13"+
		"\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\2\u011e\2.\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2\nO\3\2\2\2\f"+
		"n\3\2\2\2\16p\3\2\2\2\20z\3\2\2\2\22\u008b\3\2\2\2\24\u0091\3\2\2\2\26"+
		"\u009c\3\2\2\2\30\u00ab\3\2\2\2\32\u00ba\3\2\2\2\34\u00c5\3\2\2\2\36\u00f8"+
		"\3\2\2\2 \u00fa\3\2\2\2\"\u0109\3\2\2\2$%\7\7\2\2%&\7\17\2\2&\'\5\4\3"+
		"\2\'(\7\21\2\2()\b\2\1\2)/\3\2\2\2*+\7\7\2\2+,\5\4\3\2,-\b\2\1\2-/\3\2"+
		"\2\2.$\3\2\2\2.*\3\2\2\2/\3\3\2\2\2\60\61\5\"\22\2\61\62\b\3\1\2\62:\3"+
		"\2\2\2\63\64\5\6\4\2\64\65\b\3\1\2\65:\3\2\2\2\66\67\5\b\5\2\678\b\3\1"+
		"\28:\3\2\2\29\60\3\2\2\29\63\3\2\2\29\66\3\2\2\2:\5\3\2\2\2;<\7\34\2\2"+
		"<>\7\17\2\2=?\5\n\6\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\21\2\2AB\b\4\1"+
		"\2B\7\3\2\2\2CD\5\16\b\2DE\b\5\1\2EF\7\30\2\2FG\7\34\2\2GH\b\5\1\2HJ\7"+
		"\17\2\2IK\5\n\6\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\21\2\2MN\b\5\1\2N"+
		"\t\3\2\2\2O[\b\6\1\2PQ\5\"\22\2QX\b\6\1\2RS\7\26\2\2ST\5\"\22\2TU\b\6"+
		"\1\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2[P\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2]^\7\33\2\2^o\b\7\1\2_`\7\32\2"+
		"\2`o\b\7\1\2ab\7\31\2\2bo\b\7\1\2cd\7\34\2\2do\b\7\1\2ef\5\16\b\2fg\b"+
		"\7\1\2go\3\2\2\2hi\5\6\4\2ij\b\7\1\2jo\3\2\2\2kl\5\b\5\2lm\b\7\1\2mo\3"+
		"\2\2\2n]\3\2\2\2n_\3\2\2\2na\3\2\2\2nc\3\2\2\2ne\3\2\2\2nh\3\2\2\2nk\3"+
		"\2\2\2o\r\3\2\2\2pq\7\34\2\2qw\b\b\1\2rs\7\30\2\2st\7\34\2\2tv\b\b\1\2"+
		"ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yw\3\2\2\2z}\b\t\1"+
		"\2{|\7\27\2\2|~\b\t\1\2}{\3\2\2\2}~\3\2\2\2~\u0087\3\2\2\2\177\u0080\5"+
		"\f\7\2\u0080\u0081\b\t\1\2\u0081\u0088\3\2\2\2\u0082\u0083\7\17\2\2\u0083"+
		"\u0084\5\"\22\2\u0084\u0085\7\21\2\2\u0085\u0086\b\t\1\2\u0086\u0088\3"+
		"\2\2\2\u0087\177\3\2\2\2\u0087\u0082\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\b\t\1\2\u008a\21\3\2\2\2\u008b\u008c\5\20\t\2\u008c\u008f\b\n\1"+
		"\2\u008d\u008e\7\r\2\2\u008e\u0090\b\n\1\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\5\22\n\2\u0092\u0099\b\13\1\2\u0093"+
		"\u0094\7\t\2\2\u0094\u0095\5\22\n\2\u0095\u0096\b\13\1\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\25\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\24\13"+
		"\2\u009d\u00a8\b\f\1\2\u009e\u009f\7\23\2\2\u009f\u00a0\5\24\13\2\u00a0"+
		"\u00a1\b\f\1\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5\24"+
		"\13\2\u00a4\u00a5\b\f\1\2\u00a5\u00a7\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\27\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00b7"+
		"\b\r\1\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\b\r\1\2"+
		"\u00b0\u00b6\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4"+
		"\b\r\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\31\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00c2\b\16\1\2\u00bc"+
		"\u00bd\7\16\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\b\16\1\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\32\16"+
		"\2\u00c6\u00ee\b\17\1\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5\32\16\2\u00c9"+
		"\u00ca\b\17\1\2\u00ca\u00ed\3\2\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\5"+
		"\32\16\2\u00cd\u00ce\b\17\1\2\u00ce\u00ed\3\2\2\2\u00cf\u00d0\7\4\2\2"+
		"\u00d0\u00d1\5\32\16\2\u00d1\u00d2\b\17\1\2\u00d2\u00ed\3\2\2\2\u00d3"+
		"\u00d4\7\f\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\b\17\1\2\u00d6\u00ed"+
		"\3\2\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9\7\25\2\2\u00d9\u00da\5\32\16"+
		"\2\u00da\u00db\b\17\1\2\u00db\u00ed\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd"+
		"\u00de\5\32\16\2\u00de\u00df\b\17\1\2\u00df\u00ed\3\2\2\2\u00e0\u00e1"+
		"\7\5\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\b\17\1\2\u00e3\u00ed\3\2\2"+
		"\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\b\17\1\2\u00e7"+
		"\u00ed\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb"+
		"\b\17\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00c7\3\2\2\2\u00ec\u00cb\3\2\2\2"+
		"\u00ec\u00cf\3\2\2\2\u00ec\u00d3\3\2\2\2\u00ec\u00d7\3\2\2\2\u00ec\u00dc"+
		"\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\b\20\1\2\u00f3"+
		"\u00f9\3\2\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7"+
		"\b\20\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f4\3\2\2\2"+
		"\u00f9\37\3\2\2\2\u00fa\u00fb\5\36\20\2\u00fb\u0106\b\21\1\2\u00fc\u00fd"+
		"\7\22\2\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\b\21\1\2\u00ff\u0105\3\2\2"+
		"\2\u0100\u0101\7\n\2\2\u0101\u0102\5\"\22\2\u0102\u0103\b\21\1\2\u0103"+
		"\u0105\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107!\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010a\5 \21\2\u010a\u010b\b\22\1\2\u010b#\3\2\2\2\30.9"+
		">JX[nw}\u0087\u008f\u0099\u00a6\u00a8\u00b5\u00b7\u00c2\u00ec\u00ee\u00f8"+
		"\u0104\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
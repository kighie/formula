// Generated from Formula.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, NUMBER=28, STRING_LITERAL=29, NULL=30, BOOLEAN=31, 
		IDENT=32, WS=33, MULTILINE_COMMENT=34, LINE_COMMENT=35, NEGATION=36;
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_conditionArg = 5, RULE_literalTerm = 6, 
		RULE_formulaTerm = 7, RULE_arrayRef = 8, RULE_array = 9, RULE_map = 10, 
		RULE_qualifiedName = 11, RULE_unary = 12, RULE_percent = 13, RULE_exponential = 14, 
		RULE_multiplicative = 15, RULE_additiveExpression = 16, RULE_stringExpression = 17, 
		RULE_comparison = 18, RULE_notExpression = 19, RULE_logicalExpression = 20, 
		RULE_operatorExpression = 21;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "conditionArg", "literalTerm", "formulaTerm", "arrayRef", 
		"array", "map", "qualifiedName", "unary", "percent", "exponential", "multiplicative", 
		"additiveExpression", "stringExpression", "comparison", "notExpression", 
		"logicalExpression", "operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'.'", "','", "'is'", "'!='", "'<>'", "'not'", 
		"'>'", "'>='", "'<'", "'<='", "'['", "']'", "'{'", "':'", "'}'", "'-'", 
		"'%'", "'^'", "'*'", "'/'", "'+'", "'&'", "'and'", "'or'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
		"IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", "NEGATION"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

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
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(44);
				match(T__0);
				setState(45);
				match(T__1);
				setState(46);
				((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(47);
				match(T__2);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(50);
				match(T__0);
				setState(51);
				((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
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
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(59);
				((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(62);
				((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
			setState(67);
			((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(68);
			match(T__1);
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(69);
				((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(72);
			match(T__2);
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
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
			setState(75);
			((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(77);
			match(T__3);
			setState(78);
			((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(80);
			match(T__1);
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81);
				((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(84);
			match(T__2);
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
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public List<ConditionArgContext> conditionArg() {
			return getRuleContexts(ConditionArgContext.class);
		}
		public ConditionArgContext conditionArg(int i) {
			return getRuleContext(ConditionArgContext.class,i);
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
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(88);
				((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(97);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(90);
						match(T__4);
						{
						setState(91);
						((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__0:
					case T__5:
					case T__6:
					case T__7:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
						{
						{
						setState(94);
						((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(101);
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
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(104);
				match(T__0);
				setState(105);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(108);
				match(T__5);
				setState(109);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(112);
				match(T__6);
				setState(113);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(116);
				match(T__7);
				setState(117);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(120);
				match(T__5);
				setState(121);
				match(T__8);
				setState(122);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(125);
				match(T__9);
				setState(126);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(129);
				match(T__10);
				setState(130);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(133);
				match(T__11);
				setState(134);
				((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(137);
				match(T__12);
				setState(138);
				((ConditionArgContext)_localctx).op2 = literalTerm();
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
		public TerminalNode BOOLEAN() { return getToken(FormulaParser.BOOLEAN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FormulaParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(FormulaParser.NULL, 0); }
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
			setState(153);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
		public ArrayRefContext arrayRef;
		public ArrayContext array;
		public MapContext map;
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
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
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				((FormulaTermContext)_localctx).map = map();
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
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(179);
			match(T__13);
			setState(184);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(180);
				((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.literal( ExprTokens.LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(182);
				((ArrayRefContext)_localctx).id2 = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(T__14);
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
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
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
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__13);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(190);
			((ArrayContext)_localctx).formulaTerm = formulaTerm();
			 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(192);
				match(T__4);
				setState(193);
				((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				((ArrayContext)_localctx).result =  handler.array(elements); 
			setState(202);
			match(T__14);
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
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__15);
			 ((MapContext)_localctx).result =  handler.map(ExprTokens.SIMPLE_MAP);
			setState(206);
			((MapContext)_localctx).IDENT = match(IDENT);
			setState(207);
			match(T__16);
			setState(208);
			((MapContext)_localctx).formulaTerm = formulaTerm();
			 handler.mapEntry( _localctx.result, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ); 
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(210);
				match(T__4);
				setState(211);
				((MapContext)_localctx).IDENT = match(IDENT);
				setState(212);
				match(T__16);
				setState(213);
				((MapContext)_localctx).formulaTerm = formulaTerm();
				 handler.mapEntry( _localctx.result, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ); 
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__17);
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
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
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
		enterRule(_localctx, 22, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(T__3);
					setState(226);
					((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(236);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(234);
				match(T__18);
				 negative = true; 
				}
			}

			setState(246);
			switch (_input.LA(1)) {
			case T__13:
			case T__15:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(238);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__1:
				{
				setState(241);
				match(T__1);
				setState(242);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(243);
				match(T__2);
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
		enterRule(_localctx, 26, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(254);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(252);
				match(T__19);
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
		enterRule(_localctx, 28, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(258);
				match(T__20);
				setState(259);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(266);
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
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
		}
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
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
		enterRule(_localctx, 30, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				setState(277);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(269);
					match(T__21);
					setState(270);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__22:
					{
					setState(273);
					match(T__22);
					setState(274);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(281);
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
		enterRule(_localctx, 32, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__23) {
				{
				setState(292);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(284);
					match(T__23);
					setState(285);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__18:
					{
					setState(288);
					match(T__18);
					setState(289);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(296);
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
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
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
		enterRule(_localctx, 34, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(299);
				match(T__24);
				setState(300);
				((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(307);
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
		enterRule(_localctx, 36, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(310);
						match(T__0);
						setState(311);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(314);
						match(T__5);
						setState(315);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(318);
						match(T__6);
						setState(319);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(322);
						match(T__7);
						setState(323);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(326);
						match(T__5);
						setState(327);
						match(T__8);
						setState(328);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(331);
						match(T__9);
						setState(332);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(335);
						match(T__10);
						setState(336);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(339);
						match(T__11);
						setState(340);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(343);
						match(T__12);
						setState(344);
						((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(351);
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
		enterRule(_localctx, 38, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__15:
			case T__18:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(352);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__8:
				{
				setState(355);
				match(T__8);
				setState(356);
				((NotExpressionContext)_localctx).comparison = comparison();
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
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(371);
					switch (_input.LA(1)) {
					case T__25:
						{
						setState(363);
						match(T__25);
						setState(364);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__26:
						{
						setState(367);
						match(T__26);
						setState(368);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 42, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"D\n\3\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n\6\f\6"+
		"\16\6g\13\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00bb\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00c7\n\13\f\13\16\13\u00ca\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\16\3\16\3"+
		"\16\5\16\u00ef\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f9"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0109\n\20\f\20\16\20\u010c\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0118\n\21\f\21\16\21\u011b\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0127\n\22\f\22"+
		"\16\22\u012a\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0132\n\23\f\23"+
		"\16\23\u0135\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u015e\n\24\f\24\16\24\u0161\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u016a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0176\n\26\f\26\16\26\u0179\13\26\3\27\3\27\3\27\3\27\2\2\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u019a\28\3\2\2\2\4"+
		"C\3\2\2\2\6E\3\2\2\2\bM\3\2\2\2\nY\3\2\2\2\f\u008f\3\2\2\2\16\u009b\3"+
		"\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00be\3\2\2\2\26\u00ce\3\2"+
		"\2\2\30\u00e1\3\2\2\2\32\u00eb\3\2\2\2\34\u00fc\3\2\2\2\36\u0102\3\2\2"+
		"\2 \u010d\3\2\2\2\"\u011c\3\2\2\2$\u012b\3\2\2\2&\u0136\3\2\2\2(\u0169"+
		"\3\2\2\2*\u016b\3\2\2\2,\u017a\3\2\2\2./\7\3\2\2/\60\7\4\2\2\60\61\5\4"+
		"\3\2\61\62\7\5\2\2\62\63\b\2\1\2\639\3\2\2\2\64\65\7\3\2\2\65\66\5\4\3"+
		"\2\66\67\b\2\1\2\679\3\2\2\28.\3\2\2\28\64\3\2\2\29\3\3\2\2\2:;\5,\27"+
		"\2;<\b\3\1\2<D\3\2\2\2=>\5\6\4\2>?\b\3\1\2?D\3\2\2\2@A\5\b\5\2AB\b\3\1"+
		"\2BD\3\2\2\2C:\3\2\2\2C=\3\2\2\2C@\3\2\2\2D\5\3\2\2\2EF\7\"\2\2FH\7\4"+
		"\2\2GI\5\n\6\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\5\2\2KL\b\4\1\2L\7\3"+
		"\2\2\2MN\5\30\r\2NO\b\5\1\2OP\7\6\2\2PQ\7\"\2\2QR\b\5\1\2RT\7\4\2\2SU"+
		"\5\n\6\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\5\2\2WX\b\5\1\2X\t\3\2\2\2"+
		"Yh\b\6\1\2Z[\5,\27\2[e\b\6\1\2\\]\7\7\2\2]^\5,\27\2^_\b\6\1\2_d\3\2\2"+
		"\2`a\5\f\7\2ab\b\6\1\2bd\3\2\2\2c\\\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hZ\3\2\2\2hi\3\2\2\2i\13\3\2\2\2jk\7"+
		"\3\2\2kl\5\16\b\2lm\b\7\1\2m\u0090\3\2\2\2no\7\b\2\2op\5\16\b\2pq\b\7"+
		"\1\2q\u0090\3\2\2\2rs\7\t\2\2st\5\16\b\2tu\b\7\1\2u\u0090\3\2\2\2vw\7"+
		"\n\2\2wx\5\16\b\2xy\b\7\1\2y\u0090\3\2\2\2z{\7\b\2\2{|\7\13\2\2|}\5\16"+
		"\b\2}~\b\7\1\2~\u0090\3\2\2\2\177\u0080\7\f\2\2\u0080\u0081\5\16\b\2\u0081"+
		"\u0082\b\7\1\2\u0082\u0090\3\2\2\2\u0083\u0084\7\r\2\2\u0084\u0085\5\16"+
		"\b\2\u0085\u0086\b\7\1\2\u0086\u0090\3\2\2\2\u0087\u0088\7\16\2\2\u0088"+
		"\u0089\5\16\b\2\u0089\u008a\b\7\1\2\u008a\u0090\3\2\2\2\u008b\u008c\7"+
		"\17\2\2\u008c\u008d\5\16\b\2\u008d\u008e\b\7\1\2\u008e\u0090\3\2\2\2\u008f"+
		"j\3\2\2\2\u008fn\3\2\2\2\u008fr\3\2\2\2\u008fv\3\2\2\2\u008fz\3\2\2\2"+
		"\u008f\177\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008b"+
		"\3\2\2\2\u0090\r\3\2\2\2\u0091\u0092\7!\2\2\u0092\u009c\b\b\1\2\u0093"+
		"\u0094\7\37\2\2\u0094\u009c\b\b\1\2\u0095\u0096\7\36\2\2\u0096\u009c\b"+
		"\b\1\2\u0097\u0098\7 \2\2\u0098\u009c\b\b\1\2\u0099\u009a\7\"\2\2\u009a"+
		"\u009c\b\b\1\2\u009b\u0091\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2"+
		"\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\17\3\2\2\2\u009d\u009e"+
		"\5\16\b\2\u009e\u009f\b\t\1\2\u009f\u00b3\3\2\2\2\u00a0\u00a1\5\30\r\2"+
		"\u00a1\u00a2\b\t\1\2\u00a2\u00b3\3\2\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5"+
		"\b\t\1\2\u00a5\u00b3\3\2\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\b\t\1\2\u00a8"+
		"\u00b3\3\2\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\b\t\1\2\u00ab\u00b3\3"+
		"\2\2\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\b\t\1\2\u00ae\u00b3\3\2\2\2\u00af"+
		"\u00b0\5\26\f\2\u00b0\u00b1\b\t\1\2\u00b1\u00b3\3\2\2\2\u00b2\u009d\3"+
		"\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\21\3\2\2"+
		"\2\u00b4\u00b5\7\"\2\2\u00b5\u00ba\7\20\2\2\u00b6\u00b7\7\36\2\2\u00b7"+
		"\u00bb\b\n\1\2\u00b8\u00b9\7\"\2\2\u00b9\u00bb\b\n\1\2\u00ba\u00b6\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\21\2\2\u00bd"+
		"\23\3\2\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\b\13\1\2\u00c0\u00c1\5\20"+
		"\t\2\u00c1\u00c8\b\13\1\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5\20\t\2\u00c4"+
		"\u00c5\b\13\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\b\13\1\2\u00cc\u00cd\7\21\2\2\u00cd\25\3\2"+
		"\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\b\f\1\2\u00d0\u00d1\7\"\2\2\u00d1"+
		"\u00d2\7\23\2\2\u00d2\u00d3\5\20\t\2\u00d3\u00dc\b\f\1\2\u00d4\u00d5\7"+
		"\7\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7\23\2\2\u00d7\u00d8\5\20\t\2\u00d8"+
		"\u00d9\b\f\1\2\u00d9\u00db\3\2\2\2\u00da\u00d4\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\"\2"+
		"\2\u00e2\u00e8\b\r\1\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e7"+
		"\b\r\1\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\b\16\1"+
		"\2\u00ec\u00ed\7\25\2\2\u00ed\u00ef\b\16\1\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\5\20\t\2\u00f1\u00f2\b"+
		"\16\1\2\u00f2\u00f9\3\2\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5,\27\2\u00f5"+
		"\u00f6\7\5\2\2\u00f6\u00f7\b\16\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f0\3"+
		"\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\16\1\2\u00fb"+
		"\33\3\2\2\2\u00fc\u00fd\5\32\16\2\u00fd\u0100\b\17\1\2\u00fe\u00ff\7\26"+
		"\2\2\u00ff\u0101\b\17\1\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\35\3\2\2\2\u0102\u0103\5\34\17\2\u0103\u010a\b\20\1\2\u0104\u0105\7\27"+
		"\2\2\u0105\u0106\5\34\17\2\u0106\u0107\b\20\1\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\37\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\36\20\2\u010e"+
		"\u0119\b\21\1\2\u010f\u0110\7\30\2\2\u0110\u0111\5\36\20\2\u0111\u0112"+
		"\b\21\1\2\u0112\u0118\3\2\2\2\u0113\u0114\7\31\2\2\u0114\u0115\5\36\20"+
		"\2\u0115\u0116\b\21\1\2\u0116\u0118\3\2\2\2\u0117\u010f\3\2\2\2\u0117"+
		"\u0113\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a!\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\5 \21\2\u011d\u0128"+
		"\b\22\1\2\u011e\u011f\7\32\2\2\u011f\u0120\5 \21\2\u0120\u0121\b\22\1"+
		"\2\u0121\u0127\3\2\2\2\u0122\u0123\7\25\2\2\u0123\u0124\5 \21\2\u0124"+
		"\u0125\b\22\1\2\u0125\u0127\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"#\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\5\"\22\2\u012c\u0133\b\23\1"+
		"\2\u012d\u012e\7\33\2\2\u012e\u012f\5\"\22\2\u012f\u0130\b\23\1\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137"+
		"\5$\23\2\u0137\u015f\b\24\1\2\u0138\u0139\7\3\2\2\u0139\u013a\5$\23\2"+
		"\u013a\u013b\b\24\1\2\u013b\u015e\3\2\2\2\u013c\u013d\7\b\2\2\u013d\u013e"+
		"\5$\23\2\u013e\u013f\b\24\1\2\u013f\u015e\3\2\2\2\u0140\u0141\7\t\2\2"+
		"\u0141\u0142\5$\23\2\u0142\u0143\b\24\1\2\u0143\u015e\3\2\2\2\u0144\u0145"+
		"\7\n\2\2\u0145\u0146\5$\23\2\u0146\u0147\b\24\1\2\u0147\u015e\3\2\2\2"+
		"\u0148\u0149\7\b\2\2\u0149\u014a\7\13\2\2\u014a\u014b\5$\23\2\u014b\u014c"+
		"\b\24\1\2\u014c\u015e\3\2\2\2\u014d\u014e\7\f\2\2\u014e\u014f\5$\23\2"+
		"\u014f\u0150\b\24\1\2\u0150\u015e\3\2\2\2\u0151\u0152\7\r\2\2\u0152\u0153"+
		"\5$\23\2\u0153\u0154\b\24\1\2\u0154\u015e\3\2\2\2\u0155\u0156\7\16\2\2"+
		"\u0156\u0157\5$\23\2\u0157\u0158\b\24\1\2\u0158\u015e\3\2\2\2\u0159\u015a"+
		"\7\17\2\2\u015a\u015b\5$\23\2\u015b\u015c\b\24\1\2\u015c\u015e\3\2\2\2"+
		"\u015d\u0138\3\2\2\2\u015d\u013c\3\2\2\2\u015d\u0140\3\2\2\2\u015d\u0144"+
		"\3\2\2\2\u015d\u0148\3\2\2\2\u015d\u014d\3\2\2\2\u015d\u0151\3\2\2\2\u015d"+
		"\u0155\3\2\2\2\u015d\u0159\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\'\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163"+
		"\5&\24\2\u0163\u0164\b\25\1\2\u0164\u016a\3\2\2\2\u0165\u0166\7\13\2\2"+
		"\u0166\u0167\5&\24\2\u0167\u0168\b\25\1\2\u0168\u016a\3\2\2\2\u0169\u0162"+
		"\3\2\2\2\u0169\u0165\3\2\2\2\u016a)\3\2\2\2\u016b\u016c\5(\25\2\u016c"+
		"\u0177\b\26\1\2\u016d\u016e\7\34\2\2\u016e\u016f\5,\27\2\u016f\u0170\b"+
		"\26\1\2\u0170\u0176\3\2\2\2\u0171\u0172\7\35\2\2\u0172\u0173\5,\27\2\u0173"+
		"\u0174\b\26\1\2\u0174\u0176\3\2\2\2\u0175\u016d\3\2\2\2\u0175\u0171\3"+
		"\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"+\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5*\26\2\u017b\u017c\b\27\1\2"+
		"\u017c-\3\2\2\2\368CHTceh\u008f\u009b\u00b2\u00ba\u00c8\u00dc\u00e8\u00ee"+
		"\u00f8\u0100\u010a\u0117\u0119\u0126\u0128\u0133\u015d\u015f\u0169\u0175"+
		"\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from FormulaScript.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

	
	import kr.simula.formula.script.*;
	import kr.simula.formula.script.statement.*;


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
public class FormulaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, END_OF_STMT=32, 
		NUMBER=33, STRING_LITERAL=34, BOOLEAN=35, IDENT=36, WS=37, COMMENT=38, 
		MULTILINE_COMMENT=39, NEGATION=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'foreach'", "'elseif'", "'!='", "'{'", "'='", "'}'", 
		"'^'", "'if'", "':='", "'<='", "'&'", "'('", "'*'", "','", "'.'", "':'", 
		"'>='", "'<'", "'>'", "'decode'", "'or'", "'<>'", "'%'", "'else'", "')'", 
		"'and'", "'+'", "'not'", "'-'", "'import'", "';'", "NUMBER", "STRING_LITERAL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "MULTILINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaScript = 0, RULE_block = 1, RULE_ifStatement = 2, RULE_decodeStatement = 3, 
		RULE_foreachStatement = 4, RULE_loopCondition = 5, RULE_methodCallStatement = 6, 
		RULE_assignStatement = 7, RULE_assignBodyExpr = 8, RULE_importStatement = 9, 
		RULE_variableDecl = 10, RULE_type = 11, RULE_formulaExpression = 12, RULE_formulaExpressionBase = 13, 
		RULE_funcCallExp = 14, RULE_methodCallExp = 15, RULE_arguments = 16, RULE_formulaTerm = 17, 
		RULE_qualifiedName = 18, RULE_unary = 19, RULE_percent = 20, RULE_exponential = 21, 
		RULE_multiplicative = 22, RULE_additiveExpression = 23, RULE_stringExpression = 24, 
		RULE_comparison = 25, RULE_notExpression = 26, RULE_logicalExpression = 27, 
		RULE_operatorExpression = 28;
	public static final String[] ruleNames = {
		"formulaScript", "block", "ifStatement", "decodeStatement", "foreachStatement", 
		"loopCondition", "methodCallStatement", "assignStatement", "assignBodyExpr", 
		"importStatement", "variableDecl", "type", "formulaExpression", "formulaExpressionBase", 
		"funcCallExp", "methodCallExp", "arguments", "formulaTerm", "qualifiedName", 
		"unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"stringExpression", "comparison", "notExpression", "logicalExpression", 
		"operatorExpression"
	};

	@Override
	public String getGrammarFileName() { return "FormulaScript.g4"; }

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
	    	if( text != null && text.length() >= 4 ) {
	    		text = text.substring( 1, text.length() - 1 );
	    		text = text.replaceAll( "\'", "'" );
	    		text = text.replaceAll( "\"", "\\\"" );
	    	}
	    	return text;
		}

	public FormulaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaScriptContext extends ParserRuleContext {
		public Script script;
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public FormulaScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFormulaScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFormulaScript(this);
		}
	}

	public final FormulaScriptContext formulaScript() throws RecognitionException {
		FormulaScriptContext _localctx = new FormulaScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formulaScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(58); importStatement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(64); variableDecl();
				}
				}
				setState(69);
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

	public static class BlockContext extends ParserRuleContext {
		public Block stmtHolder;
		public IfStatementContext ifStatement;
		public ForeachStatementContext foreachStatement;
		public AssignStatementContext assignStatement;
		public MethodCallStatementContext methodCallStatement;
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public List<ForeachStatementContext> foreachStatement() {
			return getRuleContexts(ForeachStatementContext.class);
		}
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public AssignStatementContext assignStatement(int i) {
			return getRuleContext(AssignStatementContext.class,i);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public ForeachStatementContext foreachStatement(int i) {
			return getRuleContext(ForeachStatementContext.class,i);
		}
		public List<MethodCallStatementContext> methodCallStatement() {
			return getRuleContexts(MethodCallStatementContext.class);
		}
		public MethodCallStatementContext methodCallStatement(int i) {
			return getRuleContext(MethodCallStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContext(ParserRuleContext parent, int invokingState, Block stmtHolder) {
			super(parent, invokingState);
			this.stmtHolder = stmtHolder;
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block(Block stmtHolder) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), stmtHolder);
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__22) | (1L << IDENT))) != 0)) {
				{
				setState(82);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(70); ((BlockContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(73); ((BlockContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContext)_localctx).foreachStatement.stmt); 
					}
					break;
				case 3:
					{
					setState(76); ((BlockContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(79); ((BlockContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				}
				}
				setState(86);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatement ifstmt;
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__22);
			setState(88); match(T__18);
			setState(89); logicalExpression();
			setState(90); match(T__5);
			((IfStatementContext)_localctx).ifstmt =  (IfStatement)handler.statement(ScriptTokens.IF); 
			setState(92); match(T__26);
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93); block(_localctx.ifstmt);
				}
				break;
			}
			setState(96); match(T__24);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(97); match(T__28);
				setState(98); match(T__18);
				setState(99); logicalExpression();
				setState(100); match(T__5);
				setState(101); match(T__26);
				setState(103);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(102); block(_localctx.ifstmt);
					}
					break;
				}
				setState(105); match(T__24);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(112); match(T__6);
				setState(113); match(T__26);
				setState(115);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(114); block(_localctx.ifstmt);
					}
					break;
				}
				setState(117); match(T__24);
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

	public static class DecodeStatementContext extends ParserRuleContext {
		public Statement stmt;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormulaTermContext formulaTerm() {
			return getRuleContext(FormulaTermContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FormulaScriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaScriptParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaScriptParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public DecodeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decodeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterDecodeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitDecodeStatement(this);
		}
	}

	public final DecodeStatementContext decodeStatement() throws RecognitionException {
		DecodeStatementContext _localctx = new DecodeStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decodeStatement);
		int _la;
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(T__10);
				setState(121); match(T__18);
				setState(122); match(IDENT);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); qualifiedName();
				setState(124); match(T__5);
				setState(125); match(T__26);
				setState(126);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(127); match(T__14);
				setState(128); formulaTerm();
				setState(129); match(T__24);
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public Statement stmt;
		public LoopConditionContext loopCondition() {
			return getRuleContext(LoopConditionContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(T__29);
			setState(134); match(T__18);
			setState(135); loopCondition();
			setState(136); match(T__5);
			setState(137); match(T__26);
			setState(138); match(T__24);
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

	public static class LoopConditionContext extends ParserRuleContext {
		public Token var;
		public Token from;
		public Token to;
		public TerminalNode NUMBER(int i) {
			return getToken(FormulaScriptParser.NUMBER, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(FormulaScriptParser.NUMBER); }
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public LoopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLoopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLoopCondition(this);
		}
	}

	public final LoopConditionContext loopCondition() throws RecognitionException {
		LoopConditionContext _localctx = new LoopConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(IDENT);
			setState(147);
			switch (_input.LA(1)) {
			case T__14:
				{
				{
				setState(141); match(T__14);
				setState(142); ((LoopConditionContext)_localctx).var = match(IDENT);
				}
				}
				break;
			case T__25:
				{
				{
				setState(143); match(T__25);
				setState(144); ((LoopConditionContext)_localctx).from = match(NUMBER);
				setState(145); match(T__14);
				setState(146); ((LoopConditionContext)_localctx).to = match(NUMBER);
				}
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

	public static class MethodCallStatementContext extends ParserRuleContext {
		public Statement stmt;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitMethodCallStatement(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); methodCallExp();
			setState(150); match(END_OF_STMT);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public Statement stmt;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public DecodeStatementContext decodeStatement() {
			return getRuleContext(DecodeStatementContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(152); match(IDENT);
				}
				break;
			case 2:
				{
				setState(153); qualifiedName();
				}
				break;
			}
			setState(156); match(T__21);
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157); formulaExpressionBase();
				}
				break;
			case 2:
				{
				setState(158); decodeStatement();
				}
				break;
			}
			setState(161); match(END_OF_STMT);
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

	public static class AssignBodyExprContext extends ParserRuleContext {
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public DecodeStatementContext decodeStatement() {
			return getRuleContext(DecodeStatementContext.class,0);
		}
		public AssignBodyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignBodyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterAssignBodyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitAssignBodyExpr(this);
		}
	}

	public final AssignBodyExprContext assignBodyExpr() throws RecognitionException {
		AssignBodyExprContext _localctx = new AssignBodyExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignBodyExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(T__21);
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(164); formulaExpressionBase();
				}
				break;
			case 2:
				{
				setState(165); decodeStatement();
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__0);
			setState(169); qualifiedName();
			setState(170); match(END_OF_STMT);
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

	public static class VariableDeclContext extends ParserRuleContext {
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public AssignBodyExprContext assignBodyExpr() {
			return getRuleContext(AssignBodyExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); type();
			setState(173); match(IDENT);
			setState(175);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(174); assignBodyExpr();
				}
			}

			setState(177); match(END_OF_STMT);
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

	public static class TypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); qualifiedName();
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFormulaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFormulaExpression(this);
		}
	}

	public final FormulaExpressionContext formulaExpression() throws RecognitionException {
		FormulaExpressionContext _localctx = new FormulaExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formulaExpression);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(183); match(T__25);
				setState(184); match(T__18);
				setState(185); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(186); match(T__5);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(189); match(T__25);
				setState(190); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFormulaExpressionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFormulaExpressionBase(this);
		}
	}

	public final FormulaExpressionBaseContext formulaExpressionBase() throws RecognitionException {
		FormulaExpressionBaseContext _localctx = new FormulaExpressionBaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(195); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(198); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(201); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public FuncCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFuncCallExp(this);
		}
	}

	public final FuncCallExpContext funcCallExp() throws RecognitionException {
		FuncCallExpContext _localctx = new FuncCallExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(207); match(T__18);
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(208); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(211); match(T__5);
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
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public MethodCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterMethodCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitMethodCallExp(this);
		}
	}

	public final MethodCallExpContext methodCallExp() throws RecognitionException {
		MethodCallExpContext _localctx = new MethodCallExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(216); match(T__15);
			setState(217); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(219); match(T__18);
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(220); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(223); match(T__5);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).nodeList =  new LinkedList<Node>(); 
			setState(238);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(227); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(229); match(T__16);
					setState(230); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
					 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
					}
					}
					setState(237);
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
		public TerminalNode STRING_LITERAL() { return getToken(FormulaScriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaScriptParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaScriptParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public FormulaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formulaTerm);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); ((FormulaTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((FormulaTermContext)_localctx).BOOLEAN!=null?((FormulaTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); ((FormulaTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((FormulaTermContext)_localctx).STRING_LITERAL!=null?((FormulaTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); ((FormulaTermContext)_localctx).NUMBER = match(NUMBER);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((FormulaTermContext)_localctx).NUMBER!=null?((FormulaTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); ((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  handler.refer( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
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
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261); match(T__15);
					setState(262); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(272);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(270); match(T__1);
				 negative = true; 
				}
			}

			setState(282);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(274); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__18:
				{
				setState(277); match(T__18);
				setState(278); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(279); match(T__5);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(290);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(288); match(T__7);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(294); match(T__23);
				setState(295); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(302);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || _la==T__17) {
				{
				setState(313);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(305); match(T__17);
					setState(306); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__30:
					{
					setState(309); match(T__30);
					setState(310); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(317);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__1) {
				{
				setState(328);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(320); match(T__3);
					setState(321); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(324); match(T__1);
					setState(325); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(332);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(335); match(T__19);
				setState(336); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(343);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__25) | (1L << T__20) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8))) != 0)) {
				{
				setState(374);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(346); match(T__25);
					setState(347); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__27:
					{
					setState(350); match(T__27);
					setState(351); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__8:
					{
					setState(354); match(T__8);
					setState(355); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__11:
					{
					setState(358); match(T__11);
					setState(359); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__13:
					{
					setState(362); match(T__13);
					setState(363); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__12:
					{
					setState(366); match(T__12);
					setState(367); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case T__20:
					{
					setState(370); match(T__20);
					setState(371); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(378);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			switch (_input.LA(1)) {
			case T__18:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(379); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__2:
				{
				setState(382); match(T__2);
				setState(383); ((NotExpressionContext)_localctx).comparison = comparison();
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(398);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(390); match(T__4);
						setState(391); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__9:
						{
						setState(394); match(T__9);
						setState(395); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitOperatorExpression(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\7\4n\n\4\f\4\16\4q"+
		"\13\4\3\4\3\4\3\4\5\4v\n\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0096\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u009d\n\t\3\t\3\t"+
		"\3\t\5\t\u00a2\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\r\3\r\5\r\u00b8\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\5\20\u00d4"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e0\n\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ec\n\22\f\22"+
		"\16\22\u00ef\13\22\5\22\u00f1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0104\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u010b\n\24\f\24\16\24\u010e\13\24\3\25\3\25"+
		"\3\25\5\25\u0113\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011d"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0125\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u013c\n\30\f\30\16\30\u013f\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u014b\n\31\f\31"+
		"\16\31\u014e\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0156\n\32\f\32"+
		"\16\32\u0159\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u0179\n\33\f\33\16\33\u017c\13\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0185\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0191\n\35\f\35\16\35\u0194\13\35"+
		"\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\3\3\2#%\u01ae\2?\3\2\2\2\4V\3\2\2\2\6Y\3\2\2\2"+
		"\b\u0085\3\2\2\2\n\u0087\3\2\2\2\f\u008e\3\2\2\2\16\u0097\3\2\2\2\20\u009c"+
		"\3\2\2\2\22\u00a5\3\2\2\2\24\u00aa\3\2\2\2\26\u00ae\3\2\2\2\30\u00b7\3"+
		"\2\2\2\32\u00c3\3\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3\2\2\2 \u00d8\3\2\2"+
		"\2\"\u00e4\3\2\2\2$\u0103\3\2\2\2&\u0105\3\2\2\2(\u010f\3\2\2\2*\u0120"+
		"\3\2\2\2,\u0126\3\2\2\2.\u0131\3\2\2\2\60\u0140\3\2\2\2\62\u014f\3\2\2"+
		"\2\64\u015a\3\2\2\2\66\u0184\3\2\2\28\u0186\3\2\2\2:\u0195\3\2\2\2<>\5"+
		"\24\13\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2B"+
		"D\5\26\f\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2"+
		"\2HI\5\6\4\2IJ\b\3\1\2JU\3\2\2\2KL\5\n\6\2LM\b\3\1\2MU\3\2\2\2NO\5\20"+
		"\t\2OP\b\3\1\2PU\3\2\2\2QR\5\16\b\2RS\b\3\1\2SU\3\2\2\2TH\3\2\2\2TK\3"+
		"\2\2\2TN\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\5\3\2\2\2XV"+
		"\3\2\2\2YZ\7\13\2\2Z[\7\17\2\2[\\\58\35\2\\]\7\34\2\2]^\b\4\1\2^`\7\7"+
		"\2\2_a\5\4\3\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bo\7\t\2\2cd\7\5\2\2de\7\17"+
		"\2\2ef\58\35\2fg\7\34\2\2gi\7\7\2\2hj\5\4\3\2ih\3\2\2\2ij\3\2\2\2jk\3"+
		"\2\2\2kl\7\t\2\2ln\3\2\2\2mc\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2px\3"+
		"\2\2\2qo\3\2\2\2rs\7\33\2\2su\7\7\2\2tv\5\4\3\2ut\3\2\2\2uv\3\2\2\2vw"+
		"\3\2\2\2wy\7\t\2\2xr\3\2\2\2xy\3\2\2\2y\7\3\2\2\2z{\7\27\2\2{|\7\17\2"+
		"\2|\u0086\7&\2\2}~\5&\24\2~\177\7\34\2\2\177\u0080\7\7\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\u0082\7\23\2\2\u0082\u0083\5$\23\2\u0083\u0084\7\t\2\2"+
		"\u0084\u0086\3\2\2\2\u0085z\3\2\2\2\u0085}\3\2\2\2\u0086\t\3\2\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\7\17\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7"+
		"\34\2\2\u008b\u008c\7\7\2\2\u008c\u008d\7\t\2\2\u008d\13\3\2\2\2\u008e"+
		"\u0095\7&\2\2\u008f\u0090\7\23\2\2\u0090\u0096\7&\2\2\u0091\u0092\7\b"+
		"\2\2\u0092\u0093\7#\2\2\u0093\u0094\7\23\2\2\u0094\u0096\7#\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0096\r\3\2\2\2\u0097\u0098\5 \21\2"+
		"\u0098\u0099\7\"\2\2\u0099\17\3\2\2\2\u009a\u009d\7&\2\2\u009b\u009d\5"+
		"&\24\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a1\7\f\2\2\u009f\u00a2\5\34\17\2\u00a0\u00a2\5\b\5\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\"\2\2\u00a4"+
		"\21\3\2\2\2\u00a5\u00a8\7\f\2\2\u00a6\u00a9\5\34\17\2\u00a7\u00a9\5\b"+
		"\5\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00ab"+
		"\7!\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\"\2\2\u00ad\25\3\2\2\2\u00ae"+
		"\u00af\5\30\r\2\u00af\u00b1\7&\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00b0\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\"\2\2\u00b4"+
		"\27\3\2\2\2\u00b5\u00b8\7&\2\2\u00b6\u00b8\5&\24\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb"+
		"\7\17\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\34\2\2\u00bd\u00be\b\16"+
		"\1\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5\34\17\2\u00c1"+
		"\u00c2\b\16\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bf\3"+
		"\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c6\5:\36\2\u00c6\u00c7\b\17\1\2\u00c7"+
		"\u00cf\3\2\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\b\17\1\2\u00ca\u00cf"+
		"\3\2\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\b\17\1\2\u00cd\u00cf\3\2\2\2"+
		"\u00ce\u00c5\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\35"+
		"\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1\u00d3\7\17\2\2\u00d2\u00d4\5\"\22\2"+
		"\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\7\34\2\2\u00d6\u00d7\b\20\1\2\u00d7\37\3\2\2\2\u00d8\u00d9\5&\24\2\u00d9"+
		"\u00da\b\21\1\2\u00da\u00db\7\22\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd\b"+
		"\21\1\2\u00dd\u00df\7\17\2\2\u00de\u00e0\5\"\22\2\u00df\u00de\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\34\2\2\u00e2\u00e3"+
		"\b\21\1\2\u00e3!\3\2\2\2\u00e4\u00f0\b\22\1\2\u00e5\u00e6\5:\36\2\u00e6"+
		"\u00ed\b\22\1\2\u00e7\u00e8\7\21\2\2\u00e8\u00e9\5:\36\2\u00e9\u00ea\b"+
		"\22\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1#\3\2\2\2\u00f2\u00f3"+
		"\7%\2\2\u00f3\u0104\b\23\1\2\u00f4\u00f5\7$\2\2\u00f5\u0104\b\23\1\2\u00f6"+
		"\u00f7\7#\2\2\u00f7\u0104\b\23\1\2\u00f8\u00f9\7&\2\2\u00f9\u0104\b\23"+
		"\1\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\b\23\1\2\u00fc\u0104\3\2\2\2\u00fd"+
		"\u00fe\5\36\20\2\u00fe\u00ff\b\23\1\2\u00ff\u0104\3\2\2\2\u0100\u0101"+
		"\5 \21\2\u0101\u0102\b\23\1\2\u0102\u0104\3\2\2\2\u0103\u00f2\3\2\2\2"+
		"\u0103\u00f4\3\2\2\2\u0103\u00f6\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00fa"+
		"\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0100\3\2\2\2\u0104%\3\2\2\2\u0105"+
		"\u0106\7&\2\2\u0106\u010c\b\24\1\2\u0107\u0108\7\22\2\2\u0108\u0109\7"+
		"&\2\2\u0109\u010b\b\24\1\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\'\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0112\b\25\1\2\u0110\u0111\7 \2\2\u0111\u0113\b\25\1\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011c\3\2\2\2\u0114\u0115\5$\23\2\u0115"+
		"\u0116\b\25\1\2\u0116\u011d\3\2\2\2\u0117\u0118\7\17\2\2\u0118\u0119\5"+
		":\36\2\u0119\u011a\7\34\2\2\u011a\u011b\b\25\1\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\25"+
		"\1\2\u011f)\3\2\2\2\u0120\u0121\5(\25\2\u0121\u0124\b\26\1\2\u0122\u0123"+
		"\7\32\2\2\u0123\u0125\b\26\1\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125+\3\2\2\2\u0126\u0127\5*\26\2\u0127\u012e\b\27\1\2\u0128\u0129\7"+
		"\n\2\2\u0129\u012a\5*\26\2\u012a\u012b\b\27\1\2\u012b\u012d\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f-\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5,\27\2\u0132\u013d"+
		"\b\30\1\2\u0133\u0134\7\20\2\2\u0134\u0135\5,\27\2\u0135\u0136\b\30\1"+
		"\2\u0136\u013c\3\2\2\2\u0137\u0138\7\3\2\2\u0138\u0139\5,\27\2\u0139\u013a"+
		"\b\30\1\2\u013a\u013c\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0137\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e/\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5.\30\2\u0141\u014c\b\31\1\2\u0142"+
		"\u0143\7\36\2\2\u0143\u0144\5.\30\2\u0144\u0145\b\31\1\2\u0145\u014b\3"+
		"\2\2\2\u0146\u0147\7 \2\2\u0147\u0148\5.\30\2\u0148\u0149\b\31\1\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\61\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0150\5\60\31\2\u0150\u0157\b\32\1\2\u0151\u0152\7\16\2"+
		"\2\u0152\u0153\5\60\31\2\u0153\u0154\b\32\1\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\63\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\62\32\2\u015b"+
		"\u017a\b\33\1\2\u015c\u015d\7\b\2\2\u015d\u015e\5\62\32\2\u015e\u015f"+
		"\b\33\1\2\u015f\u0179\3\2\2\2\u0160\u0161\7\6\2\2\u0161\u0162\5\62\32"+
		"\2\u0162\u0163\b\33\1\2\u0163\u0179\3\2\2\2\u0164\u0165\7\31\2\2\u0165"+
		"\u0166\5\62\32\2\u0166\u0167\b\33\1\2\u0167\u0179\3\2\2\2\u0168\u0169"+
		"\7\26\2\2\u0169\u016a\5\62\32\2\u016a\u016b\b\33\1\2\u016b\u0179\3\2\2"+
		"\2\u016c\u016d\7\24\2\2\u016d\u016e\5\62\32\2\u016e\u016f\b\33\1\2\u016f"+
		"\u0179\3\2\2\2\u0170\u0171\7\25\2\2\u0171\u0172\5\62\32\2\u0172\u0173"+
		"\b\33\1\2\u0173\u0179\3\2\2\2\u0174\u0175\7\r\2\2\u0175\u0176\5\62\32"+
		"\2\u0176\u0177\b\33\1\2\u0177\u0179\3\2\2\2\u0178\u015c\3\2\2\2\u0178"+
		"\u0160\3\2\2\2\u0178\u0164\3\2\2\2\u0178\u0168\3\2\2\2\u0178\u016c\3\2"+
		"\2\2\u0178\u0170\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\65\3\2\2\2\u017c\u017a\3\2\2"+
		"\2\u017d\u017e\5\64\33\2\u017e\u017f\b\34\1\2\u017f\u0185\3\2\2\2\u0180"+
		"\u0181\7\37\2\2\u0181\u0182\5\64\33\2\u0182\u0183\b\34\1\2\u0183\u0185"+
		"\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u0180\3\2\2\2\u0185\67\3\2\2\2\u0186"+
		"\u0187\5\66\34\2\u0187\u0192\b\35\1\2\u0188\u0189\7\35\2\2\u0189\u018a"+
		"\5:\36\2\u018a\u018b\b\35\1\2\u018b\u0191\3\2\2\2\u018c\u018d\7\30\2\2"+
		"\u018d\u018e\5:\36\2\u018e\u018f\b\35\1\2\u018f\u0191\3\2\2\2\u0190\u0188"+
		"\3\2\2\2\u0190\u018c\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u01939\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\58\35\2"+
		"\u0196\u0197\b\36\1\2\u0197;\3\2\2\2(?ETV`ioux\u0085\u0095\u009c\u00a1"+
		"\u00a8\u00b1\u00b7\u00c3\u00ce\u00d3\u00df\u00ed\u00f0\u0103\u010c\u0112"+
		"\u011c\u0124\u012e\u013b\u013d\u014a\u014c\u0157\u0178\u017a\u0184\u0190"+
		"\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
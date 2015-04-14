// Generated from FormulaScript.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

	
	import kr.simula.formula.script.*;
	import kr.simula.formula.script.statement.*;
	import kr.simula.formula.util.*;


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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, END_OF_STMT=35, NUMBER=36, STRING_LITERAL=37, 
		BOOLEAN=38, IDENT=39, WS=40, MULTILINE_COMMENT=41, LINE_COMMENT=42, NEGATION=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'foreach'", "'elseif'", "'return'", "'!='", "'{'", 
		"'='", "'}'", "'^'", "'if'", "'<='", "'&'", "'('", "'is'", "'*'", "','", 
		"'.'", "'->'", "'<-'", "':'", "'>='", "'<'", "'>'", "'or'", "'<>'", "'%'", 
		"'in'", "'else'", "')'", "'and'", "'+'", "'not'", "'-'", "'import'", "';'", 
		"NUMBER", "STRING_LITERAL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaScript = 0, RULE_importStatement = 1, RULE_variableDecl = 2, 
		RULE_type = 3, RULE_functionDecl = 4, RULE_argsDecl = 5, RULE_retrunStmt = 6, 
		RULE_blockContents = 7, RULE_ifStatement = 8, RULE_foreachStatement = 9, 
		RULE_loopCondition = 10, RULE_methodCallStatement = 11, RULE_functionCallStatement = 12, 
		RULE_assignStatement = 13, RULE_leftAssign = 14, RULE_rightAssign = 15, 
		RULE_formulaExpression = 16, RULE_formulaExpressionBase = 17, RULE_funcCallExp = 18, 
		RULE_methodCallExp = 19, RULE_arguments = 20, RULE_formulaTerm = 21, RULE_qualifiedName = 22, 
		RULE_unary = 23, RULE_percent = 24, RULE_exponential = 25, RULE_multiplicative = 26, 
		RULE_additiveExpression = 27, RULE_stringExpression = 28, RULE_comparison = 29, 
		RULE_notExpression = 30, RULE_logicalExpression = 31, RULE_operatorExpression = 32;
	public static final String[] ruleNames = {
		"formulaScript", "importStatement", "variableDecl", "type", "functionDecl", 
		"argsDecl", "retrunStmt", "blockContents", "ifStatement", "foreachStatement", 
		"loopCondition", "methodCallStatement", "functionCallStatement", "assignStatement", 
		"leftAssign", "rightAssign", "formulaExpression", "formulaExpressionBase", 
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
	    	if( text != null && text.length() >= 3 ) {
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
		public Module module;
		public ImportStatementContext importStatement;
		public FunctionDeclContext functionDecl;
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public TerminalNode EOF() { return getToken(FormulaScriptParser.EOF, 0); }
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((FormulaScriptContext)_localctx).module =  (Module)handler.block(ScriptTokens.MODULE); 
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(67); ((FormulaScriptContext)_localctx).importStatement = importStatement();
				 _localctx.module.append(((FormulaScriptContext)_localctx).importStatement.stmt); 
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75); ((FormulaScriptContext)_localctx).functionDecl = functionDecl();
					 _localctx.module.append(((FormulaScriptContext)_localctx).functionDecl.fnBlock); 
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(83); blockContents(_localctx.module);
			setState(84); match(EOF);
			 handler.endBlock();
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
		public Statement stmt;
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
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__0);
			setState(88); qualifiedName();
			setState(89); match(END_OF_STMT);
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
		public VariableDeclStatement stmt;
		public TypeContext type;
		public Token IDENT;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
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
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); ((VariableDeclContext)_localctx).type = type();
			setState(92); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = handler.declare(ScriptTokens.VAR_DECL, ((VariableDeclContext)_localctx).type.typeClz ,(((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null)); 
					((VariableDeclContext)_localctx).stmt =  (VariableDeclStatement)handler.statement(ScriptTokens.VAR_DECL, varRef);
				
			setState(98);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(94); match(T__15);
				setState(95); ((VariableDeclContext)_localctx).formulaExpressionBase = formulaExpressionBase();
					_localctx.stmt.setValueNode(((VariableDeclContext)_localctx).formulaExpressionBase.result); 
				}
			}

			setState(100); match(END_OF_STMT);
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
		public Class<?> typeClz;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
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
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102); ((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).typeClz =  handler.type((((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null)); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(104); ((TypeContext)_localctx).qualifiedName = qualifiedName();
				 ((TypeContext)_localctx).typeClz =  handler.type((((TypeContext)_localctx).qualifiedName!=null?_input.getText(((TypeContext)_localctx).qualifiedName.start,((TypeContext)_localctx).qualifiedName.stop):null)); 
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public BlockStatement fnBlock;
		public TypeContext type;
		public Token IDENT;
		public ArgsDeclContext argsDecl() {
			return getRuleContext(ArgsDeclContext.class,0);
		}
		public RetrunStmtContext retrunStmt() {
			return getRuleContext(RetrunStmtContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Ref> args = new LinkedList<Ref>(); 
			setState(110); ((FunctionDeclContext)_localctx).type = type();
			setState(111); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(112); match(T__21);
			setState(114);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(113); argsDecl(args);
				}
			}

			setState(116); match(T__5);
			setState(117); match(T__28);
			 
					((FunctionDeclContext)_localctx).fnBlock =  handler.declareFn(((FunctionDeclContext)_localctx).type.typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
				
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(119); blockContents(_localctx.fnBlock);
				}
				break;
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(122); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(125); match(T__26);
				handler.endBlock(); 
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

	public static class ArgsDeclContext extends ParserRuleContext {
		public List<Ref> args;
		public TypeContext type;
		public Token IDENT;
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public ArgsDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsDeclContext(ParserRuleContext parent, int invokingState, List<Ref> args) {
			super(parent, invokingState);
			this.args = args;
		}
		@Override public int getRuleIndex() { return RULE_argsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterArgsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitArgsDecl(this);
		}
	}

	public final ArgsDeclContext argsDecl(List<Ref> args) throws RecognitionException {
		ArgsDeclContext _localctx = new ArgsDeclContext(_ctx, getState(), args);
		enterRule(_localctx, 10, RULE_argsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128); ((ArgsDeclContext)_localctx).type = type();
			setState(129); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(131); match(T__18);
				setState(132); ((ArgsDeclContext)_localctx).type = type();
				setState(133); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RetrunStmtContext extends ParserRuleContext {
		public BlockStatement fnBlock;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public RetrunStmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RetrunStmtContext(ParserRuleContext parent, int invokingState, BlockStatement fnBlock) {
			super(parent, invokingState);
			this.fnBlock = fnBlock;
		}
		@Override public int getRuleIndex() { return RULE_retrunStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterRetrunStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitRetrunStmt(this);
		}
	}

	public final RetrunStmtContext retrunStmt(BlockStatement fnBlock) throws RecognitionException {
		RetrunStmtContext _localctx = new RetrunStmtContext(_ctx, getState(), fnBlock);
		enterRule(_localctx, 12, RULE_retrunStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Node arg = null; 
			setState(142); match(T__30);
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(143); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( handler.statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(149); match(END_OF_STMT);
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

	public static class BlockContentsContext extends ParserRuleContext {
		public Block stmtHolder;
		public IfStatementContext ifStatement;
		public ForeachStatementContext foreachStatement;
		public AssignStatementContext assignStatement;
		public MethodCallStatementContext methodCallStatement;
		public FunctionCallStatementContext functionCallStatement;
		public VariableDeclContext variableDecl;
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public List<ForeachStatementContext> foreachStatement() {
			return getRuleContexts(ForeachStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
		}
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
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
		public BlockContentsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContentsContext(ParserRuleContext parent, int invokingState, Block stmtHolder) {
			super(parent, invokingState);
			this.stmtHolder = stmtHolder;
		}
		@Override public int getRuleIndex() { return RULE_blockContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterBlockContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitBlockContents(this);
		}
	}

	public final BlockContentsContext blockContents(Block stmtHolder) throws RecognitionException {
		BlockContentsContext _localctx = new BlockContentsContext(_ctx, getState(), stmtHolder);
		enterRule(_localctx, 14, RULE_blockContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__24) | (1L << T__21) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(169);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(151); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(154); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(157); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(160); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(163); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(166); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
				}
				}
				setState(173);
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
		public LogicalExpressionContext logicalExpression;
		public BlockContentsContext blockContents(int i) {
			return getRuleContext(BlockContentsContext.class,i);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<BlockContentsContext> blockContents() {
			return getRuleContexts(BlockContentsContext.class);
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
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(T__24);
			setState(175); match(T__21);
			setState(176); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(177); match(T__5);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)handler.statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(179); match(T__28);
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(180); blockContents(_localctx.ifstmt);
				}
				break;
			}
			setState(183); match(T__26);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(184); match(T__31);
				setState(185); match(T__21);
				setState(186); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(187); match(T__5);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(189); match(T__28);
				setState(191);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(190); blockContents(elseIfStmt);
					}
					break;
				}
				setState(193); match(T__26);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(200); match(T__6);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(202); match(T__28);
				setState(204);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(203); blockContents(elseStmt);
					}
					break;
				}
				setState(206); match(T__26);
				}
			}

				handler.endBlock(); 
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
		public BlockStatement foreachStmt;
		public LoopConditionContext loopCondition;
		public LoopConditionContext loopCondition() {
			return getRuleContext(LoopConditionContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
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
		enterRule(_localctx, 18, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(T__32);
			setState(212); match(T__21);
			setState(213); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(214); match(T__5);

						((ForeachStatementContext)_localctx).foreachStmt =  handler.statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(216); match(T__28);
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(217); blockContents(_localctx.foreachStmt);
				}
				break;
			}
			setState(220); match(T__26);
				handler.endBlock(); 
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
		public LoopConditionStatement condition;
		public TypeContext type;
		public Token IDENT;
		public Token var;
		public Token from;
		public Token to;
		public TerminalNode NUMBER(int i) {
			return getToken(FormulaScriptParser.NUMBER, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 20, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); ((LoopConditionContext)_localctx).type = type();
			setState(224); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = handler.declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)handler.statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(234);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(226); match(T__7);
				setState(227); ((LoopConditionContext)_localctx).var = match(IDENT);

								Ref iteratorRef = handler.refer( (((LoopConditionContext)_localctx).var!=null?((LoopConditionContext)_localctx).var.getText():null));
								_localctx.condition.setIteratorRef(iteratorRef);
							
				}
				}
				break;
			case T__27:
				{
				{
				setState(229); match(T__27);
				setState(230); ((LoopConditionContext)_localctx).from = match(NUMBER);
				setState(231); match(T__14);
				setState(232); ((LoopConditionContext)_localctx).to = match(NUMBER);

								Range range = Range.create((((LoopConditionContext)_localctx).from!=null?((LoopConditionContext)_localctx).from.getText():null), (((LoopConditionContext)_localctx).to!=null?((LoopConditionContext)_localctx).to.getText():null));
								_localctx.condition.setRange(range);
							
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
		public MethodCallExpContext methodCallExp;
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
		enterRule(_localctx, 22, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			setState(237); match(END_OF_STMT);
			 ((MethodCallStatementContext)_localctx).stmt =  handler.statement(ScriptTokens.MTHODE_CALL_STMT, ((MethodCallStatementContext)_localctx).methodCallExp.result); 
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public Statement stmt;
		public FuncCallExpContext funcCallExp;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			setState(241); match(END_OF_STMT);
			 ((FunctionCallStatementContext)_localctx).stmt =  handler.statement(ScriptTokens.FUNCTION_CALL_STMT, ((FunctionCallStatementContext)_localctx).funcCallExp.result); 
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
		public LeftAssignContext leftAssign;
		public RightAssignContext rightAssign;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public RightAssignContext rightAssign() {
			return getRuleContext(RightAssignContext.class,0);
		}
		public LeftAssignContext leftAssign() {
			return getRuleContext(LeftAssignContext.class,0);
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
		enterRule(_localctx, 26, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(244); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(247); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).rightAssign.stmt ; 
				}
				break;
			}
			setState(252); match(END_OF_STMT);
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

	public static class LeftAssignContext extends ParserRuleContext {
		public Statement stmt;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public LeftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLeftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLeftAssign(this);
		}
	}

	public final LeftAssignContext leftAssign() throws RecognitionException {
		LeftAssignContext _localctx = new LeftAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_leftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(255); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(257); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			}
			setState(262); match(T__15);
			setState(263); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			 ((LeftAssignContext)_localctx).stmt =  handler.statement(ScriptTokens.ASSIGN_STMT, settable, ((LeftAssignContext)_localctx).formulaExpressionBase.result); 
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

	public static class RightAssignContext extends ParserRuleContext {
		public Statement stmt;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public RightAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterRightAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitRightAssign(this);
		}
	}

	public final RightAssignContext rightAssign() throws RecognitionException {
		RightAssignContext _localctx = new RightAssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rightAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(267); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(268); match(T__16);
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(271); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((RightAssignContext)_localctx).qualifiedName.result;
				}
				break;
			}
			 ((RightAssignContext)_localctx).stmt =  handler.statement(ScriptTokens.ASSIGN_STMT, settable, ((RightAssignContext)_localctx).formulaExpressionBase.result); 
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
		enterRule(_localctx, 32, RULE_formulaExpression);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(278); match(T__27);
				setState(279); match(T__21);
				setState(280); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(281); match(T__5);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(284); match(T__27);
				setState(285); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
		enterRule(_localctx, 34, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(290); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(293); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(296); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 36, RULE_funcCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(302); match(T__21);
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(303); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(306); match(T__5);
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
		enterRule(_localctx, 38, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(311); match(T__17);
			setState(312); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(314); match(T__21);
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(315); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(318); match(T__5);
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
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).nodeList =  new LinkedList<Node>(); 
			setState(333);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(322); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(324); match(T__18);
					setState(325); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
					 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
					}
					}
					setState(332);
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
		enterRule(_localctx, 42, RULE_formulaTerm);
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); ((FormulaTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((FormulaTermContext)_localctx).BOOLEAN!=null?((FormulaTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337); ((FormulaTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((FormulaTermContext)_localctx).STRING_LITERAL!=null?((FormulaTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339); ((FormulaTermContext)_localctx).NUMBER = match(NUMBER);
				 ((FormulaTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((FormulaTermContext)_localctx).NUMBER!=null?((FormulaTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341); ((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  handler.refer( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(349); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 44, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356); match(T__17);
					setState(357); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(363);
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
		enterRule(_localctx, 46, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(367);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(365); match(T__1);
				 negative = true; 
				}
			}

			setState(377);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(369); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__21:
				{
				setState(372); match(T__21);
				setState(373); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(374); match(T__5);
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
		enterRule(_localctx, 48, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(385);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(383); match(T__8);
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
		enterRule(_localctx, 50, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(389); match(T__25);
				setState(390); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(397);
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
		enterRule(_localctx, 52, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__19) {
				{
				setState(408);
				switch (_input.LA(1)) {
				case T__19:
					{
					setState(400); match(T__19);
					setState(401); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__33:
					{
					setState(404); match(T__33);
					setState(405); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(412);
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
		enterRule(_localctx, 54, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__1) {
				{
				setState(423);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(415); match(T__3);
					setState(416); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(419); match(T__1);
					setState(420); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(427);
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
		enterRule(_localctx, 56, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(430); match(T__22);
				setState(431); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(438);
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
		enterRule(_localctx, 58, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__27) | (1L << T__23) | (1L << T__20) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__9))) != 0)) {
				{
				setState(478);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(441); match(T__27);
					setState(442); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(445); match(T__20);
					setState(446); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(449); match(T__29);
					setState(450); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(453); match(T__9);
					setState(454); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(457); match(T__20);
					setState(458); match(T__2);
					setState(459); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(462); match(T__11);
					setState(463); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(466); match(T__13);
					setState(467); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(470); match(T__12);
					setState(471); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(474); match(T__23);
					setState(475); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(482);
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
		enterRule(_localctx, 60, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			switch (_input.LA(1)) {
			case T__21:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN:
			case IDENT:
				{
				setState(483); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__2:
				{
				setState(486); match(T__2);
				setState(487); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 62, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(502);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(494); match(T__4);
						setState(495); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__10:
						{
						setState(498); match(T__10);
						setState(499); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 64, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0201\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\2\7\2Q\n"+
		"\2\f\2\16\2T\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4e\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6u\n\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0095\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00c2\n\n\3\n\3\n\7\n\u00c6\n\n\f\n\16\n\u00c9\13\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00cf\n\n\3\n\5\n\u00d2\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00dd\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fd\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0107\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0115\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0123\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u012e\n\23\3\24\3\24\3\24\5\24\u0133\n\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013f\n\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014b\n\26\f\26\16\26\u014e"+
		"\13\26\5\26\u0150\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u016a\n\30\f\30\16\30\u016d\13\30\3\31\3\31\3\31\5\31"+
		"\u0172\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017c\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\5\32\u0184\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u018c\n\33\f\33\16\33\u018f\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u019b\n\34\f\34\16\34\u019e\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01aa\n\35\f\35\16"+
		"\35\u01ad\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01b5\n\36\f\36\16"+
		"\36\u01b8\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u01e1\n\37\f\37\16\37\u01e4\13\37\3 \3 \3 \3 \3 \3 \3 \5 \u01ed"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01f9\n!\f!\16!\u01fc\13!\3\"\3\""+
		"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@B\2\2\u021b\2D\3\2\2\2\4Y\3\2\2\2\6]\3\2\2\2\bm\3\2\2\2\no\3\2"+
		"\2\2\f\u0082\3\2\2\2\16\u008f\3\2\2\2\20\u00ad\3\2\2\2\22\u00b0\3\2\2"+
		"\2\24\u00d5\3\2\2\2\26\u00e1\3\2\2\2\30\u00ee\3\2\2\2\32\u00f2\3\2\2\2"+
		"\34\u00fc\3\2\2\2\36\u0100\3\2\2\2 \u010c\3\2\2\2\"\u0122\3\2\2\2$\u012d"+
		"\3\2\2\2&\u012f\3\2\2\2(\u0137\3\2\2\2*\u0143\3\2\2\2,\u0162\3\2\2\2."+
		"\u0164\3\2\2\2\60\u016e\3\2\2\2\62\u017f\3\2\2\2\64\u0185\3\2\2\2\66\u0190"+
		"\3\2\2\28\u019f\3\2\2\2:\u01ae\3\2\2\2<\u01b9\3\2\2\2>\u01ec\3\2\2\2@"+
		"\u01ee\3\2\2\2B\u01fd\3\2\2\2DJ\b\2\1\2EF\5\4\3\2FG\b\2\1\2GI\3\2\2\2"+
		"HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KR\3\2\2\2LJ\3\2\2\2MN\5\n\6\2"+
		"NO\b\2\1\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2"+
		"TR\3\2\2\2UV\5\20\t\2VW\7\2\2\3WX\b\2\1\2X\3\3\2\2\2YZ\7$\2\2Z[\5.\30"+
		"\2[\\\7%\2\2\\\5\3\2\2\2]^\5\b\5\2^_\7)\2\2_d\b\4\1\2`a\7\25\2\2ab\5$"+
		"\23\2bc\b\4\1\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7%\2\2g\7\3"+
		"\2\2\2hi\7)\2\2in\b\5\1\2jk\5.\30\2kl\b\5\1\2ln\3\2\2\2mh\3\2\2\2mj\3"+
		"\2\2\2n\t\3\2\2\2op\b\6\1\2pq\5\b\5\2qr\7)\2\2rt\7\17\2\2su\5\f\7\2ts"+
		"\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\37\2\2wx\7\b\2\2xz\b\6\1\2y{\5\20\t\2"+
		"zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5\16\b\2}|\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\n\2\2\u0080\u0081\b\6\1\2\u0081\13\3\2\2\2\u0082\u0083"+
		"\5\b\5\2\u0083\u0084\7)\2\2\u0084\u008c\b\7\1\2\u0085\u0086\7\22\2\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\7)\2\2\u0088\u0089\b\7\1\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\r\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\b\1\2"+
		"\u0090\u0094\7\6\2\2\u0091\u0092\5$\23\2\u0092\u0093\b\b\1\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\b\1\2\u0097\u0098\7%\2\2\u0098\17\3\2\2\2\u0099\u009a\5\22\n"+
		"\2\u009a\u009b\b\t\1\2\u009b\u00ac\3\2\2\2\u009c\u009d\5\24\13\2\u009d"+
		"\u009e\b\t\1\2\u009e\u00ac\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\b"+
		"\t\1\2\u00a1\u00ac\3\2\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\b\t\1\2\u00a4"+
		"\u00ac\3\2\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\b\t\1\2\u00a7\u00ac\3"+
		"\2\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\b\t\1\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0099\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2"+
		"\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\5@!\2\u00b3\u00b4"+
		"\7\37\2\2\u00b4\u00b5\b\n\1\2\u00b5\u00b7\7\b\2\2\u00b6\u00b8\5\20\t\2"+
		"\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c7"+
		"\7\n\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5@!\2\u00bd"+
		"\u00be\7\37\2\2\u00be\u00bf\b\n\1\2\u00bf\u00c1\7\b\2\2\u00c0\u00c2\5"+
		"\20\t\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\n\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\36\2\2\u00cb\u00cc\b\n\1\2\u00cc\u00ce\7"+
		"\b\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\7\n\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\n\1\2\u00d4\23\3\2\2\2\u00d5\u00d6"+
		"\7\4\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7\37\2"+
		"\2\u00d9\u00da\b\13\1\2\u00da\u00dc\7\b\2\2\u00db\u00dd\5\20\t\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\n"+
		"\2\2\u00df\u00e0\b\13\1\2\u00e0\25\3\2\2\2\u00e1\u00e2\5\b\5\2\u00e2\u00e3"+
		"\7)\2\2\u00e3\u00ec\b\f\1\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\7)\2\2\u00e6"+
		"\u00ed\b\f\1\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\7\26"+
		"\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ed\b\f\1\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00e7\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0\7%\2\2"+
		"\u00f0\u00f1\b\r\1\2\u00f1\31\3\2\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4"+
		"\7%\2\2\u00f4\u00f5\b\16\1\2\u00f5\33\3\2\2\2\u00f6\u00f7\5\36\20\2\u00f7"+
		"\u00f8\b\17\1\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\b"+
		"\17\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\7%\2\2\u00ff\35\3\2\2\2\u0100\u0106\b\20\1"+
		"\2\u0101\u0102\7)\2\2\u0102\u0107\b\20\1\2\u0103\u0104\5.\30\2\u0104\u0105"+
		"\b\20\1\2\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0109\7\25\2\2\u0109\u010a\5$\23\2\u010a\u010b"+
		"\b\20\1\2\u010b\37\3\2\2\2\u010c\u010d\b\21\1\2\u010d\u010e\5$\23\2\u010e"+
		"\u0114\7\24\2\2\u010f\u0110\7)\2\2\u0110\u0115\b\21\1\2\u0111\u0112\5"+
		".\30\2\u0112\u0113\b\21\1\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\21\1\2\u0117!\3\2\2\2"+
		"\u0118\u0119\7\t\2\2\u0119\u011a\7\17\2\2\u011a\u011b\5$\23\2\u011b\u011c"+
		"\7\37\2\2\u011c\u011d\b\22\1\2\u011d\u0123\3\2\2\2\u011e\u011f\7\t\2\2"+
		"\u011f\u0120\5$\23\2\u0120\u0121\b\22\1\2\u0121\u0123\3\2\2\2\u0122\u0118"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0123#\3\2\2\2\u0124\u0125\5B\"\2\u0125\u0126"+
		"\b\23\1\2\u0126\u012e\3\2\2\2\u0127\u0128\5&\24\2\u0128\u0129\b\23\1\2"+
		"\u0129\u012e\3\2\2\2\u012a\u012b\5(\25\2\u012b\u012c\b\23\1\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"%\3\2\2\2\u012f\u0130\7)\2\2\u0130\u0132\7\17\2\2\u0131\u0133\5*\26\2"+
		"\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\7\37\2\2\u0135\u0136\b\24\1\2\u0136\'\3\2\2\2\u0137\u0138\5.\30\2\u0138"+
		"\u0139\b\25\1\2\u0139\u013a\7\23\2\2\u013a\u013b\7)\2\2\u013b\u013c\b"+
		"\25\1\2\u013c\u013e\7\17\2\2\u013d\u013f\5*\26\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\37\2\2\u0141\u0142\b"+
		"\25\1\2\u0142)\3\2\2\2\u0143\u014f\b\26\1\2\u0144\u0145\5B\"\2\u0145\u014c"+
		"\b\26\1\2\u0146\u0147\7\22\2\2\u0147\u0148\5B\"\2\u0148\u0149\b\26\1\2"+
		"\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0144\3\2\2\2\u014f\u0150\3\2\2\2\u0150+\3\2\2\2\u0151\u0152\7(\2\2\u0152"+
		"\u0163\b\27\1\2\u0153\u0154\7\'\2\2\u0154\u0163\b\27\1\2\u0155\u0156\7"+
		"&\2\2\u0156\u0163\b\27\1\2\u0157\u0158\7)\2\2\u0158\u0163\b\27\1\2\u0159"+
		"\u015a\5.\30\2\u015a\u015b\b\27\1\2\u015b\u0163\3\2\2\2\u015c\u015d\5"+
		"&\24\2\u015d\u015e\b\27\1\2\u015e\u0163\3\2\2\2\u015f\u0160\5(\25\2\u0160"+
		"\u0161\b\27\1\2\u0161\u0163\3\2\2\2\u0162\u0151\3\2\2\2\u0162\u0153\3"+
		"\2\2\2\u0162\u0155\3\2\2\2\u0162\u0157\3\2\2\2\u0162\u0159\3\2\2\2\u0162"+
		"\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0163-\3\2\2\2\u0164\u0165\7)\2\2\u0165"+
		"\u016b\b\30\1\2\u0166\u0167\7\23\2\2\u0167\u0168\7)\2\2\u0168\u016a\b"+
		"\30\1\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c/\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0171\b\31\1\2"+
		"\u016f\u0170\7#\2\2\u0170\u0172\b\31\1\2\u0171\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u017b\3\2\2\2\u0173\u0174\5,\27\2\u0174\u0175\b\31\1\2"+
		"\u0175\u017c\3\2\2\2\u0176\u0177\7\17\2\2\u0177\u0178\5B\"\2\u0178\u0179"+
		"\7\37\2\2\u0179\u017a\b\31\1\2\u017a\u017c\3\2\2\2\u017b\u0173\3\2\2\2"+
		"\u017b\u0176\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b\31\1\2\u017e\61"+
		"\3\2\2\2\u017f\u0180\5\60\31\2\u0180\u0183\b\32\1\2\u0181\u0182\7\34\2"+
		"\2\u0182\u0184\b\32\1\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\63\3\2\2\2\u0185\u0186\5\62\32\2\u0186\u018d\b\33\1\2\u0187\u0188\7\13"+
		"\2\2\u0188\u0189\5\62\32\2\u0189\u018a\b\33\1\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\65\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\5\64\33\2\u0191"+
		"\u019c\b\34\1\2\u0192\u0193\7\21\2\2\u0193\u0194\5\64\33\2\u0194\u0195"+
		"\b\34\1\2\u0195\u019b\3\2\2\2\u0196\u0197\7\3\2\2\u0197\u0198\5\64\33"+
		"\2\u0198\u0199\b\34\1\2\u0199\u019b\3\2\2\2\u019a\u0192\3\2\2\2\u019a"+
		"\u0196\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\67\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\5\66\34\2\u01a0"+
		"\u01ab\b\35\1\2\u01a1\u01a2\7!\2\2\u01a2\u01a3\5\66\34\2\u01a3\u01a4\b"+
		"\35\1\2\u01a4\u01aa\3\2\2\2\u01a5\u01a6\7#\2\2\u01a6\u01a7\5\66\34\2\u01a7"+
		"\u01a8\b\35\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a5\3"+
		"\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"9\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\58\35\2\u01af\u01b6\b\36\1\2"+
		"\u01b0\u01b1\7\16\2\2\u01b1\u01b2\58\35\2\u01b2\u01b3\b\36\1\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7;\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\5:\36\2"+
		"\u01ba\u01e2\b\37\1\2\u01bb\u01bc\7\t\2\2\u01bc\u01bd\5:\36\2\u01bd\u01be"+
		"\b\37\1\2\u01be\u01e1\3\2\2\2\u01bf\u01c0\7\20\2\2\u01c0\u01c1\5:\36\2"+
		"\u01c1\u01c2\b\37\1\2\u01c2\u01e1\3\2\2\2\u01c3\u01c4\7\7\2\2\u01c4\u01c5"+
		"\5:\36\2\u01c5\u01c6\b\37\1\2\u01c6\u01e1\3\2\2\2\u01c7\u01c8\7\33\2\2"+
		"\u01c8\u01c9\5:\36\2\u01c9\u01ca\b\37\1\2\u01ca\u01e1\3\2\2\2\u01cb\u01cc"+
		"\7\20\2\2\u01cc\u01cd\7\"\2\2\u01cd\u01ce\5:\36\2\u01ce\u01cf\b\37\1\2"+
		"\u01cf\u01e1\3\2\2\2\u01d0\u01d1\7\31\2\2\u01d1\u01d2\5:\36\2\u01d2\u01d3"+
		"\b\37\1\2\u01d3\u01e1\3\2\2\2\u01d4\u01d5\7\27\2\2\u01d5\u01d6\5:\36\2"+
		"\u01d6\u01d7\b\37\1\2\u01d7\u01e1\3\2\2\2\u01d8\u01d9\7\30\2\2\u01d9\u01da"+
		"\5:\36\2\u01da\u01db\b\37\1\2\u01db\u01e1\3\2\2\2\u01dc\u01dd\7\r\2\2"+
		"\u01dd\u01de\5:\36\2\u01de\u01df\b\37\1\2\u01df\u01e1\3\2\2\2\u01e0\u01bb"+
		"\3\2\2\2\u01e0\u01bf\3\2\2\2\u01e0\u01c3\3\2\2\2\u01e0\u01c7\3\2\2\2\u01e0"+
		"\u01cb\3\2\2\2\u01e0\u01d0\3\2\2\2\u01e0\u01d4\3\2\2\2\u01e0\u01d8\3\2"+
		"\2\2\u01e0\u01dc\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3=\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5<\37\2"+
		"\u01e6\u01e7\b \1\2\u01e7\u01ed\3\2\2\2\u01e8\u01e9\7\"\2\2\u01e9\u01ea"+
		"\5<\37\2\u01ea\u01eb\b \1\2\u01eb\u01ed\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec"+
		"\u01e8\3\2\2\2\u01ed?\3\2\2\2\u01ee\u01ef\5> \2\u01ef\u01fa\b!\1\2\u01f0"+
		"\u01f1\7 \2\2\u01f1\u01f2\5B\"\2\u01f2\u01f3\b!\1\2\u01f3\u01f9\3\2\2"+
		"\2\u01f4\u01f5\7\32\2\2\u01f5\u01f6\5B\"\2\u01f6\u01f7\b!\1\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbA\3\2\2\2\u01fc\u01fa\3\2\2\2"+
		"\u01fd\u01fe\5@!\2\u01fe\u01ff\b\"\1\2\u01ffC\3\2\2\2-JRdmtz}\u008c\u0094"+
		"\u00ab\u00ad\u00b7\u00c1\u00c7\u00ce\u00d1\u00dc\u00ec\u00fc\u0106\u0114"+
		"\u0122\u012d\u0132\u013e\u014c\u014f\u0162\u016b\u0171\u017b\u0183\u018d"+
		"\u019a\u019c\u01a9\u01ab\u01b6\u01e0\u01e2\u01ec\u01f8\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
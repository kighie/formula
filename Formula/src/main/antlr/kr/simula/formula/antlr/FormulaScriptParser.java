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
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, END_OF_STMT=37, NUMBER=38, 
		STRING_LITERAL=39, NULL=40, BOOLEAN=41, IDENT=42, WS=43, MULTILINE_COMMENT=44, 
		LINE_COMMENT=45, NEGATION=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'foreach'", "'elseif'", "'return'", "'!='", "'{'", 
		"'='", "'}'", "'^'", "'if'", "'<='", "'&'", "'('", "'is'", "'*'", "','", 
		"'.'", "'->'", "'<-'", "':'", "'>='", "'['", "'<'", "']'", "'>'", "'or'", 
		"'<>'", "'%'", "'in'", "'else'", "')'", "'and'", "'+'", "'not'", "'-'", 
		"'import'", "';'", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", 
		"WS", "MULTILINE_COMMENT", "LINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaScript = 0, RULE_importStatement = 1, RULE_variableDecl = 2, 
		RULE_type = 3, RULE_functionDecl = 4, RULE_argsDecl = 5, RULE_retrunStmt = 6, 
		RULE_blockContents = 7, RULE_ifStatement = 8, RULE_foreachStatement = 9, 
		RULE_loopCondition = 10, RULE_methodCallStatement = 11, RULE_functionCallStatement = 12, 
		RULE_assignStatement = 13, RULE_leftAssign = 14, RULE_rightAssign = 15, 
		RULE_formulaExpression = 16, RULE_formulaExpressionBase = 17, RULE_funcCallExp = 18, 
		RULE_methodCallExp = 19, RULE_arguments = 20, RULE_conditionArg = 21, 
		RULE_literalTerm = 22, RULE_formulaTerm = 23, RULE_arrayRef = 24, RULE_array = 25, 
		RULE_map = 26, RULE_qualifiedName = 27, RULE_unary = 28, RULE_percent = 29, 
		RULE_exponential = 30, RULE_multiplicative = 31, RULE_additiveExpression = 32, 
		RULE_stringExpression = 33, RULE_comparison = 34, RULE_notExpression = 35, 
		RULE_logicalExpression = 36, RULE_operatorExpression = 37;
	public static final String[] ruleNames = {
		"formulaScript", "importStatement", "variableDecl", "type", "functionDecl", 
		"argsDecl", "retrunStmt", "blockContents", "ifStatement", "foreachStatement", 
		"loopCondition", "methodCallStatement", "functionCallStatement", "assignStatement", 
		"leftAssign", "rightAssign", "formulaExpression", "formulaExpressionBase", 
		"funcCallExp", "methodCallExp", "arguments", "conditionArg", "literalTerm", 
		"formulaTerm", "arrayRef", "array", "map", "qualifiedName", "unary", "percent", 
		"exponential", "multiplicative", "additiveExpression", "stringExpression", 
		"comparison", "notExpression", "logicalExpression", "operatorExpression"
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77); ((FormulaScriptContext)_localctx).importStatement = importStatement();
				 _localctx.module.append(((FormulaScriptContext)_localctx).importStatement.stmt); 
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85); ((FormulaScriptContext)_localctx).functionDecl = functionDecl();
					 _localctx.module.append(((FormulaScriptContext)_localctx).functionDecl.fnBlock); 
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(93); blockContents(_localctx.module);
			setState(94); match(EOF);
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
			setState(97); match(T__0);
			setState(98); qualifiedName();
			setState(99); match(END_OF_STMT);
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
			setState(101); ((VariableDeclContext)_localctx).type = type();
			setState(102); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = handler.declare(ScriptTokens.VAR_DECL, ((VariableDeclContext)_localctx).type.typeClz ,(((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null)); 
					((VariableDeclContext)_localctx).stmt =  (VariableDeclStatement)handler.statement(ScriptTokens.VAR_DECL, varRef);
				
			setState(108);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(104); match(T__17);
				setState(105); ((VariableDeclContext)_localctx).formulaExpressionBase = formulaExpressionBase();
					_localctx.stmt.setValueNode(((VariableDeclContext)_localctx).formulaExpressionBase.result); 
				}
			}

			setState(110); match(END_OF_STMT);
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
		int _la;
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(112); ((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).typeClz =  handler.type((((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null)); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(114); ((TypeContext)_localctx).qualifiedName = qualifiedName();
				 ((TypeContext)_localctx).typeClz =  handler.type((((TypeContext)_localctx).qualifiedName!=null?_input.getText(((TypeContext)_localctx).qualifiedName.start,((TypeContext)_localctx).qualifiedName.stop):null)); 
				}
				setState(120);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(117); match(T__14);
					setState(118); match(T__12);
					 ((TypeContext)_localctx).typeClz =  handler.arrayType(_localctx.typeClz); 
					}
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
			setState(125); ((FunctionDeclContext)_localctx).type = type();
			setState(126); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(127); match(T__23);
			setState(129);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(128); argsDecl(args);
				}
			}

			setState(131); match(T__5);
			setState(132); match(T__30);
			 
					((FunctionDeclContext)_localctx).fnBlock =  handler.declareFn(((FunctionDeclContext)_localctx).type.typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
				
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(134); blockContents(_localctx.fnBlock);
				}
				break;
			}
			setState(138);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(137); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(140); match(T__28);
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
			setState(143); ((ArgsDeclContext)_localctx).type = type();
			setState(144); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(146); match(T__20);
				setState(147); ((ArgsDeclContext)_localctx).type = type();
				setState(148); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(155);
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
			setState(157); match(T__32);
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__23) | (1L << T__14) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(158); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( handler.statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(164); match(END_OF_STMT);
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
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__26) | (1L << T__23) | (1L << T__14) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(184);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(166); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(169); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(172); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(175); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(178); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(181); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
				}
				}
				setState(188);
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
			setState(189); match(T__26);
			setState(190); match(T__23);
			setState(191); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(192); match(T__5);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)handler.statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(194); match(T__30);
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(195); blockContents(_localctx.ifstmt);
				}
				break;
			}
			setState(198); match(T__28);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(199); match(T__33);
				setState(200); match(T__23);
				setState(201); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(202); match(T__5);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(204); match(T__30);
				setState(206);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(205); blockContents(elseIfStmt);
					}
					break;
				}
				setState(208); match(T__28);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(215); match(T__6);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(217); match(T__30);
				setState(219);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(218); blockContents(elseStmt);
					}
					break;
				}
				setState(221); match(T__28);
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
			setState(226); match(T__34);
			setState(227); match(T__23);
			setState(228); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(229); match(T__5);

						((ForeachStatementContext)_localctx).foreachStmt =  handler.statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(231); match(T__30);
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(232); blockContents(_localctx.foreachStmt);
				}
				break;
			}
			setState(235); match(T__28);
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
			setState(238); ((LoopConditionContext)_localctx).type = type();
			setState(239); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = handler.declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)handler.statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(249);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(241); match(T__7);
				setState(242); ((LoopConditionContext)_localctx).var = match(IDENT);

								Ref iteratorRef = handler.refer( (((LoopConditionContext)_localctx).var!=null?((LoopConditionContext)_localctx).var.getText():null));
								_localctx.condition.setIteratorRef(iteratorRef);
							
				}
				}
				break;
			case T__29:
				{
				{
				setState(244); match(T__29);
				setState(245); ((LoopConditionContext)_localctx).from = match(NUMBER);
				setState(246); match(T__16);
				setState(247); ((LoopConditionContext)_localctx).to = match(NUMBER);

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
			setState(251); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			setState(252); match(END_OF_STMT);
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
			setState(255); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			setState(256); match(END_OF_STMT);
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
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(259); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(262); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).rightAssign.stmt ; 
				}
				break;
			}
			setState(267); match(END_OF_STMT);
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(270); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(272); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			}
			setState(277); match(T__17);
			setState(278); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(282); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(283); match(T__18);
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(284); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(286); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
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
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(293); match(T__29);
				setState(294); match(T__23);
				setState(295); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(296); match(T__5);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(299); match(T__29);
				setState(300); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(305); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(308); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(311); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
			setState(316); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(317); match(T__23);
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(318); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(321); match(T__5);
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
			setState(324); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(326); match(T__19);
			setState(327); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(329); match(T__23);
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(330); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(333); match(T__5);
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
			setState(351);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__23) | (1L << T__14) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(337); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__29) | (1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__15) | (1L << T__13) | (1L << T__11) | (1L << T__9))) != 0)) {
					{
					setState(346);
					switch (_input.LA(1)) {
					case T__20:
						{
						setState(339); match(T__20);
						{
						setState(340); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__31:
					case T__29:
					case T__25:
					case T__22:
					case T__15:
					case T__13:
					case T__11:
					case T__9:
						{
						{
						setState(343); ((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(350);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterConditionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitConditionArg(this);
		}
	}

	public final ConditionArgContext conditionArg() throws RecognitionException {
		ConditionArgContext _localctx = new ConditionArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(353); match(T__29);
				setState(354); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(357); match(T__22);
				setState(358); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(361); match(T__31);
				setState(362); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(365); match(T__9);
				setState(366); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(369); match(T__22);
				setState(370); match(T__2);
				setState(371); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(374); match(T__11);
				setState(375); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(378); match(T__15);
				setState(379); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(382); match(T__13);
				setState(383); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(386); match(T__25);
				setState(387); ((ConditionArgContext)_localctx).op2 = literalTerm();
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
		public TerminalNode NULL() { return getToken(FormulaScriptParser.NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FormulaScriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaScriptParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaScriptParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public LiteralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLiteralTerm(this);
		}
	}

	public final LiteralTermContext literalTerm() throws RecognitionException {
		LiteralTermContext _localctx = new LiteralTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literalTerm);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(396); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(398); match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(400); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formulaTerm);
		try {
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(416); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(419); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(422); ((FormulaTermContext)_localctx).map = map();
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
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public TerminalNode NUMBER() { return getToken(FormulaScriptParser.NUMBER, 0); }
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(428); match(T__14);
			setState(433);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(429); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.literal( ExprTokens.LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(431); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), _localctx.result = handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null)) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(435); match(T__12);
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
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(T__14);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(439); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
			 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(441); match(T__20);
				setState(442); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				((ArrayContext)_localctx).result =  handler.array(elements); 
			setState(451); match(T__12);
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
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(T__30);
			 List<MapEntry> entryList = new LinkedList<MapEntry>(); 
			setState(455); ((MapContext)_localctx).IDENT = match(IDENT);
			setState(456); match(T__16);
			setState(457); ((MapContext)_localctx).formulaTerm = formulaTerm();
			 entryList.add( handler.mapEntry(ExprTokens.MAP_ENTRY, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ) ); 
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(459); match(T__20);
				setState(460); ((MapContext)_localctx).IDENT = match(IDENT);
				setState(461); match(T__16);
				setState(462); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 entryList.add( handler.mapEntry(ExprTokens.MAP_ENTRY, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ) ); 
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((MapContext)_localctx).result =  handler.map(ExprTokens.MAP, entryList);
			setState(471); match(T__28);
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
		enterRule(_localctx, 54, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475); match(T__19);
					setState(476); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 56, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(486);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(484); match(T__1);
				 negative = true; 
				}
			}

			setState(496);
			switch (_input.LA(1)) {
			case T__30:
			case T__14:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(488); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__23:
				{
				setState(491); match(T__23);
				setState(492); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(493); match(T__5);
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
		enterRule(_localctx, 58, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(504);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(502); match(T__8);
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
		enterRule(_localctx, 60, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(508); match(T__27);
				setState(509); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(516);
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
		enterRule(_localctx, 62, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__21) {
				{
				setState(527);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(519); match(T__21);
					setState(520); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__35:
					{
					setState(523); match(T__35);
					setState(524); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(531);
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
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__1) {
				{
				setState(542);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(534); match(T__3);
					setState(535); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(538); match(T__1);
					setState(539); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(546);
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
		enterRule(_localctx, 66, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(549); match(T__24);
				setState(550); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(557);
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
		enterRule(_localctx, 68, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(597);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(560); match(T__29);
						setState(561); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(564); match(T__22);
						setState(565); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(568); match(T__31);
						setState(569); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(572); match(T__9);
						setState(573); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(576); match(T__22);
						setState(577); match(T__2);
						setState(578); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(581); match(T__11);
						setState(582); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(585); match(T__15);
						setState(586); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(589); match(T__13);
						setState(590); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(593); match(T__25);
						setState(594); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 70, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			switch (_input.LA(1)) {
			case T__30:
			case T__23:
			case T__14:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(602); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__2:
				{
				setState(605); match(T__2);
				setState(606); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 72, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(621);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(613); match(T__4);
						setState(614); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__10:
						{
						setState(617); match(T__10);
						setState(618); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 74, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0278\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n"+
		"\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\6\5\6\u008d\n\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c7\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00d1\n\n\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00de\n\n\3\n\5\n\u00e1\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ec\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00fc\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u010c\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0116\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0124\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0132\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\24\5\24\u0142\n\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014e\n\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015d\n\26\f\26"+
		"\16\26\u0160\13\26\5\26\u0162\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0189\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0195\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ac\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01b4\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u01c0\n\33\f\33\16\33\u01c3\13\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u01d4\n\34\f\34\16\34\u01d7\13\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u01e1\n\35\f\35\16\35\u01e4\13\35\3\36\3\36\3\36\5\36"+
		"\u01e9\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01f3\n\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\5\37\u01fb\n\37\3 \3 \3 \3 \3 \3 \7 \u0203"+
		"\n \f \16 \u0206\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0212\n!\f!\16!"+
		"\u0215\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0221\n\"\f\"\16"+
		"\"\u0224\13\"\3#\3#\3#\3#\3#\3#\7#\u022c\n#\f#\16#\u022f\13#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0258\n$\f$\16$\u025b\13$\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u0264\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0270"+
		"\n&\f&\16&\u0273\13&\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\u029e\2N\3\2\2\2\4c\3\2"+
		"\2\2\6g\3\2\2\2\b|\3\2\2\2\n~\3\2\2\2\f\u0091\3\2\2\2\16\u009e\3\2\2\2"+
		"\20\u00bc\3\2\2\2\22\u00bf\3\2\2\2\24\u00e4\3\2\2\2\26\u00f0\3\2\2\2\30"+
		"\u00fd\3\2\2\2\32\u0101\3\2\2\2\34\u010b\3\2\2\2\36\u010f\3\2\2\2 \u011b"+
		"\3\2\2\2\"\u0131\3\2\2\2$\u013c\3\2\2\2&\u013e\3\2\2\2(\u0146\3\2\2\2"+
		"*\u0152\3\2\2\2,\u0188\3\2\2\2.\u0194\3\2\2\2\60\u01ab\3\2\2\2\62\u01ad"+
		"\3\2\2\2\64\u01b7\3\2\2\2\66\u01c7\3\2\2\28\u01db\3\2\2\2:\u01e5\3\2\2"+
		"\2<\u01f6\3\2\2\2>\u01fc\3\2\2\2@\u0207\3\2\2\2B\u0216\3\2\2\2D\u0225"+
		"\3\2\2\2F\u0230\3\2\2\2H\u0263\3\2\2\2J\u0265\3\2\2\2L\u0274\3\2\2\2N"+
		"T\b\2\1\2OP\5\4\3\2PQ\b\2\1\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2U\\\3\2\2\2VT\3\2\2\2WX\5\n\6\2XY\b\2\1\2Y[\3\2\2\2ZW\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\20\t\2`a\7"+
		"\2\2\3ab\b\2\1\2b\3\3\2\2\2cd\7&\2\2de\58\35\2ef\7\'\2\2f\5\3\2\2\2gh"+
		"\5\b\5\2hi\7,\2\2in\b\4\1\2jk\7\25\2\2kl\5$\23\2lm\b\4\1\2mo\3\2\2\2n"+
		"j\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\'\2\2q\7\3\2\2\2rs\7,\2\2s}\b\5\1\2"+
		"tu\58\35\2uv\b\5\1\2vz\3\2\2\2wx\7\30\2\2xy\7\32\2\2y{\b\5\1\2zw\3\2\2"+
		"\2z{\3\2\2\2{}\3\2\2\2|r\3\2\2\2|t\3\2\2\2}\t\3\2\2\2~\177\b\6\1\2\177"+
		"\u0080\5\b\5\2\u0080\u0081\7,\2\2\u0081\u0083\7\17\2\2\u0082\u0084\5\f"+
		"\7\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7!\2\2\u0086\u0087\7\b\2\2\u0087\u0089\b\6\1\2\u0088\u008a\5\20"+
		"\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u008d\5\16\b\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\7\n\2\2\u008f\u0090\b\6\1\2\u0090\13\3\2\2\2\u0091"+
		"\u0092\5\b\5\2\u0092\u0093\7,\2\2\u0093\u009b\b\7\1\2\u0094\u0095\7\22"+
		"\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7,\2\2\u0097\u0098\b\7\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\r\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f"+
		"\b\b\1\2\u009f\u00a3\7\6\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\b\b\1\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\b\b\1\2\u00a6\u00a7\7\'\2\2\u00a7\17\3\2\2\2\u00a8\u00a9"+
		"\5\22\n\2\u00a9\u00aa\b\t\1\2\u00aa\u00bb\3\2\2\2\u00ab\u00ac\5\24\13"+
		"\2\u00ac\u00ad\b\t\1\2\u00ad\u00bb\3\2\2\2\u00ae\u00af\5\34\17\2\u00af"+
		"\u00b0\b\t\1\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b"+
		"\t\1\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\b\t\1\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\b\t\1\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba"+
		"\u00b1\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\5J&\2\u00c2"+
		"\u00c3\7!\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00c6\7\b\2\2\u00c5\u00c7\5\20"+
		"\t\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00d6\7\n\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\5"+
		"J&\2\u00cc\u00cd\7!\2\2\u00cd\u00ce\b\n\1\2\u00ce\u00d0\7\b\2\2\u00cf"+
		"\u00d1\5\20\t\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e0\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7 \2\2\u00da\u00db\b\n\1\2\u00db"+
		"\u00dd\7\b\2\2\u00dc\u00de\5\20\t\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\n\2\2\u00e0\u00d9\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\n\1\2\u00e3\23\3\2\2"+
		"\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7\5\26\f\2\u00e7"+
		"\u00e8\7!\2\2\u00e8\u00e9\b\13\1\2\u00e9\u00eb\7\b\2\2\u00ea\u00ec\5\20"+
		"\t\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\7\n\2\2\u00ee\u00ef\b\13\1\2\u00ef\25\3\2\2\2\u00f0\u00f1\5\b\5"+
		"\2\u00f1\u00f2\7,\2\2\u00f2\u00fb\b\f\1\2\u00f3\u00f4\7\37\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5\u00fc\b\f\1\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7(\2\2\u00f8"+
		"\u00f9\7\26\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fc\b\f\1\2\u00fb\u00f3\3\2"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff"+
		"\7\'\2\2\u00ff\u0100\b\r\1\2\u0100\31\3\2\2\2\u0101\u0102\5&\24\2\u0102"+
		"\u0103\7\'\2\2\u0103\u0104\b\16\1\2\u0104\33\3\2\2\2\u0105\u0106\5\36"+
		"\20\2\u0106\u0107\b\17\1\2\u0107\u010c\3\2\2\2\u0108\u0109\5 \21\2\u0109"+
		"\u010a\b\17\1\2\u010a\u010c\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\'\2\2\u010e\35\3\2\2\2\u010f"+
		"\u0115\b\20\1\2\u0110\u0111\7,\2\2\u0111\u0116\b\20\1\2\u0112\u0113\5"+
		"8\35\2\u0113\u0114\b\20\1\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\25\2\2\u0118\u0119\5"+
		"$\23\2\u0119\u011a\b\20\1\2\u011a\37\3\2\2\2\u011b\u011c\b\21\1\2\u011c"+
		"\u011d\5$\23\2\u011d\u0123\7\24\2\2\u011e\u011f\7,\2\2\u011f\u0124\b\21"+
		"\1\2\u0120\u0121\58\35\2\u0121\u0122\b\21\1\2\u0122\u0124\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\21"+
		"\1\2\u0126!\3\2\2\2\u0127\u0128\7\t\2\2\u0128\u0129\7\17\2\2\u0129\u012a"+
		"\5$\23\2\u012a\u012b\7!\2\2\u012b\u012c\b\22\1\2\u012c\u0132\3\2\2\2\u012d"+
		"\u012e\7\t\2\2\u012e\u012f\5$\23\2\u012f\u0130\b\22\1\2\u0130\u0132\3"+
		"\2\2\2\u0131\u0127\3\2\2\2\u0131\u012d\3\2\2\2\u0132#\3\2\2\2\u0133\u0134"+
		"\5L\'\2\u0134\u0135\b\23\1\2\u0135\u013d\3\2\2\2\u0136\u0137\5&\24\2\u0137"+
		"\u0138\b\23\1\2\u0138\u013d\3\2\2\2\u0139\u013a\5(\25\2\u013a\u013b\b"+
		"\23\1\2\u013b\u013d\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0136\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013d%\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0141\7\17\2\2"+
		"\u0140\u0142\5*\26\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\7!\2\2\u0144\u0145\b\24\1\2\u0145\'\3\2\2\2\u0146"+
		"\u0147\58\35\2\u0147\u0148\b\25\1\2\u0148\u0149\7\23\2\2\u0149\u014a\7"+
		",\2\2\u014a\u014b\b\25\1\2\u014b\u014d\7\17\2\2\u014c\u014e\5*\26\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7!"+
		"\2\2\u0150\u0151\b\25\1\2\u0151)\3\2\2\2\u0152\u0161\b\26\1\2\u0153\u0154"+
		"\5L\'\2\u0154\u015e\b\26\1\2\u0155\u0156\7\22\2\2\u0156\u0157\5L\'\2\u0157"+
		"\u0158\b\26\1\2\u0158\u015d\3\2\2\2\u0159\u015a\5,\27\2\u015a\u015b\b"+
		"\26\1\2\u015b\u015d\3\2\2\2\u015c\u0155\3\2\2\2\u015c\u0159\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"+\3\2\2\2\u0163\u0164\7\t\2\2\u0164\u0165\5.\30\2\u0165\u0166\b\27\1\2"+
		"\u0166\u0189\3\2\2\2\u0167\u0168\7\20\2\2\u0168\u0169\5.\30\2\u0169\u016a"+
		"\b\27\1\2\u016a\u0189\3\2\2\2\u016b\u016c\7\7\2\2\u016c\u016d\5.\30\2"+
		"\u016d\u016e\b\27\1\2\u016e\u0189\3\2\2\2\u016f\u0170\7\35\2\2\u0170\u0171"+
		"\5.\30\2\u0171\u0172\b\27\1\2\u0172\u0189\3\2\2\2\u0173\u0174\7\20\2\2"+
		"\u0174\u0175\7$\2\2\u0175\u0176\5.\30\2\u0176\u0177\b\27\1\2\u0177\u0189"+
		"\3\2\2\2\u0178\u0179\7\33\2\2\u0179\u017a\5.\30\2\u017a\u017b\b\27\1\2"+
		"\u017b\u0189\3\2\2\2\u017c\u017d\7\27\2\2\u017d\u017e\5.\30\2\u017e\u017f"+
		"\b\27\1\2\u017f\u0189\3\2\2\2\u0180\u0181\7\31\2\2\u0181\u0182\5.\30\2"+
		"\u0182\u0183\b\27\1\2\u0183\u0189\3\2\2\2\u0184\u0185\7\r\2\2\u0185\u0186"+
		"\5.\30\2\u0186\u0187\b\27\1\2\u0187\u0189\3\2\2\2\u0188\u0163\3\2\2\2"+
		"\u0188\u0167\3\2\2\2\u0188\u016b\3\2\2\2\u0188\u016f\3\2\2\2\u0188\u0173"+
		"\3\2\2\2\u0188\u0178\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u0180\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0189-\3\2\2\2\u018a\u018b\7+\2\2\u018b\u0195\b\30\1\2"+
		"\u018c\u018d\7)\2\2\u018d\u0195\b\30\1\2\u018e\u018f\7(\2\2\u018f\u0195"+
		"\b\30\1\2\u0190\u0191\7*\2\2\u0191\u0195\b\30\1\2\u0192\u0193\7,\2\2\u0193"+
		"\u0195\b\30\1\2\u0194\u018a\3\2\2\2\u0194\u018c\3\2\2\2\u0194\u018e\3"+
		"\2\2\2\u0194\u0190\3\2\2\2\u0194\u0192\3\2\2\2\u0195/\3\2\2\2\u0196\u0197"+
		"\5.\30\2\u0197\u0198\b\31\1\2\u0198\u01ac\3\2\2\2\u0199\u019a\58\35\2"+
		"\u019a\u019b\b\31\1\2\u019b\u01ac\3\2\2\2\u019c\u019d\5&\24\2\u019d\u019e"+
		"\b\31\1\2\u019e\u01ac\3\2\2\2\u019f\u01a0\5(\25\2\u01a0\u01a1\b\31\1\2"+
		"\u01a1\u01ac\3\2\2\2\u01a2\u01a3\5\62\32\2\u01a3\u01a4\b\31\1\2\u01a4"+
		"\u01ac\3\2\2\2\u01a5\u01a6\5\64\33\2\u01a6\u01a7\b\31\1\2\u01a7\u01ac"+
		"\3\2\2\2\u01a8\u01a9\5\66\34\2\u01a9\u01aa\b\31\1\2\u01aa\u01ac\3\2\2"+
		"\2\u01ab\u0196\3\2\2\2\u01ab\u0199\3\2\2\2\u01ab\u019c\3\2\2\2\u01ab\u019f"+
		"\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac"+
		"\61\3\2\2\2\u01ad\u01ae\7,\2\2\u01ae\u01b3\7\30\2\2\u01af\u01b0\7(\2\2"+
		"\u01b0\u01b4\b\32\1\2\u01b1\u01b2\7,\2\2\u01b2\u01b4\b\32\1\2\u01b3\u01af"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\32\2\2"+
		"\u01b6\63\3\2\2\2\u01b7\u01b8\7\30\2\2\u01b8\u01b9\b\33\1\2\u01b9\u01ba"+
		"\5\60\31\2\u01ba\u01c1\b\33\1\2\u01bb\u01bc\7\22\2\2\u01bc\u01bd\5\60"+
		"\31\2\u01bd\u01be\b\33\1\2\u01be\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\b\33\1\2\u01c5\u01c6\7\32\2\2\u01c6"+
		"\65\3\2\2\2\u01c7\u01c8\7\b\2\2\u01c8\u01c9\b\34\1\2\u01c9\u01ca\7,\2"+
		"\2\u01ca\u01cb\7\26\2\2\u01cb\u01cc\5\60\31\2\u01cc\u01d5\b\34\1\2\u01cd"+
		"\u01ce\7\22\2\2\u01ce\u01cf\7,\2\2\u01cf\u01d0\7\26\2\2\u01d0\u01d1\5"+
		"\60\31\2\u01d1\u01d2\b\34\1\2\u01d2\u01d4\3\2\2\2\u01d3\u01cd\3\2\2\2"+
		"\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\b\34\1\2\u01d9\u01da\7\n\2\2"+
		"\u01da\67\3\2\2\2\u01db\u01dc\7,\2\2\u01dc\u01e2\b\35\1\2\u01dd\u01de"+
		"\7\23\2\2\u01de\u01df\7,\2\2\u01df\u01e1\b\35\1\2\u01e0\u01dd\3\2\2\2"+
		"\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e39\3"+
		"\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\b\36\1\2\u01e6\u01e7\7%\2\2\u01e7"+
		"\u01e9\b\36\1\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f2\3"+
		"\2\2\2\u01ea\u01eb\5\60\31\2\u01eb\u01ec\b\36\1\2\u01ec\u01f3\3\2\2\2"+
		"\u01ed\u01ee\7\17\2\2\u01ee\u01ef\5L\'\2\u01ef\u01f0\7!\2\2\u01f0\u01f1"+
		"\b\36\1\2\u01f1\u01f3\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f2\u01ed\3\2\2\2"+
		"\u01f3\u01f4\3\2\2\2\u01f4\u01f5\b\36\1\2\u01f5;\3\2\2\2\u01f6\u01f7\5"+
		":\36\2\u01f7\u01fa\b\37\1\2\u01f8\u01f9\7\36\2\2\u01f9\u01fb\b\37\1\2"+
		"\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb=\3\2\2\2\u01fc\u01fd\5"+
		"<\37\2\u01fd\u0204\b \1\2\u01fe\u01ff\7\13\2\2\u01ff\u0200\5<\37\2\u0200"+
		"\u0201\b \1\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205?\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0207\u0208\5> \2\u0208\u0213\b!\1\2\u0209\u020a\7\21\2\2\u020a"+
		"\u020b\5> \2\u020b\u020c\b!\1\2\u020c\u0212\3\2\2\2\u020d\u020e\7\3\2"+
		"\2\u020e\u020f\5> \2\u020f\u0210\b!\1\2\u0210\u0212\3\2\2\2\u0211\u0209"+
		"\3\2\2\2\u0211\u020d\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214A\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\5@!\2\u0217"+
		"\u0222\b\"\1\2\u0218\u0219\7#\2\2\u0219\u021a\5@!\2\u021a\u021b\b\"\1"+
		"\2\u021b\u0221\3\2\2\2\u021c\u021d\7%\2\2\u021d\u021e\5@!\2\u021e\u021f"+
		"\b\"\1\2\u021f\u0221\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u021c\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223C\3\2\2\2"+
		"\u0224\u0222\3\2\2\2\u0225\u0226\5B\"\2\u0226\u022d\b#\1\2\u0227\u0228"+
		"\7\16\2\2\u0228\u0229\5B\"\2\u0229\u022a\b#\1\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0227\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022eE\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5D#\2\u0231\u0259"+
		"\b$\1\2\u0232\u0233\7\t\2\2\u0233\u0234\5D#\2\u0234\u0235\b$\1\2\u0235"+
		"\u0258\3\2\2\2\u0236\u0237\7\20\2\2\u0237\u0238\5D#\2\u0238\u0239\b$\1"+
		"\2\u0239\u0258\3\2\2\2\u023a\u023b\7\7\2\2\u023b\u023c\5D#\2\u023c\u023d"+
		"\b$\1\2\u023d\u0258\3\2\2\2\u023e\u023f\7\35\2\2\u023f\u0240\5D#\2\u0240"+
		"\u0241\b$\1\2\u0241\u0258\3\2\2\2\u0242\u0243\7\20\2\2\u0243\u0244\7$"+
		"\2\2\u0244\u0245\5D#\2\u0245\u0246\b$\1\2\u0246\u0258\3\2\2\2\u0247\u0248"+
		"\7\33\2\2\u0248\u0249\5D#\2\u0249\u024a\b$\1\2\u024a\u0258\3\2\2\2\u024b"+
		"\u024c\7\27\2\2\u024c\u024d\5D#\2\u024d\u024e\b$\1\2\u024e\u0258\3\2\2"+
		"\2\u024f\u0250\7\31\2\2\u0250\u0251\5D#\2\u0251\u0252\b$\1\2\u0252\u0258"+
		"\3\2\2\2\u0253\u0254\7\r\2\2\u0254\u0255\5D#\2\u0255\u0256\b$\1\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0232\3\2\2\2\u0257\u0236\3\2\2\2\u0257\u023a\3\2"+
		"\2\2\u0257\u023e\3\2\2\2\u0257\u0242\3\2\2\2\u0257\u0247\3\2\2\2\u0257"+
		"\u024b\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0253\3\2\2\2\u0258\u025b\3\2"+
		"\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025aG\3\2\2\2\u025b\u0259"+
		"\3\2\2\2\u025c\u025d\5F$\2\u025d\u025e\b%\1\2\u025e\u0264\3\2\2\2\u025f"+
		"\u0260\7$\2\2\u0260\u0261\5F$\2\u0261\u0262\b%\1\2\u0262\u0264\3\2\2\2"+
		"\u0263\u025c\3\2\2\2\u0263\u025f\3\2\2\2\u0264I\3\2\2\2\u0265\u0266\5"+
		"H%\2\u0266\u0271\b&\1\2\u0267\u0268\7\"\2\2\u0268\u0269\5L\'\2\u0269\u026a"+
		"\b&\1\2\u026a\u0270\3\2\2\2\u026b\u026c\7\34\2\2\u026c\u026d\5L\'\2\u026d"+
		"\u026e\b&\1\2\u026e\u0270\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u026b\3\2"+
		"\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"K\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\5J&\2\u0275\u0276\b\'\1\2\u0276"+
		"M\3\2\2\2\64T\\nz|\u0083\u0089\u008c\u009b\u00a3\u00ba\u00bc\u00c6\u00d0"+
		"\u00d6\u00dd\u00e0\u00eb\u00fb\u010b\u0115\u0123\u0131\u013c\u0141\u014d"+
		"\u015c\u015e\u0161\u0188\u0194\u01ab\u01b3\u01c1\u01d5\u01e2\u01e8\u01f2"+
		"\u01fa\u0204\u0211\u0213\u0220\u0222\u022d\u0257\u0259\u0263\u026f\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
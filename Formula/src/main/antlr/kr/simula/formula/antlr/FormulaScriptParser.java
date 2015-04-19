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
		"'.'", "'->'", "'<-'", "':'", "'['", "'>='", "'<'", "']'", "'>'", "'or'", 
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
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			setState(120); ((FunctionDeclContext)_localctx).type = type();
			setState(121); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(122); match(T__23);
			setState(124);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(123); argsDecl(args);
				}
			}

			setState(126); match(T__5);
			setState(127); match(T__30);
			 
					((FunctionDeclContext)_localctx).fnBlock =  handler.declareFn(((FunctionDeclContext)_localctx).type.typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
				
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129); blockContents(_localctx.fnBlock);
				}
				break;
			}
			setState(133);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(132); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(135); match(T__28);
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
			setState(138); ((ArgsDeclContext)_localctx).type = type();
			setState(139); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(141); match(T__20);
				setState(142); ((ArgsDeclContext)_localctx).type = type();
				setState(143); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( handler.declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(150);
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
			setState(152); match(T__32);
			setState(156);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__23) | (1L << T__15) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(153); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( handler.statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(159); match(END_OF_STMT);
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__30) | (1L << T__26) | (1L << T__23) | (1L << T__15) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(179);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(161); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(164); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(167); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(170); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(173); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(176); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
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
			setState(184); match(T__26);
			setState(185); match(T__23);
			setState(186); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(187); match(T__5);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)handler.statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(189); match(T__30);
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(190); blockContents(_localctx.ifstmt);
				}
				break;
			}
			setState(193); match(T__28);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(194); match(T__33);
				setState(195); match(T__23);
				setState(196); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(197); match(T__5);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(199); match(T__30);
				setState(201);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(200); blockContents(elseIfStmt);
					}
					break;
				}
				setState(203); match(T__28);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(210); match(T__6);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(212); match(T__30);
				setState(214);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(213); blockContents(elseStmt);
					}
					break;
				}
				setState(216); match(T__28);
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
			setState(221); match(T__34);
			setState(222); match(T__23);
			setState(223); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(224); match(T__5);

						((ForeachStatementContext)_localctx).foreachStmt =  handler.statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(226); match(T__30);
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(227); blockContents(_localctx.foreachStmt);
				}
				break;
			}
			setState(230); match(T__28);
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
			setState(233); ((LoopConditionContext)_localctx).type = type();
			setState(234); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = handler.declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)handler.statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(244);
			switch (_input.LA(1)) {
			case T__7:
				{
				{
				setState(236); match(T__7);
				setState(237); ((LoopConditionContext)_localctx).var = match(IDENT);

								Ref iteratorRef = handler.refer( (((LoopConditionContext)_localctx).var!=null?((LoopConditionContext)_localctx).var.getText():null));
								_localctx.condition.setIteratorRef(iteratorRef);
							
				}
				}
				break;
			case T__29:
				{
				{
				setState(239); match(T__29);
				setState(240); ((LoopConditionContext)_localctx).from = match(NUMBER);
				setState(241); match(T__16);
				setState(242); ((LoopConditionContext)_localctx).to = match(NUMBER);

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
			setState(246); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			setState(247); match(END_OF_STMT);
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
			setState(250); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			setState(251); match(END_OF_STMT);
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
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(254); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(257); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).rightAssign.stmt ; 
				}
				break;
			}
			setState(262); match(END_OF_STMT);
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
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(265); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(267); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			}
			setState(272); match(T__17);
			setState(273); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(277); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(278); match(T__18);
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(279); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = handler.refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(281); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
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
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(288); match(T__29);
				setState(289); match(T__23);
				setState(290); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(291); match(T__5);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(294); match(T__29);
				setState(295); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(300); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(303); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(306); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
			setState(311); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
			setState(312); match(T__23);
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(313); ((FuncCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(316); match(T__5);
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
			setState(319); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
			 Ref parent = ((MethodCallExpContext)_localctx).qualifiedName.result; 
			setState(321); match(T__19);
			setState(322); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
			 String methodName = (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null); 
			setState(324); match(T__23);
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(325); ((MethodCallExpContext)_localctx).arguments = arguments();
				}
				break;
			}
			setState(328); match(T__5);
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
			setState(346);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__23) | (1L << T__15) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(332); ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).operatorExpression.result); 
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__29) | (1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__9))) != 0)) {
					{
					setState(341);
					switch (_input.LA(1)) {
					case T__20:
						{
						setState(334); match(T__20);
						{
						setState(335); ((ArgumentsContext)_localctx).arg2 = ((ArgumentsContext)_localctx).operatorExpression = operatorExpression();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
						}
						}
						break;
					case T__31:
					case T__29:
					case T__25:
					case T__22:
					case T__14:
					case T__13:
					case T__11:
					case T__9:
						{
						{
						setState(338); ((ArgumentsContext)_localctx).arg3 = conditionArg();
						 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.result); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(345);
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
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(348); match(T__29);
				setState(349); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(352); match(T__22);
				setState(353); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(356); match(T__31);
				setState(357); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(360); match(T__9);
				setState(361); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(364); match(T__22);
				setState(365); match(T__2);
				setState(366); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_NOT_EQ, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(369); match(T__11);
				setState(370); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(373); match(T__14);
				setState(374); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_EQ_GT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(377); match(T__13);
				setState(378); ((ConditionArgContext)_localctx).op2 = literalTerm();
				((ConditionArgContext)_localctx).result =  handler.lambda(ExprTokens.OP_LT, null, ((ConditionArgContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(381); match(T__25);
				setState(382); ((ConditionArgContext)_localctx).op2 = literalTerm();
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
			setState(397);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(387); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(389); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(391); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(393); match(NULL);
				 ((LiteralTermContext)_localctx).result =  handler.literal( ExprTokens.LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(395); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(417); ((FormulaTermContext)_localctx).map = map();
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
			setState(422); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(423); match(T__15);
			setState(428);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(424); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), handler.literal( ExprTokens.LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(426); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), _localctx.result = handler.refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null)) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430); match(T__12);
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
			setState(432); match(T__15);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(434); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
			 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(436); match(T__20);
				setState(437); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				((ArrayContext)_localctx).result =  handler.array(elements); 
			setState(446); match(T__12);
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
			setState(448); match(T__30);
			 List<MapEntry> entryList = new LinkedList<MapEntry>(); 
			setState(450); ((MapContext)_localctx).IDENT = match(IDENT);
			setState(451); match(T__16);
			setState(452); ((MapContext)_localctx).formulaTerm = formulaTerm();
			 entryList.add( handler.mapEntry(ExprTokens.MAP_ENTRY, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ) ); 
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(454); match(T__20);
				setState(455); ((MapContext)_localctx).IDENT = match(IDENT);
				setState(456); match(T__16);
				setState(457); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 entryList.add( handler.mapEntry(ExprTokens.MAP_ENTRY, null, (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null), ((MapContext)_localctx).formulaTerm.result ) ); 
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((MapContext)_localctx).result =  handler.map(ExprTokens.MAP, entryList);
			setState(466); match(T__28);
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
			setState(468); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  handler.refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470); match(T__19);
					setState(471); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  handler.refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(481);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(479); match(T__1);
				 negative = true; 
				}
			}

			setState(491);
			switch (_input.LA(1)) {
			case T__30:
			case T__15:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(483); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__23:
				{
				setState(486); match(T__23);
				setState(487); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(488); match(T__5);
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
			setState(495); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(499);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(497); match(T__8);
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
			setState(501); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(503); match(T__27);
				setState(504); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  handler.operator(ExprTokens.OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(511);
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
			setState(512); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__21) {
				{
				setState(522);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(514); match(T__21);
					setState(515); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__35:
					{
					setState(518); match(T__35);
					setState(519); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  handler.operator(ExprTokens.OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(526);
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
			setState(527); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__1) {
				{
				setState(537);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(529); match(T__3);
					setState(530); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(533); match(T__1);
					setState(534); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(541);
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
			setState(542); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(544); match(T__24);
				setState(545); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(552);
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
			setState(553); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(592);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(555); match(T__29);
						setState(556); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 2:
						{
						setState(559); match(T__22);
						setState(560); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 3:
						{
						setState(563); match(T__31);
						setState(564); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 4:
						{
						setState(567); match(T__9);
						setState(568); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 5:
						{
						setState(571); match(T__22);
						setState(572); match(T__2);
						setState(573); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 6:
						{
						setState(576); match(T__11);
						setState(577); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 7:
						{
						setState(580); match(T__14);
						setState(581); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 8:
						{
						setState(584); match(T__13);
						setState(585); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					case 9:
						{
						setState(588); match(T__25);
						setState(589); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
						((ComparisonContext)_localctx).result =  handler.operator(ExprTokens.OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
						}
						break;
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
			setState(604);
			switch (_input.LA(1)) {
			case T__30:
			case T__23:
			case T__15:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(597); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__2:
				{
				setState(600); match(T__2);
				setState(601); ((NotExpressionContext)_localctx).comparison = comparison();
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
			setState(606); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(616);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(608); match(T__4);
						setState(609); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__10:
						{
						setState(612); match(T__10);
						setState(613); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  handler.operator(ExprTokens.OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			setState(621); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0273\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0085\n\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9\13\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00c2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\n"+
		"\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\n\5\n\u00d9\n\n\3"+
		"\n\5\n\u00dc\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e7"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f7"+
		"\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0107\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0111\n"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011f"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u012d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0138\n"+
		"\23\3\24\3\24\3\24\5\24\u013d\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0149\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0158\n\26\f\26\16\26\u015b\13\26\5\26"+
		"\u015d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0184\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0190\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01a7\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01af\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u01bb\n\33\f\33\16\33\u01be\13\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01cf\n\34\f\34\16"+
		"\34\u01d2\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u01dc\n\35"+
		"\f\35\16\35\u01df\13\35\3\36\3\36\3\36\5\36\u01e4\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01ee\n\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u01f6\n\37\3 \3 \3 \3 \3 \3 \7 \u01fe\n \f \16 \u0201\13 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\7!\u020d\n!\f!\16!\u0210\13!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u021c\n\"\f\"\16\"\u021f\13\"\3#\3#\3#\3"+
		"#\3#\3#\7#\u0227\n#\f#\16#\u022a\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\7$\u0253\n$\f$\16$\u0256\13$\3%\3%\3%\3%\3%\3%\3%\5%\u025f"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u026b\n&\f&\16&\u026e\13&\3\'\3\'"+
		"\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJL\2\2\u0298\2N\3\2\2\2\4c\3\2\2\2\6g\3\2\2\2\bw\3\2\2\2\n"+
		"y\3\2\2\2\f\u008c\3\2\2\2\16\u0099\3\2\2\2\20\u00b7\3\2\2\2\22\u00ba\3"+
		"\2\2\2\24\u00df\3\2\2\2\26\u00eb\3\2\2\2\30\u00f8\3\2\2\2\32\u00fc\3\2"+
		"\2\2\34\u0106\3\2\2\2\36\u010a\3\2\2\2 \u0116\3\2\2\2\"\u012c\3\2\2\2"+
		"$\u0137\3\2\2\2&\u0139\3\2\2\2(\u0141\3\2\2\2*\u014d\3\2\2\2,\u0183\3"+
		"\2\2\2.\u018f\3\2\2\2\60\u01a6\3\2\2\2\62\u01a8\3\2\2\2\64\u01b2\3\2\2"+
		"\2\66\u01c2\3\2\2\28\u01d6\3\2\2\2:\u01e0\3\2\2\2<\u01f1\3\2\2\2>\u01f7"+
		"\3\2\2\2@\u0202\3\2\2\2B\u0211\3\2\2\2D\u0220\3\2\2\2F\u022b\3\2\2\2H"+
		"\u025e\3\2\2\2J\u0260\3\2\2\2L\u026f\3\2\2\2NT\b\2\1\2OP\5\4\3\2PQ\b\2"+
		"\1\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\\\3\2\2\2VT\3"+
		"\2\2\2WX\5\n\6\2XY\b\2\1\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\20\t\2`a\7\2\2\3ab\b\2\1\2b\3\3\2\2"+
		"\2cd\7&\2\2de\58\35\2ef\7\'\2\2f\5\3\2\2\2gh\5\b\5\2hi\7,\2\2in\b\4\1"+
		"\2jk\7\25\2\2kl\5$\23\2lm\b\4\1\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2op\3\2"+
		"\2\2pq\7\'\2\2q\7\3\2\2\2rs\7,\2\2sx\b\5\1\2tu\58\35\2uv\b\5\1\2vx\3\2"+
		"\2\2wr\3\2\2\2wt\3\2\2\2x\t\3\2\2\2yz\b\6\1\2z{\5\b\5\2{|\7,\2\2|~\7\17"+
		"\2\2}\177\5\f\7\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\7!\2\2\u0081\u0082\7\b\2\2\u0082\u0084\b\6\1\2\u0083\u0085\5\20\t\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5\16"+
		"\b\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7\n\2\2\u008a\u008b\b\6\1\2\u008b\13\3\2\2\2\u008c\u008d\5\b\5"+
		"\2\u008d\u008e\7,\2\2\u008e\u0096\b\7\1\2\u008f\u0090\7\22\2\2\u0090\u0091"+
		"\5\b\5\2\u0091\u0092\7,\2\2\u0092\u0093\b\7\1\2\u0093\u0095\3\2\2\2\u0094"+
		"\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\r\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\b\1\2\u009a\u009e"+
		"\7\6\2\2\u009b\u009c\5$\23\2\u009c\u009d\b\b\1\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\b"+
		"\1\2\u00a1\u00a2\7\'\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5"+
		"\b\t\1\2\u00a5\u00b6\3\2\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\b\t\1\2"+
		"\u00a8\u00b6\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\b\t\1\2\u00ab\u00b6"+
		"\3\2\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\b\t\1\2\u00ae\u00b6\3\2\2\2"+
		"\u00af\u00b0\5\32\16\2\u00b0\u00b1\b\t\1\2\u00b1\u00b6\3\2\2\2\u00b2\u00b3"+
		"\5\6\4\2\u00b3\u00b4\b\t\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00a3\3\2\2\2\u00b5"+
		"\u00a6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\f\2"+
		"\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5J&\2\u00bd\u00be\7!\2\2\u00be\u00bf"+
		"\b\n\1\2\u00bf\u00c1\7\b\2\2\u00c0\u00c2\5\20\t\2\u00c1\u00c0\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00d1\7\n\2\2\u00c4\u00c5"+
		"\7\5\2\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\5J&\2\u00c7\u00c8\7!\2\2\u00c8"+
		"\u00c9\b\n\1\2\u00c9\u00cb\7\b\2\2\u00ca\u00cc\5\20\t\2\u00cb\u00ca\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c4\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7 \2\2\u00d5\u00d6\b\n\1\2\u00d6\u00d8\7\b\2\2\u00d7\u00d9\5\20"+
		"\t\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\7\n\2\2\u00db\u00d4\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\b\n\1\2\u00de\23\3\2\2\2\u00df\u00e0\7\4\2\2\u00e0\u00e1"+
		"\7\17\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\b\13\1\2"+
		"\u00e4\u00e6\7\b\2\2\u00e5\u00e7\5\20\t\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea\b\13\1\2"+
		"\u00ea\25\3\2\2\2\u00eb\u00ec\5\b\5\2\u00ec\u00ed\7,\2\2\u00ed\u00f6\b"+
		"\f\1\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f7\b\f\1\2\u00f1"+
		"\u00f2\7\t\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f5\7("+
		"\2\2\u00f5\u00f7\b\f\1\2\u00f6\u00ee\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7"+
		"\27\3\2\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\7\'\2\2\u00fa\u00fb\b\r\1"+
		"\2\u00fb\31\3\2\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\'\2\2\u00fe\u00ff"+
		"\b\16\1\2\u00ff\33\3\2\2\2\u0100\u0101\5\36\20\2\u0101\u0102\b\17\1\2"+
		"\u0102\u0107\3\2\2\2\u0103\u0104\5 \21\2\u0104\u0105\b\17\1\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\7\'\2\2\u0109\35\3\2\2\2\u010a\u0110\b\20\1\2\u010b\u010c\7,\2"+
		"\2\u010c\u0111\b\20\1\2\u010d\u010e\58\35\2\u010e\u010f\b\20\1\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010d\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\7\25\2\2\u0113\u0114\5$\23\2\u0114\u0115\b\20\1\2\u0115"+
		"\37\3\2\2\2\u0116\u0117\b\21\1\2\u0117\u0118\5$\23\2\u0118\u011e\7\24"+
		"\2\2\u0119\u011a\7,\2\2\u011a\u011f\b\21\1\2\u011b\u011c\58\35\2\u011c"+
		"\u011d\b\21\1\2\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011b\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\21\1\2\u0121!\3\2\2\2\u0122\u0123"+
		"\7\t\2\2\u0123\u0124\7\17\2\2\u0124\u0125\5$\23\2\u0125\u0126\7!\2\2\u0126"+
		"\u0127\b\22\1\2\u0127\u012d\3\2\2\2\u0128\u0129\7\t\2\2\u0129\u012a\5"+
		"$\23\2\u012a\u012b\b\22\1\2\u012b\u012d\3\2\2\2\u012c\u0122\3\2\2\2\u012c"+
		"\u0128\3\2\2\2\u012d#\3\2\2\2\u012e\u012f\5L\'\2\u012f\u0130\b\23\1\2"+
		"\u0130\u0138\3\2\2\2\u0131\u0132\5&\24\2\u0132\u0133\b\23\1\2\u0133\u0138"+
		"\3\2\2\2\u0134\u0135\5(\25\2\u0135\u0136\b\23\1\2\u0136\u0138\3\2\2\2"+
		"\u0137\u012e\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138%\3"+
		"\2\2\2\u0139\u013a\7,\2\2\u013a\u013c\7\17\2\2\u013b\u013d\5*\26\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7!"+
		"\2\2\u013f\u0140\b\24\1\2\u0140\'\3\2\2\2\u0141\u0142\58\35\2\u0142\u0143"+
		"\b\25\1\2\u0143\u0144\7\23\2\2\u0144\u0145\7,\2\2\u0145\u0146\b\25\1\2"+
		"\u0146\u0148\7\17\2\2\u0147\u0149\5*\26\2\u0148\u0147\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7!\2\2\u014b\u014c\b\25\1\2\u014c"+
		")\3\2\2\2\u014d\u015c\b\26\1\2\u014e\u014f\5L\'\2\u014f\u0159\b\26\1\2"+
		"\u0150\u0151\7\22\2\2\u0151\u0152\5L\'\2\u0152\u0153\b\26\1\2\u0153\u0158"+
		"\3\2\2\2\u0154\u0155\5,\27\2\u0155\u0156\b\26\1\2\u0156\u0158\3\2\2\2"+
		"\u0157\u0150\3\2\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u014e\3\2\2\2\u015c\u015d\3\2\2\2\u015d+\3\2\2\2\u015e\u015f\7\t\2\2"+
		"\u015f\u0160\5.\30\2\u0160\u0161\b\27\1\2\u0161\u0184\3\2\2\2\u0162\u0163"+
		"\7\20\2\2\u0163\u0164\5.\30\2\u0164\u0165\b\27\1\2\u0165\u0184\3\2\2\2"+
		"\u0166\u0167\7\7\2\2\u0167\u0168\5.\30\2\u0168\u0169\b\27\1\2\u0169\u0184"+
		"\3\2\2\2\u016a\u016b\7\35\2\2\u016b\u016c\5.\30\2\u016c\u016d\b\27\1\2"+
		"\u016d\u0184\3\2\2\2\u016e\u016f\7\20\2\2\u016f\u0170\7$\2\2\u0170\u0171"+
		"\5.\30\2\u0171\u0172\b\27\1\2\u0172\u0184\3\2\2\2\u0173\u0174\7\33\2\2"+
		"\u0174\u0175\5.\30\2\u0175\u0176\b\27\1\2\u0176\u0184\3\2\2\2\u0177\u0178"+
		"\7\30\2\2\u0178\u0179\5.\30\2\u0179\u017a\b\27\1\2\u017a\u0184\3\2\2\2"+
		"\u017b\u017c\7\31\2\2\u017c\u017d\5.\30\2\u017d\u017e\b\27\1\2\u017e\u0184"+
		"\3\2\2\2\u017f\u0180\7\r\2\2\u0180\u0181\5.\30\2\u0181\u0182\b\27\1\2"+
		"\u0182\u0184\3\2\2\2\u0183\u015e\3\2\2\2\u0183\u0162\3\2\2\2\u0183\u0166"+
		"\3\2\2\2\u0183\u016a\3\2\2\2\u0183\u016e\3\2\2\2\u0183\u0173\3\2\2\2\u0183"+
		"\u0177\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017f\3\2\2\2\u0184-\3\2\2\2"+
		"\u0185\u0186\7+\2\2\u0186\u0190\b\30\1\2\u0187\u0188\7)\2\2\u0188\u0190"+
		"\b\30\1\2\u0189\u018a\7(\2\2\u018a\u0190\b\30\1\2\u018b\u018c\7*\2\2\u018c"+
		"\u0190\b\30\1\2\u018d\u018e\7,\2\2\u018e\u0190\b\30\1\2\u018f\u0185\3"+
		"\2\2\2\u018f\u0187\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190/\3\2\2\2\u0191\u0192\5.\30\2\u0192\u0193\b\31\1\2"+
		"\u0193\u01a7\3\2\2\2\u0194\u0195\58\35\2\u0195\u0196\b\31\1\2\u0196\u01a7"+
		"\3\2\2\2\u0197\u0198\5&\24\2\u0198\u0199\b\31\1\2\u0199\u01a7\3\2\2\2"+
		"\u019a\u019b\5(\25\2\u019b\u019c\b\31\1\2\u019c\u01a7\3\2\2\2\u019d\u019e"+
		"\5\62\32\2\u019e\u019f\b\31\1\2\u019f\u01a7\3\2\2\2\u01a0\u01a1\5\64\33"+
		"\2\u01a1\u01a2\b\31\1\2\u01a2\u01a7\3\2\2\2\u01a3\u01a4\5\66\34\2\u01a4"+
		"\u01a5\b\31\1\2\u01a5\u01a7\3\2\2\2\u01a6\u0191\3\2\2\2\u01a6\u0194\3"+
		"\2\2\2\u01a6\u0197\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6"+
		"\u01a0\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7\61\3\2\2\2\u01a8\u01a9\7,\2\2"+
		"\u01a9\u01ae\7\27\2\2\u01aa\u01ab\7(\2\2\u01ab\u01af\b\32\1\2\u01ac\u01ad"+
		"\7,\2\2\u01ad\u01af\b\32\1\2\u01ae\u01aa\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\7\32\2\2\u01b1\63\3\2\2\2\u01b2\u01b3\7\27"+
		"\2\2\u01b3\u01b4\b\33\1\2\u01b4\u01b5\5\60\31\2\u01b5\u01bc\b\33\1\2\u01b6"+
		"\u01b7\7\22\2\2\u01b7\u01b8\5\60\31\2\u01b8\u01b9\b\33\1\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\b\33"+
		"\1\2\u01c0\u01c1\7\32\2\2\u01c1\65\3\2\2\2\u01c2\u01c3\7\b\2\2\u01c3\u01c4"+
		"\b\34\1\2\u01c4\u01c5\7,\2\2\u01c5\u01c6\7\26\2\2\u01c6\u01c7\5\60\31"+
		"\2\u01c7\u01d0\b\34\1\2\u01c8\u01c9\7\22\2\2\u01c9\u01ca\7,\2\2\u01ca"+
		"\u01cb\7\26\2\2\u01cb\u01cc\5\60\31\2\u01cc\u01cd\b\34\1\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01c8\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\b\34"+
		"\1\2\u01d4\u01d5\7\n\2\2\u01d5\67\3\2\2\2\u01d6\u01d7\7,\2\2\u01d7\u01dd"+
		"\b\35\1\2\u01d8\u01d9\7\23\2\2\u01d9\u01da\7,\2\2\u01da\u01dc\b\35\1\2"+
		"\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de9\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\b\36\1\2\u01e1"+
		"\u01e2\7%\2\2\u01e2\u01e4\b\36\1\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01ed\3\2\2\2\u01e5\u01e6\5\60\31\2\u01e6\u01e7\b\36\1\2\u01e7"+
		"\u01ee\3\2\2\2\u01e8\u01e9\7\17\2\2\u01e9\u01ea\5L\'\2\u01ea\u01eb\7!"+
		"\2\2\u01eb\u01ec\b\36\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed"+
		"\u01e8\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\b\36\1\2\u01f0;\3\2\2\2"+
		"\u01f1\u01f2\5:\36\2\u01f2\u01f5\b\37\1\2\u01f3\u01f4\7\36\2\2\u01f4\u01f6"+
		"\b\37\1\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6=\3\2\2\2\u01f7"+
		"\u01f8\5<\37\2\u01f8\u01ff\b \1\2\u01f9\u01fa\7\13\2\2\u01fa\u01fb\5<"+
		"\37\2\u01fb\u01fc\b \1\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200?\3\2\2\2"+
		"\u0201\u01ff\3\2\2\2\u0202\u0203\5> \2\u0203\u020e\b!\1\2\u0204\u0205"+
		"\7\21\2\2\u0205\u0206\5> \2\u0206\u0207\b!\1\2\u0207\u020d\3\2\2\2\u0208"+
		"\u0209\7\3\2\2\u0209\u020a\5> \2\u020a\u020b\b!\1\2\u020b\u020d\3\2\2"+
		"\2\u020c\u0204\3\2\2\2\u020c\u0208\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020e\u020f\3\2\2\2\u020fA\3\2\2\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0212\5@!\2\u0212\u021d\b\"\1\2\u0213\u0214\7#\2\2\u0214\u0215\5@!\2"+
		"\u0215\u0216\b\"\1\2\u0216\u021c\3\2\2\2\u0217\u0218\7%\2\2\u0218\u0219"+
		"\5@!\2\u0219\u021a\b\"\1\2\u021a\u021c\3\2\2\2\u021b\u0213\3\2\2\2\u021b"+
		"\u0217\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021eC\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\5B\"\2\u0221\u0228"+
		"\b#\1\2\u0222\u0223\7\16\2\2\u0223\u0224\5B\"\2\u0224\u0225\b#\1\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0222\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229E\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c"+
		"\5D#\2\u022c\u0254\b$\1\2\u022d\u022e\7\t\2\2\u022e\u022f\5D#\2\u022f"+
		"\u0230\b$\1\2\u0230\u0253\3\2\2\2\u0231\u0232\7\20\2\2\u0232\u0233\5D"+
		"#\2\u0233\u0234\b$\1\2\u0234\u0253\3\2\2\2\u0235\u0236\7\7\2\2\u0236\u0237"+
		"\5D#\2\u0237\u0238\b$\1\2\u0238\u0253\3\2\2\2\u0239\u023a\7\35\2\2\u023a"+
		"\u023b\5D#\2\u023b\u023c\b$\1\2\u023c\u0253\3\2\2\2\u023d\u023e\7\20\2"+
		"\2\u023e\u023f\7$\2\2\u023f\u0240\5D#\2\u0240\u0241\b$\1\2\u0241\u0253"+
		"\3\2\2\2\u0242\u0243\7\33\2\2\u0243\u0244\5D#\2\u0244\u0245\b$\1\2\u0245"+
		"\u0253\3\2\2\2\u0246\u0247\7\30\2\2\u0247\u0248\5D#\2\u0248\u0249\b$\1"+
		"\2\u0249\u0253\3\2\2\2\u024a\u024b\7\31\2\2\u024b\u024c\5D#\2\u024c\u024d"+
		"\b$\1\2\u024d\u0253\3\2\2\2\u024e\u024f\7\r\2\2\u024f\u0250\5D#\2\u0250"+
		"\u0251\b$\1\2\u0251\u0253\3\2\2\2\u0252\u022d\3\2\2\2\u0252\u0231\3\2"+
		"\2\2\u0252\u0235\3\2\2\2\u0252\u0239\3\2\2\2\u0252\u023d\3\2\2\2\u0252"+
		"\u0242\3\2\2\2\u0252\u0246\3\2\2\2\u0252\u024a\3\2\2\2\u0252\u024e\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"G\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5F$\2\u0258\u0259\b%\1\2\u0259"+
		"\u025f\3\2\2\2\u025a\u025b\7$\2\2\u025b\u025c\5F$\2\u025c\u025d\b%\1\2"+
		"\u025d\u025f\3\2\2\2\u025e\u0257\3\2\2\2\u025e\u025a\3\2\2\2\u025fI\3"+
		"\2\2\2\u0260\u0261\5H%\2\u0261\u026c\b&\1\2\u0262\u0263\7\"\2\2\u0263"+
		"\u0264\5L\'\2\u0264\u0265\b&\1\2\u0265\u026b\3\2\2\2\u0266\u0267\7\34"+
		"\2\2\u0267\u0268\5L\'\2\u0268\u0269\b&\1\2\u0269\u026b\3\2\2\2\u026a\u0262"+
		"\3\2\2\2\u026a\u0266\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026dK\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\5J&\2\u0270"+
		"\u0271\b\'\1\2\u0271M\3\2\2\2\63T\\nw~\u0084\u0087\u0096\u009e\u00b5\u00b7"+
		"\u00c1\u00cb\u00d1\u00d8\u00db\u00e6\u00f6\u0106\u0110\u011e\u012c\u0137"+
		"\u013c\u0148\u0157\u0159\u015c\u0183\u018f\u01a6\u01ae\u01bc\u01d0\u01dd"+
		"\u01e3\u01ed\u01f5\u01ff\u020c\u020e\u021b\u021d\u0228\u0252\u0254\u025e"+
		"\u026a\u026c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
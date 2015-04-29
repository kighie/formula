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
	import kr.simula.formula.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaScriptParser extends kr.simula.formula.core.antlr.FormulaHandlerParser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, END_OF_STMT=43, NUMBER=44, STRING_LITERAL=45, 
		NULL=46, BOOLEAN=47, IDENT=48, WS=49, MULTILINE_COMMENT=50, LINE_COMMENT=51, 
		NEGATION=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'as'", "'foreach'", "'elseif'", "'return'", "'importJava'", 
		"'!='", "'{'", "'='", "'}'", "'^'", "'if'", "'fndef'", "'<='", "'&'", 
		"'('", "'paramdef'", "'is'", "'*'", "'r{'", "','", "'.'", "'->'", "'<-'", 
		"':'", "'>='", "'['", "'<'", "']'", "'>'", "'or'", "'<>'", "'%'", "'in'", 
		"'else'", "'typedef'", "'R{'", "')'", "'and'", "'+'", "'not'", "'-'", 
		"';'", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "NEGATION"
	};
	public static final int
		RULE_formulaScript = 0, RULE_importStatement = 1, RULE_paramDef = 2, RULE_variableDecl = 3, 
		RULE_functionDecl = 4, RULE_argsDecl = 5, RULE_retrunStmt = 6, RULE_typeDecl = 7, 
		RULE_blockContents = 8, RULE_ifStatement = 9, RULE_foreachStatement = 10, 
		RULE_loopCondition = 11, RULE_methodCallStatement = 12, RULE_functionCallStatement = 13, 
		RULE_arguments = 14, RULE_formulaTerm = 15, RULE_lambdaDecl = 16, RULE_proto = 17, 
		RULE_type = 18, RULE_assignStatement = 19, RULE_leftAssign = 20, RULE_rightAssign = 21, 
		RULE_formulaExpression = 22, RULE_formulaExpressionBase = 23, RULE_funcCallExp = 24, 
		RULE_methodCallExp = 25, RULE_lambdaArg = 26, RULE_literalTerm = 27, RULE_iterableTerm = 28, 
		RULE_arrayRef = 29, RULE_array = 30, RULE_map = 31, RULE_qualifiedName = 32, 
		RULE_unary = 33, RULE_percent = 34, RULE_exponential = 35, RULE_multiplicative = 36, 
		RULE_additiveExpression = 37, RULE_stringExpression = 38, RULE_comparison = 39, 
		RULE_notExpression = 40, RULE_logicalExpression = 41, RULE_operatorExpression = 42;
	public static final String[] ruleNames = {
		"formulaScript", "importStatement", "paramDef", "variableDecl", "functionDecl", 
		"argsDecl", "retrunStmt", "typeDecl", "blockContents", "ifStatement", 
		"foreachStatement", "loopCondition", "methodCallStatement", "functionCallStatement", 
		"arguments", "formulaTerm", "lambdaDecl", "proto", "type", "assignStatement", 
		"leftAssign", "rightAssign", "formulaExpression", "formulaExpressionBase", 
		"funcCallExp", "methodCallExp", "lambdaArg", "literalTerm", "iterableTerm", 
		"arrayRef", "array", "map", "qualifiedName", "unary", "percent", "exponential", 
		"multiplicative", "additiveExpression", "stringExpression", "comparison", 
		"notExpression", "logicalExpression", "operatorExpression"
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


	  	


		public String strip( String text ) {
	    	if( text != null && text.length() >= 2 ) {
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
		public ParamDefContext paramDef;
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public TerminalNode EOF() { return getToken(FormulaScriptParser.EOF, 0); }
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ParamDefContext> paramDef() {
			return getRuleContexts(ParamDefContext.class);
		}
		public ParamDefContext paramDef(int i) {
			return getRuleContext(ParamDefContext.class,i);
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
			 ((FormulaScriptContext)_localctx).module =  (Module)block(ScriptTokens.MODULE); 
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(87); importStatement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(93); ((FormulaScriptContext)_localctx).paramDef = paramDef();
				 _localctx.module.append(((FormulaScriptContext)_localctx).paramDef.result); 
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); blockContents(_localctx.module);
			setState(102); match(EOF);
			 endScope();
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
		public QualifiedNameContext qualifiedName;
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
			setState(105); match(T__36);
			setState(106); ((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
			setState(107); match(END_OF_STMT);
			 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
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

	public static class ParamDefContext extends ParserRuleContext {
		public Statement result;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public ParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitParamDef(this);
		}
	}

	public final ParamDefContext paramDef() throws RecognitionException {
		ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__25);
			setState(111); ((ParamDefContext)_localctx).IDENT = match(IDENT);
			setState(112); match(T__40);
			setState(113); ((ParamDefContext)_localctx).type = type();
			setState(114); match(END_OF_STMT);
			 ((ParamDefContext)_localctx).result =  statement(PARAM_DECL_STMT, declare(PARAM_DECL, ((ParamDefContext)_localctx).type.typeClz ,(((ParamDefContext)_localctx).IDENT!=null?((ParamDefContext)_localctx).IDENT.getText():null)) ); 
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
		enterRule(_localctx, 6, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); ((VariableDeclContext)_localctx).type = type();
			setState(118); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((VariableDeclContext)_localctx).type.typeClz ,(((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null)); 
					((VariableDeclContext)_localctx).stmt =  (VariableDeclStatement)statement(ScriptTokens.VAR_DECL, varRef);
				
			setState(124);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(120); match(T__18);
				setState(121); ((VariableDeclContext)_localctx).formulaExpressionBase = formulaExpressionBase();
					_localctx.stmt.setValueNode(((VariableDeclContext)_localctx).formulaExpressionBase.result); 
				}
			}

			setState(126); match(END_OF_STMT);
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
		public Token IDENT;
		public TypeContext type;
		public RetrunStmtContext retrunStmt() {
			return getRuleContext(RetrunStmtContext.class,0);
		}
		public ArgsDeclContext argsDecl() {
			return getRuleContext(ArgsDeclContext.class,0);
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
					beginScope();
					Class<?> typeClz = Object.class;
				
			setState(129); match(T__29);
			setState(130); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(131); match(T__26);
				setState(132); match(T__4);
				}
				}
				break;
			case 2:
				{
				{
				setState(133); match(T__26);
				setState(134); argsDecl(args);
				setState(135); match(T__4);
				}
				}
				break;
			}
			setState(145);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(139); match(T__17);
				setState(140); ((FunctionDeclContext)_localctx).type = type();
				 typeClz = ((FunctionDeclContext)_localctx).type.typeClz; 
				setState(142); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(144); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((FunctionDeclContext)_localctx).fnBlock =  declareFn(typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
			{
			setState(148); blockContents(_localctx.fnBlock);
			}
			setState(150);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(149); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(152); match(T__32);
				endScope(); 
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
			setState(155); ((ArgsDeclContext)_localctx).type = type();
			setState(156); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(158); match(T__21);
				setState(159); ((ArgsDeclContext)_localctx).type = type();
				setState(160); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(167);
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
			setState(169); match(T__37);
			setState(173);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__29) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__5) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(170); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(176); match(END_OF_STMT);
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

	public static class TypeDeclContext extends ParserRuleContext {
		public Token typeName;
		public Token fieldName;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public LambdaDeclContext lambdaDecl(int i) {
			return getRuleContext(LambdaDeclContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public List<LambdaDeclContext> lambdaDecl() {
			return getRuleContexts(LambdaDeclContext.class);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(T__6);
			setState(179); ((TypeDeclContext)_localctx).typeName = match(IDENT);
			setState(180); match(T__34);
			{
			setState(181); type();
			setState(182); ((TypeDeclContext)_localctx).fieldName = match(IDENT);
			setState(190);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(183); match(T__17);
				setState(188);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					{
					setState(184); formulaTerm();
					  
					}
					}
					break;
				case 2:
					{
					{
					setState(187); lambdaDecl();
					}
					}
					break;
				}
				}
			}

			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(192); match(T__21);
				setState(193); type();
				setState(194); match(IDENT);
				setState(200);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(195); match(T__17);
					setState(198);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						{
						setState(196); formulaTerm();
						}
						}
						break;
					case 2:
						{
						{
						setState(197); lambdaDecl();
						}
						}
						break;
					}
					}
				}

				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); match(T__32);
			setState(209);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(208); match(END_OF_STMT);
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

	public static class BlockContentsContext extends ParserRuleContext {
		public Block stmtHolder;
		public IfStatementContext ifStatement;
		public ForeachStatementContext foreachStatement;
		public AssignStatementContext assignStatement;
		public MethodCallStatementContext methodCallStatement;
		public FunctionCallStatementContext functionCallStatement;
		public VariableDeclContext variableDecl;
		public FunctionDeclContext functionDecl;
		public List<ForeachStatementContext> foreachStatement() {
			return getRuleContexts(ForeachStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public AssignStatementContext assignStatement(int i) {
			return getRuleContext(AssignStatementContext.class,i);
		}
		public TypeDeclContext typeDecl(int i) {
			return getRuleContext(TypeDeclContext.class,i);
		}
		public MethodCallStatementContext methodCallStatement(int i) {
			return getRuleContext(MethodCallStatementContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public List<TypeDeclContext> typeDecl() {
			return getRuleContexts(TypeDeclContext.class);
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
		enterRule(_localctx, 16, RULE_blockContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__34) | (1L << T__30) | (1L << T__29) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(233);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(211); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(214); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(217); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(220); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(223); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(226); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
				case 7:
					{
					setState(229); ((BlockContentsContext)_localctx).functionDecl = functionDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionDecl.fnBlock); 
					}
					break;
				case 8:
					{
					setState(232); typeDecl();
					}
					break;
				}
				}
				setState(237);
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
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(T__30);
			 beginScope(); 
			setState(240); match(T__26);
			setState(241); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(242); match(T__4);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(244); match(T__34);
			setState(245); blockContents(_localctx.ifstmt);
			setState(246); match(T__32);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(247); match(T__38);
				setState(248); match(T__26);
				setState(249); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(250); match(T__4);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(252); match(T__34);
				setState(253); blockContents(elseIfStmt);
				setState(254); match(T__32);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(261); match(T__7);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(263); match(T__34);
				setState(264); blockContents(elseStmt);
				setState(265); match(T__32);
				}
			}

				endScope(); 
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
		enterRule(_localctx, 20, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(T__39);
				beginScope(); 
			setState(273); match(T__26);
			setState(274); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(275); match(T__4);

						((ForeachStatementContext)_localctx).foreachStmt =  statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(277); match(T__34);
			setState(278); blockContents(_localctx.foreachStmt);
			setState(279); match(T__32);
			setState(281);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(280); match(END_OF_STMT);
				}
			}

				endScope(); 
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
		public IterableTermContext iterableTerm;
		public IterableTermContext iterableTerm() {
			return getRuleContext(IterableTermContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
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
		enterRule(_localctx, 22, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); ((LoopConditionContext)_localctx).type = type();
			setState(286); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(288); match(T__8);
			{
			setState(289); ((LoopConditionContext)_localctx).iterableTerm = iterableTerm();

							_localctx.condition.setIteratorRef(((LoopConditionContext)_localctx).iterableTerm.result);
						
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
		enterRule(_localctx, 24, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			setState(293); match(END_OF_STMT);
			 ((MethodCallStatementContext)_localctx).stmt =  statement(ScriptTokens.MTHODE_CALL_STMT, ((MethodCallStatementContext)_localctx).methodCallExp.result); 
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
		enterRule(_localctx, 26, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			setState(297); match(END_OF_STMT);
			 ((FunctionCallStatementContext)_localctx).stmt =  statement(ScriptTokens.FUNCTION_CALL_STMT, ((FunctionCallStatementContext)_localctx).funcCallExp.result); 
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
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).nodeList =  new LinkedList<Node>(); 
			{
			{
			setState(301); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
			 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(304); match(T__21);
				{
				setState(305); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				}
				setState(312);
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

	public static class FormulaTermContext extends ParserRuleContext {
		public Node result;
		public LiteralTermContext literalTerm;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayRefContext arrayRef;
		public ArrayContext array;
		public MapContext map;
		public ProtoContext proto;
		public LambdaDeclContext lambdaDecl;
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
		public ProtoContext proto() {
			return getRuleContext(ProtoContext.class,0);
		}
		public LambdaDeclContext lambdaDecl() {
			return getRuleContext(LambdaDeclContext.class,0);
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
		enterRule(_localctx, 30, RULE_formulaTerm);
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331); ((FormulaTermContext)_localctx).map = map();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).map.result; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334); ((FormulaTermContext)_localctx).proto = proto();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).proto.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(337); ((FormulaTermContext)_localctx).lambdaDecl = lambdaDecl();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).lambdaDecl.lambda; 
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

	public static class LambdaDeclContext extends ParserRuleContext {
		public Lambda lambda;
		public TypeContext type;
		public RetrunStmtContext retrunStmt() {
			return getRuleContext(RetrunStmtContext.class,0);
		}
		public ArgsDeclContext argsDecl() {
			return getRuleContext(ArgsDeclContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LambdaDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLambdaDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLambdaDecl(this);
		}
	}

	public final LambdaDeclContext lambdaDecl() throws RecognitionException {
		LambdaDeclContext _localctx = new LambdaDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lambdaDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					List<Ref> args = new LinkedList<Ref>(); 
					beginScope();
					Class<?> typeClz = Object.class;
				
			setState(343); match(T__29);
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(344); match(T__26);
				setState(345); match(T__4);
				}
				}
				break;
			case 2:
				{
				{
				setState(346); match(T__26);
				setState(347); argsDecl(args);
				setState(348); match(T__4);
				}
				}
				break;
			}
			setState(358);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(352); match(T__17);
				setState(353); ((LambdaDeclContext)_localctx).type = type();
				 typeClz = ((LambdaDeclContext)_localctx).type.typeClz; 
				setState(355); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(357); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((LambdaDeclContext)_localctx).lambda =  lambda( LAMBDA , args, typeClz); 
			{
			setState(361); blockContents(_localctx.lambda);
			}
			setState(363);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(362); retrunStmt(_localctx.lambda);
				}
			}

			setState(365); match(T__32);
				endScope(); 
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

	public static class ProtoContext extends ParserRuleContext {
		public Gettable result;
		public Token fieldName;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public ProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterProto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitProto(this);
		}
	}

	public final ProtoContext proto() throws RecognitionException {
		ProtoContext _localctx = new ProtoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_proto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(368); match(T__5);
				}
				}
				break;
			case T__22:
				{
				{
				setState(369); match(T__22);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(372); type();
			setState(373); ((ProtoContext)_localctx).fieldName = match(IDENT);
			setState(378);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(374); match(T__17);
				setState(375); formulaTerm();
				  
				}
			}

			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(380); match(T__21);
				setState(381); type();
				setState(382); match(IDENT);
				setState(387);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(383); match(T__17);
					setState(384); formulaTerm();
					  
					}
				}

				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394); match(T__32);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(396); ((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null)); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(398); ((TypeContext)_localctx).qualifiedName = qualifiedName();
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).qualifiedName!=null?_input.getText(((TypeContext)_localctx).qualifiedName.start,((TypeContext)_localctx).qualifiedName.stop):null)); 
				}
				setState(404);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(401); match(T__15);
					setState(402); match(T__13);
					 ((TypeContext)_localctx).typeClz =  arrayType(_localctx.typeClz); 
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

	public static class AssignStatementContext extends ParserRuleContext {
		public Statement stmt;
		public LeftAssignContext leftAssign;
		public RightAssignContext rightAssign;
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
		enterRule(_localctx, 38, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(408); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(411); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).rightAssign.stmt ; 
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

	public static class LeftAssignContext extends ParserRuleContext {
		public Statement stmt;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public ArrayRefContext arrayRef;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
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
		enterRule(_localctx, 40, RULE_leftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(417); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(419); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(422); ((LeftAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((LeftAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(427); match(T__18);
			setState(428); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(429); match(END_OF_STMT);
			 ((LeftAssignContext)_localctx).stmt =  statement(ScriptTokens.ASSIGN_STMT, settable, ((LeftAssignContext)_localctx).formulaExpressionBase.result); 
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
		public ArrayRefContext arrayRef;
		public TerminalNode END_OF_STMT() { return getToken(FormulaScriptParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
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
		enterRule(_localctx, 42, RULE_rightAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(433); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(434); match(T__19);
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(435); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(437); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((RightAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(440); ((RightAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((RightAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(445); match(END_OF_STMT);
			 ((RightAssignContext)_localctx).stmt =  statement(ScriptTokens.ASSIGN_STMT, settable, ((RightAssignContext)_localctx).formulaExpressionBase.result); 
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
		enterRule(_localctx, 44, RULE_formulaExpression);
		try {
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(448); match(T__33);
				setState(449); match(T__26);
				setState(450); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(451); match(T__4);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(454); match(T__33);
				setState(455); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
		enterRule(_localctx, 46, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(460); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(463); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(466); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 48, RULE_funcCallExp);
		try {
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(471); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(472); match(T__26);
				setState(473); match(T__4);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(475); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(476); match(T__26);
				setState(477); ((FuncCallExpContext)_localctx).arguments = arguments();
				setState(478); match(T__4);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), ((FuncCallExpContext)_localctx).arguments.nodeList) ;
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
		enterRule(_localctx, 50, RULE_methodCallExp);
		try {
			setState(498);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(483); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(484); match(T__20);
				setState(485); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(486); match(T__26);
				setState(487); match(T__4);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(490); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(491); match(T__20);
				setState(492); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(493); match(T__26);
				setState(494); ((MethodCallExpContext)_localctx).arguments = arguments();
				setState(495); match(T__4);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), ((MethodCallExpContext)_localctx).arguments.nodeList) ; 
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

	public static class LambdaArgContext extends ParserRuleContext {
		public Lambda result;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public LambdaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterLambdaArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitLambdaArg(this);
		}
	}

	public final LambdaArgContext lambdaArg() throws RecognitionException {
		LambdaArgContext _localctx = new LambdaArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lambdaArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(500); match(IDENT);
				}
				}
				break;
			case T__26:
				{
				{
				setState(501); match(T__26);
				setState(502); match(IDENT);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(503); match(T__21);
					setState(504); match(IDENT);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510); match(T__4);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(513); match(T__19);
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
		enterRule(_localctx, 54, RULE_literalTerm);
		try {
			setState(525);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(515); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(517); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(519); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(521); match(NULL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(523); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
				 ((LiteralTermContext)_localctx).result =  refer( (((LiteralTermContext)_localctx).IDENT!=null?((LiteralTermContext)_localctx).IDENT.getText():null)); 
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
		public TerminalNode IDENT() { return getToken(FormulaScriptParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IterableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterIterableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitIterableTerm(this);
		}
	}

	public final IterableTermContext iterableTerm() throws RecognitionException {
		IterableTermContext _localctx = new IterableTermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_iterableTerm);
		try {
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  refer( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(538); ((IterableTermContext)_localctx).array = array();
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

	public static class ArrayRefContext extends ParserRuleContext {
		public Ref result;
		public Token IDENT;
		public Token NUMBER;
		public Token id2;
		public Token id3;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaScriptParser.IDENT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(FormulaScriptParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 58, RULE_arrayRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(544); match(T__15);
			setState(551);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(545); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), literal( LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(547); ((ArrayRefContext)_localctx).id2 = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
				}
				break;
			case STRING_LITERAL:
				{
				setState(549); ((ArrayRefContext)_localctx).id3 = match(STRING_LITERAL);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), literal( LIT_STRING, strip((((ArrayRefContext)_localctx).id3!=null?((ArrayRefContext)_localctx).id3.getText():null))) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(553); match(T__13);
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
		public Token from;
		public Token to;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(FormulaScriptParser.NUMBER, i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public List<TerminalNode> NUMBER() { return getTokens(FormulaScriptParser.NUMBER); }
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
		enterRule(_localctx, 60, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(T__15);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				{
				setState(557); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(560); ((ArrayContext)_localctx).from = match(NUMBER);
				setState(561); match(T__17);
				setState(562); ((ArrayContext)_localctx).to = match(NUMBER);
				 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
				}
				}
				break;
			}
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==NUMBER) {
				{
				setState(574);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(566); match(T__21);
					{
					setState(567); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					break;
				case NUMBER:
					{
					{
					setState(570); ((ArrayContext)_localctx).from = match(NUMBER);
					setState(571); match(T__17);
					setState(572); ((ArrayContext)_localctx).to = match(NUMBER);
					 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579); match(T__13);
				((ArrayContext)_localctx).result =  array(elements); 
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
		public Token STRING_LITERAL;
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
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FormulaScriptParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FormulaScriptParser.STRING_LITERAL, i);
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
		enterRule(_localctx, 62, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); match(T__34);
			 ((MapContext)_localctx).result =  map(SIMPLE_MAP); String key;
			setState(609);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENT) {
				{
				setState(588);
				switch (_input.LA(1)) {
				case IDENT:
					{
					{
					setState(584); ((MapContext)_localctx).IDENT = match(IDENT);
					key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
					}
					}
					break;
				case STRING_LITERAL:
					{
					{
					setState(586); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(590); match(T__17);
				setState(591); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(593); match(T__21);
					setState(598);
					switch (_input.LA(1)) {
					case IDENT:
						{
						{
						setState(594); ((MapContext)_localctx).IDENT = match(IDENT);
						key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
						}
						}
						break;
					case STRING_LITERAL:
						{
						{
						setState(596); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
						key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(600); match(T__17);
					setState(601); ((MapContext)_localctx).formulaTerm = formulaTerm();
					 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(611); match(T__32);
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
		enterRule(_localctx, 64, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615); match(T__20);
					setState(616); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(622);
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
		enterRule(_localctx, 66, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(626);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(624); match(T__0);
				 negative = true; 
				}
			}

			setState(636);
			switch (_input.LA(1)) {
			case T__34:
			case T__29:
			case T__22:
			case T__15:
			case T__5:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(628); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__26:
				{
				setState(631); match(T__26);
				setState(632); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(633); match(T__4);
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).operatorExpression.result;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 
						if(negative){
							((UnaryContext)_localctx).result =  operator(OP_NUM_NEGATION, _localctx.result );
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
		enterRule(_localctx, 68, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(644);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(642); match(T__9);
				((PercentContext)_localctx).result =  operator(OP_PERCENT, _localctx.result); 
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
		enterRule(_localctx, 70, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(648); match(T__31);
				setState(649); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  operator(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(656);
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
		enterRule(_localctx, 72, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41 || _la==T__23) {
				{
				setState(667);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(659); match(T__23);
					setState(660); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__41:
					{
					setState(663); match(T__41);
					setState(664); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(671);
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
		enterRule(_localctx, 74, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				setState(682);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(674); match(T__2);
					setState(675); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__0:
					{
					setState(678); match(T__0);
					setState(679); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(686);
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
		enterRule(_localctx, 76, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(689); match(T__27);
				setState(690); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  operator(OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(697);
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
		enterRule(_localctx, 78, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__28) | (1L << T__24) | (1L << T__16) | (1L << T__14) | (1L << T__12) | (1L << T__10))) != 0)) {
				{
				setState(737);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(700); match(T__33);
					setState(701); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(704); match(T__24);
					setState(705); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(708); match(T__35);
					setState(709); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(712); match(T__10);
					setState(713); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(716); match(T__24);
					setState(717); match(T__1);
					setState(718); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(721); match(T__12);
					setState(722); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(725); match(T__16);
					setState(726); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(729); match(T__14);
					setState(730); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(733); match(T__28);
					setState(734); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(741);
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
		enterRule(_localctx, 80, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			switch (_input.LA(1)) {
			case T__34:
			case T__29:
			case T__26:
			case T__22:
			case T__15:
			case T__5:
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(742); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__1:
				{
				setState(745); match(T__1);
				setState(746); ((NotExpressionContext)_localctx).comparison = comparison();
				((NotExpressionContext)_localctx).result =  operator(OP_NOT, ((NotExpressionContext)_localctx).comparison.result); 
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
		enterRule(_localctx, 82, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(761);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(753); match(T__3);
						setState(754); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__11:
						{
						setState(757); match(T__11);
						setState(758); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 84, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0304\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u008c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\6\3\6"+
		"\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a6"+
		"\n\7\f\7\16\7\u00a9\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\5\t\u00c1\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\5\t\u00cb\n\t\7\t\u00cd\n\t\f\t\16"+
		"\t\u00d0\13\t\3\t\3\t\5\t\u00d4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ec\n\n\f"+
		"\n\16\n\u00ef\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0103\n\13\f\13\16\13\u0106"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010e\n\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011c\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0137\n\20\f\20\16\20\u013a\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0157"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0161\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0169\n\22\3\22\3\22\3\22\5\22\u016e\n\22\3"+
		"\22\3\22\3\22\3\23\3\23\5\23\u0175\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u017d\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0186\n\23\7"+
		"\23\u0188\n\23\f\23\16\23\u018b\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0197\n\24\5\24\u0199\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01a1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u01ac\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01be\n\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01cd\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01d8\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01e4\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01f5\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u01fc\n\34\f\34\16\34\u01ff\13\34\3\34\5\34\u0202\n\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0210"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0220\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u022a"+
		"\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0237\n \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \7 \u0241\n \f \16 \u0244\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u024f"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0259\n!\3!\3!\3!\3!\7!\u025f\n!\f!\16"+
		"!\u0262\13!\5!\u0264\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u026d\n\"\f\"\16"+
		"\"\u0270\13\"\3#\3#\3#\5#\u0275\n#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u027f\n"+
		"#\3#\3#\3$\3$\3$\3$\5$\u0287\n$\3%\3%\3%\3%\3%\3%\7%\u028f\n%\f%\16%\u0292"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u029e\n&\f&\16&\u02a1\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02ad\n\'\f\'\16\'\u02b0\13\'\3"+
		"(\3(\3(\3(\3(\3(\7(\u02b8\n(\f(\16(\u02bb\13(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02e4\n)\f)\16)\u02e7\13)\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u02f0\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02fc\n+\f+\16+\u02ff"+
		"\13+\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTV\2\2\u0336\2X\3\2\2\2\4k\3\2\2\2\6p\3\2\2"+
		"\2\bw\3\2\2\2\n\u0082\3\2\2\2\f\u009d\3\2\2\2\16\u00aa\3\2\2\2\20\u00b4"+
		"\3\2\2\2\22\u00ed\3\2\2\2\24\u00f0\3\2\2\2\26\u0111\3\2\2\2\30\u011f\3"+
		"\2\2\2\32\u0126\3\2\2\2\34\u012a\3\2\2\2\36\u012e\3\2\2\2 \u0156\3\2\2"+
		"\2\"\u0158\3\2\2\2$\u0174\3\2\2\2&\u0198\3\2\2\2(\u01a0\3\2\2\2*\u01a2"+
		"\3\2\2\2,\u01b2\3\2\2\2.\u01cc\3\2\2\2\60\u01d7\3\2\2\2\62\u01e3\3\2\2"+
		"\2\64\u01f4\3\2\2\2\66\u0201\3\2\2\28\u020f\3\2\2\2:\u021f\3\2\2\2<\u0221"+
		"\3\2\2\2>\u022d\3\2\2\2@\u0248\3\2\2\2B\u0267\3\2\2\2D\u0271\3\2\2\2F"+
		"\u0282\3\2\2\2H\u0288\3\2\2\2J\u0293\3\2\2\2L\u02a2\3\2\2\2N\u02b1\3\2"+
		"\2\2P\u02bc\3\2\2\2R\u02ef\3\2\2\2T\u02f1\3\2\2\2V\u0300\3\2\2\2X\\\b"+
		"\2\1\2Y[\5\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2\2\2^"+
		"\\\3\2\2\2_`\5\6\4\2`a\b\2\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\22\n\2hi\7\2\2\3ij\b\2\1\2j\3\3\2\2"+
		"\2kl\7\b\2\2lm\5B\"\2mn\7-\2\2no\b\3\1\2o\5\3\2\2\2pq\7\23\2\2qr\7\62"+
		"\2\2rs\7\4\2\2st\5&\24\2tu\7-\2\2uv\b\4\1\2v\7\3\2\2\2wx\5&\24\2xy\7\62"+
		"\2\2y~\b\5\1\2z{\7\32\2\2{|\5\60\31\2|}\b\5\1\2}\177\3\2\2\2~z\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7-\2\2\u0081\t\3\2\2\2\u0082"+
		"\u0083\b\6\1\2\u0083\u0084\7\17\2\2\u0084\u008b\7\62\2\2\u0085\u0086\7"+
		"\22\2\2\u0086\u008c\7(\2\2\u0087\u0088\7\22\2\2\u0088\u0089\5\f\7\2\u0089"+
		"\u008a\7(\2\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2"+
		"\2\2\u008c\u0093\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u008f\5&\24\2\u008f"+
		"\u0090\b\6\1\2\u0090\u0091\7\n\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7\n"+
		"\2\2\u0093\u008d\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\b\6\1\2\u0096\u0098\5\22\n\2\u0097\u0099\5\16\b\2\u0098\u0097\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\f\2\2\u009b"+
		"\u009c\b\6\1\2\u009c\13\3\2\2\2\u009d\u009e\5&\24\2\u009e\u009f\7\62\2"+
		"\2\u009f\u00a7\b\7\1\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5&\24\2\u00a2"+
		"\u00a3\7\62\2\2\u00a3\u00a4\b\7\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\r\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\b\b\1\2\u00ab\u00af\7\7\2\2"+
		"\u00ac\u00ad\5\60\31\2\u00ad\u00ae\b\b\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ac"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\b\1\2\u00b2"+
		"\u00b3\7-\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7&\2\2\u00b5\u00b6\7\62\2\2"+
		"\u00b6\u00b7\7\n\2\2\u00b7\u00b8\5&\24\2\u00b8\u00c0\7\62\2\2\u00b9\u00be"+
		"\7\33\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\b\t\1\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bf\5\"\22\2\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00ce\3\2\2\2\u00c2"+
		"\u00c3\7\27\2\2\u00c3\u00c4\5&\24\2\u00c4\u00ca\7\62\2\2\u00c5\u00c8\7"+
		"\33\2\2\u00c6\u00c9\5 \21\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d3\7\f\2\2\u00d2\u00d4\7-\2\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\21\3\2\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\b\n"+
		"\1\2\u00d7\u00ec\3\2\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\b\n\1\2\u00da"+
		"\u00ec\3\2\2\2\u00db\u00dc\5(\25\2\u00dc\u00dd\b\n\1\2\u00dd\u00ec\3\2"+
		"\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\b\n\1\2\u00e0\u00ec\3\2\2\2\u00e1"+
		"\u00e2\5\34\17\2\u00e2\u00e3\b\n\1\2\u00e3\u00ec\3\2\2\2\u00e4\u00e5\5"+
		"\b\5\2\u00e5\u00e6\b\n\1\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\5\n\6\2\u00e8"+
		"\u00e9\b\n\1\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5\20\t\2\u00eb\u00d5\3"+
		"\2\2\2\u00eb\u00d8\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb"+
		"\u00e1\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\23\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\16\2\2\u00f1\u00f2\b\13"+
		"\1\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5T+\2\u00f4\u00f5\7(\2\2\u00f5\u00f6"+
		"\b\13\1\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\5\22\n\2\u00f8\u0104\7\f\2\2"+
		"\u00f9\u00fa\7\6\2\2\u00fa\u00fb\7\22\2\2\u00fb\u00fc\5T+\2\u00fc\u00fd"+
		"\7(\2\2\u00fd\u00fe\b\13\1\2\u00fe\u00ff\7\n\2\2\u00ff\u0100\5\22\n\2"+
		"\u0100\u0101\7\f\2\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010d\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7%\2\2\u0108\u0109\b\13\1\2\u0109\u010a\7\n"+
		"\2\2\u010a\u010b\5\22\n\2\u010b\u010c\7\f\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u0107\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\13"+
		"\1\2\u0110\25\3\2\2\2\u0111\u0112\7\5\2\2\u0112\u0113\b\f\1\2\u0113\u0114"+
		"\7\22\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7(\2\2\u0116\u0117\b\f\1\2"+
		"\u0117\u0118\7\n\2\2\u0118\u0119\5\22\n\2\u0119\u011b\7\f\2\2\u011a\u011c"+
		"\7-\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\b\f\1\2\u011e\27\3\2\2\2\u011f\u0120\5&\24\2\u0120\u0121\7\62\2"+
		"\2\u0121\u0122\b\r\1\2\u0122\u0123\7$\2\2\u0123\u0124\5:\36\2\u0124\u0125"+
		"\b\r\1\2\u0125\31\3\2\2\2\u0126\u0127\5\64\33\2\u0127\u0128\7-\2\2\u0128"+
		"\u0129\b\16\1\2\u0129\33\3\2\2\2\u012a\u012b\5\62\32\2\u012b\u012c\7-"+
		"\2\2\u012c\u012d\b\17\1\2\u012d\35\3\2\2\2\u012e\u012f\b\20\1\2\u012f"+
		"\u0130\5V,\2\u0130\u0131\b\20\1\2\u0131\u0138\3\2\2\2\u0132\u0133\7\27"+
		"\2\2\u0133\u0134\5V,\2\u0134\u0135\b\20\1\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\37\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\58\35\2\u013c\u013d"+
		"\b\21\1\2\u013d\u0157\3\2\2\2\u013e\u013f\5B\"\2\u013f\u0140\b\21\1\2"+
		"\u0140\u0157\3\2\2\2\u0141\u0142\5\62\32\2\u0142\u0143\b\21\1\2\u0143"+
		"\u0157\3\2\2\2\u0144\u0145\5\64\33\2\u0145\u0146\b\21\1\2\u0146\u0157"+
		"\3\2\2\2\u0147\u0148\5<\37\2\u0148\u0149\b\21\1\2\u0149\u0157\3\2\2\2"+
		"\u014a\u014b\5> \2\u014b\u014c\b\21\1\2\u014c\u0157\3\2\2\2\u014d\u014e"+
		"\5@!\2\u014e\u014f\b\21\1\2\u014f\u0157\3\2\2\2\u0150\u0151\5$\23\2\u0151"+
		"\u0152\b\21\1\2\u0152\u0157\3\2\2\2\u0153\u0154\5\"\22\2\u0154\u0155\b"+
		"\21\1\2\u0155\u0157\3\2\2\2\u0156\u013b\3\2\2\2\u0156\u013e\3\2\2\2\u0156"+
		"\u0141\3\2\2\2\u0156\u0144\3\2\2\2\u0156\u0147\3\2\2\2\u0156\u014a\3\2"+
		"\2\2\u0156\u014d\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0153\3\2\2\2\u0157"+
		"!\3\2\2\2\u0158\u0159\b\22\1\2\u0159\u0160\7\17\2\2\u015a\u015b\7\22\2"+
		"\2\u015b\u0161\7(\2\2\u015c\u015d\7\22\2\2\u015d\u015e\5\f\7\2\u015e\u015f"+
		"\7(\2\2\u015f\u0161\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015c\3\2\2\2\u0161"+
		"\u0168\3\2\2\2\u0162\u0163\7\33\2\2\u0163\u0164\5&\24\2\u0164\u0165\b"+
		"\22\1\2\u0165\u0166\7\n\2\2\u0166\u0169\3\2\2\2\u0167\u0169\7\n\2\2\u0168"+
		"\u0162\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\22"+
		"\1\2\u016b\u016d\5\22\n\2\u016c\u016e\5\16\b\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\f\2\2\u0170\u0171\b\22"+
		"\1\2\u0171#\3\2\2\2\u0172\u0175\7\'\2\2\u0173\u0175\7\26\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5&\24\2\u0177"+
		"\u017c\7\62\2\2\u0178\u0179\7\33\2\2\u0179\u017a\5 \21\2\u017a\u017b\b"+
		"\23\1\2\u017b\u017d\3\2\2\2\u017c\u0178\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u0189\3\2\2\2\u017e\u017f\7\27\2\2\u017f\u0180\5&\24\2\u0180\u0185\7"+
		"\62\2\2\u0181\u0182\7\33\2\2\u0182\u0183\5 \21\2\u0183\u0184\b\23\1\2"+
		"\u0184\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u017e\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\f"+
		"\2\2\u018d%\3\2\2\2\u018e\u018f\7\62\2\2\u018f\u0199\b\24\1\2\u0190\u0191"+
		"\5B\"\2\u0191\u0192\b\24\1\2\u0192\u0196\3\2\2\2\u0193\u0194\7\35\2\2"+
		"\u0194\u0195\7\37\2\2\u0195\u0197\b\24\1\2\u0196\u0193\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u018e\3\2\2\2\u0198\u0190\3\2\2\2\u0199"+
		"\'\3\2\2\2\u019a\u019b\5*\26\2\u019b\u019c\b\25\1\2\u019c\u01a1\3\2\2"+
		"\2\u019d\u019e\5,\27\2\u019e\u019f\b\25\1\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019a\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1)\3\2\2\2\u01a2\u01ab\b\26\1\2"+
		"\u01a3\u01a4\7\62\2\2\u01a4\u01ac\b\26\1\2\u01a5\u01a6\5B\"\2\u01a6\u01a7"+
		"\b\26\1\2\u01a7\u01ac\3\2\2\2\u01a8\u01a9\5<\37\2\u01a9\u01aa\b\26\1\2"+
		"\u01aa\u01ac\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a8"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\32\2\2\u01ae\u01af\5\60\31"+
		"\2\u01af\u01b0\7-\2\2\u01b0\u01b1\b\26\1\2\u01b1+\3\2\2\2\u01b2\u01b3"+
		"\b\27\1\2\u01b3\u01b4\5\60\31\2\u01b4\u01bd\7\31\2\2\u01b5\u01b6\7\62"+
		"\2\2\u01b6\u01be\b\27\1\2\u01b7\u01b8\5B\"\2\u01b8\u01b9\b\27\1\2\u01b9"+
		"\u01be\3\2\2\2\u01ba\u01bb\5<\37\2\u01bb\u01bc\b\27\1\2\u01bc\u01be\3"+
		"\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\7-\2\2\u01c0\u01c1\b\27\1\2\u01c1-\3\2\2\2"+
		"\u01c2\u01c3\7\13\2\2\u01c3\u01c4\7\22\2\2\u01c4\u01c5\5\60\31\2\u01c5"+
		"\u01c6\7(\2\2\u01c6\u01c7\b\30\1\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\7\13"+
		"\2\2\u01c9\u01ca\5\60\31\2\u01ca\u01cb\b\30\1\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01c2\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cd/\3\2\2\2\u01ce\u01cf\5V,\2\u01cf"+
		"\u01d0\b\31\1\2\u01d0\u01d8\3\2\2\2\u01d1\u01d2\5\62\32\2\u01d2\u01d3"+
		"\b\31\1\2\u01d3\u01d8\3\2\2\2\u01d4\u01d5\5\64\33\2\u01d5\u01d6\b\31\1"+
		"\2\u01d6\u01d8\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d4"+
		"\3\2\2\2\u01d8\61\3\2\2\2\u01d9\u01da\7\62\2\2\u01da\u01db\7\22\2\2\u01db"+
		"\u01dc\7(\2\2\u01dc\u01e4\b\32\1\2\u01dd\u01de\7\62\2\2\u01de\u01df\7"+
		"\22\2\2\u01df\u01e0\5\36\20\2\u01e0\u01e1\7(\2\2\u01e1\u01e2\b\32\1\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e4\63"+
		"\3\2\2\2\u01e5\u01e6\5B\"\2\u01e6\u01e7\7\30\2\2\u01e7\u01e8\7\62\2\2"+
		"\u01e8\u01e9\7\22\2\2\u01e9\u01ea\7(\2\2\u01ea\u01eb\b\33\1\2\u01eb\u01f5"+
		"\3\2\2\2\u01ec\u01ed\5B\"\2\u01ed\u01ee\7\30\2\2\u01ee\u01ef\7\62\2\2"+
		"\u01ef\u01f0\7\22\2\2\u01f0\u01f1\5\36\20\2\u01f1\u01f2\7(\2\2\u01f2\u01f3"+
		"\b\33\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f4\u01ec\3\2\2\2"+
		"\u01f5\65\3\2\2\2\u01f6\u0202\7\62\2\2\u01f7\u01f8\7\22\2\2\u01f8\u01fd"+
		"\7\62\2\2\u01f9\u01fa\7\27\2\2\u01fa\u01fc\7\62\2\2\u01fb\u01f9\3\2\2"+
		"\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7(\2\2\u0201\u01f6\3\2\2\2\u0201"+
		"\u01f7\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\31\2\2\u0204\67\3\2\2"+
		"\2\u0205\u0206\7\61\2\2\u0206\u0210\b\35\1\2\u0207\u0208\7/\2\2\u0208"+
		"\u0210\b\35\1\2\u0209\u020a\7.\2\2\u020a\u0210\b\35\1\2\u020b\u020c\7"+
		"\60\2\2\u020c\u0210\b\35\1\2\u020d\u020e\7\62\2\2\u020e\u0210\b\35\1\2"+
		"\u020f\u0205\3\2\2\2\u020f\u0207\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020b"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u02109\3\2\2\2\u0211\u0212\7\62\2\2\u0212"+
		"\u0220\b\36\1\2\u0213\u0214\5B\"\2\u0214\u0215\b\36\1\2\u0215\u0220\3"+
		"\2\2\2\u0216\u0217\5\62\32\2\u0217\u0218\b\36\1\2\u0218\u0220\3\2\2\2"+
		"\u0219\u021a\5\64\33\2\u021a\u021b\b\36\1\2\u021b\u0220\3\2\2\2\u021c"+
		"\u021d\5> \2\u021d\u021e\b\36\1\2\u021e\u0220\3\2\2\2\u021f\u0211\3\2"+
		"\2\2\u021f\u0213\3\2\2\2\u021f\u0216\3\2\2\2\u021f\u0219\3\2\2\2\u021f"+
		"\u021c\3\2\2\2\u0220;\3\2\2\2\u0221\u0222\7\62\2\2\u0222\u0229\7\35\2"+
		"\2\u0223\u0224\7.\2\2\u0224\u022a\b\37\1\2\u0225\u0226\7\62\2\2\u0226"+
		"\u022a\b\37\1\2\u0227\u0228\7/\2\2\u0228\u022a\b\37\1\2\u0229\u0223\3"+
		"\2\2\2\u0229\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\7\37\2\2\u022c=\3\2\2\2\u022d\u022e\7\35\2\2\u022e\u0236\b \1\2"+
		"\u022f\u0230\5 \21\2\u0230\u0231\b \1\2\u0231\u0237\3\2\2\2\u0232\u0233"+
		"\7.\2\2\u0233\u0234\7\33\2\2\u0234\u0235\7.\2\2\u0235\u0237\b \1\2\u0236"+
		"\u022f\3\2\2\2\u0236\u0232\3\2\2\2\u0237\u0242\3\2\2\2\u0238\u0239\7\27"+
		"\2\2\u0239\u023a\5 \21\2\u023a\u023b\b \1\2\u023b\u0241\3\2\2\2\u023c"+
		"\u023d\7.\2\2\u023d\u023e\7\33\2\2\u023e\u023f\7.\2\2\u023f\u0241\b \1"+
		"\2\u0240\u0238\3\2\2\2\u0240\u023c\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0246\7\37\2\2\u0246\u0247\b \1\2\u0247?\3\2\2\2\u0248\u0249\7\n\2\2"+
		"\u0249\u0263\b!\1\2\u024a\u024b\7\62\2\2\u024b\u024f\b!\1\2\u024c\u024d"+
		"\7/\2\2\u024d\u024f\b!\1\2\u024e\u024a\3\2\2\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\7\33\2\2\u0251\u0252\5 \21\2\u0252\u0260\b"+
		"!\1\2\u0253\u0258\7\27\2\2\u0254\u0255\7\62\2\2\u0255\u0259\b!\1\2\u0256"+
		"\u0257\7/\2\2\u0257\u0259\b!\1\2\u0258\u0254\3\2\2\2\u0258\u0256\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025b\7\33\2\2\u025b\u025c\5 \21\2\u025c"+
		"\u025d\b!\1\2\u025d\u025f\3\2\2\2\u025e\u0253\3\2\2\2\u025f\u0262\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u024e\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\7\f\2\2\u0266A\3\2\2\2\u0267\u0268\7\62\2\2\u0268\u026e"+
		"\b\"\1\2\u0269\u026a\7\30\2\2\u026a\u026b\7\62\2\2\u026b\u026d\b\"\1\2"+
		"\u026c\u0269\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026fC\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0274\b#\1\2\u0272\u0273"+
		"\7,\2\2\u0273\u0275\b#\1\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u027e\3\2\2\2\u0276\u0277\5 \21\2\u0277\u0278\b#\1\2\u0278\u027f\3\2"+
		"\2\2\u0279\u027a\7\22\2\2\u027a\u027b\5V,\2\u027b\u027c\7(\2\2\u027c\u027d"+
		"\b#\1\2\u027d\u027f\3\2\2\2\u027e\u0276\3\2\2\2\u027e\u0279\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\b#\1\2\u0281E\3\2\2\2\u0282\u0283\5D#\2\u0283"+
		"\u0286\b$\1\2\u0284\u0285\7#\2\2\u0285\u0287\b$\1\2\u0286\u0284\3\2\2"+
		"\2\u0286\u0287\3\2\2\2\u0287G\3\2\2\2\u0288\u0289\5F$\2\u0289\u0290\b"+
		"%\1\2\u028a\u028b\7\r\2\2\u028b\u028c\5F$\2\u028c\u028d\b%\1\2\u028d\u028f"+
		"\3\2\2\2\u028e\u028a\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291I\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\5H%\2\u0294"+
		"\u029f\b&\1\2\u0295\u0296\7\25\2\2\u0296\u0297\5H%\2\u0297\u0298\b&\1"+
		"\2\u0298\u029e\3\2\2\2\u0299\u029a\7\3\2\2\u029a\u029b\5H%\2\u029b\u029c"+
		"\b&\1\2\u029c\u029e\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u0299\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0K\3\2\2\2"+
		"\u02a1\u029f\3\2\2\2\u02a2\u02a3\5J&\2\u02a3\u02ae\b\'\1\2\u02a4\u02a5"+
		"\7*\2\2\u02a5\u02a6\5J&\2\u02a6\u02a7\b\'\1\2\u02a7\u02ad\3\2\2\2\u02a8"+
		"\u02a9\7,\2\2\u02a9\u02aa\5J&\2\u02aa\u02ab\b\'\1\2\u02ab\u02ad\3\2\2"+
		"\2\u02ac\u02a4\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02afM\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1"+
		"\u02b2\5L\'\2\u02b2\u02b9\b(\1\2\u02b3\u02b4\7\21\2\2\u02b4\u02b5\5L\'"+
		"\2\u02b5\u02b6\b(\1\2\u02b6\u02b8\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b8\u02bb"+
		"\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02baO\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bc\u02bd\5N(\2\u02bd\u02e5\b)\1\2\u02be\u02bf\7\13\2"+
		"\2\u02bf\u02c0\5N(\2\u02c0\u02c1\b)\1\2\u02c1\u02e4\3\2\2\2\u02c2\u02c3"+
		"\7\24\2\2\u02c3\u02c4\5N(\2\u02c4\u02c5\b)\1\2\u02c5\u02e4\3\2\2\2\u02c6"+
		"\u02c7\7\t\2\2\u02c7\u02c8\5N(\2\u02c8\u02c9\b)\1\2\u02c9\u02e4\3\2\2"+
		"\2\u02ca\u02cb\7\"\2\2\u02cb\u02cc\5N(\2\u02cc\u02cd\b)\1\2\u02cd\u02e4"+
		"\3\2\2\2\u02ce\u02cf\7\24\2\2\u02cf\u02d0\7+\2\2\u02d0\u02d1\5N(\2\u02d1"+
		"\u02d2\b)\1\2\u02d2\u02e4\3\2\2\2\u02d3\u02d4\7 \2\2\u02d4\u02d5\5N(\2"+
		"\u02d5\u02d6\b)\1\2\u02d6\u02e4\3\2\2\2\u02d7\u02d8\7\34\2\2\u02d8\u02d9"+
		"\5N(\2\u02d9\u02da\b)\1\2\u02da\u02e4\3\2\2\2\u02db\u02dc\7\36\2\2\u02dc"+
		"\u02dd\5N(\2\u02dd\u02de\b)\1\2\u02de\u02e4\3\2\2\2\u02df\u02e0\7\20\2"+
		"\2\u02e0\u02e1\5N(\2\u02e1\u02e2\b)\1\2\u02e2\u02e4\3\2\2\2\u02e3\u02be"+
		"\3\2\2\2\u02e3\u02c2\3\2\2\2\u02e3\u02c6\3\2\2\2\u02e3\u02ca\3\2\2\2\u02e3"+
		"\u02ce\3\2\2\2\u02e3\u02d3\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3\u02db\3\2"+
		"\2\2\u02e3\u02df\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6Q\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\5P)\2\u02e9"+
		"\u02ea\b*\1\2\u02ea\u02f0\3\2\2\2\u02eb\u02ec\7+\2\2\u02ec\u02ed\5P)\2"+
		"\u02ed\u02ee\b*\1\2\u02ee\u02f0\3\2\2\2\u02ef\u02e8\3\2\2\2\u02ef\u02eb"+
		"\3\2\2\2\u02f0S\3\2\2\2\u02f1\u02f2\5R*\2\u02f2\u02fd\b+\1\2\u02f3\u02f4"+
		"\7)\2\2\u02f4\u02f5\5V,\2\u02f5\u02f6\b+\1\2\u02f6\u02fc\3\2\2\2\u02f7"+
		"\u02f8\7!\2\2\u02f8\u02f9\5V,\2\u02f9\u02fa\b+\1\2\u02fa\u02fc\3\2\2\2"+
		"\u02fb\u02f3\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02feU\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300"+
		"\u0301\5T+\2\u0301\u0302\b,\1\2\u0302W\3\2\2\2B\\d~\u008b\u0093\u0098"+
		"\u00a7\u00af\u00be\u00c0\u00c8\u00ca\u00ce\u00d3\u00eb\u00ed\u0104\u010d"+
		"\u011b\u0138\u0156\u0160\u0168\u016d\u0174\u017c\u0185\u0189\u0196\u0198"+
		"\u01a0\u01ab\u01bd\u01cc\u01d7\u01e3\u01f4\u01fd\u0201\u020f\u021f\u0229"+
		"\u0236\u0240\u0242\u024e\u0258\u0260\u0263\u026e\u0274\u027e\u0286\u0290"+
		"\u029d\u029f\u02ac\u02ae\u02b9\u02e3\u02e5\u02ef\u02fb\u02fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
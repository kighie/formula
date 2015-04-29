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
		RULE_arguments = 14, RULE_lambdaArg = 15, RULE_assignStatement = 16, RULE_leftAssign = 17, 
		RULE_rightAssign = 18, RULE_formulaExpression = 19, RULE_formulaExpressionBase = 20, 
		RULE_funcCallExp = 21, RULE_methodCallExp = 22, RULE_literalTerm = 23, 
		RULE_iterableTerm = 24, RULE_formulaTerm = 25, RULE_arrayRef = 26, RULE_array = 27, 
		RULE_map = 28, RULE_record = 29, RULE_type = 30, RULE_qualifiedName = 31, 
		RULE_unary = 32, RULE_percent = 33, RULE_exponential = 34, RULE_multiplicative = 35, 
		RULE_additiveExpression = 36, RULE_stringExpression = 37, RULE_comparison = 38, 
		RULE_notExpression = 39, RULE_logicalExpression = 40, RULE_operatorExpression = 41;
	public static final String[] ruleNames = {
		"formulaScript", "importStatement", "paramDef", "variableDecl", "functionDecl", 
		"argsDecl", "retrunStmt", "typeDecl", "blockContents", "ifStatement", 
		"foreachStatement", "loopCondition", "methodCallStatement", "functionCallStatement", 
		"arguments", "lambdaArg", "assignStatement", "leftAssign", "rightAssign", 
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"literalTerm", "iterableTerm", "formulaTerm", "arrayRef", "array", "map", 
		"record", "type", "qualifiedName", "unary", "percent", "exponential", 
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(85); importStatement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(91); ((FormulaScriptContext)_localctx).paramDef = paramDef();
				 _localctx.module.append(((FormulaScriptContext)_localctx).paramDef.result); 
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); blockContents(_localctx.module);
			setState(100); match(EOF);
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
			setState(103); match(T__36);
			setState(104); ((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
			setState(105); match(END_OF_STMT);
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
			setState(108); match(T__25);
			setState(109); ((ParamDefContext)_localctx).IDENT = match(IDENT);
			setState(110); match(T__40);
			setState(111); ((ParamDefContext)_localctx).type = type();
			setState(112); match(END_OF_STMT);
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
			setState(115); ((VariableDeclContext)_localctx).type = type();
			setState(116); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((VariableDeclContext)_localctx).type.typeClz ,(((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null)); 
					((VariableDeclContext)_localctx).stmt =  (VariableDeclStatement)statement(ScriptTokens.VAR_DECL, varRef);
				
			setState(122);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(118); match(T__18);
				setState(119); ((VariableDeclContext)_localctx).formulaExpressionBase = formulaExpressionBase();
					_localctx.stmt.setValueNode(((VariableDeclContext)_localctx).formulaExpressionBase.result); 
				}
			}

			setState(124); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
				
			setState(127); match(T__29);
			setState(128); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(129); match(T__26);
				setState(130); match(T__4);
				}
				}
				break;
			case 2:
				{
				{
				setState(131); match(T__26);
				setState(132); argsDecl(args);
				setState(133); match(T__4);
				}
				}
				break;
			}
			setState(143);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(137); match(T__17);
				setState(138); ((FunctionDeclContext)_localctx).type = type();
				 typeClz = ((FunctionDeclContext)_localctx).type.typeClz; 
				setState(140); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(142); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((FunctionDeclContext)_localctx).fnBlock =  declareFn(typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
			{
			setState(146); blockContents(_localctx.fnBlock);
			}
			setState(148);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(147); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(150); match(T__32);
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
			setState(153); ((ArgsDeclContext)_localctx).type = type();
			setState(154); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(156); match(T__21);
				setState(157); ((ArgsDeclContext)_localctx).type = type();
				setState(158); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(165);
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
			setState(167); match(T__37);
			setState(171);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__5) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(168); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(174); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
		public List<LambdaArgContext> lambdaArg() {
			return getRuleContexts(LambdaArgContext.class);
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
		public LambdaArgContext lambdaArg(int i) {
			return getRuleContext(LambdaArgContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
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
			setState(176); match(T__6);
			setState(177); ((TypeDeclContext)_localctx).typeName = match(IDENT);
			setState(178); match(T__34);
			{
			setState(179); type();
			setState(180); ((TypeDeclContext)_localctx).fieldName = match(IDENT);
			setState(188);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(181); match(T__17);
				setState(186);
				switch (_input.LA(1)) {
				case T__34:
				case T__22:
				case T__15:
				case T__5:
				case NUMBER:
				case STRING_LITERAL:
				case NULL:
				case BOOLEAN:
				case IDENT:
					{
					{
					setState(182); formulaTerm();
					  
					}
					}
					break;
				case T__29:
					{
					{
					setState(185); lambdaArg();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(190); match(T__21);
				setState(191); type();
				setState(192); match(IDENT);
				setState(198);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(193); match(T__17);
					setState(196);
					switch (_input.LA(1)) {
					case T__34:
					case T__22:
					case T__15:
					case T__5:
					case NUMBER:
					case STRING_LITERAL:
					case NULL:
					case BOOLEAN:
					case IDENT:
						{
						{
						setState(194); formulaTerm();
						}
						}
						break;
					case T__29:
						{
						{
						setState(195); lambdaArg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(T__32);
			setState(207);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(206); match(END_OF_STMT);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__34) | (1L << T__30) | (1L << T__29) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__5) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(231);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(209); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(212); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(215); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(218); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(221); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(224); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
				case 7:
					{
					setState(227); ((BlockContentsContext)_localctx).functionDecl = functionDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionDecl.fnBlock); 
					}
					break;
				case 8:
					{
					setState(230); typeDecl();
					}
					break;
				}
				}
				setState(235);
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
			setState(236); match(T__30);
			 beginScope(); 
			setState(238); match(T__26);
			setState(239); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(240); match(T__4);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(242); match(T__34);
			setState(243); blockContents(_localctx.ifstmt);
			setState(244); match(T__32);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(245); match(T__38);
				setState(246); match(T__26);
				setState(247); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(248); match(T__4);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(250); match(T__34);
				setState(251); blockContents(elseIfStmt);
				setState(252); match(T__32);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(259); match(T__7);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(261); match(T__34);
				setState(262); blockContents(elseStmt);
				setState(263); match(T__32);
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
			setState(269); match(T__39);
				beginScope(); 
			setState(271); match(T__26);
			setState(272); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(273); match(T__4);

						((ForeachStatementContext)_localctx).foreachStmt =  statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(275); match(T__34);
			setState(276); blockContents(_localctx.foreachStmt);
			setState(277); match(T__32);
			setState(279);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(278); match(END_OF_STMT);
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
			setState(283); ((LoopConditionContext)_localctx).type = type();
			setState(284); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(286); match(T__8);
			{
			setState(287); ((LoopConditionContext)_localctx).iterableTerm = iterableTerm();

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
			setState(290); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			setState(291); match(END_OF_STMT);
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
			setState(294); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			setState(295); match(END_OF_STMT);
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
		public LambdaArgContext arg3;
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public List<LambdaArgContext> lambdaArg() {
			return getRuleContexts(LambdaArgContext.class);
		}
		public LambdaArgContext lambdaArg(int i) {
			return getRuleContext(LambdaArgContext.class,i);
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
			setState(305);
			switch (_input.LA(1)) {
			case T__34:
			case T__26:
			case T__22:
			case T__15:
			case T__5:
			case T__1:
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				{
				setState(299); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				break;
			case T__29:
				{
				{
				setState(302); ((ArgumentsContext)_localctx).arg3 = lambdaArg();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.lambda); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__21) {
				{
				setState(314);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(307); match(T__21);
					{
					setState(308); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
					 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
					}
					}
					break;
				case T__29:
					{
					{
					setState(311); ((ArgumentsContext)_localctx).arg3 = lambdaArg();
					 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg3.lambda); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(318);
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

	public static class LambdaArgContext extends ParserRuleContext {
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
		enterRule(_localctx, 30, RULE_lambdaArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					List<Ref> args = new LinkedList<Ref>(); 
					beginScope();
					Class<?> typeClz = Object.class;
				
			setState(320); match(T__29);
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(321); match(T__26);
				setState(322); match(T__4);
				}
				}
				break;
			case 2:
				{
				{
				setState(323); match(T__26);
				setState(324); argsDecl(args);
				setState(325); match(T__4);
				}
				}
				break;
			}
			setState(335);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(329); match(T__17);
				setState(330); ((LambdaArgContext)_localctx).type = type();
				 typeClz = ((LambdaArgContext)_localctx).type.typeClz; 
				setState(332); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(334); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((LambdaArgContext)_localctx).lambda =  lambda( LAMBDA , args, typeClz); 
			{
			setState(338); blockContents(_localctx.lambda);
			}
			setState(340);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(339); retrunStmt(_localctx.lambda);
				}
			}

			setState(342); match(T__32);
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
		enterRule(_localctx, 32, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(345); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(348); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
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
		enterRule(_localctx, 34, RULE_leftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(354); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(356); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(359); ((LeftAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((LeftAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(364); match(T__18);
			setState(365); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(366); match(END_OF_STMT);
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
		enterRule(_localctx, 36, RULE_rightAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(370); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(371); match(T__19);
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(372); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(374); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((RightAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(377); ((RightAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((RightAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(382); match(END_OF_STMT);
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
		enterRule(_localctx, 38, RULE_formulaExpression);
		try {
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(385); match(T__33);
				setState(386); match(T__26);
				setState(387); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(388); match(T__4);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(391); match(T__33);
				setState(392); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
		enterRule(_localctx, 40, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(397); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(400); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(403); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		enterRule(_localctx, 42, RULE_funcCallExp);
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(408); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(409); match(T__26);
				setState(410); match(T__4);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(412); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(413); match(T__26);
				setState(414); ((FuncCallExpContext)_localctx).arguments = arguments();
				setState(415); match(T__4);
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
		enterRule(_localctx, 44, RULE_methodCallExp);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(420); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(421); match(T__20);
				setState(422); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(423); match(T__26);
				setState(424); match(T__4);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(427); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(428); match(T__20);
				setState(429); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(430); match(T__26);
				setState(431); ((MethodCallExpContext)_localctx).arguments = arguments();
				setState(432); match(T__4);
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
		enterRule(_localctx, 46, RULE_literalTerm);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(439); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(441); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(443); match(NULL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(445); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
		enterRule(_localctx, 48, RULE_iterableTerm);
		try {
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  refer( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(460); ((IterableTermContext)_localctx).array = array();
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
		public RecordContext record;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
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
		enterRule(_localctx, 50, RULE_formulaTerm);
		try {
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(477); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(483); ((FormulaTermContext)_localctx).map = map();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).map.result; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(486); ((FormulaTermContext)_localctx).record = record();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).record.result; 
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
		enterRule(_localctx, 52, RULE_arrayRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); ((ArrayRefContext)_localctx).IDENT = match(IDENT);
			setState(492); match(T__15);
			setState(499);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(493); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), literal( LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
				}
				break;
			case IDENT:
				{
				setState(495); ((ArrayRefContext)_localctx).id2 = match(IDENT);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
				}
				break;
			case STRING_LITERAL:
				{
				setState(497); ((ArrayRefContext)_localctx).id3 = match(STRING_LITERAL);
				 ((ArrayRefContext)_localctx).result =  refer( (((ArrayRefContext)_localctx).IDENT!=null?((ArrayRefContext)_localctx).IDENT.getText():null), literal( LIT_STRING, strip((((ArrayRefContext)_localctx).id3!=null?((ArrayRefContext)_localctx).id3.getText():null))) ); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(501); match(T__13);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(T__15);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				{
				setState(505); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(508); ((ArrayContext)_localctx).from = match(NUMBER);
				setState(509); match(T__17);
				setState(510); ((ArrayContext)_localctx).to = match(NUMBER);
				 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
				}
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==NUMBER) {
				{
				setState(522);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(514); match(T__21);
					{
					setState(515); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					break;
				case NUMBER:
					{
					{
					setState(518); ((ArrayContext)_localctx).from = match(NUMBER);
					setState(519); match(T__17);
					setState(520); ((ArrayContext)_localctx).to = match(NUMBER);
					 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
					}
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
			setState(527); match(T__13);
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
		enterRule(_localctx, 56, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); match(T__34);
			 ((MapContext)_localctx).result =  map(SIMPLE_MAP); String key;
			setState(557);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENT) {
				{
				setState(536);
				switch (_input.LA(1)) {
				case IDENT:
					{
					{
					setState(532); ((MapContext)_localctx).IDENT = match(IDENT);
					key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
					}
					}
					break;
				case STRING_LITERAL:
					{
					{
					setState(534); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(538); match(T__17);
				setState(539); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(541); match(T__21);
					setState(546);
					switch (_input.LA(1)) {
					case IDENT:
						{
						{
						setState(542); ((MapContext)_localctx).IDENT = match(IDENT);
						key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
						}
						}
						break;
					case STRING_LITERAL:
						{
						{
						setState(544); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
						key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(548); match(T__17);
					setState(549); ((MapContext)_localctx).formulaTerm = formulaTerm();
					 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(559); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordContext extends ParserRuleContext {
		public Gettable result;
		public Token fieldName;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<LambdaArgContext> lambdaArg() {
			return getRuleContexts(LambdaArgContext.class);
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
		public LambdaArgContext lambdaArg(int i) {
			return getRuleContext(LambdaArgContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaScriptParser.IDENT); }
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaScriptListener ) ((FormulaScriptListener)listener).exitRecord(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(561); match(T__5);
				}
				}
				break;
			case T__22:
				{
				{
				setState(562); match(T__22);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(565); type();
			setState(566); ((RecordContext)_localctx).fieldName = match(IDENT);
			setState(574);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(567); match(T__17);
				setState(572);
				switch (_input.LA(1)) {
				case T__34:
				case T__22:
				case T__15:
				case T__5:
				case NUMBER:
				case STRING_LITERAL:
				case NULL:
				case BOOLEAN:
				case IDENT:
					{
					{
					setState(568); formulaTerm();
					  
					}
					}
					break;
				case T__29:
					{
					{
					setState(571); lambdaArg();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(576); match(T__21);
				setState(577); type();
				setState(578); match(IDENT);
				setState(584);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(579); match(T__17);
					setState(582);
					switch (_input.LA(1)) {
					case T__34:
					case T__22:
					case T__15:
					case T__5:
					case NUMBER:
					case STRING_LITERAL:
					case NULL:
					case BOOLEAN:
					case IDENT:
						{
						{
						setState(580); formulaTerm();
						}
						}
						break;
					case T__29:
						{
						{
						setState(581); lambdaArg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591); match(T__32);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(593); ((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null)); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(595); ((TypeContext)_localctx).qualifiedName = qualifiedName();
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).qualifiedName!=null?_input.getText(((TypeContext)_localctx).qualifiedName.start,((TypeContext)_localctx).qualifiedName.stop):null)); 
				}
				setState(601);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(598); match(T__15);
					setState(599); match(T__13);
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
		enterRule(_localctx, 62, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607); match(T__20);
					setState(608); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 64, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(618);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(616); match(T__0);
				 negative = true; 
				}
			}

			setState(628);
			switch (_input.LA(1)) {
			case T__34:
			case T__22:
			case T__15:
			case T__5:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(620); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__26:
				{
				setState(623); match(T__26);
				setState(624); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(625); match(T__4);
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
		enterRule(_localctx, 66, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(636);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(634); match(T__9);
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
		enterRule(_localctx, 68, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(640); match(T__31);
				setState(641); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  operator(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(648);
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
		enterRule(_localctx, 70, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41 || _la==T__23) {
				{
				setState(659);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(651); match(T__23);
					setState(652); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__41:
					{
					setState(655); match(T__41);
					setState(656); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(663);
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
		enterRule(_localctx, 72, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				setState(674);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(666); match(T__2);
					setState(667); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__0:
					{
					setState(670); match(T__0);
					setState(671); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(678);
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
		enterRule(_localctx, 74, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(681); match(T__27);
				setState(682); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  operator(OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(689);
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
		enterRule(_localctx, 76, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__28) | (1L << T__24) | (1L << T__16) | (1L << T__14) | (1L << T__12) | (1L << T__10))) != 0)) {
				{
				setState(729);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(692); match(T__33);
					setState(693); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(696); match(T__24);
					setState(697); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(700); match(T__35);
					setState(701); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(704); match(T__10);
					setState(705); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(708); match(T__24);
					setState(709); match(T__1);
					setState(710); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(713); match(T__12);
					setState(714); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(717); match(T__16);
					setState(718); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(721); match(T__14);
					setState(722); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(725); match(T__28);
					setState(726); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(733);
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
		enterRule(_localctx, 78, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			switch (_input.LA(1)) {
			case T__34:
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
				setState(734); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__1:
				{
				setState(737); match(T__1);
				setState(738); ((NotExpressionContext)_localctx).comparison = comparison();
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
		enterRule(_localctx, 80, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(753);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(745); match(T__3);
						setState(746); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__11:
						{
						setState(749); match(T__11);
						setState(750); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 82, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u02fc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5}\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u008a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\6\3\6\3\6\5"+
		"\6\u0097\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a4\n\7"+
		"\f\7\16\7\u00a7\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bd\n\t\5\t\u00bf\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\5\t\u00c9\n\t\7\t\u00cb\n\t\f\t\16\t"+
		"\u00ce\13\t\3\t\3\t\5\t\u00d2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ea\n\n\f\n"+
		"\16\n\u00ed\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0101\n\13\f\13\16\13\u0104\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010c\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011a\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0134\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u013d\n\20\f\20\16\20\u0140\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u014a\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0152\n\21\3"+
		"\21\3\21\3\21\5\21\u0157\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0162\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u016d\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u017f\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u018e\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0199\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01a5\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b6\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c2\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d2\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ec\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01f6\n\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0203\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u020d\n\35\f\35\16\35\u0210\13\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u021b\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0225\n\36\3\36\3\36\3\36\3\36\7\36\u022b\n\36\f\36\16"+
		"\36\u022e\13\36\5\36\u0230\n\36\3\36\3\36\3\37\3\37\5\37\u0236\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u023f\n\37\5\37\u0241\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0249\n\37\5\37\u024b\n\37\7\37\u024d\n"+
		"\37\f\37\16\37\u0250\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u025c"+
		"\n \5 \u025e\n \3!\3!\3!\3!\3!\7!\u0265\n!\f!\16!\u0268\13!\3\"\3\"\3"+
		"\"\5\"\u026d\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0277\n\"\3\"\3\""+
		"\3#\3#\3#\3#\5#\u027f\n#\3$\3$\3$\3$\3$\3$\7$\u0287\n$\f$\16$\u028a\13"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0296\n%\f%\16%\u0299\13%\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\7&\u02a5\n&\f&\16&\u02a8\13&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\7\'\u02b0\n\'\f\'\16\'\u02b3\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\7(\u02dc\n(\f(\16(\u02df\13(\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u02e8\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u02f4\n*\f*\16*\u02f7\13*\3"+
		"+\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRT\2\2\u0330\2V\3\2\2\2\4i\3\2\2\2\6n\3\2\2\2\bu\3"+
		"\2\2\2\n\u0080\3\2\2\2\f\u009b\3\2\2\2\16\u00a8\3\2\2\2\20\u00b2\3\2\2"+
		"\2\22\u00eb\3\2\2\2\24\u00ee\3\2\2\2\26\u010f\3\2\2\2\30\u011d\3\2\2\2"+
		"\32\u0124\3\2\2\2\34\u0128\3\2\2\2\36\u012c\3\2\2\2 \u0141\3\2\2\2\"\u0161"+
		"\3\2\2\2$\u0163\3\2\2\2&\u0173\3\2\2\2(\u018d\3\2\2\2*\u0198\3\2\2\2,"+
		"\u01a4\3\2\2\2.\u01b5\3\2\2\2\60\u01c1\3\2\2\2\62\u01d1\3\2\2\2\64\u01eb"+
		"\3\2\2\2\66\u01ed\3\2\2\28\u01f9\3\2\2\2:\u0214\3\2\2\2<\u0235\3\2\2\2"+
		">\u025d\3\2\2\2@\u025f\3\2\2\2B\u0269\3\2\2\2D\u027a\3\2\2\2F\u0280\3"+
		"\2\2\2H\u028b\3\2\2\2J\u029a\3\2\2\2L\u02a9\3\2\2\2N\u02b4\3\2\2\2P\u02e7"+
		"\3\2\2\2R\u02e9\3\2\2\2T\u02f8\3\2\2\2VZ\b\2\1\2WY\5\4\3\2XW\3\2\2\2Y"+
		"\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[b\3\2\2\2\\Z\3\2\2\2]^\5\6\4\2^_\b\2\1"+
		"\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2"+
		"\2ef\5\22\n\2fg\7\2\2\3gh\b\2\1\2h\3\3\2\2\2ij\7\b\2\2jk\5@!\2kl\7-\2"+
		"\2lm\b\3\1\2m\5\3\2\2\2no\7\23\2\2op\7\62\2\2pq\7\4\2\2qr\5> \2rs\7-\2"+
		"\2st\b\4\1\2t\7\3\2\2\2uv\5> \2vw\7\62\2\2w|\b\5\1\2xy\7\32\2\2yz\5*\26"+
		"\2z{\b\5\1\2{}\3\2\2\2|x\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7-\2\2\177\t"+
		"\3\2\2\2\u0080\u0081\b\6\1\2\u0081\u0082\7\17\2\2\u0082\u0089\7\62\2\2"+
		"\u0083\u0084\7\22\2\2\u0084\u008a\7(\2\2\u0085\u0086\7\22\2\2\u0086\u0087"+
		"\5\f\7\2\u0087\u0088\7(\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u008a\u0091\3\2\2\2\u008b\u008c\7\33\2\2\u008c\u008d\5"+
		"> \2\u008d\u008e\b\6\1\2\u008e\u008f\7\n\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u0092\7\n\2\2\u0091\u008b\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\b\6\1\2\u0094\u0096\5\22\n\2\u0095\u0097\5\16\b\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\f"+
		"\2\2\u0099\u009a\b\6\1\2\u009a\13\3\2\2\2\u009b\u009c\5> \2\u009c\u009d"+
		"\7\62\2\2\u009d\u00a5\b\7\1\2\u009e\u009f\7\27\2\2\u009f\u00a0\5> \2\u00a0"+
		"\u00a1\7\62\2\2\u00a1\u00a2\b\7\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\r\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\b\1\2\u00a9\u00ad\7\7\2\2"+
		"\u00aa\u00ab\5*\26\2\u00ab\u00ac\b\b\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\b\1\2\u00b0"+
		"\u00b1\7-\2\2\u00b1\17\3\2\2\2\u00b2\u00b3\7&\2\2\u00b3\u00b4\7\62\2\2"+
		"\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5> \2\u00b6\u00be\7\62\2\2\u00b7\u00bc"+
		"\7\33\2\2\u00b8\u00b9\5\64\33\2\u00b9\u00ba\b\t\1\2\u00ba\u00bd\3\2\2"+
		"\2\u00bb\u00bd\5 \21\2\u00bc\u00b8\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00cc\3\2\2\2\u00c0"+
		"\u00c1\7\27\2\2\u00c1\u00c2\5> \2\u00c2\u00c8\7\62\2\2\u00c3\u00c6\7\33"+
		"\2\2\u00c4\u00c7\5\64\33\2\u00c5\u00c7\5 \21\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c0\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d1\7\f\2\2\u00d0\u00d2\7-\2\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\21\3\2\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\b\n"+
		"\1\2\u00d5\u00ea\3\2\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\b\n\1\2\u00d8"+
		"\u00ea\3\2\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\b\n\1\2\u00db\u00ea\3"+
		"\2\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\b\n\1\2\u00de\u00ea\3\2\2\2\u00df"+
		"\u00e0\5\34\17\2\u00e0\u00e1\b\n\1\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\5"+
		"\b\5\2\u00e3\u00e4\b\n\1\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\5\n\6\2\u00e6"+
		"\u00e7\b\n\1\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\5\20\t\2\u00e9\u00d3\3"+
		"\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9"+
		"\u00df\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\23\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef\u00f0\b\13"+
		"\1\2\u00f0\u00f1\7\22\2\2\u00f1\u00f2\5R*\2\u00f2\u00f3\7(\2\2\u00f3\u00f4"+
		"\b\13\1\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\5\22\n\2\u00f6\u0102\7\f\2\2"+
		"\u00f7\u00f8\7\6\2\2\u00f8\u00f9\7\22\2\2\u00f9\u00fa\5R*\2\u00fa\u00fb"+
		"\7(\2\2\u00fb\u00fc\b\13\1\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\5\22\n\2"+
		"\u00fe\u00ff\7\f\2\2\u00ff\u0101\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010b\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7%\2\2\u0106\u0107\b\13\1\2\u0107\u0108\7\n"+
		"\2\2\u0108\u0109\5\22\n\2\u0109\u010a\7\f\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0105\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\13"+
		"\1\2\u010e\25\3\2\2\2\u010f\u0110\7\5\2\2\u0110\u0111\b\f\1\2\u0111\u0112"+
		"\7\22\2\2\u0112\u0113\5\30\r\2\u0113\u0114\7(\2\2\u0114\u0115\b\f\1\2"+
		"\u0115\u0116\7\n\2\2\u0116\u0117\5\22\n\2\u0117\u0119\7\f\2\2\u0118\u011a"+
		"\7-\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\b\f\1\2\u011c\27\3\2\2\2\u011d\u011e\5> \2\u011e\u011f\7\62\2\2"+
		"\u011f\u0120\b\r\1\2\u0120\u0121\7$\2\2\u0121\u0122\5\62\32\2\u0122\u0123"+
		"\b\r\1\2\u0123\31\3\2\2\2\u0124\u0125\5.\30\2\u0125\u0126\7-\2\2\u0126"+
		"\u0127\b\16\1\2\u0127\33\3\2\2\2\u0128\u0129\5,\27\2\u0129\u012a\7-\2"+
		"\2\u012a\u012b\b\17\1\2\u012b\35\3\2\2\2\u012c\u0133\b\20\1\2\u012d\u012e"+
		"\5T+\2\u012e\u012f\b\20\1\2\u012f\u0134\3\2\2\2\u0130\u0131\5 \21\2\u0131"+
		"\u0132\b\20\1\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0130\3"+
		"\2\2\2\u0134\u013e\3\2\2\2\u0135\u0136\7\27\2\2\u0136\u0137\5T+\2\u0137"+
		"\u0138\b\20\1\2\u0138\u013d\3\2\2\2\u0139\u013a\5 \21\2\u013a\u013b\b"+
		"\20\1\2\u013b\u013d\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0139\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\37\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0141\u0142\b\21\1\2\u0142\u0149\7\17\2\2\u0143"+
		"\u0144\7\22\2\2\u0144\u014a\7(\2\2\u0145\u0146\7\22\2\2\u0146\u0147\5"+
		"\f\7\2\u0147\u0148\7(\2\2\u0148\u014a\3\2\2\2\u0149\u0143\3\2\2\2\u0149"+
		"\u0145\3\2\2\2\u014a\u0151\3\2\2\2\u014b\u014c\7\33\2\2\u014c\u014d\5"+
		"> \2\u014d\u014e\b\21\1\2\u014e\u014f\7\n\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u0152\7\n\2\2\u0151\u014b\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\b\21\1\2\u0154\u0156\5\22\n\2\u0155\u0157\5\16\b\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\f"+
		"\2\2\u0159\u015a\b\21\1\2\u015a!\3\2\2\2\u015b\u015c\5$\23\2\u015c\u015d"+
		"\b\22\1\2\u015d\u0162\3\2\2\2\u015e\u015f\5&\24\2\u015f\u0160\b\22\1\2"+
		"\u0160\u0162\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015e\3\2\2\2\u0162#\3"+
		"\2\2\2\u0163\u016c\b\23\1\2\u0164\u0165\7\62\2\2\u0165\u016d\b\23\1\2"+
		"\u0166\u0167\5@!\2\u0167\u0168\b\23\1\2\u0168\u016d\3\2\2\2\u0169\u016a"+
		"\5\66\34\2\u016a\u016b\b\23\1\2\u016b\u016d\3\2\2\2\u016c\u0164\3\2\2"+
		"\2\u016c\u0166\3\2\2\2\u016c\u0169\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f"+
		"\7\32\2\2\u016f\u0170\5*\26\2\u0170\u0171\7-\2\2\u0171\u0172\b\23\1\2"+
		"\u0172%\3\2\2\2\u0173\u0174\b\24\1\2\u0174\u0175\5*\26\2\u0175\u017e\7"+
		"\31\2\2\u0176\u0177\7\62\2\2\u0177\u017f\b\24\1\2\u0178\u0179\5@!\2\u0179"+
		"\u017a\b\24\1\2\u017a\u017f\3\2\2\2\u017b\u017c\5\66\34\2\u017c\u017d"+
		"\b\24\1\2\u017d\u017f\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u0178\3\2\2\2"+
		"\u017e\u017b\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7-\2\2\u0181\u0182"+
		"\b\24\1\2\u0182\'\3\2\2\2\u0183\u0184\7\13\2\2\u0184\u0185\7\22\2\2\u0185"+
		"\u0186\5*\26\2\u0186\u0187\7(\2\2\u0187\u0188\b\25\1\2\u0188\u018e\3\2"+
		"\2\2\u0189\u018a\7\13\2\2\u018a\u018b\5*\26\2\u018b\u018c\b\25\1\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0183\3\2\2\2\u018d\u0189\3\2\2\2\u018e)\3\2\2\2"+
		"\u018f\u0190\5T+\2\u0190\u0191\b\26\1\2\u0191\u0199\3\2\2\2\u0192\u0193"+
		"\5,\27\2\u0193\u0194\b\26\1\2\u0194\u0199\3\2\2\2\u0195\u0196\5.\30\2"+
		"\u0196\u0197\b\26\1\2\u0197\u0199\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0192"+
		"\3\2\2\2\u0198\u0195\3\2\2\2\u0199+\3\2\2\2\u019a\u019b\7\62\2\2\u019b"+
		"\u019c\7\22\2\2\u019c\u019d\7(\2\2\u019d\u01a5\b\27\1\2\u019e\u019f\7"+
		"\62\2\2\u019f\u01a0\7\22\2\2\u01a0\u01a1\5\36\20\2\u01a1\u01a2\7(\2\2"+
		"\u01a2\u01a3\b\27\1\2\u01a3\u01a5\3\2\2\2\u01a4\u019a\3\2\2\2\u01a4\u019e"+
		"\3\2\2\2\u01a5-\3\2\2\2\u01a6\u01a7\5@!\2\u01a7\u01a8\7\30\2\2\u01a8\u01a9"+
		"\7\62\2\2\u01a9\u01aa\7\22\2\2\u01aa\u01ab\7(\2\2\u01ab\u01ac\b\30\1\2"+
		"\u01ac\u01b6\3\2\2\2\u01ad\u01ae\5@!\2\u01ae\u01af\7\30\2\2\u01af\u01b0"+
		"\7\62\2\2\u01b0\u01b1\7\22\2\2\u01b1\u01b2\5\36\20\2\u01b2\u01b3\7(\2"+
		"\2\u01b3\u01b4\b\30\1\2\u01b4\u01b6\3\2\2\2\u01b5\u01a6\3\2\2\2\u01b5"+
		"\u01ad\3\2\2\2\u01b6/\3\2\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01c2\b\31\1"+
		"\2\u01b9\u01ba\7/\2\2\u01ba\u01c2\b\31\1\2\u01bb\u01bc\7.\2\2\u01bc\u01c2"+
		"\b\31\1\2\u01bd\u01be\7\60\2\2\u01be\u01c2\b\31\1\2\u01bf\u01c0\7\62\2"+
		"\2\u01c0\u01c2\b\31\1\2\u01c1\u01b7\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1"+
		"\u01bb\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\61\3\2\2"+
		"\2\u01c3\u01c4\7\62\2\2\u01c4\u01d2\b\32\1\2\u01c5\u01c6\5@!\2\u01c6\u01c7"+
		"\b\32\1\2\u01c7\u01d2\3\2\2\2\u01c8\u01c9\5,\27\2\u01c9\u01ca\b\32\1\2"+
		"\u01ca\u01d2\3\2\2\2\u01cb\u01cc\5.\30\2\u01cc\u01cd\b\32\1\2\u01cd\u01d2"+
		"\3\2\2\2\u01ce\u01cf\58\35\2\u01cf\u01d0\b\32\1\2\u01d0\u01d2\3\2\2\2"+
		"\u01d1\u01c3\3\2\2\2\u01d1\u01c5\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cb"+
		"\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d2\63\3\2\2\2\u01d3\u01d4\5\60\31\2\u01d4"+
		"\u01d5\b\33\1\2\u01d5\u01ec\3\2\2\2\u01d6\u01d7\5@!\2\u01d7\u01d8\b\33"+
		"\1\2\u01d8\u01ec\3\2\2\2\u01d9\u01da\5,\27\2\u01da\u01db\b\33\1\2\u01db"+
		"\u01ec\3\2\2\2\u01dc\u01dd\5.\30\2\u01dd\u01de\b\33\1\2\u01de\u01ec\3"+
		"\2\2\2\u01df\u01e0\5\66\34\2\u01e0\u01e1\b\33\1\2\u01e1\u01ec\3\2\2\2"+
		"\u01e2\u01e3\58\35\2\u01e3\u01e4\b\33\1\2\u01e4\u01ec\3\2\2\2\u01e5\u01e6"+
		"\5:\36\2\u01e6\u01e7\b\33\1\2\u01e7\u01ec\3\2\2\2\u01e8\u01e9\5<\37\2"+
		"\u01e9\u01ea\b\33\1\2\u01ea\u01ec\3\2\2\2\u01eb\u01d3\3\2\2\2\u01eb\u01d6"+
		"\3\2\2\2\u01eb\u01d9\3\2\2\2\u01eb\u01dc\3\2\2\2\u01eb\u01df\3\2\2\2\u01eb"+
		"\u01e2\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e8\3\2\2\2\u01ec\65\3\2\2"+
		"\2\u01ed\u01ee\7\62\2\2\u01ee\u01f5\7\35\2\2\u01ef\u01f0\7.\2\2\u01f0"+
		"\u01f6\b\34\1\2\u01f1\u01f2\7\62\2\2\u01f2\u01f6\b\34\1\2\u01f3\u01f4"+
		"\7/\2\2\u01f4\u01f6\b\34\1\2\u01f5\u01ef\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\37\2\2\u01f8\67\3\2\2"+
		"\2\u01f9\u01fa\7\35\2\2\u01fa\u0202\b\35\1\2\u01fb\u01fc\5\64\33\2\u01fc"+
		"\u01fd\b\35\1\2\u01fd\u0203\3\2\2\2\u01fe\u01ff\7.\2\2\u01ff\u0200\7\33"+
		"\2\2\u0200\u0201\7.\2\2\u0201\u0203\b\35\1\2\u0202\u01fb\3\2\2\2\u0202"+
		"\u01fe\3\2\2\2\u0203\u020e\3\2\2\2\u0204\u0205\7\27\2\2\u0205\u0206\5"+
		"\64\33\2\u0206\u0207\b\35\1\2\u0207\u020d\3\2\2\2\u0208\u0209\7.\2\2\u0209"+
		"\u020a\7\33\2\2\u020a\u020b\7.\2\2\u020b\u020d\b\35\1\2\u020c\u0204\3"+
		"\2\2\2\u020c\u0208\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\37"+
		"\2\2\u0212\u0213\b\35\1\2\u02139\3\2\2\2\u0214\u0215\7\n\2\2\u0215\u022f"+
		"\b\36\1\2\u0216\u0217\7\62\2\2\u0217\u021b\b\36\1\2\u0218\u0219\7/\2\2"+
		"\u0219\u021b\b\36\1\2\u021a\u0216\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\7\33\2\2\u021d\u021e\5\64\33\2\u021e\u022c\b\36\1"+
		"\2\u021f\u0224\7\27\2\2\u0220\u0221\7\62\2\2\u0221\u0225\b\36\1\2\u0222"+
		"\u0223\7/\2\2\u0223\u0225\b\36\1\2\u0224\u0220\3\2\2\2\u0224\u0222\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7\33\2\2\u0227\u0228\5\64\33\2\u0228"+
		"\u0229\b\36\1\2\u0229\u022b\3\2\2\2\u022a\u021f\3\2\2\2\u022b\u022e\3"+
		"\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u021a\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0232\7\f\2\2\u0232;\3\2\2\2\u0233\u0236\7\'\2\2\u0234\u0236"+
		"\7\26\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2"+
		"\u0237\u0238\5> \2\u0238\u0240\7\62\2\2\u0239\u023e\7\33\2\2\u023a\u023b"+
		"\5\64\33\2\u023b\u023c\b\37\1\2\u023c\u023f\3\2\2\2\u023d\u023f\5 \21"+
		"\2\u023e\u023a\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0239"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u024e\3\2\2\2\u0242\u0243\7\27\2\2"+
		"\u0243\u0244\5> \2\u0244\u024a\7\62\2\2\u0245\u0248\7\33\2\2\u0246\u0249"+
		"\5\64\33\2\u0247\u0249\5 \21\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2"+
		"\u0249\u024b\3\2\2\2\u024a\u0245\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d"+
		"\3\2\2\2\u024c\u0242\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7\f"+
		"\2\2\u0252=\3\2\2\2\u0253\u0254\7\62\2\2\u0254\u025e\b \1\2\u0255\u0256"+
		"\5@!\2\u0256\u0257\b \1\2\u0257\u025b\3\2\2\2\u0258\u0259\7\35\2\2\u0259"+
		"\u025a\7\37\2\2\u025a\u025c\b \1\2\u025b\u0258\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025e\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0255\3\2\2\2\u025e"+
		"?\3\2\2\2\u025f\u0260\7\62\2\2\u0260\u0266\b!\1\2\u0261\u0262\7\30\2\2"+
		"\u0262\u0263\7\62\2\2\u0263\u0265\b!\1\2\u0264\u0261\3\2\2\2\u0265\u0268"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267A\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026c\b\"\1\2\u026a\u026b\7,\2\2\u026b\u026d\b\""+
		"\1\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0276\3\2\2\2\u026e"+
		"\u026f\5\64\33\2\u026f\u0270\b\"\1\2\u0270\u0277\3\2\2\2\u0271\u0272\7"+
		"\22\2\2\u0272\u0273\5T+\2\u0273\u0274\7(\2\2\u0274\u0275\b\"\1\2\u0275"+
		"\u0277\3\2\2\2\u0276\u026e\3\2\2\2\u0276\u0271\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u0279\b\"\1\2\u0279C\3\2\2\2\u027a\u027b\5B\"\2\u027b\u027e"+
		"\b#\1\2\u027c\u027d\7#\2\2\u027d\u027f\b#\1\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027fE\3\2\2\2\u0280\u0281\5D#\2\u0281\u0288\b$\1\2\u0282"+
		"\u0283\7\r\2\2\u0283\u0284\5D#\2\u0284\u0285\b$\1\2\u0285\u0287\3\2\2"+
		"\2\u0286\u0282\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289G\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\5F$\2\u028c\u0297"+
		"\b%\1\2\u028d\u028e\7\25\2\2\u028e\u028f\5F$\2\u028f\u0290\b%\1\2\u0290"+
		"\u0296\3\2\2\2\u0291\u0292\7\3\2\2\u0292\u0293\5F$\2\u0293\u0294\b%\1"+
		"\2\u0294\u0296\3\2\2\2\u0295\u028d\3\2\2\2\u0295\u0291\3\2\2\2\u0296\u0299"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298I\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u029a\u029b\5H%\2\u029b\u02a6\b&\1\2\u029c\u029d\7*\2\2"+
		"\u029d\u029e\5H%\2\u029e\u029f\b&\1\2\u029f\u02a5\3\2\2\2\u02a0\u02a1"+
		"\7,\2\2\u02a1\u02a2\5H%\2\u02a2\u02a3\b&\1\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u029c\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7K\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa"+
		"\5J&\2\u02aa\u02b1\b\'\1\2\u02ab\u02ac\7\21\2\2\u02ac\u02ad\5J&\2\u02ad"+
		"\u02ae\b\'\1\2\u02ae\u02b0\3\2\2\2\u02af\u02ab\3\2\2\2\u02b0\u02b3\3\2"+
		"\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2M\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b4\u02b5\5L\'\2\u02b5\u02dd\b(\1\2\u02b6\u02b7\7\13\2\2\u02b7"+
		"\u02b8\5L\'\2\u02b8\u02b9\b(\1\2\u02b9\u02dc\3\2\2\2\u02ba\u02bb\7\24"+
		"\2\2\u02bb\u02bc\5L\'\2\u02bc\u02bd\b(\1\2\u02bd\u02dc\3\2\2\2\u02be\u02bf"+
		"\7\t\2\2\u02bf\u02c0\5L\'\2\u02c0\u02c1\b(\1\2\u02c1\u02dc\3\2\2\2\u02c2"+
		"\u02c3\7\"\2\2\u02c3\u02c4\5L\'\2\u02c4\u02c5\b(\1\2\u02c5\u02dc\3\2\2"+
		"\2\u02c6\u02c7\7\24\2\2\u02c7\u02c8\7+\2\2\u02c8\u02c9\5L\'\2\u02c9\u02ca"+
		"\b(\1\2\u02ca\u02dc\3\2\2\2\u02cb\u02cc\7 \2\2\u02cc\u02cd\5L\'\2\u02cd"+
		"\u02ce\b(\1\2\u02ce\u02dc\3\2\2\2\u02cf\u02d0\7\34\2\2\u02d0\u02d1\5L"+
		"\'\2\u02d1\u02d2\b(\1\2\u02d2\u02dc\3\2\2\2\u02d3\u02d4\7\36\2\2\u02d4"+
		"\u02d5\5L\'\2\u02d5\u02d6\b(\1\2\u02d6\u02dc\3\2\2\2\u02d7\u02d8\7\20"+
		"\2\2\u02d8\u02d9\5L\'\2\u02d9\u02da\b(\1\2\u02da\u02dc\3\2\2\2\u02db\u02b6"+
		"\3\2\2\2\u02db\u02ba\3\2\2\2\u02db\u02be\3\2\2\2\u02db\u02c2\3\2\2\2\u02db"+
		"\u02c6\3\2\2\2\u02db\u02cb\3\2\2\2\u02db\u02cf\3\2\2\2\u02db\u02d3\3\2"+
		"\2\2\u02db\u02d7\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02deO\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\5N(\2\u02e1"+
		"\u02e2\b)\1\2\u02e2\u02e8\3\2\2\2\u02e3\u02e4\7+\2\2\u02e4\u02e5\5N(\2"+
		"\u02e5\u02e6\b)\1\2\u02e6\u02e8\3\2\2\2\u02e7\u02e0\3\2\2\2\u02e7\u02e3"+
		"\3\2\2\2\u02e8Q\3\2\2\2\u02e9\u02ea\5P)\2\u02ea\u02f5\b*\1\2\u02eb\u02ec"+
		"\7)\2\2\u02ec\u02ed\5T+\2\u02ed\u02ee\b*\1\2\u02ee\u02f4\3\2\2\2\u02ef"+
		"\u02f0\7!\2\2\u02f0\u02f1\5T+\2\u02f1\u02f2\b*\1\2\u02f2\u02f4\3\2\2\2"+
		"\u02f3\u02eb\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6S\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8"+
		"\u02f9\5R*\2\u02f9\u02fa\b+\1\2\u02faU\3\2\2\2DZb|\u0089\u0091\u0096\u00a5"+
		"\u00ad\u00bc\u00be\u00c6\u00c8\u00cc\u00d1\u00e9\u00eb\u0102\u010b\u0119"+
		"\u0133\u013c\u013e\u0149\u0151\u0156\u0161\u016c\u017e\u018d\u0198\u01a4"+
		"\u01b5\u01c1\u01d1\u01eb\u01f5\u0202\u020c\u020e\u021a\u0224\u022c\u022f"+
		"\u0235\u023e\u0240\u0248\u024a\u024e\u025b\u025d\u0266\u026c\u0276\u027e"+
		"\u0288\u0295\u0297\u02a4\u02a6\u02b1\u02db\u02dd\u02e7\u02f3\u02f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
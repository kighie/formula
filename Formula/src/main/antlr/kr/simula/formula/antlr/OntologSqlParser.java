// Generated from OntologSql.g4 by ANTLR 4.4
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
public class OntologSqlParser extends kr.simula.formula.core.antlr.FormulaHandlerParser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, END_OF_STMT=44, NUMBER=45, 
		STRING_LITERAL=46, NULL=47, BOOLEAN=48, IDENT=49, WS=50, MULTILINE_COMMENT=51, 
		LINE_COMMENT=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'as'", "'foreach'", "'elseif'", "'return'", "'importJava'", 
		"'SQL{'", "'!='", "'{'", "'='", "'}'", "'^'", "'if'", "'fndef'", "'<='", 
		"'&'", "'('", "'paramdef'", "'is'", "'*'", "'r{'", "','", "'.'", "'->'", 
		"'<-'", "':'", "'>='", "'['", "'<'", "']'", "'>'", "'or'", "'<>'", "'%'", 
		"'in'", "'else'", "'R{'", "')'", "'sql{'", "'and'", "'+'", "'not'", "'-'", 
		"';'", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_protoExtention = 0, RULE_formulaScript = 1, RULE_importStatement = 2, 
		RULE_paramDef = 3, RULE_variableDecl = 4, RULE_functionDecl = 5, RULE_argsDecl = 6, 
		RULE_retrunStmt = 7, RULE_blockContents = 8, RULE_ifStatement = 9, RULE_foreachStatement = 10, 
		RULE_loopCondition = 11, RULE_methodCallStatement = 12, RULE_functionCallStatement = 13, 
		RULE_arguments = 14, RULE_formulaTerm = 15, RULE_lambdaDecl = 16, RULE_recordProto = 17, 
		RULE_recordField = 18, RULE_recordFieldValue = 19, RULE_type = 20, RULE_assignStatement = 21, 
		RULE_leftAssign = 22, RULE_rightAssign = 23, RULE_formulaExpression = 24, 
		RULE_formulaExpressionBase = 25, RULE_funcCallExp = 26, RULE_methodCallExp = 27, 
		RULE_lambdaArg = 28, RULE_literalTerm = 29, RULE_iterableTerm = 30, RULE_arrayRef = 31, 
		RULE_array = 32, RULE_map = 33, RULE_qualifiedName = 34, RULE_unary = 35, 
		RULE_percent = 36, RULE_exponential = 37, RULE_multiplicative = 38, RULE_additiveExpression = 39, 
		RULE_stringExpression = 40, RULE_comparison = 41, RULE_notExpression = 42, 
		RULE_logicalExpression = 43, RULE_operatorExpression = 44;
	public static final String[] ruleNames = {
		"protoExtention", "formulaScript", "importStatement", "paramDef", "variableDecl", 
		"functionDecl", "argsDecl", "retrunStmt", "blockContents", "ifStatement", 
		"foreachStatement", "loopCondition", "methodCallStatement", "functionCallStatement", 
		"arguments", "formulaTerm", "lambdaDecl", "recordProto", "recordField", 
		"recordFieldValue", "type", "assignStatement", "leftAssign", "rightAssign", 
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"lambdaArg", "literalTerm", "iterableTerm", "arrayRef", "array", "map", 
		"qualifiedName", "unary", "percent", "exponential", "multiplicative", 
		"additiveExpression", "stringExpression", "comparison", "notExpression", 
		"logicalExpression", "operatorExpression"
	};

	@Override
	public String getGrammarFileName() { return "OntologSql.g4"; }

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

	public OntologSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProtoExtentionContext extends ParserRuleContext {
		public Gettable result;
		public ProtoExtentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protoExtention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterProtoExtention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitProtoExtention(this);
		}
	}

	public final ProtoExtentionContext protoExtention() throws RecognitionException {
		ProtoExtentionContext _localctx = new ProtoExtentionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_protoExtention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch (_input.LA(1)) {
			case T__36:
				{
				{
				setState(90); match(T__36);
				}
				}
				break;
			case T__4:
				{
				{
				setState(91); match(T__4);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaScriptContext extends ParserRuleContext {
		public Module module;
		public ParamDefContext paramDef;
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public TerminalNode EOF() { return getToken(OntologSqlParser.EOF, 0); }
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFormulaScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFormulaScript(this);
		}
	}

	public final FormulaScriptContext formulaScript() throws RecognitionException {
		FormulaScriptContext _localctx = new FormulaScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formulaScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FormulaScriptContext)_localctx).module =  (Module)block(ScriptTokens.MODULE); 
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(97); importStatement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(103); ((FormulaScriptContext)_localctx).paramDef = paramDef();
				 _localctx.module.append(((FormulaScriptContext)_localctx).paramDef.result); 
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); blockContents(_localctx.module);
			setState(112); match(EOF);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(T__37);
			setState(116); ((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
			setState(117); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public ParamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterParamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitParamDef(this);
		}
	}

	public final ParamDefContext paramDef() throws RecognitionException {
		ParamDefContext _localctx = new ParamDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__25);
			setState(121); ((ParamDefContext)_localctx).IDENT = match(IDENT);
			setState(122); match(T__41);
			setState(123); ((ParamDefContext)_localctx).type = type();
			setState(124); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); ((VariableDeclContext)_localctx).type = type();
			setState(128); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((VariableDeclContext)_localctx).type.typeClz ,(((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null)); 
					((VariableDeclContext)_localctx).stmt =  (VariableDeclStatement)statement(ScriptTokens.VAR_DECL, varRef);
				
			setState(134);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(130); match(T__18);
				setState(131); ((VariableDeclContext)_localctx).formulaExpressionBase = formulaExpressionBase();
					_localctx.stmt.setValueNode(((VariableDeclContext)_localctx).formulaExpressionBase.result); 
				}
			}

			setState(136); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					List<Ref> args = new LinkedList<Ref>(); 
					beginScope();
					Class<?> typeClz = Object.class;
				
			setState(139); match(T__29);
			setState(140); ((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(141); match(T__26);
				setState(142); match(T__5);
				}
				}
				break;
			case 2:
				{
				{
				setState(143); match(T__26);
				setState(144); argsDecl(args);
				setState(145); match(T__5);
				}
				}
				break;
			}
			setState(155);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(149); match(T__17);
				setState(150); ((FunctionDeclContext)_localctx).type = type();
				 typeClz = ((FunctionDeclContext)_localctx).type.typeClz; 
				setState(152); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(154); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((FunctionDeclContext)_localctx).fnBlock =  declareFn(typeClz ,(((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args); 
			{
			setState(158); blockContents(_localctx.fnBlock);
			}
			setState(160);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(159); retrunStmt(_localctx.fnBlock);
				}
			}

			setState(162); match(T__32);
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
			return getToken(OntologSqlParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologSqlParser.IDENT); }
		public ArgsDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsDeclContext(ParserRuleContext parent, int invokingState, List<Ref> args) {
			super(parent, invokingState);
			this.args = args;
		}
		@Override public int getRuleIndex() { return RULE_argsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterArgsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitArgsDecl(this);
		}
	}

	public final ArgsDeclContext argsDecl(List<Ref> args) throws RecognitionException {
		ArgsDeclContext _localctx = new ArgsDeclContext(_ctx, getState(), args);
		enterRule(_localctx, 12, RULE_argsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165); ((ArgsDeclContext)_localctx).type = type();
			setState(166); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(168); match(T__21);
				setState(169); ((ArgsDeclContext)_localctx).type = type();
				setState(170); ((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( declare(ScriptTokens.ARG_DECL, ((ArgsDeclContext)_localctx).type.typeClz ,(((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null))); 
				}
				}
				setState(177);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterRetrunStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitRetrunStmt(this);
		}
	}

	public final RetrunStmtContext retrunStmt(BlockStatement fnBlock) throws RecognitionException {
		RetrunStmtContext _localctx = new RetrunStmtContext(_ctx, getState(), fnBlock);
		enterRule(_localctx, 14, RULE_retrunStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Node arg = null; 
			setState(179); match(T__38);
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__34) | (1L << T__29) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(180); ((RetrunStmtContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 arg = ((RetrunStmtContext)_localctx).formulaExpressionBase.result; 
				}
			}

			 
					_localctx.fnBlock.append( statement( ScriptTokens.RETURN, fnBlock, arg ) ); 
				
			setState(186); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterBlockContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitBlockContents(this);
		}
	}

	public final BlockContentsContext blockContents(Block stmtHolder) throws RecognitionException {
		BlockContentsContext _localctx = new BlockContentsContext(_ctx, getState(), stmtHolder);
		enterRule(_localctx, 16, RULE_blockContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__36) | (1L << T__34) | (1L << T__30) | (1L << T__29) | (1L << T__26) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(209);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(188); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.ifstmt); 
					}
					break;
				case 2:
					{
					setState(191); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.foreachStmt); 
					}
					break;
				case 3:
					{
					setState(194); ((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.stmt); 
					}
					break;
				case 4:
					{
					setState(197); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.stmt); 
					}
					break;
				case 5:
					{
					setState(200); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.stmt); 
					}
					break;
				case 6:
					{
					setState(203); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.stmt); 
					}
					break;
				case 7:
					{
					setState(206); ((BlockContentsContext)_localctx).functionDecl = functionDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionDecl.fnBlock); 
					}
					break;
				}
				}
				setState(213);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(T__30);
			 beginScope(); 
			setState(216); match(T__26);
			setState(217); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(218); match(T__5);

						((IfStatementContext)_localctx).ifstmt =  (IfStatement)statementBlock(ScriptTokens.IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(220); match(T__34);
			setState(221); blockContents(_localctx.ifstmt);
			setState(222); match(T__32);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(223); match(T__39);
				setState(224); match(T__26);
				setState(225); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
				setState(226); match(T__5);

							IfStatement.ElseIf elseIfStmt = _localctx.ifstmt.createElseIf(((IfStatementContext)_localctx).logicalExpression.result);
						
				setState(228); match(T__34);
				setState(229); blockContents(elseIfStmt);
				setState(230); match(T__32);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(237); match(T__7);

							IfStatement.Else elseStmt = _localctx.ifstmt.checkOutElse();
						
				setState(239); match(T__34);
				setState(240); blockContents(elseStmt);
				setState(241); match(T__32);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(T__40);
				beginScope(); 
			setState(249); match(T__26);
			setState(250); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(251); match(T__5);

						((ForeachStatementContext)_localctx).foreachStmt =  statementBlock(ScriptTokens.FOREACH, ((ForeachStatementContext)_localctx).loopCondition.condition); 
					
			setState(253); match(T__34);
			setState(254); blockContents(_localctx.foreachStmt);
			setState(255); match(T__32);
			setState(257);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(256); match(END_OF_STMT);
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
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public LoopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLoopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLoopCondition(this);
		}
	}

	public final LoopConditionContext loopCondition() throws RecognitionException {
		LoopConditionContext _localctx = new LoopConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); ((LoopConditionContext)_localctx).type = type();
			setState(262); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
					Ref varRef = declare(ScriptTokens.VAR_DECL, ((LoopConditionContext)_localctx).type.typeClz ,(((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null)); 
					((LoopConditionContext)_localctx).condition =  (LoopConditionStatement)statement(ScriptTokens.LOOP_COND_DECL, varRef);
				
			setState(264); match(T__8);
			{
			setState(265); ((LoopConditionContext)_localctx).iterableTerm = iterableTerm();

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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitMethodCallStatement(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).stmt =  statement(ScriptTokens.MTHODE_CALL_STMT, ((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(270); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).stmt =  statement(ScriptTokens.FUNCTION_CALL_STMT, ((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(274); match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitArguments(this);
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
			setState(277); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
			 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(280); match(T__21);
				{
				setState(281); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				}
				setState(288);
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
		public RecordProtoContext recordProto;
		public ProtoExtentionContext protoExtention;
		public LambdaDeclContext lambdaDecl;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ProtoExtentionContext protoExtention() {
			return getRuleContext(ProtoExtentionContext.class,0);
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
		public RecordProtoContext recordProto() {
			return getRuleContext(RecordProtoContext.class,0);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formulaTerm);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307); ((FormulaTermContext)_localctx).map = map();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).map.result; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(310); ((FormulaTermContext)_localctx).recordProto = recordProto();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).recordProto.result; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(313); ((FormulaTermContext)_localctx).protoExtention = protoExtention();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).protoExtention.result; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(316); ((FormulaTermContext)_localctx).lambdaDecl = lambdaDecl();
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLambdaDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLambdaDecl(this);
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
				
			setState(322); match(T__29);
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(323); match(T__26);
				setState(324); match(T__5);
				}
				}
				break;
			case 2:
				{
				{
				setState(325); match(T__26);
				setState(326); argsDecl(args);
				setState(327); match(T__5);
				}
				}
				break;
			}
			setState(337);
			switch (_input.LA(1)) {
			case T__17:
				{
				{
				setState(331); match(T__17);
				setState(332); ((LambdaDeclContext)_localctx).type = type();
				 typeClz = ((LambdaDeclContext)_localctx).type.typeClz; 
				setState(334); match(T__34);
				}
				}
				break;
			case T__34:
				{
				{
				setState(336); match(T__34);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((LambdaDeclContext)_localctx).lambda =  lambda( LAMBDA , args, typeClz); 
			{
			setState(340); blockContents(_localctx.lambda);
			}
			setState(342);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(341); retrunStmt(_localctx.lambda);
				}
			}

			setState(344); match(T__32);
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

	public static class RecordProtoContext extends ParserRuleContext {
		public Gettable result;
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordProtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordProto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterRecordProto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitRecordProto(this);
		}
	}

	public final RecordProtoContext recordProto() throws RecognitionException {
		RecordProtoContext _localctx = new RecordProtoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_recordProto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			switch (_input.LA(1)) {
			case T__6:
				{
				{
				setState(347); match(T__6);
				}
				}
				break;
			case T__22:
				{
				{
				setState(348); match(T__22);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 
						List<?> fieldList = new LinkedList(); 
						beginScope();
					
			setState(352); recordField(fieldList);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(353); match(T__21);
				setState(354); recordField(fieldList);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						endScope();
						((RecordProtoContext)_localctx).result =  declareProto(RECORD, fieldList); 
					
			setState(361); match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldContext extends ParserRuleContext {
		public List<?> fieldList;
		public TypeContext type;
		public Token IDENT;
		public RecordFieldValueContext recordFieldValue;
		public RecordFieldValueContext recordFieldValue() {
			return getRuleContext(RecordFieldValueContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public RecordFieldContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RecordFieldContext(ParserRuleContext parent, int invokingState, List<?> fieldList) {
			super(parent, invokingState);
			this.fieldList = fieldList;
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterRecordField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitRecordField(this);
		}
	}

	public final RecordFieldContext recordField(List<?> fieldList) throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState(), fieldList);
		enterRule(_localctx, 36, RULE_recordField);
		try {
			setState(373);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(363); ((RecordFieldContext)_localctx).type = type();
				setState(364); ((RecordFieldContext)_localctx).IDENT = match(IDENT);
				 protoField(RECORD, fieldList, ((RecordFieldContext)_localctx).type.typeClz, (((RecordFieldContext)_localctx).IDENT!=null?((RecordFieldContext)_localctx).IDENT.getText():null), null ); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(367); ((RecordFieldContext)_localctx).type = type();
				setState(368); ((RecordFieldContext)_localctx).IDENT = match(IDENT);
				setState(369); match(T__17);
				setState(370); ((RecordFieldContext)_localctx).recordFieldValue = recordFieldValue();
				 protoField(RECORD, fieldList, ((RecordFieldContext)_localctx).type.typeClz, (((RecordFieldContext)_localctx).IDENT!=null?((RecordFieldContext)_localctx).IDENT.getText():null), ((RecordFieldContext)_localctx).recordFieldValue.result ); 
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

	public static class RecordFieldValueContext extends ParserRuleContext {
		public Node result;
		public LiteralTermContext literalTerm;
		public ArrayContext array;
		public MapContext map;
		public RecordProtoContext recordProto;
		public LambdaDeclContext lambdaDecl;
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public RecordProtoContext recordProto() {
			return getRuleContext(RecordProtoContext.class,0);
		}
		public LambdaDeclContext lambdaDecl() {
			return getRuleContext(LambdaDeclContext.class,0);
		}
		public RecordFieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterRecordFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitRecordFieldValue(this);
		}
	}

	public final RecordFieldValueContext recordFieldValue() throws RecognitionException {
		RecordFieldValueContext _localctx = new RecordFieldValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_recordFieldValue);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); ((RecordFieldValueContext)_localctx).literalTerm = literalTerm();
				 ((RecordFieldValueContext)_localctx).result =  ((RecordFieldValueContext)_localctx).literalTerm.result; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); ((RecordFieldValueContext)_localctx).array = array();
				 ((RecordFieldValueContext)_localctx).result =  ((RecordFieldValueContext)_localctx).array.result; 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(381); ((RecordFieldValueContext)_localctx).map = map();
				 ((RecordFieldValueContext)_localctx).result =  ((RecordFieldValueContext)_localctx).map.result; 
				}
				break;
			case T__22:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(384); ((RecordFieldValueContext)_localctx).recordProto = recordProto();
				 ((RecordFieldValueContext)_localctx).result =  ((RecordFieldValueContext)_localctx).recordProto.result; 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(387); ((RecordFieldValueContext)_localctx).lambdaDecl = lambdaDecl();
				 ((RecordFieldValueContext)_localctx).result =  ((RecordFieldValueContext)_localctx).lambdaDecl.lambda; 
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

	public static class TypeContext extends ParserRuleContext {
		public Class<?> typeClz;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(392); ((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null)); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(394); ((TypeContext)_localctx).qualifiedName = qualifiedName();
				 ((TypeContext)_localctx).typeClz =  type((((TypeContext)_localctx).qualifiedName!=null?_input.getText(((TypeContext)_localctx).qualifiedName.start,((TypeContext)_localctx).qualifiedName.stop):null)); 
				}
				setState(400);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(397); match(T__15);
					setState(398); match(T__13);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(404); ((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).stmt =  ((AssignStatementContext)_localctx).leftAssign.stmt ; 
				}
				break;
			case 2:
				{
				setState(407); ((AssignStatementContext)_localctx).rightAssign = rightAssign();
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public LeftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLeftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLeftAssign(this);
		}
	}

	public final LeftAssignContext leftAssign() throws RecognitionException {
		LeftAssignContext _localctx = new LeftAssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_leftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(413); ((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(415); ((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((LeftAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(418); ((LeftAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((LeftAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(423); match(T__18);
			setState(424); ((LeftAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(425); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologSqlParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public RightAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterRightAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitRightAssign(this);
		}
	}

	public final RightAssignContext rightAssign() throws RecognitionException {
		RightAssignContext _localctx = new RightAssignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rightAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Ref settable = null; 
			setState(429); ((RightAssignContext)_localctx).formulaExpressionBase = formulaExpressionBase();
			setState(430); match(T__19);
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(431); ((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = refer( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(433); ((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = ((RightAssignContext)_localctx).qualifiedName.result;
				}
				break;
			case 3:
				{
				setState(436); ((RightAssignContext)_localctx).arrayRef = arrayRef();
				 settable = ((RightAssignContext)_localctx).arrayRef.result;
				}
				break;
			}
			setState(441); match(END_OF_STMT);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFormulaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFormulaExpression(this);
		}
	}

	public final FormulaExpressionContext formulaExpression() throws RecognitionException {
		FormulaExpressionContext _localctx = new FormulaExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formulaExpression);
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(444); match(T__33);
				setState(445); match(T__26);
				setState(446); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(447); match(T__5);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(450); match(T__33);
				setState(451); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFormulaExpressionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFormulaExpressionBase(this);
		}
	}

	public final FormulaExpressionBaseContext formulaExpressionBase() throws RecognitionException {
		FormulaExpressionBaseContext _localctx = new FormulaExpressionBaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(456); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(459); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(462); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
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
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public FuncCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitFuncCallExp(this);
		}
	}

	public final FuncCallExpContext funcCallExp() throws RecognitionException {
		FuncCallExpContext _localctx = new FuncCallExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcCallExp);
		try {
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(467); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(468); match(T__26);
				setState(469); match(T__5);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(471); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(472); match(T__26);
				setState(473); ((FuncCallExpContext)_localctx).arguments = arguments();
				setState(474); match(T__5);
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
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public MethodCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterMethodCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitMethodCallExp(this);
		}
	}

	public final MethodCallExpContext methodCallExp() throws RecognitionException {
		MethodCallExpContext _localctx = new MethodCallExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodCallExp);
		try {
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(479); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(480); match(T__20);
				setState(481); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(482); match(T__26);
				setState(483); match(T__5);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(486); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(487); match(T__20);
				setState(488); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(489); match(T__26);
				setState(490); ((MethodCallExpContext)_localctx).arguments = arguments();
				setState(491); match(T__5);
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
			return getToken(OntologSqlParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologSqlParser.IDENT); }
		public LambdaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLambdaArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLambdaArg(this);
		}
	}

	public final LambdaArgContext lambdaArg() throws RecognitionException {
		LambdaArgContext _localctx = new LambdaArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lambdaArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(496); match(IDENT);
				}
				}
				break;
			case T__26:
				{
				{
				setState(497); match(T__26);
				setState(498); match(IDENT);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(499); match(T__21);
					setState(500); match(IDENT);
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(506); match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509); match(T__19);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NULL() { return getToken(OntologSqlParser.NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(OntologSqlParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(OntologSqlParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(OntologSqlParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public LiteralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLiteralTerm(this);
		}
	}

	public final LiteralTermContext literalTerm() throws RecognitionException {
		LiteralTermContext _localctx = new LiteralTermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literalTerm);
		try {
			setState(521);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(511); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(515); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(517); match(NULL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(519); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
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
		public ArrayRefContext arrayRef;
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
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologSqlParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IterableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterIterableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitIterableTerm(this);
		}
	}

	public final IterableTermContext iterableTerm() throws RecognitionException {
		IterableTermContext _localctx = new IterableTermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iterableTerm);
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  refer( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); ((IterableTermContext)_localctx).arrayRef = arrayRef();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537); ((IterableTermContext)_localctx).array = array();
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
		public QualifiedNameContext qualifiedName;
		public Token NUMBER;
		public Token id2;
		public Token id3;
		public TerminalNode NUMBER(int i) {
			return getToken(OntologSqlParser.NUMBER, i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(OntologSqlParser.IDENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(OntologSqlParser.STRING_LITERAL); }
		public List<TerminalNode> NUMBER() { return getTokens(OntologSqlParser.NUMBER); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(OntologSqlParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologSqlParser.IDENT); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); ((ArrayRefContext)_localctx).qualifiedName = qualifiedName();
			 ((ArrayRefContext)_localctx).result =  ((ArrayRefContext)_localctx).qualifiedName.result; 
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(544); match(T__15);
				setState(551);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(545); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , literal( LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
					}
					break;
				case IDENT:
					{
					setState(547); ((ArrayRefContext)_localctx).id2 = match(IDENT);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
					}
					break;
				case STRING_LITERAL:
					{
					setState(549); ((ArrayRefContext)_localctx).id3 = match(STRING_LITERAL);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , literal( LIT_STRING, strip((((ArrayRefContext)_localctx).id3!=null?((ArrayRefContext)_localctx).id3.getText():null))) ); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(553); match(T__13);
				}
				}
				setState(558);
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

	public static class ArrayContext extends ParserRuleContext {
		public Gettable result;
		public FormulaTermContext formulaTerm;
		public Token from;
		public Token to;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(OntologSqlParser.NUMBER, i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OntologSqlParser.NUMBER); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); match(T__15);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				{
				setState(561); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(564); ((ArrayContext)_localctx).from = match(NUMBER);
				setState(565); match(T__17);
				setState(566); ((ArrayContext)_localctx).to = match(NUMBER);
				 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
				}
				}
				break;
			}
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==NUMBER) {
				{
				setState(578);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(570); match(T__21);
					{
					setState(571); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					break;
				case NUMBER:
					{
					{
					setState(574); ((ArrayContext)_localctx).from = match(NUMBER);
					setState(575); match(T__17);
					setState(576); ((ArrayContext)_localctx).to = match(NUMBER);
					 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583); match(T__13);
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
			return getToken(OntologSqlParser.IDENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(OntologSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(OntologSqlParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologSqlParser.IDENT); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); match(T__34);
			 ((MapContext)_localctx).result =  map(SIMPLE_MAP); String key;
			setState(613);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENT) {
				{
				setState(592);
				switch (_input.LA(1)) {
				case IDENT:
					{
					{
					setState(588); ((MapContext)_localctx).IDENT = match(IDENT);
					key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
					}
					}
					break;
				case STRING_LITERAL:
					{
					{
					setState(590); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(594); match(T__17);
				setState(595); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(597); match(T__21);
					setState(602);
					switch (_input.LA(1)) {
					case IDENT:
						{
						{
						setState(598); ((MapContext)_localctx).IDENT = match(IDENT);
						key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
						}
						}
						break;
					case STRING_LITERAL:
						{
						{
						setState(600); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
						key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(604); match(T__17);
					setState(605); ((MapContext)_localctx).formulaTerm = formulaTerm();
					 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(615); match(T__32);
			}
		}
		catch (RecognitionException re) {
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
			return getToken(OntologSqlParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologSqlParser.IDENT); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619); match(T__20);
					setState(620); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(626);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(630);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(628); match(T__0);
				 negative = true; 
				}
			}

			setState(640);
			switch (_input.LA(1)) {
			case T__36:
			case T__34:
			case T__29:
			case T__22:
			case T__15:
			case T__6:
			case T__4:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(632); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__26:
				{
				setState(635); match(T__26);
				setState(636); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(637); match(T__5);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(648);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(646); match(T__9);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(652); match(T__31);
				setState(653); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  operator(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(660);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42 || _la==T__23) {
				{
				setState(671);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(663); match(T__23);
					setState(664); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__42:
					{
					setState(667); match(T__42);
					setState(668); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(675);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				setState(686);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(678); match(T__2);
					setState(679); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__0:
					{
					setState(682); match(T__0);
					setState(683); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(690);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(693); match(T__27);
				setState(694); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  operator(OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(701);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__28) | (1L << T__24) | (1L << T__16) | (1L << T__14) | (1L << T__12) | (1L << T__10))) != 0)) {
				{
				setState(741);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(704); match(T__33);
					setState(705); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(708); match(T__24);
					setState(709); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(712); match(T__35);
					setState(713); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(716); match(T__10);
					setState(717); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(720); match(T__24);
					setState(721); match(T__1);
					setState(722); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(725); match(T__12);
					setState(726); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(729); match(T__16);
					setState(730); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(733); match(T__14);
					setState(734); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(737); match(T__28);
					setState(738); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(745);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			switch (_input.LA(1)) {
			case T__36:
			case T__34:
			case T__29:
			case T__26:
			case T__22:
			case T__15:
			case T__6:
			case T__4:
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(746); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__1:
				{
				setState(749); match(T__1);
				setState(750); ((NotExpressionContext)_localctx).comparison = comparison();
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(765);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(757); match(T__3);
						setState(758); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__11:
						{
						setState(761); match(T__11);
						setState(762); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologSqlListener ) ((OntologSqlListener)listener).exitOperatorExpression(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0308\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\5\2_\n\2\3\2\3\2\3\3\3\3\7\3e\n\3\f\3\16\3h\13"+
		"\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0089"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4\n\n\f"+
		"\n\16\n\u00d7\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00eb\n\13\f\13\16\13\u00ee"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f6\n\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0104\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0142\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014c"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0154\n\22\3\22\3\22\3\22\5\22"+
		"\u0159\n\22\3\22\3\22\3\22\3\23\3\23\5\23\u0160\n\23\3\23\3\23\3\23\3"+
		"\23\7\23\u0166\n\23\f\23\16\23\u0169\13\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0178\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0189"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0193\n\26\5\26\u0195"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019d\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01a8\n\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ba\n\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c9"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01d4\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01e0\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01f1\n\35\3\36\3\36\3\36\3\36\3\36\7\36\u01f8\n\36\f\36\16\36\u01fb"+
		"\13\36\3\36\5\36\u01fe\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u020c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u021f\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u022a\n!\3"+
		"!\7!\u022d\n!\f!\16!\u0230\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u023b\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0245\n\"\f\"\16\"\u0248"+
		"\13\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0253\n#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u025d\n#\3#\3#\3#\3#\7#\u0263\n#\f#\16#\u0266\13#\5#\u0268\n#\3#"+
		"\3#\3$\3$\3$\3$\3$\7$\u0271\n$\f$\16$\u0274\13$\3%\3%\3%\5%\u0279\n%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u0283\n%\3%\3%\3&\3&\3&\3&\5&\u028b\n&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u0293\n\'\f\'\16\'\u0296\13\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\7(\u02a2\n(\f(\16(\u02a5\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\7)\u02b1\n)\f)\16)\u02b4\13)\3*\3*\3*\3*\3*\3*\7*\u02bc\n*\f*\16*"+
		"\u02bf\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02e8\n"+
		"+\f+\16+\u02eb\13+\3,\3,\3,\3,\3,\3,\3,\5,\u02f4\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\7-\u0300\n-\f-\16-\u0303\13-\3.\3.\3.\3.\2\2/\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\2"+
		"\u0338\2^\3\2\2\2\4b\3\2\2\2\6u\3\2\2\2\bz\3\2\2\2\n\u0081\3\2\2\2\f\u008c"+
		"\3\2\2\2\16\u00a7\3\2\2\2\20\u00b4\3\2\2\2\22\u00d5\3\2\2\2\24\u00d8\3"+
		"\2\2\2\26\u00f9\3\2\2\2\30\u0107\3\2\2\2\32\u010e\3\2\2\2\34\u0112\3\2"+
		"\2\2\36\u0116\3\2\2\2 \u0141\3\2\2\2\"\u0143\3\2\2\2$\u015f\3\2\2\2&\u0177"+
		"\3\2\2\2(\u0188\3\2\2\2*\u0194\3\2\2\2,\u019c\3\2\2\2.\u019e\3\2\2\2\60"+
		"\u01ae\3\2\2\2\62\u01c8\3\2\2\2\64\u01d3\3\2\2\2\66\u01df\3\2\2\28\u01f0"+
		"\3\2\2\2:\u01fd\3\2\2\2<\u020b\3\2\2\2>\u021e\3\2\2\2@\u0220\3\2\2\2B"+
		"\u0231\3\2\2\2D\u024c\3\2\2\2F\u026b\3\2\2\2H\u0275\3\2\2\2J\u0286\3\2"+
		"\2\2L\u028c\3\2\2\2N\u0297\3\2\2\2P\u02a6\3\2\2\2R\u02b5\3\2\2\2T\u02c0"+
		"\3\2\2\2V\u02f3\3\2\2\2X\u02f5\3\2\2\2Z\u0304\3\2\2\2\\_\7\t\2\2]_\7)"+
		"\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7\r\2\2a\3\3\2\2\2bf\b\3\1\2ce\5"+
		"\6\4\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gn\3\2\2\2hf\3\2\2\2ij\5"+
		"\b\5\2jk\b\3\1\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3"+
		"\2\2\2pn\3\2\2\2qr\5\22\n\2rs\7\2\2\3st\b\3\1\2t\5\3\2\2\2uv\7\b\2\2v"+
		"w\5F$\2wx\7.\2\2xy\b\4\1\2y\7\3\2\2\2z{\7\24\2\2{|\7\63\2\2|}\7\4\2\2"+
		"}~\5*\26\2~\177\7.\2\2\177\u0080\b\5\1\2\u0080\t\3\2\2\2\u0081\u0082\5"+
		"*\26\2\u0082\u0083\7\63\2\2\u0083\u0088\b\6\1\2\u0084\u0085\7\33\2\2\u0085"+
		"\u0086\5\64\33\2\u0086\u0087\b\6\1\2\u0087\u0089\3\2\2\2\u0088\u0084\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7.\2\2\u008b"+
		"\13\3\2\2\2\u008c\u008d\b\7\1\2\u008d\u008e\7\20\2\2\u008e\u0095\7\63"+
		"\2\2\u008f\u0090\7\23\2\2\u0090\u0096\7(\2\2\u0091\u0092\7\23\2\2\u0092"+
		"\u0093\5\16\b\2\u0093\u0094\7(\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0091\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0098\7\34\2\2\u0098"+
		"\u0099\5*\26\2\u0099\u009a\b\7\1\2\u009a\u009b\7\13\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009e\7\13\2\2\u009d\u0097\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\7\1\2\u00a0\u00a2\5\22\n\2\u00a1\u00a3\5"+
		"\20\t\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\r\2\2\u00a5\u00a6\b\7\1\2\u00a6\r\3\2\2\2\u00a7\u00a8\5*\26\2"+
		"\u00a8\u00a9\7\63\2\2\u00a9\u00b1\b\b\1\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac"+
		"\5*\26\2\u00ac\u00ad\7\63\2\2\u00ad\u00ae\b\b\1\2\u00ae\u00b0\3\2\2\2"+
		"\u00af\u00aa\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\t\1\2\u00b5"+
		"\u00b9\7\7\2\2\u00b6\u00b7\5\64\33\2\u00b7\u00b8\b\t\1\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\b\t\1\2\u00bc\u00bd\7.\2\2\u00bd\21\3\2\2\2\u00be\u00bf\5\24\13"+
		"\2\u00bf\u00c0\b\n\1\2\u00c0\u00d4\3\2\2\2\u00c1\u00c2\5\26\f\2\u00c2"+
		"\u00c3\b\n\1\2\u00c3\u00d4\3\2\2\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\b\n"+
		"\1\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\b\n\1\2\u00c9"+
		"\u00d4\3\2\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00cc\b\n\1\2\u00cc\u00d4\3"+
		"\2\2\2\u00cd\u00ce\5\n\6\2\u00ce\u00cf\b\n\1\2\u00cf\u00d4\3\2\2\2\u00d0"+
		"\u00d1\5\f\7\2\u00d1\u00d2\b\n\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00be\3\2"+
		"\2\2\u00d3\u00c1\3\2\2\2\u00d3\u00c4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3"+
		"\u00ca\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\b\13\1\2\u00da\u00db\7\23\2"+
		"\2\u00db\u00dc\5X-\2\u00dc\u00dd\7(\2\2\u00dd\u00de\b\13\1\2\u00de\u00df"+
		"\7\13\2\2\u00df\u00e0\5\22\n\2\u00e0\u00ec\7\r\2\2\u00e1\u00e2\7\6\2\2"+
		"\u00e2\u00e3\7\23\2\2\u00e3\u00e4\5X-\2\u00e4\u00e5\7(\2\2\u00e5\u00e6"+
		"\b\13\1\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7\r\2"+
		"\2\u00e9\u00eb\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f5\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7&\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\5"+
		"\22\n\2\u00f3\u00f4\7\r\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\13\1\2\u00f8\25\3\2\2"+
		"\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\b\f\1\2\u00fb\u00fc\7\23\2\2\u00fc"+
		"\u00fd\5\30\r\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\b\f\1\2\u00ff\u0100\7\13"+
		"\2\2\u0100\u0101\5\22\n\2\u0101\u0103\7\r\2\2\u0102\u0104\7.\2\2\u0103"+
		"\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\f"+
		"\1\2\u0106\27\3\2\2\2\u0107\u0108\5*\26\2\u0108\u0109\7\63\2\2\u0109\u010a"+
		"\b\r\1\2\u010a\u010b\7%\2\2\u010b\u010c\5> \2\u010c\u010d\b\r\1\2\u010d"+
		"\31\3\2\2\2\u010e\u010f\58\35\2\u010f\u0110\b\16\1\2\u0110\u0111\7.\2"+
		"\2\u0111\33\3\2\2\2\u0112\u0113\5\66\34\2\u0113\u0114\b\17\1\2\u0114\u0115"+
		"\7.\2\2\u0115\35\3\2\2\2\u0116\u0117\b\20\1\2\u0117\u0118\5Z.\2\u0118"+
		"\u0119\b\20\1\2\u0119\u0120\3\2\2\2\u011a\u011b\7\30\2\2\u011b\u011c\5"+
		"Z.\2\u011c\u011d\b\20\1\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\37\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0124\5<\37\2\u0124\u0125\b\21\1\2\u0125"+
		"\u0142\3\2\2\2\u0126\u0127\5F$\2\u0127\u0128\b\21\1\2\u0128\u0142\3\2"+
		"\2\2\u0129\u012a\5\66\34\2\u012a\u012b\b\21\1\2\u012b\u0142\3\2\2\2\u012c"+
		"\u012d\58\35\2\u012d\u012e\b\21\1\2\u012e\u0142\3\2\2\2\u012f\u0130\5"+
		"@!\2\u0130\u0131\b\21\1\2\u0131\u0142\3\2\2\2\u0132\u0133\5B\"\2\u0133"+
		"\u0134\b\21\1\2\u0134\u0142\3\2\2\2\u0135\u0136\5D#\2\u0136\u0137\b\21"+
		"\1\2\u0137\u0142\3\2\2\2\u0138\u0139\5$\23\2\u0139\u013a\b\21\1\2\u013a"+
		"\u0142\3\2\2\2\u013b\u013c\5\2\2\2\u013c\u013d\b\21\1\2\u013d\u0142\3"+
		"\2\2\2\u013e\u013f\5\"\22\2\u013f\u0140\b\21\1\2\u0140\u0142\3\2\2\2\u0141"+
		"\u0123\3\2\2\2\u0141\u0126\3\2\2\2\u0141\u0129\3\2\2\2\u0141\u012c\3\2"+
		"\2\2\u0141\u012f\3\2\2\2\u0141\u0132\3\2\2\2\u0141\u0135\3\2\2\2\u0141"+
		"\u0138\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142!\3\2\2\2"+
		"\u0143\u0144\b\22\1\2\u0144\u014b\7\20\2\2\u0145\u0146\7\23\2\2\u0146"+
		"\u014c\7(\2\2\u0147\u0148\7\23\2\2\u0148\u0149\5\16\b\2\u0149\u014a\7"+
		"(\2\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014c"+
		"\u0153\3\2\2\2\u014d\u014e\7\34\2\2\u014e\u014f\5*\26\2\u014f\u0150\b"+
		"\22\1\2\u0150\u0151\7\13\2\2\u0151\u0154\3\2\2\2\u0152\u0154\7\13\2\2"+
		"\u0153\u014d\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\b\22\1\2\u0156\u0158\5\22\n\2\u0157\u0159\5\20\t\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\r\2\2\u015b\u015c"+
		"\b\22\1\2\u015c#\3\2\2\2\u015d\u0160\7\'\2\2\u015e\u0160\7\27\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\23"+
		"\1\2\u0162\u0167\5&\24\2\u0163\u0164\7\30\2\2\u0164\u0166\5&\24\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\b\23\1\2\u016b"+
		"\u016c\7\r\2\2\u016c%\3\2\2\2\u016d\u016e\5*\26\2\u016e\u016f\7\63\2\2"+
		"\u016f\u0170\b\24\1\2\u0170\u0178\3\2\2\2\u0171\u0172\5*\26\2\u0172\u0173"+
		"\7\63\2\2\u0173\u0174\7\34\2\2\u0174\u0175\5(\25\2\u0175\u0176\b\24\1"+
		"\2\u0176\u0178\3\2\2\2\u0177\u016d\3\2\2\2\u0177\u0171\3\2\2\2\u0178\'"+
		"\3\2\2\2\u0179\u017a\5<\37\2\u017a\u017b\b\25\1\2\u017b\u0189\3\2\2\2"+
		"\u017c\u017d\5B\"\2\u017d\u017e\b\25\1\2\u017e\u0189\3\2\2\2\u017f\u0180"+
		"\5D#\2\u0180\u0181\b\25\1\2\u0181\u0189\3\2\2\2\u0182\u0183\5$\23\2\u0183"+
		"\u0184\b\25\1\2\u0184\u0189\3\2\2\2\u0185\u0186\5\"\22\2\u0186\u0187\b"+
		"\25\1\2\u0187\u0189\3\2\2\2\u0188\u0179\3\2\2\2\u0188\u017c\3\2\2\2\u0188"+
		"\u017f\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0185\3\2\2\2\u0189)\3\2\2\2"+
		"\u018a\u018b\7\63\2\2\u018b\u0195\b\26\1\2\u018c\u018d\5F$\2\u018d\u018e"+
		"\b\26\1\2\u018e\u0192\3\2\2\2\u018f\u0190\7\36\2\2\u0190\u0191\7 \2\2"+
		"\u0191\u0193\b\26\1\2\u0192\u018f\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195"+
		"\3\2\2\2\u0194\u018a\3\2\2\2\u0194\u018c\3\2\2\2\u0195+\3\2\2\2\u0196"+
		"\u0197\5.\30\2\u0197\u0198\b\27\1\2\u0198\u019d\3\2\2\2\u0199\u019a\5"+
		"\60\31\2\u019a\u019b\b\27\1\2\u019b\u019d\3\2\2\2\u019c\u0196\3\2\2\2"+
		"\u019c\u0199\3\2\2\2\u019d-\3\2\2\2\u019e\u01a7\b\30\1\2\u019f\u01a0\7"+
		"\63\2\2\u01a0\u01a8\b\30\1\2\u01a1\u01a2\5F$\2\u01a2\u01a3\b\30\1\2\u01a3"+
		"\u01a8\3\2\2\2\u01a4\u01a5\5@!\2\u01a5\u01a6\b\30\1\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\7\33\2\2\u01aa\u01ab\5\64\33\2\u01ab\u01ac"+
		"\7.\2\2\u01ac\u01ad\b\30\1\2\u01ad/\3\2\2\2\u01ae\u01af\b\31\1\2\u01af"+
		"\u01b0\5\64\33\2\u01b0\u01b9\7\32\2\2\u01b1\u01b2\7\63\2\2\u01b2\u01ba"+
		"\b\31\1\2\u01b3\u01b4\5F$\2\u01b4\u01b5\b\31\1\2\u01b5\u01ba\3\2\2\2\u01b6"+
		"\u01b7\5@!\2\u01b7\u01b8\b\31\1\2\u01b8\u01ba\3\2\2\2\u01b9\u01b1\3\2"+
		"\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\7.\2\2\u01bc\u01bd\b\31\1\2\u01bd\61\3\2\2\2\u01be\u01bf\7\f\2"+
		"\2\u01bf\u01c0\7\23\2\2\u01c0\u01c1\5\64\33\2\u01c1\u01c2\7(\2\2\u01c2"+
		"\u01c3\b\32\1\2\u01c3\u01c9\3\2\2\2\u01c4\u01c5\7\f\2\2\u01c5\u01c6\5"+
		"\64\33\2\u01c6\u01c7\b\32\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01be\3\2\2\2"+
		"\u01c8\u01c4\3\2\2\2\u01c9\63\3\2\2\2\u01ca\u01cb\5Z.\2\u01cb\u01cc\b"+
		"\33\1\2\u01cc\u01d4\3\2\2\2\u01cd\u01ce\5\66\34\2\u01ce\u01cf\b\33\1\2"+
		"\u01cf\u01d4\3\2\2\2\u01d0\u01d1\58\35\2\u01d1\u01d2\b\33\1\2\u01d2\u01d4"+
		"\3\2\2\2\u01d3\u01ca\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4"+
		"\65\3\2\2\2\u01d5\u01d6\7\63\2\2\u01d6\u01d7\7\23\2\2\u01d7\u01d8\7(\2"+
		"\2\u01d8\u01e0\b\34\1\2\u01d9\u01da\7\63\2\2\u01da\u01db\7\23\2\2\u01db"+
		"\u01dc\5\36\20\2\u01dc\u01dd\7(\2\2\u01dd\u01de\b\34\1\2\u01de\u01e0\3"+
		"\2\2\2\u01df\u01d5\3\2\2\2\u01df\u01d9\3\2\2\2\u01e0\67\3\2\2\2\u01e1"+
		"\u01e2\5F$\2\u01e2\u01e3\7\31\2\2\u01e3\u01e4\7\63\2\2\u01e4\u01e5\7\23"+
		"\2\2\u01e5\u01e6\7(\2\2\u01e6\u01e7\b\35\1\2\u01e7\u01f1\3\2\2\2\u01e8"+
		"\u01e9\5F$\2\u01e9\u01ea\7\31\2\2\u01ea\u01eb\7\63\2\2\u01eb\u01ec\7\23"+
		"\2\2\u01ec\u01ed\5\36\20\2\u01ed\u01ee\7(\2\2\u01ee\u01ef\b\35\1\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01e1\3\2\2\2\u01f0\u01e8\3\2\2\2\u01f19\3\2\2\2"+
		"\u01f2\u01fe\7\63\2\2\u01f3\u01f4\7\23\2\2\u01f4\u01f9\7\63\2\2\u01f5"+
		"\u01f6\7\30\2\2\u01f6\u01f8\7\63\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3"+
		"\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fe\7(\2\2\u01fd\u01f2\3\2\2\2\u01fd\u01f3\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\32\2\2\u0200;\3\2\2\2\u0201\u0202"+
		"\7\62\2\2\u0202\u020c\b\37\1\2\u0203\u0204\7\60\2\2\u0204\u020c\b\37\1"+
		"\2\u0205\u0206\7/\2\2\u0206\u020c\b\37\1\2\u0207\u0208\7\61\2\2\u0208"+
		"\u020c\b\37\1\2\u0209\u020a\7\63\2\2\u020a\u020c\b\37\1\2\u020b\u0201"+
		"\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0205\3\2\2\2\u020b\u0207\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020c=\3\2\2\2\u020d\u020e\7\63\2\2\u020e\u021f\b \1\2"+
		"\u020f\u0210\5F$\2\u0210\u0211\b \1\2\u0211\u021f\3\2\2\2\u0212\u0213"+
		"\5\66\34\2\u0213\u0214\b \1\2\u0214\u021f\3\2\2\2\u0215\u0216\58\35\2"+
		"\u0216\u0217\b \1\2\u0217\u021f\3\2\2\2\u0218\u0219\5@!\2\u0219\u021a"+
		"\b \1\2\u021a\u021f\3\2\2\2\u021b\u021c\5B\"\2\u021c\u021d\b \1\2\u021d"+
		"\u021f\3\2\2\2\u021e\u020d\3\2\2\2\u021e\u020f\3\2\2\2\u021e\u0212\3\2"+
		"\2\2\u021e\u0215\3\2\2\2\u021e\u0218\3\2\2\2\u021e\u021b\3\2\2\2\u021f"+
		"?\3\2\2\2\u0220\u0221\5F$\2\u0221\u022e\b!\1\2\u0222\u0229\7\36\2\2\u0223"+
		"\u0224\7/\2\2\u0224\u022a\b!\1\2\u0225\u0226\7\63\2\2\u0226\u022a\b!\1"+
		"\2\u0227\u0228\7\60\2\2\u0228\u022a\b!\1\2\u0229\u0223\3\2\2\2\u0229\u0225"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\7 \2\2\u022c"+
		"\u0222\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022fA\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7\36\2\2\u0232\u023a"+
		"\b\"\1\2\u0233\u0234\5 \21\2\u0234\u0235\b\"\1\2\u0235\u023b\3\2\2\2\u0236"+
		"\u0237\7/\2\2\u0237\u0238\7\34\2\2\u0238\u0239\7/\2\2\u0239\u023b\b\""+
		"\1\2\u023a\u0233\3\2\2\2\u023a\u0236\3\2\2\2\u023b\u0246\3\2\2\2\u023c"+
		"\u023d\7\30\2\2\u023d\u023e\5 \21\2\u023e\u023f\b\"\1\2\u023f\u0245\3"+
		"\2\2\2\u0240\u0241\7/\2\2\u0241\u0242\7\34\2\2\u0242\u0243\7/\2\2\u0243"+
		"\u0245\b\"\1\2\u0244\u023c\3\2\2\2\u0244\u0240\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024a\7 \2\2\u024a\u024b\b\"\1\2\u024bC\3\2\2\2\u024c"+
		"\u024d\7\13\2\2\u024d\u0267\b#\1\2\u024e\u024f\7\63\2\2\u024f\u0253\b"+
		"#\1\2\u0250\u0251\7\60\2\2\u0251\u0253\b#\1\2\u0252\u024e\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\7\34\2\2\u0255\u0256\5"+
		" \21\2\u0256\u0264\b#\1\2\u0257\u025c\7\30\2\2\u0258\u0259\7\63\2\2\u0259"+
		"\u025d\b#\1\2\u025a\u025b\7\60\2\2\u025b\u025d\b#\1\2\u025c\u0258\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7\34\2\2\u025f"+
		"\u0260\5 \21\2\u0260\u0261\b#\1\2\u0261\u0263\3\2\2\2\u0262\u0257\3\2"+
		"\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0252\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7\r\2\2\u026aE\3\2\2\2\u026b\u026c"+
		"\7\63\2\2\u026c\u0272\b$\1\2\u026d\u026e\7\31\2\2\u026e\u026f\7\63\2\2"+
		"\u026f\u0271\b$\1\2\u0270\u026d\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273G\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\b%\1\2\u0276\u0277\7-\2\2\u0277\u0279\b%\1\2\u0278\u0276\3\2\2"+
		"\2\u0278\u0279\3\2\2\2\u0279\u0282\3\2\2\2\u027a\u027b\5 \21\2\u027b\u027c"+
		"\b%\1\2\u027c\u0283\3\2\2\2\u027d\u027e\7\23\2\2\u027e\u027f\5Z.\2\u027f"+
		"\u0280\7(\2\2\u0280\u0281\b%\1\2\u0281\u0283\3\2\2\2\u0282\u027a\3\2\2"+
		"\2\u0282\u027d\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\b%\1\2\u0285I\3"+
		"\2\2\2\u0286\u0287\5H%\2\u0287\u028a\b&\1\2\u0288\u0289\7$\2\2\u0289\u028b"+
		"\b&\1\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028bK\3\2\2\2\u028c\u028d"+
		"\5J&\2\u028d\u0294\b\'\1\2\u028e\u028f\7\16\2\2\u028f\u0290\5J&\2\u0290"+
		"\u0291\b\'\1\2\u0291\u0293\3\2\2\2\u0292\u028e\3\2\2\2\u0293\u0296\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295M\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0297\u0298\5L\'\2\u0298\u02a3\b(\1\2\u0299\u029a\7\26\2\2\u029a"+
		"\u029b\5L\'\2\u029b\u029c\b(\1\2\u029c\u02a2\3\2\2\2\u029d\u029e\7\3\2"+
		"\2\u029e\u029f\5L\'\2\u029f\u02a0\b(\1\2\u02a0\u02a2\3\2\2\2\u02a1\u0299"+
		"\3\2\2\2\u02a1\u029d\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4O\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\5N(\2\u02a7"+
		"\u02b2\b)\1\2\u02a8\u02a9\7+\2\2\u02a9\u02aa\5N(\2\u02aa\u02ab\b)\1\2"+
		"\u02ab\u02b1\3\2\2\2\u02ac\u02ad\7-\2\2\u02ad\u02ae\5N(\2\u02ae\u02af"+
		"\b)\1\2\u02af\u02b1\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b1"+
		"\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3Q\3\2\2\2"+
		"\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5P)\2\u02b6\u02bd\b*\1\2\u02b7\u02b8"+
		"\7\22\2\2\u02b8\u02b9\5P)\2\u02b9\u02ba\b*\1\2\u02ba\u02bc\3\2\2\2\u02bb"+
		"\u02b7\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02beS\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\5R*\2\u02c1\u02e9"+
		"\b+\1\2\u02c2\u02c3\7\f\2\2\u02c3\u02c4\5R*\2\u02c4\u02c5\b+\1\2\u02c5"+
		"\u02e8\3\2\2\2\u02c6\u02c7\7\25\2\2\u02c7\u02c8\5R*\2\u02c8\u02c9\b+\1"+
		"\2\u02c9\u02e8\3\2\2\2\u02ca\u02cb\7\n\2\2\u02cb\u02cc\5R*\2\u02cc\u02cd"+
		"\b+\1\2\u02cd\u02e8\3\2\2\2\u02ce\u02cf\7#\2\2\u02cf\u02d0\5R*\2\u02d0"+
		"\u02d1\b+\1\2\u02d1\u02e8\3\2\2\2\u02d2\u02d3\7\25\2\2\u02d3\u02d4\7,"+
		"\2\2\u02d4\u02d5\5R*\2\u02d5\u02d6\b+\1\2\u02d6\u02e8\3\2\2\2\u02d7\u02d8"+
		"\7!\2\2\u02d8\u02d9\5R*\2\u02d9\u02da\b+\1\2\u02da\u02e8\3\2\2\2\u02db"+
		"\u02dc\7\35\2\2\u02dc\u02dd\5R*\2\u02dd\u02de\b+\1\2\u02de\u02e8\3\2\2"+
		"\2\u02df\u02e0\7\37\2\2\u02e0\u02e1\5R*\2\u02e1\u02e2\b+\1\2\u02e2\u02e8"+
		"\3\2\2\2\u02e3\u02e4\7\21\2\2\u02e4\u02e5\5R*\2\u02e5\u02e6\b+\1\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02c2\3\2\2\2\u02e7\u02c6\3\2\2\2\u02e7\u02ca\3\2"+
		"\2\2\u02e7\u02ce\3\2\2\2\u02e7\u02d2\3\2\2\2\u02e7\u02d7\3\2\2\2\u02e7"+
		"\u02db\3\2\2\2\u02e7\u02df\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e8\u02eb\3\2"+
		"\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eaU\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ed\5T+\2\u02ed\u02ee\b,\1\2\u02ee\u02f4\3\2\2\2\u02ef"+
		"\u02f0\7,\2\2\u02f0\u02f1\5T+\2\u02f1\u02f2\b,\1\2\u02f2\u02f4\3\2\2\2"+
		"\u02f3\u02ec\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f4W\3\2\2\2\u02f5\u02f6\5"+
		"V,\2\u02f6\u0301\b-\1\2\u02f7\u02f8\7*\2\2\u02f8\u02f9\5Z.\2\u02f9\u02fa"+
		"\b-\1\2\u02fa\u0300\3\2\2\2\u02fb\u02fc\7\"\2\2\u02fc\u02fd\5Z.\2\u02fd"+
		"\u02fe\b-\1\2\u02fe\u0300\3\2\2\2\u02ff\u02f7\3\2\2\2\u02ff\u02fb\3\2"+
		"\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"Y\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0305\5X-\2\u0305\u0306\b.\1\2\u0306"+
		"[\3\2\2\2>^fn\u0088\u0095\u009d\u00a2\u00b1\u00b9\u00d3\u00d5\u00ec\u00f5"+
		"\u0103\u0120\u0141\u014b\u0153\u0158\u015f\u0167\u0177\u0188\u0192\u0194"+
		"\u019c\u01a7\u01b9\u01c8\u01d3\u01df\u01f0\u01f9\u01fd\u020b\u021e\u0229"+
		"\u022e\u023a\u0244\u0246\u0252\u025c\u0264\u0267\u0272\u0278\u0282\u028a"+
		"\u0294\u02a1\u02a3\u02b0\u02b2\u02bd\u02e7\u02e9\u02f3\u02ff\u0301";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
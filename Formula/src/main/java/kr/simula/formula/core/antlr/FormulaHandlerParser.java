package kr.simula.formula.core.antlr;

import java.util.List;
import java.util.Map;

import kr.simula.formula.core.Block;
import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.Literal;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.builder.FormulaHandler;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;

public class FormulaHandlerParser extends Parser {

	public FormulaHandlerParser(TokenStream input) {
		super(input);
	}

	private FormulaHandler handler;

	public Block block(String token) {
		
		return handler.block(token);
	}


	public void beginScope() {
		handler.beginScope();
	}


	public void endScope() {
		handler.endScope();
	}


	public Gettable<?> operator(String token, Node node) {
		return handler.operator(token, node);
	}

	public Gettable<?> operator(String token, Node left, Node right) {
		return handler.operator(token, left, right);
	}

	public Literal literal(String token, String value) {
		return handler.literal(token, value);
	}

	public Ref refer(String name) {
		return handler.refer(name);
	}

	public Ref refer(String name, Node index) {
		return handler.refer(name, index);
	}

	public Ref refer(Ref parent, String name) {
		return handler.refer(parent, name);
	}

	public Ref refer(Ref parent, String name, Node index) {
		return handler.refer(parent, name, index);
	}

	public Ref declare(String token, Class<?> type, String name) {
		return handler.declare(token, type, name);
	}

	public BlockStatement declareFn(Class<?> retType, String name,
			List<Ref> args) {
		return handler.declareFn(retType, name, args);
	}

	public Class<?> type(String typeQname) {
		return handler.type(typeQname);
	}

	public <T> Class<T[]> arrayType(Class<T> type) {
		return handler.arrayType(type);
	}

	public Gettable functionCall(String name, List<Node> args) {
		return handler.functionCall(name, args);
	}

	public Ref methodCall(Ref parent, String name, List<Node> args) {
		return handler.methodCall(parent, name, args);
	}

	public Statement statement(String token, Node... args) {
		return handler.statement(token, args);
	}

	public BlockStatement statementBlock(String token, Node... args) {
		return handler.statementBlock(token, args);
	}

	public Lambda lambda(String token, List<Ref> args, Node... infos) {
		return handler.lambda(token, args, infos);
	}

	public Gettable<?> array(List<Node> elements) {
		return handler.array(elements);
	}

	public Gettable<Map> map(String token) {
		return handler.map(token);
	}

	public void mapEntry(Gettable<?> mapGettable, Class<?> entryType,
			String name, Node value) {
		handler.mapEntry(mapGettable, entryType, name, value);
	}

	@Override
	public String[] getTokenNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getRuleNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGrammarFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ATN getATN() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

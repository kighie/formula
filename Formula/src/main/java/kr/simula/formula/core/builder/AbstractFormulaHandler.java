/* 
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kr.simula.formula.core.builder;

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
import kr.simula.formula.core.builder.helper.ArrayHelper;
import kr.simula.formula.core.builder.helper.BinaryOperatorHelper;
import kr.simula.formula.core.builder.helper.BlockHelper;
import kr.simula.formula.core.builder.helper.DeclarationHelper;
import kr.simula.formula.core.builder.helper.FunctionCallHelper;
import kr.simula.formula.core.builder.helper.ImportHelper;
import kr.simula.formula.core.builder.helper.LambdaHelper;
import kr.simula.formula.core.builder.helper.LiteralHelper;
import kr.simula.formula.core.builder.helper.MapHelper;
import kr.simula.formula.core.builder.helper.MethodCallHelper;
import kr.simula.formula.core.builder.helper.RefHelper;
import kr.simula.formula.core.builder.helper.StatementHelper;
import kr.simula.formula.core.builder.helper.TypeHelper;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;

/**
 * @author kighie@gmail.com
 *
 */
public abstract class AbstractFormulaHandler implements FormulaHandler {
	protected final RootBuildContext rootContext;

	
	protected final BlockHelper blockHelper;
	protected final LiteralHelper literalHelper;
	protected final RefHelper refHelper;
	protected final TypeHelper typeHelper;
	protected final BinaryOperatorHelper binaryOperatorHelper;
	protected final UnaryOperatorHelper unaryOperatorHelper ;
	protected final FunctionCallHelper functionCallHelper ;
	protected final MethodCallHelper methodCallHelper ;
	protected final StatementHelper statementHelper;
	protected final DeclarationHelper declarationHelper;
	protected final LambdaHelper lambdaHelper;

	protected final ArrayHelper arrayHelper;
	protected final MapHelper mapHelper;
	protected final ImportHelper importHelper;
	
	protected BuildContext current;
	
	
	


	/**
	 * @param rootContext
	 * @param blockHelper
	 * @param literalHelper
	 * @param refHelper
	 * @param typeHelper
	 * @param binaryOperatorHelper
	 * @param unaryOperatorHelper
	 * @param functionCallHelper
	 * @param methodCallHelper
	 * @param statementHelper
	 * @param declarationHelper
	 */
	public AbstractFormulaHandler(RootBuildContext rootContext,
			ImportHelper importHelper,
			BlockHelper blockHelper, LiteralHelper literalHelper,
			RefHelper refHelper, TypeHelper typeHelper,
			BinaryOperatorHelper binaryOperatorHelper,
			UnaryOperatorHelper unaryOperatorHelper,
			FunctionCallHelper functionCallHelper,
			MethodCallHelper methodCallHelper, StatementHelper statementHelper,
			DeclarationHelper declarationHelper,
			ArrayHelper arrayHelper,
			MapHelper mapHelper,
			LambdaHelper lambdaHelper) {
		this.current = this.rootContext = rootContext;
		this.importHelper = importHelper;
		this.blockHelper = blockHelper;
		this.literalHelper = literalHelper;
		this.refHelper = refHelper;
		this.typeHelper = typeHelper;
		this.binaryOperatorHelper = binaryOperatorHelper;
		this.unaryOperatorHelper = unaryOperatorHelper;
		this.functionCallHelper = functionCallHelper;
		this.methodCallHelper = methodCallHelper;
		this.statementHelper = statementHelper;
		this.declarationHelper = declarationHelper;
		this.arrayHelper = arrayHelper;
		this.mapHelper = mapHelper;
		this.lambdaHelper = lambdaHelper;
	}


	@Override
	public BuildContext current(){
		return current;
	}
	

	public void beginScope(){
		ScopeBuildContext scope = new ScopeBuildContext(current);
		current = scope;
	}
	
	public void endScope(){
		BuildContext parent = current.getParent();
		if(parent == null){
			throw new BuildException("Current step exceeds BuildScope.");
		}
		
		current = parent;
	}
	
	
	@Override
	public Block block(String token){
		beginScope();
		Block block = blockHelper.create(current, token);
		return block;
	}
	/*
	@Override
	public void endBlock() {
		endScope();
	}
	*/
	
	@Override
	public Gettable<?> operator(String token, Node node) {
		return unaryOperatorHelper.create(current, token, node);
	}


	@Override
	public Gettable<?> operator(String token, Node left, Node right) {
		return binaryOperatorHelper.create(current, token, left, right);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Literal literal(String token, String value) {
		return literalHelper.create(current, token, value);
	}

	@Override
	public Ref refer(String name) {
		return refHelper.get(current,name);
	}
	
	@Override
	public Ref refer(Ref parent, String name) {
		return refHelper.get(current, parent, name);
	}
	
	@Override
	public Ref refer(String name, Node index) {
		return refHelper.get(current,name, index);
	}


	@Override
	public Ref refer(Ref parent, String name, Node index) {
		return refHelper.get(current, parent, name, index);
	}


	@Override
	public Ref declare(String token, Class<?> type, String name) {
		return declarationHelper.create(current, token, type, name);
	}
	
	@Override
	public BlockStatement declareFn(Class<?> retType, String name, List<Ref> args) {
//		beginScope();
		return declarationHelper.createFn(current, retType, name, args);
	}
	
	@Override
	public Class<?> type(String typeQname) {
		return typeHelper.getType(current, typeQname);
	}
	
	@Override
	public <T> Class<T[]> arrayType(Class<T> type) {
		return typeHelper.getArrayType(current, type);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Gettable functionCall(String name, List<Node> args) {
		return functionCallHelper.create(current, name, args);
	}

	@Override
	public Ref methodCall(Ref parent, String name, List<Node> args) {
		return methodCallHelper.create(current, parent, name, args);
	}
	
	@Override
	public Statement statement(String token, Node... args) {
		return statementHelper.create(current, token, args);
	}
	
	@Override
	public BlockStatement statementBlock(String token, Node... args) {
		return (BlockStatement)statementHelper.create(current, token, args);
	}
	
	@Override
	public Lambda lambda(String token, List<Ref> args, Node... infos) {
		return lambdaHelper.create(current, token, args, infos);
	}


	@Override
	public Gettable<?> array(List<Node> elements) {
		return arrayHelper.create(current, elements);
	}


	@SuppressWarnings("rawtypes")
	@Override
	public Gettable<Map> map(String token) {
		return mapHelper.create(current, token);
	}

	@Override
	public void mapEntry(Gettable<?> mapGettable, Class<?> entryType,
			String name, Node value) {
		mapHelper.mapEntry(current, mapGettable, entryType, name, value);
	}

	@Override
	public void importJava(Ref ref) {
		importHelper.importJava(current, ref);
	}
}

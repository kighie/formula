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
package kr.simula.formula.script.build;

import kr.simula.formula.FormulaException;
import kr.simula.formula.antlr.FormulaScriptLexer;
import kr.simula.formula.antlr.FormulaScriptParser;
import kr.simula.formula.antlr.FormulaScriptParser.FormulaScriptContext;
import kr.simula.formula.core.builder.AbstractFormulaBuilder;
import kr.simula.formula.core.builder.FormulaHandler;
import kr.simula.formula.core.builder.FormulaSource;
import kr.simula.formula.core.builder.RootBuildContext;
import kr.simula.formula.core.builder.helper.ArrayHelper;
import kr.simula.formula.core.builder.helper.BinaryOperatorHelper;
import kr.simula.formula.core.builder.helper.BlockHelper;
import kr.simula.formula.core.builder.helper.BuiltInFunctionRegistry;
import kr.simula.formula.core.builder.helper.DeclarationHelper;
import kr.simula.formula.core.builder.helper.FunctionCallHelper;
import kr.simula.formula.core.builder.helper.LambdaHelper;
import kr.simula.formula.core.builder.helper.LiteralHelper;
import kr.simula.formula.core.builder.helper.MapHelper;
import kr.simula.formula.core.builder.helper.MethodCallHelper;
import kr.simula.formula.core.builder.helper.RefHelper;
import kr.simula.formula.core.builder.helper.StatementHelper;
import kr.simula.formula.core.builder.helper.TypeHelper;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;
import kr.simula.formula.expr.builder.ExprBinaryOperatorHelper;
import kr.simula.formula.expr.builder.ExprLiteralHelper;
import kr.simula.formula.expr.builder.ExprMapHelper;
import kr.simula.formula.expr.builder.ExprUnaryOperatorHelper;
import kr.simula.formula.script.Module;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class FormulaScriptBuilder extends AbstractFormulaBuilder<Module> {

	protected final static String FUNC_CLASSPATH = "kr.simula.formula.func";
	
	
	@Override
	protected BuiltInFunctionRegistry initGlobalFunctionRegistry() {
		BuiltInFunctionRegistry registry = new BuiltInFunctionRegistry(){
			@Override
			protected void initFunctions() {
				loadAndRegisterFunctions(this.getClass().getClassLoader(), FUNC_CLASSPATH);
			}
		};
		registry.initialize();
		return registry;
	}
	
	public BlockHelper initBlockHelper() {
		return new ScriptBlockHelper();
	}

	public StatementHelper initStatementHelper() {
		return new ScriptStatementHelper();
	}

	public DeclarationHelper initDeclarationHelper() {
		return new ScriptDeclarationHelper();
	}

	public TypeHelper initTypeHelper() {
		return new ScriptTypeHelper();
	}

	protected LiteralHelper initLiteralHelper() {
		return new ExprLiteralHelper();
	}

	protected BinaryOperatorHelper initBinaryOperatorHelper() {
		return new ExprBinaryOperatorHelper();
	}

	protected UnaryOperatorHelper initUnaryOperatorHelper() {
		return  new ExprUnaryOperatorHelper();
	}

	protected MapHelper initMapHelper() {
		return new ExprMapHelper();
	}

	@Override
	protected FormulaHandler newHandler(RootBuildContext rootContext,
			BlockHelper blockHelper, LiteralHelper literalHelper,
			RefHelper refHelper, TypeHelper typeHelper,
			BinaryOperatorHelper binaryOperatorHelper,
			UnaryOperatorHelper unaryOperatorHelper,
			FunctionCallHelper functionCallHelper,
			MethodCallHelper methodCallHelper, StatementHelper statementHelper,
			DeclarationHelper declarationHelper, ArrayHelper arrayHelper,
			MapHelper mapHelper, LambdaHelper lambdaHelper) {
		return new FormulaScriptHandler(rootContext, 
				blockHelper, literalHelper, refHelper, typeHelper, binaryOperatorHelper, unaryOperatorHelper, 
				functionCallHelper, methodCallHelper, statementHelper, declarationHelper, 
				arrayHelper, mapHelper, lambdaHelper);
	}

	@Override
	protected Module build(FormulaHandler handler, String expression) {
		CharStream input = new ANTLRInputStream(expression);
		FormulaScriptLexer lexer = new FormulaScriptLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		FormulaScriptParser parser =new FormulaScriptParser(tokenStream);
		parser.setHandler(handler);
		parser.setSourceText(expression);
		parser.addErrorListener(errorAdapter);
		
//		FormulaScriptBaseListener2 extractor = new FormulaScriptBaseListener2(parser);
//		parser.addParseListener(extractor);
		
		FormulaScriptContext ctx = null;
		
		try {
			ctx = parser.formulaScript();
			
			return ctx.module;
		} catch (FormulaException e) {
			FormulaException be = (FormulaException)e;
			be.setLocation(parser.currentLocation());
			System.out.println(be);

//			if( ctx != null){
//				ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
//				
//				walker.walk(extractor, ctx); // initiate walk of tree with listener
//			}
			
			throw be;
		}
	}

	@Override
	protected Module build(FormulaHandler handler, FormulaSource source) {
		return build(handler, source.getSourceString());
	}
}

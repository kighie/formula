/* ******************************************************************************
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
package kr.simula.formula.expr.builder;

import kr.simula.formula.antlr.FormulaLexer;
import kr.simula.formula.antlr.FormulaParser;
import kr.simula.formula.antlr.FormulaParser.FormulaExpressionContext;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.builder.AbstractFormulaBuilder;
import kr.simula.formula.core.builder.FormulaHandler;
import kr.simula.formula.core.builder.FormulaSource;
import kr.simula.formula.core.builder.RootBuildContext;
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
import kr.simula.formula.core.builder.helper.PrototypeHelper;
import kr.simula.formula.core.builder.helper.RefHelper;
import kr.simula.formula.core.builder.helper.StatementHelper;
import kr.simula.formula.core.builder.helper.TypeHelper;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;
import kr.simula.formula.core.function.BuiltInFunctionRegistry;
import kr.simula.formula.expr.Expr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ExpressionBuilder extends AbstractFormulaBuilder<Expr> {

	protected final static String FUNC_CLASSPATH = "kr.simula.formula.func";
	
	
	@Override
	protected void extendBuiltinFunction(
			BuiltInFunctionRegistry registry) {
		registry.loadAndRegisterFunctions(this.getClass().getClassLoader(), FUNC_CLASSPATH);
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
			ImportHelper importHelper, BlockHelper blockHelper,
			LiteralHelper literalHelper, RefHelper refHelper,
			TypeHelper typeHelper,
			BinaryOperatorHelper binaryOperatorHelper,
			UnaryOperatorHelper unaryOperatorHelper,
			FunctionCallHelper functionCallHelper, MethodCallHelper methodCallHelper,
			StatementHelper statementHelper, DeclarationHelper declarationHelper,
			ArrayHelper arrayHelper, MapHelper mapHelper, LambdaHelper lambdaHelper, 
			PrototypeHelper prototypeHelper) {
		return new ExpressionHandler(rootContext, 
				importHelper, blockHelper, literalHelper, refHelper , typeHelper, binaryOperatorHelper, 
				unaryOperatorHelper, functionCallHelper, methodCallHelper, statementHelper,  
				declarationHelper, arrayHelper, mapHelper, lambdaHelper, prototypeHelper);
	}
	
	/**
	 * <pre>
	 * {@link FormulaParser#formulaExpression()}
	 * </pre>
	 * @param handler
	 * @param expression
	 * @return
	 */
	protected Expr build(FormulaHandler handler, String expression){
		CharStream input = new ANTLRInputStream(expression);
		FormulaLexer lexer = new FormulaLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		FormulaParser parser =new FormulaParser(tokenStream);
		parser.setHandler(handler);
		parser.addErrorListener(errorAdapter);
		FormulaExpressionContext ctx = parser.formulaExpression();
		
		Expr expr = new Expr((Gettable<?>)ctx.result);
		return expr;
	}
	
	@Override
	protected Expr build(FormulaHandler handler, FormulaSource source) {
		return build(handler, source.getSourceString());
	}
}

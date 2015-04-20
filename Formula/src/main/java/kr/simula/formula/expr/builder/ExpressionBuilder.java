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
import kr.simula.formula.core.builder.FormulaSource;
import kr.simula.formula.core.builder.RootBuildContext;
import kr.simula.formula.core.builder.helper.ArrayHelper;
import kr.simula.formula.core.builder.helper.BinaryOperatorHelper;
import kr.simula.formula.core.builder.helper.FunctionCallHelper;
import kr.simula.formula.core.builder.helper.LambdaHelper;
import kr.simula.formula.core.builder.helper.LiteralHelper;
import kr.simula.formula.core.builder.helper.MapHelper;
import kr.simula.formula.core.builder.helper.MethodCallHelper;
import kr.simula.formula.core.builder.helper.RefHelper;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;
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
public class ExpressionBuilder extends AbstractFormulaBuilder<Expr, ExpressionHandler> {

	protected LiteralHelper literalHelper = new ExprLiteralHelper();
	protected RefHelper refHelper = new RefHelper();
	protected BinaryOperatorHelper binaryOperatorHelper = new ExprBinaryOperatorHelper();
	protected UnaryOperatorHelper unaryOperatorHelper = new ExprUnaryOperatorHelper();
	protected FunctionCallHelper functionCallHelper = new ExprFunctionCallHelper();
	protected MethodCallHelper methodCallHelper = new MethodCallHelper();
	protected LambdaHelper lambdaHelper = new LambdaHelper();

	protected ArrayHelper arrayHelper = new ArrayHelper();
	protected MapHelper mapHelper = new ExprMapHelper();
	
	
	
	@Override
	public ExpressionHandler newHandler(RootBuildContext rootContext) {
		return new ExpressionHandler(rootContext, 
				null, literalHelper, refHelper, null, binaryOperatorHelper, unaryOperatorHelper, 
				functionCallHelper, methodCallHelper, null, null,  
				arrayHelper, mapHelper, lambdaHelper);
	}
	
	/**
	 * <pre>
	 * {@link FormulaParser#formulaExpression()}
	 * </pre>
	 * @param handler
	 * @param expression
	 * @return
	 */
	protected Expr build(ExpressionHandler handler, String expression){
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
	protected Expr build(ExpressionHandler handler, FormulaSource source) {
		return build(handler, source.getSourceString());
	}
}

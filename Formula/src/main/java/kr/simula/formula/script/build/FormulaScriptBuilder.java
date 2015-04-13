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

import kr.simula.formula.antlr.FormulaScriptLexer;
import kr.simula.formula.antlr.FormulaScriptParser;
import kr.simula.formula.antlr.FormulaScriptParser.FormulaScriptContext;
import kr.simula.formula.core.builder.AbstractFormulaBuilder;
import kr.simula.formula.core.builder.RootBuildContext;
import kr.simula.formula.core.factory.helper.BinaryOperatorHelper;
import kr.simula.formula.core.factory.helper.BlockHelper;
import kr.simula.formula.core.factory.helper.DeclarationHelper;
import kr.simula.formula.core.factory.helper.FunctionCallHelper;
import kr.simula.formula.core.factory.helper.LiteralHelper;
import kr.simula.formula.core.factory.helper.MethodCallHelper;
import kr.simula.formula.core.factory.helper.RefHelper;
import kr.simula.formula.core.factory.helper.StatementHelper;
import kr.simula.formula.core.factory.helper.UnaryOperatorHelper;
import kr.simula.formula.expr.builder.ExprBinaryOperatorHelper;
import kr.simula.formula.expr.builder.ExprFunctionCallHelper;
import kr.simula.formula.expr.builder.ExprLiteralHelper;
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
public class FormulaScriptBuilder extends AbstractFormulaBuilder<Module, FormulaScriptHandler> {

	protected BlockHelper blockHelper = new ScriptBlockHelper();
	protected StatementHelper statementHelper = new ScriptStatementHelper();
	protected DeclarationHelper declarationHelper = new ScriptDeclarationHelper();
	protected ScriptTypeHelper typeHelper = new ScriptTypeHelper();
	protected LiteralHelper literalHelper = new ExprLiteralHelper();
	protected RefHelper refHelper = new RefHelper();
	protected BinaryOperatorHelper binaryOperatorHelper = new ExprBinaryOperatorHelper();
	protected UnaryOperatorHelper unaryOperatorHelper = new ExprUnaryOperatorHelper();
	protected FunctionCallHelper functionCallHelper = new ExprFunctionCallHelper();
	protected MethodCallHelper methodCallHelper = new MethodCallHelper();
	
	
	@Override
	public FormulaScriptHandler newHandler(RootBuildContext rootContext) {
		FormulaScriptHandler handler = new FormulaScriptHandler(rootContext, 
				blockHelper, literalHelper, refHelper, typeHelper, binaryOperatorHelper, unaryOperatorHelper, 
				functionCallHelper, methodCallHelper, statementHelper, declarationHelper);
		
		return handler;
	}

	@Override
	protected Module build(FormulaScriptHandler handler, String expression) {
		CharStream input = new ANTLRInputStream(expression);
		FormulaScriptLexer lexer = new FormulaScriptLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		FormulaScriptParser parser =new FormulaScriptParser(tokenStream);
		parser.setHandler(handler);
		parser.addErrorListener(errorAdapter);
		FormulaScriptContext ctx = parser.formulaScript();
		return ctx.module;
	}
	
}

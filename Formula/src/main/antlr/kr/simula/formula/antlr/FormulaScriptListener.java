// Generated from FormulaScript.g4 by ANTLR 4.4
package kr.simula.formula.antlr;



//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.def.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaScriptParser}.
 */
public interface FormulaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(@NotNull FormulaScriptParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(@NotNull FormulaScriptParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull FormulaScriptParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull FormulaScriptParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(@NotNull FormulaScriptParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(@NotNull FormulaScriptParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull FormulaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull FormulaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull FormulaScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull FormulaScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull FormulaScriptParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull FormulaScriptParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull FormulaScriptParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull FormulaScriptParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(@NotNull FormulaScriptParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(@NotNull FormulaScriptParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(@NotNull FormulaScriptParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(@NotNull FormulaScriptParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull FormulaScriptParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull FormulaScriptParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull FormulaScriptParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull FormulaScriptParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(@NotNull FormulaScriptParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(@NotNull FormulaScriptParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void enterFormulaScript(@NotNull FormulaScriptParser.FormulaScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void exitFormulaScript(@NotNull FormulaScriptParser.FormulaScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(@NotNull FormulaScriptParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(@NotNull FormulaScriptParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull FormulaScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull FormulaScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(@NotNull FormulaScriptParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(@NotNull FormulaScriptParser.FormulaExpressionBaseContext ctx);
}
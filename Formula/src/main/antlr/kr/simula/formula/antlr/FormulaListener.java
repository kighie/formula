// Generated from Formula.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaParser}.
 */
public interface FormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull FormulaParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull FormulaParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(@NotNull FormulaParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(@NotNull FormulaParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(@NotNull FormulaParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(@NotNull FormulaParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull FormulaParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull FormulaParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(@NotNull FormulaParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(@NotNull FormulaParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull FormulaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull FormulaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull FormulaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull FormulaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull FormulaParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull FormulaParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull FormulaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull FormulaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void enterConditionArg(@NotNull FormulaParser.ConditionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void exitConditionArg(@NotNull FormulaParser.ConditionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull FormulaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull FormulaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(@NotNull FormulaParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(@NotNull FormulaParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(@NotNull FormulaParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(@NotNull FormulaParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull FormulaParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull FormulaParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull FormulaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull FormulaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull FormulaParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull FormulaParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(@NotNull FormulaParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(@NotNull FormulaParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull FormulaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull FormulaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(@NotNull FormulaParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(@NotNull FormulaParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull FormulaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull FormulaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull FormulaParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull FormulaParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(@NotNull FormulaParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(@NotNull FormulaParser.FormulaExpressionBaseContext ctx);
}
// Generated from Ontolog.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;
	import kr.simula.formula.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OntologParser}.
 */
public interface OntologListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull OntologParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull OntologParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(@NotNull OntologParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(@NotNull OntologParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(@NotNull OntologParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(@NotNull OntologParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull OntologParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull OntologParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(@NotNull OntologParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(@NotNull OntologParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull OntologParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull OntologParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull OntologParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull OntologParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull OntologParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull OntologParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void enterConditionArg(@NotNull OntologParser.ConditionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void exitConditionArg(@NotNull OntologParser.ConditionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull OntologParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull OntologParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(@NotNull OntologParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(@NotNull OntologParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(@NotNull OntologParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(@NotNull OntologParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull OntologParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull OntologParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull OntologParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull OntologParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull OntologParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull OntologParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(@NotNull OntologParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(@NotNull OntologParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull OntologParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull OntologParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(@NotNull OntologParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(@NotNull OntologParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(@NotNull OntologParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(@NotNull OntologParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull OntologParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull OntologParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull OntologParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull OntologParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(@NotNull OntologParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(@NotNull OntologParser.FormulaExpressionBaseContext ctx);
}
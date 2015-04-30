// Generated from Formula.g4 by ANTLR 4.5
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
 * {@link FormulaParser}.
 */
public interface FormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(FormulaParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(FormulaParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(FormulaParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(FormulaParser.FormulaExpressionBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(FormulaParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(FormulaParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(FormulaParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(FormulaParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FormulaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FormulaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void enterLambdaArg(FormulaParser.LambdaArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void exitLambdaArg(FormulaParser.LambdaArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(FormulaParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(FormulaParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(FormulaParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(FormulaParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(FormulaParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(FormulaParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(FormulaParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(FormulaParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(FormulaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(FormulaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(FormulaParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(FormulaParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FormulaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FormulaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(FormulaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(FormulaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(FormulaParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(FormulaParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(FormulaParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(FormulaParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(FormulaParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(FormulaParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FormulaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FormulaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(FormulaParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(FormulaParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FormulaParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FormulaParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(FormulaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(FormulaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(FormulaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(FormulaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(FormulaParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(FormulaParser.OperatorExpressionContext ctx);
}
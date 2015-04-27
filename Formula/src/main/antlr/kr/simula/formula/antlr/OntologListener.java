// Generated from Ontolog.g4 by ANTLR 4.5
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
	 * Enter a parse tree produced by {@link OntologParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(OntologParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(OntologParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(OntologParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(OntologParser.FormulaExpressionBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(OntologParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(OntologParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(OntologParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(OntologParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(OntologParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(OntologParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void enterConditionArg(OntologParser.ConditionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void exitConditionArg(OntologParser.ConditionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(OntologParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(OntologParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(OntologParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(OntologParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(OntologParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(OntologParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(OntologParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(OntologParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(OntologParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(OntologParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(OntologParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(OntologParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(OntologParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(OntologParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(OntologParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(OntologParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(OntologParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(OntologParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(OntologParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(OntologParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(OntologParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(OntologParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(OntologParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(OntologParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(OntologParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(OntologParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(OntologParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(OntologParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(OntologParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(OntologParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(OntologParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(OntologParser.OperatorExpressionContext ctx);
}
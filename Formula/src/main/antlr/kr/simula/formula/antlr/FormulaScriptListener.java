// Generated from FormulaScript.g4 by ANTLR 4.5
package kr.simula.formula.antlr;

	
	import kr.simula.formula.script.*;
	import kr.simula.formula.script.statement.*;
	import kr.simula.formula.util.*;


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
 * {@link FormulaScriptParser}.
 */
public interface FormulaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void enterFormulaScript(FormulaScriptParser.FormulaScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void exitFormulaScript(FormulaScriptParser.FormulaScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(FormulaScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(FormulaScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(FormulaScriptParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(FormulaScriptParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FormulaScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FormulaScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(FormulaScriptParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(FormulaScriptParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgsDecl(FormulaScriptParser.ArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgsDecl(FormulaScriptParser.ArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetrunStmt(FormulaScriptParser.RetrunStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetrunStmt(FormulaScriptParser.RetrunStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void enterBlockContents(FormulaScriptParser.BlockContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void exitBlockContents(FormulaScriptParser.BlockContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FormulaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FormulaScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(FormulaScriptParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(FormulaScriptParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondition(FormulaScriptParser.LoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondition(FormulaScriptParser.LoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(FormulaScriptParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(FormulaScriptParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(FormulaScriptParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(FormulaScriptParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(FormulaScriptParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(FormulaScriptParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void enterLeftAssign(FormulaScriptParser.LeftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void exitLeftAssign(FormulaScriptParser.LeftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightAssign(FormulaScriptParser.RightAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightAssign(FormulaScriptParser.RightAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(FormulaScriptParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(FormulaScriptParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(FormulaScriptParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(FormulaScriptParser.FormulaExpressionBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(FormulaScriptParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(FormulaScriptParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(FormulaScriptParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(FormulaScriptParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FormulaScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FormulaScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void enterConditionArg(FormulaScriptParser.ConditionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#conditionArg}.
	 * @param ctx the parse tree
	 */
	void exitConditionArg(FormulaScriptParser.ConditionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(FormulaScriptParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(FormulaScriptParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(FormulaScriptParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(FormulaScriptParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(FormulaScriptParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(FormulaScriptParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(FormulaScriptParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(FormulaScriptParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(FormulaScriptParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(FormulaScriptParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FormulaScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FormulaScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(FormulaScriptParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(FormulaScriptParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(FormulaScriptParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(FormulaScriptParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(FormulaScriptParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(FormulaScriptParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(FormulaScriptParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(FormulaScriptParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FormulaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FormulaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(FormulaScriptParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(FormulaScriptParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FormulaScriptParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FormulaScriptParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(FormulaScriptParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(FormulaScriptParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(FormulaScriptParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(FormulaScriptParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(FormulaScriptParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(FormulaScriptParser.OperatorExpressionContext ctx);
}
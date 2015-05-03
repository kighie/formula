// Generated from FormulaScript.g4 by ANTLR 4.4
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
	import kr.simula.formula.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaScriptParser}.
 */
public interface FormulaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull FormulaScriptParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull FormulaScriptParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull FormulaScriptParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull FormulaScriptParser.ExponentialContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull FormulaScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull FormulaScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull FormulaScriptParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull FormulaScriptParser.MethodCallStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#protoExtention}.
	 * @param ctx the parse tree
	 */
	void enterProtoExtention(@NotNull FormulaScriptParser.ProtoExtentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#protoExtention}.
	 * @param ctx the parse tree
	 */
	void exitProtoExtention(@NotNull FormulaScriptParser.ProtoExtentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(@NotNull FormulaScriptParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(@NotNull FormulaScriptParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void enterBlockContents(@NotNull FormulaScriptParser.BlockContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void exitBlockContents(@NotNull FormulaScriptParser.BlockContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull FormulaScriptParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull FormulaScriptParser.ArrayRefContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull FormulaScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull FormulaScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull FormulaScriptParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull FormulaScriptParser.PercentContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull FormulaScriptParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull FormulaScriptParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#lambdaDecl}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDecl(@NotNull FormulaScriptParser.LambdaDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#lambdaDecl}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDecl(@NotNull FormulaScriptParser.LambdaDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(@NotNull FormulaScriptParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(@NotNull FormulaScriptParser.IterableTermContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull FormulaScriptParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull FormulaScriptParser.MapContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(@NotNull FormulaScriptParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(@NotNull FormulaScriptParser.LiteralTermContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondition(@NotNull FormulaScriptParser.LoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondition(@NotNull FormulaScriptParser.LoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#recordProto}.
	 * @param ctx the parse tree
	 */
	void enterRecordProto(@NotNull FormulaScriptParser.RecordProtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#recordProto}.
	 * @param ctx the parse tree
	 */
	void exitRecordProto(@NotNull FormulaScriptParser.RecordProtoContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightAssign(@NotNull FormulaScriptParser.RightAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightAssign(@NotNull FormulaScriptParser.RightAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(@NotNull FormulaScriptParser.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(@NotNull FormulaScriptParser.ParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull FormulaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull FormulaScriptParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetrunStmt(@NotNull FormulaScriptParser.RetrunStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetrunStmt(@NotNull FormulaScriptParser.RetrunStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void enterLeftAssign(@NotNull FormulaScriptParser.LeftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void exitLeftAssign(@NotNull FormulaScriptParser.LeftAssignContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void enterLambdaArg(@NotNull FormulaScriptParser.LambdaArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void exitLambdaArg(@NotNull FormulaScriptParser.LambdaArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#recordFieldValue}.
	 * @param ctx the parse tree
	 */
	void enterRecordFieldValue(@NotNull FormulaScriptParser.RecordFieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#recordFieldValue}.
	 * @param ctx the parse tree
	 */
	void exitRecordFieldValue(@NotNull FormulaScriptParser.RecordFieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(@NotNull FormulaScriptParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(@NotNull FormulaScriptParser.ForeachStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FormulaScriptParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgsDecl(@NotNull FormulaScriptParser.ArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgsDecl(@NotNull FormulaScriptParser.ArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(@NotNull FormulaScriptParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(@NotNull FormulaScriptParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(@NotNull FormulaScriptParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(@NotNull FormulaScriptParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(@NotNull FormulaScriptParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaScriptParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(@NotNull FormulaScriptParser.AssignStatementContext ctx);
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
}
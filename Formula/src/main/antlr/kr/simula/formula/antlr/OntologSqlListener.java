// Generated from OntologSql.g4 by ANTLR 4.4
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
 * {@link OntologSqlParser}.
 */
public interface OntologSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull OntologSqlParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull OntologSqlParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull OntologSqlParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull OntologSqlParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpression(@NotNull OntologSqlParser.FormulaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#formulaExpression}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpression(@NotNull OntologSqlParser.FormulaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull OntologSqlParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull OntologSqlParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull OntologSqlParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull OntologSqlParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull OntologSqlParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull OntologSqlParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#protoExtention}.
	 * @param ctx the parse tree
	 */
	void enterProtoExtention(@NotNull OntologSqlParser.ProtoExtentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#protoExtention}.
	 * @param ctx the parse tree
	 */
	void exitProtoExtention(@NotNull OntologSqlParser.ProtoExtentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(@NotNull OntologSqlParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(@NotNull OntologSqlParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void enterBlockContents(@NotNull OntologSqlParser.BlockContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void exitBlockContents(@NotNull OntologSqlParser.BlockContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(@NotNull OntologSqlParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(@NotNull OntologSqlParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull OntologSqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull OntologSqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull OntologSqlParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull OntologSqlParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(@NotNull OntologSqlParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(@NotNull OntologSqlParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull OntologSqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull OntologSqlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull OntologSqlParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull OntologSqlParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull OntologSqlParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull OntologSqlParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull OntologSqlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull OntologSqlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#lambdaDecl}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDecl(@NotNull OntologSqlParser.LambdaDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#lambdaDecl}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDecl(@NotNull OntologSqlParser.LambdaDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(@NotNull OntologSqlParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(@NotNull OntologSqlParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(@NotNull OntologSqlParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(@NotNull OntologSqlParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull OntologSqlParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull OntologSqlParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void enterFormulaExpressionBase(@NotNull OntologSqlParser.FormulaExpressionBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#formulaExpressionBase}.
	 * @param ctx the parse tree
	 */
	void exitFormulaExpressionBase(@NotNull OntologSqlParser.FormulaExpressionBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(@NotNull OntologSqlParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(@NotNull OntologSqlParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(@NotNull OntologSqlParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(@NotNull OntologSqlParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull OntologSqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull OntologSqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondition(@NotNull OntologSqlParser.LoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondition(@NotNull OntologSqlParser.LoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#recordProto}.
	 * @param ctx the parse tree
	 */
	void enterRecordProto(@NotNull OntologSqlParser.RecordProtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#recordProto}.
	 * @param ctx the parse tree
	 */
	void exitRecordProto(@NotNull OntologSqlParser.RecordProtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull OntologSqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull OntologSqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightAssign(@NotNull OntologSqlParser.RightAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightAssign(@NotNull OntologSqlParser.RightAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void enterParamDef(@NotNull OntologSqlParser.ParamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#paramDef}.
	 * @param ctx the parse tree
	 */
	void exitParamDef(@NotNull OntologSqlParser.ParamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull OntologSqlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull OntologSqlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(@NotNull OntologSqlParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(@NotNull OntologSqlParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetrunStmt(@NotNull OntologSqlParser.RetrunStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#retrunStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetrunStmt(@NotNull OntologSqlParser.RetrunStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void enterLeftAssign(@NotNull OntologSqlParser.LeftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void exitLeftAssign(@NotNull OntologSqlParser.LeftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull OntologSqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull OntologSqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void enterLambdaArg(@NotNull OntologSqlParser.LambdaArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#lambdaArg}.
	 * @param ctx the parse tree
	 */
	void exitLambdaArg(@NotNull OntologSqlParser.LambdaArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#recordFieldValue}.
	 * @param ctx the parse tree
	 */
	void enterRecordFieldValue(@NotNull OntologSqlParser.RecordFieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#recordFieldValue}.
	 * @param ctx the parse tree
	 */
	void exitRecordFieldValue(@NotNull OntologSqlParser.RecordFieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(@NotNull OntologSqlParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(@NotNull OntologSqlParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(@NotNull OntologSqlParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(@NotNull OntologSqlParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void enterFormulaScript(@NotNull OntologSqlParser.FormulaScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#formulaScript}.
	 * @param ctx the parse tree
	 */
	void exitFormulaScript(@NotNull OntologSqlParser.FormulaScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgsDecl(@NotNull OntologSqlParser.ArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgsDecl(@NotNull OntologSqlParser.ArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(@NotNull OntologSqlParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(@NotNull OntologSqlParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(@NotNull OntologSqlParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(@NotNull OntologSqlParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(@NotNull OntologSqlParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(@NotNull OntologSqlParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologSqlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull OntologSqlParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologSqlParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull OntologSqlParser.ArgumentsContext ctx);
}
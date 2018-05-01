// Generated from C:/Users/Peter/Desktop/aaup4/aaup4/Project-V2/src/com/company\aRay.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aRayParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aRayVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aRayParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(aRayParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(aRayParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixStandardDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDcl(aRayParser.MatrixDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixDclWithNamePara}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#matrixScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixScope(aRayParser.MatrixScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#awaitScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitScope(aRayParser.AwaitScopeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDcl}
	 * labeled alternative in {@link aRayParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDcl(aRayParser.FunctionDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardDcl}
	 * labeled alternative in {@link aRayParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardDcl(aRayParser.StandardDclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDcl}
	 * labeled alternative in {@link aRayParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDcl(aRayParser.BoolDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(aRayParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dcl}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(aRayParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDAssignExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDAssignExp(aRayParser.IDAssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(aRayParser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNum}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNum(aRayParser.ExpNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(aRayParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpThis(aRayParser.ExpThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOperator}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOperator(aRayParser.ExpOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParenthesis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParenthesis(aRayParser.ExpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDotPro}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDotPro(aRayParser.ExpDotProContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpInvocation}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInvocation(aRayParser.ExpInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogOnlyExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOnlyExp(aRayParser.LogOnlyExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogExpExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogExpExp(aRayParser.LogExpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogExpCondit}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogExpCondit(aRayParser.LogExpConditContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogExpParenthesis}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(aRayParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(aRayParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(aRayParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link aRayParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(aRayParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(aRayParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link aRayParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(aRayParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link aRayParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(aRayParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(aRayParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link aRayParser#defaultBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBody(aRayParser.DefaultBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForIte}
	 * labeled alternative in {@link aRayParser#forIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIte(aRayParser.ForIteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileIte}
	 * labeled alternative in {@link aRayParser#whileIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileIte(aRayParser.WhileIteContext ctx);
}
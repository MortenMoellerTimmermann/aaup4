// Generated from D:/JavaProjects/Project-V2/src/com/company\BETS.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BETSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BETSVisitor<T> extends ParseTreeVisitor<T> {


	/**
	 * Visit a parse tree produced by {@link BETSParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(BETSParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(BETSParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(BETSParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixDeclaration(BETSParser.MatrixDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#matrixScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixScope(BETSParser.MatrixScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#matrixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixExpression(BETSParser.MatrixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#awaitScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitScope(BETSParser.AwaitScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(BETSParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BETSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(BETSParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BETSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(BETSParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BETSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(BETSParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(BETSParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(BETSParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(BETSParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BETSParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(BETSParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(BETSParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(BETSParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(BETSParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#defaultBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBody(BETSParser.DefaultBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#forIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIteration(BETSParser.ForIterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BETSParser#whileIteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileIteration(BETSParser.WhileIterationContext ctx);
}
// Generated from D:/JavaProjects/Project-V2/src/com/company\BETS.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BETSParser}.
 */
public interface BETSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BETSParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(BETSParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(BETSParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(BETSParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(BETSParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(BETSParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(BETSParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(BETSParser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(BETSParser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#matrixScope}.
	 * @param ctx the parse tree
	 */
	void enterMatrixScope(BETSParser.MatrixScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#matrixScope}.
	 * @param ctx the parse tree
	 */
	void exitMatrixScope(BETSParser.MatrixScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatrixExpression(BETSParser.MatrixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#matrixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatrixExpression(BETSParser.MatrixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#awaitScope}.
	 * @param ctx the parse tree
	 */
	void enterAwaitScope(BETSParser.AwaitScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#awaitScope}.
	 * @param ctx the parse tree
	 */
	void exitAwaitScope(BETSParser.AwaitScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(BETSParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(BETSParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BETSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BETSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(BETSParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(BETSParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BETSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BETSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(BETSParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(BETSParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BETSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BETSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(BETSParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(BETSParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(BETSParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(BETSParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(BETSParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(BETSParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(BETSParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(BETSParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BETSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BETSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(BETSParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(BETSParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(BETSParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(BETSParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(BETSParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(BETSParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(BETSParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(BETSParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#defaultBody}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBody(BETSParser.DefaultBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#defaultBody}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBody(BETSParser.DefaultBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#forIteration}.
	 * @param ctx the parse tree
	 */
	void enterForIteration(BETSParser.ForIterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#forIteration}.
	 * @param ctx the parse tree
	 */
	void exitForIteration(BETSParser.ForIterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BETSParser#whileIteration}.
	 * @param ctx the parse tree
	 */
	void enterWhileIteration(BETSParser.WhileIterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BETSParser#whileIteration}.
	 * @param ctx the parse tree
	 */
	void exitWhileIteration(BETSParser.WhileIterationContext ctx);
}
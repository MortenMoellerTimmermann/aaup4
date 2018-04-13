// Generated from C:/Users/Peter/Desktop/aaup4/aaup4/Project-V2/src/com/company\aRay.g4 by ANTLR 4.7
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aRayParser}.
 */
public interface aRayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aRayParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(aRayParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(aRayParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(aRayParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(aRayParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixStandardDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixStandardDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDcl(aRayParser.MatrixDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixDcl}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDcl(aRayParser.MatrixDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixDclWithNamePara}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixDclWithNamePara}
	 * labeled alternative in {@link aRayParser#matrixDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#matrixScope}.
	 * @param ctx the parse tree
	 */
	void enterMatrixScope(aRayParser.MatrixScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#matrixScope}.
	 * @param ctx the parse tree
	 */
	void exitMatrixScope(aRayParser.MatrixScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#awaitScope}.
	 * @param ctx the parse tree
	 */
	void enterAwaitScope(aRayParser.AwaitScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#awaitScope}.
	 * @param ctx the parse tree
	 */
	void exitAwaitScope(aRayParser.AwaitScopeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDcl}
	 * labeled alternative in {@link aRayParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDcl(aRayParser.FunctionDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDcl}
	 * labeled alternative in {@link aRayParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDcl(aRayParser.FunctionDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardDcl}
	 * labeled alternative in {@link aRayParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStandardDcl(aRayParser.StandardDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardDcl}
	 * labeled alternative in {@link aRayParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStandardDcl(aRayParser.StandardDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(aRayParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(aRayParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dcl}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDcl(aRayParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dcl}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDcl(aRayParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDAssignExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIDAssignExp(aRayParser.IDAssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDAssignExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIDAssignExp(aRayParser.IDAssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(aRayParser.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link aRayParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(aRayParser.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNum}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNum(aRayParser.ExpNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNum}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNum(aRayParser.ExpNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpId(aRayParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpId(aRayParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpThis(aRayParser.ExpThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpThis(aRayParser.ExpThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOperator}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpOperator(aRayParser.ExpOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOperator}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpOperator(aRayParser.ExpOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParenthesis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParenthesis(aRayParser.ExpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParenthesis}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParenthesis(aRayParser.ExpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDotPro}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpDotPro(aRayParser.ExpDotProContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDotPro}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpDotPro(aRayParser.ExpDotProContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpInvocation}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpInvocation(aRayParser.ExpInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpInvocation}
	 * labeled alternative in {@link aRayParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpInvocation(aRayParser.ExpInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogOnlyExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogOnlyExp(aRayParser.LogOnlyExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogOnlyExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogOnlyExp(aRayParser.LogOnlyExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogExpExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogExpExp(aRayParser.LogExpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogExpExp}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogExpExp(aRayParser.LogExpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogExpCondit}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogExpCondit(aRayParser.LogExpConditContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogExpCondit}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogExpCondit(aRayParser.LogExpConditContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogExpParenthesis}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogExpParenthesis}
	 * labeled alternative in {@link aRayParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(aRayParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(aRayParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(aRayParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(aRayParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(aRayParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(aRayParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link aRayParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(aRayParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link aRayParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(aRayParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(aRayParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(aRayParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link aRayParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(aRayParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link aRayParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(aRayParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link aRayParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(aRayParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link aRayParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(aRayParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(aRayParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(aRayParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link aRayParser#defaultBody}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBody(aRayParser.DefaultBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aRayParser#defaultBody}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBody(aRayParser.DefaultBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForIte}
	 * labeled alternative in {@link aRayParser#forIteration}.
	 * @param ctx the parse tree
	 */
	void enterForIte(aRayParser.ForIteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForIte}
	 * labeled alternative in {@link aRayParser#forIteration}.
	 * @param ctx the parse tree
	 */
	void exitForIte(aRayParser.ForIteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileIte}
	 * labeled alternative in {@link aRayParser#whileIteration}.
	 * @param ctx the parse tree
	 */
	void enterWhileIte(aRayParser.WhileIteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileIte}
	 * labeled alternative in {@link aRayParser#whileIteration}.
	 * @param ctx the parse tree
	 */
	void exitWhileIte(aRayParser.WhileIteContext ctx);
}
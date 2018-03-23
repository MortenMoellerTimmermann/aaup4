package com.company.Visitor;

import com.company.ASTnodes.AST;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;


public class ParsetreeVisitor extends aRayBaseVisitor<AST> {


    @Override
    public AST visitGlobal(aRayParser.GlobalContext ctx) {
        System.out.println("Getting started");
        return null;
    }

    @Override
    public AST visitBody(aRayParser.BodyContext ctx) {
        return null;
    }

    @Override
    public AST visitFunctionBody(aRayParser.FunctionBodyContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixDcl(aRayParser.MatrixDclContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixScope(aRayParser.MatrixScopeContext ctx) {
        return null;
    }

    @Override
    public AST visitAwaitScope(aRayParser.AwaitScopeContext ctx) {
        return null;
    }

    @Override
    public AST visitFunctionDcl(aRayParser.FunctionDclContext ctx) {
        return null;
    }

    @Override
    public AST visitStandardDcl(aRayParser.StandardDclContext ctx) {
        return null;
    }

    @Override
    public AST visitParameter(aRayParser.ParameterContext ctx) {
        return null;
    }

    @Override
    public AST visitDcl(aRayParser.DclContext ctx) {
        return null;
    }

    @Override
    public AST visitIDAssignExp(aRayParser.IDAssignExpContext ctx) {
        return null;
    }

    @Override
    public AST visitReturnExp(aRayParser.ReturnExpContext ctx) {
        return null;
    }

    @Override
    public AST visitExpInvocation(aRayParser.ExpInvocationContext ctx) {
        return null;
    }

    @Override
    public AST visitExpNum(aRayParser.ExpNumContext ctx) {
        return null;
    }

    @Override
    public AST visitExpId(aRayParser.ExpIdContext ctx) {
        return null;
    }

    @Override
    public AST visitExpThis(aRayParser.ExpThisContext ctx) {
        return null;
    }

    @Override
    public AST visitExpOperator(aRayParser.ExpOperatorContext ctx) {
        return null;
    }

    @Override
    public AST visitExpParenthesis(aRayParser.ExpParenthesisContext ctx) {
        return null;
    }

    @Override
    public AST visitExpDotPro(aRayParser.ExpDotProContext ctx) {
        return null;
    }

    @Override
    public AST visitLogExpExp(aRayParser.LogExpExpContext ctx) {
        return null;
    }

    @Override
    public AST visitLogExpCondit(aRayParser.LogExpConditContext ctx) {
        return null;
    }

    @Override
    public AST visitLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx) {
        return null;
    }

    @Override
    public AST visitInvocation(aRayParser.InvocationContext ctx) {
        return null;
    }

    @Override
    public AST visitSelection(aRayParser.SelectionContext ctx) {
        return null;
    }

    @Override
    public AST visitIteration(aRayParser.IterationContext ctx) {
        return null;
    }

    @Override
    public AST visitIfStmt(aRayParser.IfStmtContext ctx) {
        return null;
    }

    @Override
    public AST visitElseIfStatement(aRayParser.ElseIfStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitElseStmt(aRayParser.ElseStmtContext ctx) {
        return null;
    }

    @Override
    public AST visitSwitchStmt(aRayParser.SwitchStmtContext ctx) {
        return null;
    }

    @Override
    public AST visitCaseBody(aRayParser.CaseBodyContext ctx) {
        return null;
    }

    @Override
    public AST visitDefaultBody(aRayParser.DefaultBodyContext ctx) {
        return null;
    }

    @Override
    public AST visitForIte(aRayParser.ForIteContext ctx) {
        return null;
    }

    @Override
    public AST visitWhileIte(aRayParser.WhileIteContext ctx) {
        return null;
    }
}


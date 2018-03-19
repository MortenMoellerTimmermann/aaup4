package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.BETSBaseVisitor;
import com.company.BETSParser;

public class ASTVisitor extends BETSBaseVisitor<AST> implements ASTVisitorInterface<AST> {

    /*

        FIRST VISITMETHODS TO VISIT THE CST NODES!

     */
    @Override
    public AST visitGlobal(BETSParser.GlobalContext ctx) {
        AST ast = visitChildren(ctx);

        System.out.println("The Text: " + ctx.getText());
        System.out.println("The String: " + ctx.toString());
        System.out.println("The RuleIndex: " + ctx.getRuleIndex());
        System.out.println("The Start: " + ctx.start);
        System.out.println("The Stop: " + ctx.stop);
        System.out.println("The ChildCount: " + ctx.getChildCount());
        System.out.println("The ChildrenSize: " + ctx.children.size());


        return ast;
    }

    @Override
    public AST visitBody(BETSParser.BodyContext ctx) {
        AST ast = visitChildren(ctx);
        return ast;
    }

    @Override
    public AST visitFunctionBody(BETSParser.FunctionBodyContext ctx) {
            return null;

    }

    @Override
    public AST visitMatrixDeclaration(BETSParser.MatrixDeclarationContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixScope(BETSParser.MatrixScopeContext ctx) {
        return null;
    }

    @Override
    public AST visitMatrixExpression(BETSParser.MatrixExpressionContext ctx) {
        return null;
    }

    @Override
    public AST visitAwaitScope(BETSParser.AwaitScopeContext ctx) {
        return null;
    }

    @Override
    public AST visitFunctionDeclaration(BETSParser.FunctionDeclarationContext ctx) {
        return null;
    }

    @Override
    public AST visitDeclaration(BETSParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public AST visitParameter(BETSParser.ParameterContext ctx) {
        return null;
    }

    @Override
    public AST visitStatement(BETSParser.StatementContext ctx) {
        return null;
    }

    @Override
    public AST visitFunctionStatement(BETSParser.FunctionStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitExpression(BETSParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public AST visitLogicalExpression(BETSParser.LogicalExpressionContext ctx) {
        return null;
    }

    @Override
    public AST visitInvocation(BETSParser.InvocationContext ctx) {
        return null;
    }

    @Override
    public AST visitSelection(BETSParser.SelectionContext ctx) {
        return null;
    }

    @Override
    public AST visitIteration(BETSParser.IterationContext ctx) {
        return null;
    }

    @Override
    public AST visitIfStatement(BETSParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitElseIfStatement(BETSParser.ElseIfStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitElseStatement(BETSParser.ElseStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitSwitchStatement(BETSParser.SwitchStatementContext ctx) {
        return null;
    }

    @Override
    public AST visitCaseBody(BETSParser.CaseBodyContext ctx) {
        return null;
    }

    @Override
    public AST visitDefaultBody(BETSParser.DefaultBodyContext ctx) {
        return null;
    }

    @Override
    public AST visitForIteration(BETSParser.ForIterationContext ctx) {
        return null;
    }

    @Override
    public AST visitWhileIteration(BETSParser.WhileIterationContext ctx) {
        return null;
    }








    /*

            HERE STARTS THE VIST METHODS TO VISIST NODES


     */


    @Override
    public AST Visit(AdditionNode node) {
        return null;
    }

    @Override
    public AST Visit(AndNode node) {
        return null;
    }

    @Override
    public AST Visit(AssignmentNode node) {
        return null;
    }

    @Override
    public AST Visit(DotProductNode node) {
        return null;
    }

    @Override
    public AST Visit(EqualNode node) {
        return null;
    }

    @Override
    public AST Visit(ForNode node) {
        return null;
    }

    @Override
    public AST Visit(FunctioDefinitionNode node) {
        return null;
    }

    @Override
    public AST Visit(FunctionCallNode node) {
        return null;
    }

    @Override
    public AST Visit(GreaterThanNode node) {
        return null;
    }

    @Override
    public AST Visit(IfNode node) {
        return null;
    }

    @Override
    public AST Visit(IfElseNode node) {
        return null;
    }

    @Override
    public AST Visit(LessThanNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixAddtionNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixCrossProductNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixDeterminatNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixInverseNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixMultiplicationNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixRREFNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixSubtractionNode node) {
        return null;
    }

    @Override
    public AST Visit(MatrixTraceNode node) {
        return null;
    }

    @Override
    public AST Visit(NotNode node) {
        return null;
    }

    @Override
    public AST Visit(OrNode node) {
        return null;
    }

    @Override
    public AST Visit(ScalarMultiplicationNode node) {
        return null;
    }

    @Override
    public AST Visit(SubtractionNode node) {
        return null;
    }

    @Override
    public AST Visit(SwitchNode node) {
        return null;
    }

    @Override
    public AST Visit(VariableDeclarationNode node) {
        return null;
    }

    @Override
    public AST Visit(WhileNode node) {
        return null;
    }


}

package com.company.Visitor;
import com.company.ASTnodes.*;

public interface ASTVisitorInterface<T> {
    T Visit(AdditionNode node);
    T Visit(AndNode node);
    T Visit(AssignmentNode node);
    T Visit(DotProductNode node);
    T Visit(EqualNode node);
    T Visit(ForNode node);
    T Visit(FunctioDefinitionNode node);
    T Visit(FunctionCallNode node);
    T Visit(GreaterThanNode node);
    T Visit(IfNode node);
    T Visit(IfElseNode node);
    T Visit(LessThanNode node);
    T Visit(MatrixAddtionNode node);
    T Visit(MatrixCrossProductNode node);
    T Visit(MatrixDeterminatNode node);
    T Visit(MatrixInverseNode node);
    T Visit(MatrixMultiplicationNode node);
    T Visit(MatrixRREFNode node);
    T Visit(MatrixSubtractionNode node);
    T Visit(MatrixTraceNode node);
    T Visit(NotNode node);
    T Visit(OrNode node);
    T Visit(ScalarMultiplicationNode node);
    T Visit(SubtractionNode node);
    T Visit(SwitchNode node);
    T Visit(VariableDeclarationNode node);
    T Visit(WhileNode node);

}

package com.company.Visitor;
import com.company.ASTnodes.*;


public interface ASTVisitorInterface {

    void Visit(AST root);


    void Visit(AndNode node);

    void Visit(AssignmentNode node);

    void Visit(CaseNode node);

    void Visit(DeclareMatrixNode node);

    void Visit(DivisionNode node);

    void Visit(ElseIfNode node);

    void Visit(ElseNode node);

    void Visit(EqualNode node);

    void Visit(ForNode node);

    void Visit(FunctioDefinitionNode node);

    void Visit(FunctionCallNode node);

    void Visit(GreaterOrEqualNode node);

    void Visit(GreaterThanNode node);

    void Visit(IfNode node);

    void Visit(LessOrEqualNode node);

    void Visit(LessThanNode node);

    void Visit(MatrixCrossProductNode node);

    void Visit(MatrixScopeNode node);

    void Visit(MinusNode node);

    void Visit(ModuloNode node);

    void Visit(MultiplicationNode node);

    void Visit(NotEqualNode node);

    void Visit(NotNode node);

    void Visit(OrNode node);

    void Visit(ParametersNode node);

    void Visit(ParenthesisExpressionNode node);

    void Visit(ParenthesisLogicalNode node);

    void Visit(PlusNode node);

    void Visit(ReturnNode node);

    void Visit(SimpleExpressionNode node);


    void Visit(SwitchNode node);

    void Visit(VariableDeclarationNode node);

    void Visit(WhileNode node);

}

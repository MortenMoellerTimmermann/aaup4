package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor implements ASTVisitorInterface {
    public int errorCount = 0;
    public List<AST> NodesWithErrors = new ArrayList<AST>();

    @Override
    public void Visit(AST root){
        for (AST child : root.NestedNodes)
        {
            if (child != null)
                child.Accept(this);
        }
    }

    @Override
    public void Visit(AdditionNode node) {
        System.out.println(node.getClass().getSimpleName());
        //String leftNameOrNumber = node.getLeftOperand();

        System.out.println("YEAH BOY");
      // try {
      //     Float x = Float.p
      // }
      // if ()
      // switch (){
      //     case("this"):
      //         //needs to check if this is in a valid scope that allows for "this keyword"
      //         break;
      //     case ():
      // }
    }

    @Override
    public void Visit(AndNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(AssignmentNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(CaseNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(DeclareMatrixNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(DivisionNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ElseIfNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ElseNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(EqualNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ForNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(FunctioDefinitionNode node) {
        System.out.println(node.getClass().getSimpleName());
        System.out.println(node.NestedNodes.size());
        AST bodynode= node.NestedNodes.get(0);
                bodynode.Accept(this);
    }

    @Override
    public void Visit(FunctionCallNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(GreaterOrEqualNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(GreaterThanNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(IfNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(LessOrEqualNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(LessThanNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(MatrixCrossProductNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(MatrixScopeNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(MinusNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ModuloNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(MultiplicationNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(NotEqualNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(NotNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(OrNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ParametersNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ParenthesisExpressionNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ParenthesisLogicalNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(PlusNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(ReturnNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(SimpleExpressionNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(SubtractionNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(SwitchNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(VariableDeclarationNode node) {
        System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(WhileNode node) {
        System.out.println(node.getClass().getSimpleName());
    }
}
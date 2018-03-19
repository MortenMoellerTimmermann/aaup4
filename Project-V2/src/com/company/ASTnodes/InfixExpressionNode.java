package com.company.ASTnodes;

public abstract class InfixExpressionNode extends ExpressionNode {
    Node LeftNode;
    Node RigtNode;
    public InfixExpressionNode(Node Left, Node Right){
        this.LeftNode = Left;
        this.RigtNode = Right;
    }

    public InfixExpressionNode(){

    }
}

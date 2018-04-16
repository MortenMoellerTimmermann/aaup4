package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class InfixExpressionNode extends ExpressionNode {
    Node LeftNode;
    Node RigtNode;
    public InfixExpressionNode(Node Left, Node Right){
        this.LeftNode = Left;
        this.RigtNode = Right;
    }

    public InfixExpressionNode(){

    }
    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class AdditionNode extends InfixExpressionNode{
    //dpuble dispatch

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

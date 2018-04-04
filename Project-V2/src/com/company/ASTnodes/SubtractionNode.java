package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class SubtractionNode extends InfixExpressionNode implements INode{

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

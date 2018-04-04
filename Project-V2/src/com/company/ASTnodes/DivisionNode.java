package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class DivisionNode extends ExpressionNode implements INode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

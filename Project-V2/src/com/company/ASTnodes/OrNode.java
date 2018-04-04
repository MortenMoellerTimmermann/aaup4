package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class OrNode extends LogicalNode implements INode{

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

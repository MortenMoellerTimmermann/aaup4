package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class NotEqualNode extends LogicalNode implements INode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

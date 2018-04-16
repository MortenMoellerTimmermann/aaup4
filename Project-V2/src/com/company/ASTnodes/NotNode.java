package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class NotNode extends LogicalNode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

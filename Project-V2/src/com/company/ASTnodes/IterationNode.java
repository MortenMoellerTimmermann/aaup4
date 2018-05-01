package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class IterationNode extends ControlNode {


    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

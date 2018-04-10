package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class IterationNode extends ControlNode {
    public Node Predicate;

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

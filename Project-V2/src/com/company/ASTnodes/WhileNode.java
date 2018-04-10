package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class WhileNode extends IterationNode{

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

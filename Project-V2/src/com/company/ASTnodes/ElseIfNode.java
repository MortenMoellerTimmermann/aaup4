package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ElseIfNode extends ControlNode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

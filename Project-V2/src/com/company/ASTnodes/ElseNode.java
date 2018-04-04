package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ElseNode extends ControlNode implements INode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

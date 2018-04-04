package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class Node extends AST implements INode{

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

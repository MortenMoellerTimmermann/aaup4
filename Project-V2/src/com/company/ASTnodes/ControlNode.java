package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class ControlNode extends Node {
    private AST Predicate;

    private AST bodyNode;


    public AST getPredicate() {
        return Predicate;
    }

    public void setPredicate(AST predicate) {
        Predicate = predicate;
    }

    public AST getBodyNode() {
        return bodyNode;
    }

    public void setBodyNode(AST bodyNode) {
        this.bodyNode = bodyNode;
    }


    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

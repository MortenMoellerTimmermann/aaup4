package com.company.ASTnodes;

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
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class MatrixScopeNode extends Node {
    private String ScopeName;
    private boolean await = false;

    private MatrixScopeNode parentScope;

    private AST bodyNode;

    public AST getBodyNode() {
        return bodyNode;
    }

    public void setBodyNode(AST bodyNode) {
        this.bodyNode = bodyNode;
    }

    public String getScopeName() {
        return ScopeName;
    }

    public void setScopeName(String scopeName) {
        ScopeName = scopeName;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

    public boolean isAwait() {
        return await;
    }

    public void setAwait(boolean await) {
        this.await = await;
    }

    public MatrixScopeNode getParentScope() {
        return parentScope;
    }

    public void setParentScope(MatrixScopeNode parentScope) {
        this.parentScope = parentScope;
    }
}

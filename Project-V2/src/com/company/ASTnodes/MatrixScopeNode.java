package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class MatrixScopeNode extends Node implements INode {
    private String ScopeName;

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
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class MatrixScopeNode extends Node {
    private String ScopeName;
    private boolean await = false;

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
}

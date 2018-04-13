package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ReturnNode extends Node {
    private AST returnValueNode;

    private String expectedReturnType;


    public AST getReturnValueNode() {
        return returnValueNode;
    }

    public void setReturnValueNode(AST returnValueNode) {
        this.returnValueNode = returnValueNode;
    }

    public String getExpectedReturnType() {
        return expectedReturnType;
    }

    public void setExpectedReturnType(String expectedReturnType) {
        this.expectedReturnType = expectedReturnType;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ReturnNode extends ExpressionNode {
    private AST returnValueNode;

    public AST getReturnValueNode() {
        return returnValueNode;
    }

    public void setReturnValueNode(AST returnValueNode) {
        this.returnValueNode = returnValueNode;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

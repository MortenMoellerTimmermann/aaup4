package com.company.ASTnodes;

public class ReturnNode extends ExpressionNode {
    private AST returnValueNode;

    public AST getReturnValueNode() {
        return returnValueNode;
    }

    public void setReturnValueNode(AST returnValueNode) {
        this.returnValueNode = returnValueNode;
    }
}

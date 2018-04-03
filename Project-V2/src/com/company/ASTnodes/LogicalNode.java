package com.company.ASTnodes;

public abstract class LogicalNode extends InfixExpressionNode {
    private AST LeftOperandNode;


    public AST getLeftOperandNode() {
        return LeftOperandNode;
    }

    public void setLeftOperandNode(AST leftOperand) {
        LeftOperandNode = leftOperand;
    }
}

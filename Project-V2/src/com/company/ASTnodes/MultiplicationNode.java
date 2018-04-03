package com.company.ASTnodes;

public class MultiplicationNode extends ExpressionNode {
    private String leftOperand;
    private AST rightOperandNode;

    public String getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    public AST getRightOperandNode() {
        return rightOperandNode;
    }

    public void setRightOperandNode(AST rightOperandNode) {
        this.rightOperandNode = rightOperandNode;
    }
}

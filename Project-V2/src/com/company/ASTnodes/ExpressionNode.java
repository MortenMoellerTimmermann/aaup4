package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class ExpressionNode extends Node {
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

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

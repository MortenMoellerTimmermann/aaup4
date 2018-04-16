package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public abstract class LogicalNode extends InfixExpressionNode {
    private AST LeftOperandNode;


    public AST getLeftOperandNode() {
        return LeftOperandNode;
    }

    public void setLeftOperandNode(AST leftOperand) {
        LeftOperandNode = leftOperand;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

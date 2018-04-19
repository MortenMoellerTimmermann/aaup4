package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class SimpleExpressionNode extends ExpressionNode{
    private float number;
    private String variableName;


    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

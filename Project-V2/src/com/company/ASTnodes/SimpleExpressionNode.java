package com.company.ASTnodes;

public class SimpleExpressionNode extends Node {
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
}

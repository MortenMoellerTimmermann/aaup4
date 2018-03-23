package com.company.ASTnodes;

public class VariableDeclarationNode extends Node {
    protected String varName;
   private Float Value;

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public Float getValue() {
        return Value;
    }

    public void setValue(Float value) {
        Value = value;
    }
}

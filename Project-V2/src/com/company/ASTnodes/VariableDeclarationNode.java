package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class VariableDeclarationNode extends Node implements INode {
    protected String varName;

    private String typeAsString;
   // private Float Value; //this property might not be needed.
    private AST valueNode;

    public AST getValueNode() {
        return valueNode;
    }

    public void setValueNode(AST valueNode) {
        this.valueNode = valueNode;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getTypeAsString() {
        return typeAsString;
    }

    public void setTypeAsString(String typeAsString) {
        this.typeAsString = typeAsString;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

    // public Float getValue() {
   //     return Value;
   // }
//
   // public void setValue(Float value) {
   //     Value = value;
   // }
}

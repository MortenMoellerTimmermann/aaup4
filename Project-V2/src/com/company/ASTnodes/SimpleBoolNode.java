package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class SimpleBoolNode extends LogicalNode {
    private boolean value;
    private String varName;
    private AST valueNode;



    @Override
    public void Accept(ASTVisitorInterface visitor){
        visitor.Visit(this);
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public AST getValueNode() {
        return valueNode;
    }

    public void setValueNode(AST valueNode) {
        this.valueNode = valueNode;
    }
}

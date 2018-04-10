package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class AssignmentNode extends InfixExpressionNode{
    private String varName;
    private AST newValueNode;
    private String assignOperetorAsString;


    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public AST getNewValueNode() {
        return newValueNode;
    }

    public void setNewValueNode(AST newValueNode) {
        this.newValueNode = newValueNode;
    }

    public String getAssignOperetorAsString() {
        return assignOperetorAsString;
    }

    public void setAssignOperetorAsString(String assignOperetorAsString) {
        this.assignOperetorAsString = assignOperetorAsString;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

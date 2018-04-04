package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.List;

public class FunctioDefinitionNode extends Node implements INode{
    private String functionName;
    private String ReturnTypeName;

    private AST ParmaterNode;


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public AST getParmaterNode() {
        return ParmaterNode;
    }

    public void setParmaterNode(AST parmaterNode) {
        ParmaterNode = parmaterNode;
    }

    public String getReturnTypeName() {
        return ReturnTypeName;
    }

    public void setReturnTypeName(String returnTypeName) {
        ReturnTypeName = returnTypeName;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

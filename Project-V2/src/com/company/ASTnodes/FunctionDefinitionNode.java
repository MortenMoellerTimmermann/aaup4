package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.List;

public class FunctionDefinitionNode extends Node {
    private String functionName;
    private String ReturnTypeName;

    private AST ParameterNode;

    private AST bodyNode;

    public AST getBodyNode()
    {
        return bodyNode;
    }

    public void setBodyNode(AST bodyNode) {
        this.bodyNode = bodyNode;
    }


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public AST getParameterNode() {
        return ParameterNode;
    }

    public void setParameterNode(AST parameterNode) {
        ParameterNode = parameterNode;
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

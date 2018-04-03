package com.company.ASTnodes;

import java.util.List;

public class FunctioDefinitionNode extends Node {
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
}

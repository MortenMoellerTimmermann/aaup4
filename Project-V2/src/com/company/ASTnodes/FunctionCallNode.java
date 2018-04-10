package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends Node {
    private String LeftSideVarName;
    private String AssignOperatorAsString;

    private String FunctionId;

    public List<AST> ParamValueNodes = new ArrayList<AST>();

    public String getAssignOperatorAsString() {
        return AssignOperatorAsString;
    }

    public void setAssignOperatorAsString(String assignOperatorAsString) {
        AssignOperatorAsString = assignOperatorAsString;
    }

    public String getLeftSideVarName() {
        return LeftSideVarName;
    }

    public void setLeftSideVarName(String leftSideVarName) {
        LeftSideVarName = leftSideVarName;
    }


    public String getFunctionId() {
        return FunctionId;
    }

    public void setFunctionId(String functionId) {
        FunctionId = functionId;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.ArrayList;
import java.util.List;

public class ParametersNode extends Node implements INode{
    //parameter : (paramTypes+=(TYPE | EXTENDEDTYPE) paramNamesInOrder+=ID COMMA)* (lastParamType=(TYPE | EXTENDEDTYPE) lastParamName=ID)? ;

    public List<String> ParameterNames = new ArrayList<String>();
    public List<String> ParameterTypes = new ArrayList<String>();

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

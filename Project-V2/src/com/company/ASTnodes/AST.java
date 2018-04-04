package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AST  implements INode{
    public List<AST> NestedNodes = new ArrayList<AST>();

    private Type childType;

    public Type getChildType() {
        return childType;
    }

    public void setChildType(Type childType) {
        this.childType = childType;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;
import java.util.*;

public class AwaitScopeNode extends Node {

    private AST bodyNode;
    public List<String> scopes = new ArrayList<String>();

    public void setBodyNode(AST bodyNode) {
        this.bodyNode = bodyNode;
    }

    public AST getBodyNode() {
        return bodyNode;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

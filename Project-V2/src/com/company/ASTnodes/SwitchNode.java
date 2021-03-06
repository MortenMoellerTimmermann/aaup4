package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.ArrayList;
import java.util.List;

public class SwitchNode extends ControlNode{
    public List<AST> CaseNodes = new ArrayList<AST>();

    private AST defaultNode;

    private AST defaultBody;

    public void setDefaultBody(AST _defaultBody)
    {
        this.defaultBody = _defaultBody;
    }

    public AST getDefaultBody()
    {
        return this.defaultBody;
    }

    public AST getDefaultNode() {
        return defaultNode;
    }

    public void setDefaultNode(AST defaultNode) {
        this.defaultNode = defaultNode;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends ControlNode {
    public List<AST> ElseIfNodes = new ArrayList<AST>();

    private AST optionalElse;

    public AST getOptionalElse() {
        return optionalElse;
    }

    public void setOptionalElse(AST optionalElse) {
        this.optionalElse = optionalElse;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

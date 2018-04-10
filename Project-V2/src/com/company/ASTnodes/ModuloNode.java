package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ModuloNode extends ExpressionNode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

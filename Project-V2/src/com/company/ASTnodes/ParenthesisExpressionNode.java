package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class ParenthesisExpressionNode extends ExpressionNode {

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

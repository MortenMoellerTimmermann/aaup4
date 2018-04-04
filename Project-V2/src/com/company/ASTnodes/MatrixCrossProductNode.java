package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class MatrixCrossProductNode extends InfixExpressionNode  implements INode{

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public interface INode {
    void Accept(ASTVisitorInterface visitor);
}

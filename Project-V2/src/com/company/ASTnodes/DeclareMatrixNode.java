package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.*;

public class DeclareMatrixNode extends VariableDeclarationNode  implements INode{

    private Integer rows;
    private Integer Collums;
    public List<Float> values = new ArrayList<Float>();

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;

    }

    public Integer getCollums() {
        return Collums;
    }

    public void setCollums(Integer collums) {
        Collums = collums;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

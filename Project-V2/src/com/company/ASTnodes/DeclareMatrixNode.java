package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.*;

public class DeclareMatrixNode extends VariableDeclarationNode {

    private Integer rows;
    private Integer Columns;
    public List<Float> values = new ArrayList<Float>();

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;

    }

    public Integer getColumns() {
        return Columns;
    }

    public void setColumns(Integer columns) {
        Columns = columns;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

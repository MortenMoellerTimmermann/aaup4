package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.util.*;

public class DeclareMatrixNode extends VariableDeclarationNode {

    private Integer rows;
    private Integer Columns;
    public List<Float> values = new ArrayList<Float>();
    private AST ValueNode;

    private boolean random;

    private String randomRangeFrom;
    private String randomRangeTo;

    public void setRandomRangeFrom(String randomRangeFrom) {
        this.randomRangeFrom = randomRangeFrom;
    }

    public void setRandomRangeTo(String randomRangeTo) {
        this.randomRangeTo = randomRangeTo;
    }

    public String getRandomRangeFrom() {
        return randomRangeFrom;
    }

    public String getRandomRangeTo() {
        return randomRangeTo;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;

    }

    public void setRandom(boolean random) {
        this.random = random;
    }

    public boolean isRandom() {
        return random;
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

    @Override
    public AST getValueNode() {
        return ValueNode;
    }

    @Override
    public void setValueNode(AST valueNode) {
        ValueNode = valueNode;
    }
}

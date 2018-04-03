package com.company.ASTnodes;

import java.util.*;

public class DeclareMatrixNode extends VariableDeclarationNode {

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


}

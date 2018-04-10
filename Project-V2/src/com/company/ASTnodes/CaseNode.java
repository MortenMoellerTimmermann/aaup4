package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class CaseNode extends ControlNode {
    private float numberToEval;

    public float getNumberToEval() {
        return numberToEval;
    }

    public void setNumberToEval(float numberToEval) {
        this.numberToEval = numberToEval;
    }


    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }
}

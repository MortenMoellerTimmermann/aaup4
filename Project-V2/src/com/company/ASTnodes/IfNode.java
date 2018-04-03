package com.company.ASTnodes;

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
}

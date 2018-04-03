package com.company.ASTnodes;

import java.util.ArrayList;
import java.util.List;

public class SwitchNode extends ControlNode {
    public List<AST> CaseNodes = new ArrayList<AST>();

    private AST defaultNode;

    public AST getDefaultNode() {
        return defaultNode;
    }

    public void setDefaultNode(AST defaultNode) {
        this.defaultNode = defaultNode;
    }
}

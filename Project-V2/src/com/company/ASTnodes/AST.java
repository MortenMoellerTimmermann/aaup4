package com.company.ASTnodes;

import com.company.SymbleTable.Symbel;
import com.company.Visitor.ASTVisitorInterface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AST  implements INode{
    public List<AST> NestedNodes = new ArrayList<AST>();

    private Symbel nodeSym;
    private Integer lineNum;



    public Symbel getNodeSym() {
        return nodeSym;
    }

    public void setNodeSym(Symbel Type) {
        this.nodeSym = Type;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
          visitor.Visit(this);
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }
}

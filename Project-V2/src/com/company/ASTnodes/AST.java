package com.company.ASTnodes;

import com.company.SymbolTable.Symbol;
import com.company.Visitor.ASTVisitorInterface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AST  implements INode{
    public List<AST> NestedNodes = new ArrayList<AST>();

    private Symbol nodeSym;
    private Integer lineNum;



    public Symbol getNodeSym() {
        return nodeSym;
    }

    public void setNodeSym(Symbol Type) {
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

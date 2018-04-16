package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AST  implements INode{
    public List<AST> NestedNodes = new ArrayList<AST>();

    private String Type;
    private Integer lineNum;



    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
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

package com.company.SymbleTable;

import com.company.ASTnodes.AST;

public class VariableNotDeclaredException extends Exception {
    private String msg;

    public VariableNotDeclaredException(String msg){
        this.msg = msg;
    }
    public String Message(){
        return msg;
    }

}

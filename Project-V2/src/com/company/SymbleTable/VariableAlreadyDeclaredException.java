package com.company.SymbleTable;

public class VariableAlreadyDeclaredException extends Exception {
    private String msg;
    public VariableAlreadyDeclaredException(String msg){
        this.msg = msg;
    }
    public String Message(){
        return msg;
    }
}

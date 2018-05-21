package com.company.SymbolTable;

public class PropertyNotFound extends Exception {
    private String msg;

    public PropertyNotFound(String msg){
        this.msg = msg;
    }
    public String Message(){
        return msg;
    }

}

package com.company.SymbleTable;

import com.company.ASTnodes.AST;

public class Symbel {
    private AST dclNode;
    private String type;
    private int adress;

    public Symbel(String Type){
        this.type = Type;
        setType(Type);
    }

    public int getAdress() {
        return adress;
    }

    public void setAdress(int adress) {
        this.adress = adress;
    }

    public AST getDclNode() {
        return dclNode;
    }

    public void setDclNode(AST dclNode) {
        this.dclNode = dclNode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

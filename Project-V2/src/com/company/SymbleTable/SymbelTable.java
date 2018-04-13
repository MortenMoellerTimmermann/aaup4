package com.company.SymbleTable;

import com.company.ASTnodes.AST;
import com.company.ASTnodes.MatrixScopeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbelTable implements ISymbleTable {

    //Making a list of hash maps, so that there is one list per scope level
    private ArrayList<HashMap<String, Symbel>> tables = new ArrayList<>();
    private ArrayList<MatrixScopeNode> MatrixScopes = new ArrayList<>();
    //counter for the scope level
    private int scopeLevel = 0;

    //make the first hashmap to store symbels in constructor
    public SymbelTable (){
        tables.add(new HashMap<>());
    }

    @Override
    public void openScope() {
        //create a new hashmap to store symbels
        tables.add(new HashMap<>());
        //count up the cope level to get the index we work in
        scopeLevel++;
    }

    @Override
    public void closeScope() {
        //remove the closed scope
        tables.remove(scopeLevel);
        //count the scopeLevel down to keep track of the index we work in
        scopeLevel--;
    }

    @Override
    public void insert(String id, Symbel sym) throws VariableAlreadyDeclaredException {
        //if it allready exists in this scope throw exception
        if (tables.get(scopeLevel).containsKey(id)){
            throw new VariableAlreadyDeclaredException(id + " is already declared in current scope");
        }else {
            tables.get(scopeLevel).put(id , sym);
        }
    }

    @Override
    public void insertMatrixScope(MatrixScopeNode newScope) throws VariableAlreadyDeclaredException {
        for (MatrixScopeNode MS : MatrixScopes){
            if (MS.getScopeName().equals(newScope.getScopeName())){
                throw new VariableAlreadyDeclaredException("a matrix scope with name: " + MS.getScopeName() + " has already been declared");
            }
        }
        MatrixScopes.add(newScope);
    }


    @Override
    public Symbel lookup(String id) throws VariableNotDeclaredException {
        if (id == null)
            return null;
        if (id.equals("this")){
            MatrixScopeNode ref = MatrixScopes.get(MatrixScopes.size()-1);
            //Symbel sym = new Symbel(ref.isAwait()? "await matrixscope" : "matrixscope");
            //sym.setDclNode(ref);
            return lookup(ref.getScopeName());
        }
        for (int i = scopeLevel; i >= 0; i--) {
            if (tables.get(i).containsKey(id)){
                return tables.get(i).get(id);
            }
        }
        throw new VariableNotDeclaredException(id + " has not been declared");
    }


}

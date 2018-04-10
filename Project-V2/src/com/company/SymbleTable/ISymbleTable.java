package com.company.SymbleTable;

import com.company.ASTnodes.AST;

public interface ISymbleTable {
        public void openScope();
        public void closeScope();

        public void insert(String id, Symbel dcl) throws VariableAlreadyDeclaredException;
        public Symbel lookup(String id) throws VariableNotDeclaredException;
}

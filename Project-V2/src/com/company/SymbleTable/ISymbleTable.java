package com.company.SymbleTable;

import com.company.ASTnodes.AST;
import com.company.ASTnodes.MatrixScopeNode;

public interface ISymbleTable {
        public void openScope();
        public void closeScope();

        public void insert(String id, Symbel dcl) throws VariableAlreadyDeclaredException;
        public void insertMatrixScope(MatrixScopeNode newScope) throws VariableAlreadyDeclaredException;
        public Symbel lookup(String id) throws VariableNotDeclaredException;
        public MatrixScopeNode lookUpMatrixScope(String id) throws VariableNotDeclaredException;

}

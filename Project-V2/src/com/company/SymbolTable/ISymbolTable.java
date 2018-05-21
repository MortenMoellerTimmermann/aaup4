package com.company.SymbolTable;

import com.company.ASTnodes.AST;
import com.company.ASTnodes.MatrixScopeNode;

public interface ISymbolTable {
        public void openScope();
        public void closeScope();

        public void insert(String id, Symbol dcl) throws VariableAlreadyDeclaredException;
        public void insertMatrixScope(MatrixScopeNode newScope) throws VariableAlreadyDeclaredException;
        public Symbol lookup(String id) throws VariableNotDeclaredException;
        public Symbol lookupMatrixProperty(String id) throws PropertyNotFound;
        public void insertMatrixProperty (String id, String type);

        public MatrixScopeNode lookUpMatrixScope(String id) throws VariableNotDeclaredException;

}

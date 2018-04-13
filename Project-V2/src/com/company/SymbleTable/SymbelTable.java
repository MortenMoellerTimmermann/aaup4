package com.company.SymbleTable;

import com.company.ASTnodes.AST;
import com.company.ASTnodes.FunctioDefinitionNode;
import com.company.ASTnodes.MatrixScopeNode;
import com.company.Visitor.ASTVisitor;
import com.company.Visitor.ASTVisitorInterface;
import com.company.Visitor.ParsetreeVisitor;
import com.company.aRayLexer;
import com.company.aRayParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
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
            throw new VariableAlreadyDeclaredException( " " +id + " is already declared in current scope");
        }else {
            tables.get(scopeLevel).put(id , sym);
        }
    }

    @Override
    public void insertMatrixScope(MatrixScopeNode newScope) throws VariableAlreadyDeclaredException {
        for (MatrixScopeNode MS : MatrixScopes){
            if (MS.getScopeName().equals(newScope.getScopeName())){
                throw new VariableAlreadyDeclaredException(" a matrix scope with name: " + MS.getScopeName() + " has already been declared");
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
        throw new VariableNotDeclaredException( " " + id + " has not been declared");
    }

    public static SymbelTable LoadDefaultValues(SymbelTable ST){
        CharStream Input;
        try {
            Input = CharStreams.fromFileName("PredefinedFunctions");
        }catch (IOException e){

            System.out.print("Fatal internal error, cant read predefined functions - aborting");
            return null ;
        }
        //lexer that takes input
        aRayLexer x = new aRayLexer(Input);

        //token stream using lexer
        CommonTokenStream stream = new CommonTokenStream(x);

        //BETS parser giv
        aRayParser parser = new aRayParser(stream);

        //Concrete Syntax Tree (.global() as this is first rule noted in the grammar)
        ParseTree cst = parser.global();


        //abort if any syntax errors detected.
        if (parser.getNumberOfSyntaxErrors() != 0){
            System.out.println("You have "+ parser.getNumberOfSyntaxErrors() + "Syntax errors detected");
            return null;
        }

        ParsetreeVisitor ptv = new ParsetreeVisitor();

        AST ast = ptv.visit(cst);

        //create the AST visitor for type and scope check (contextual analisys)
        ASTVisitorInterface visitor = new ASTVisitor(ST);

        ast.Accept(visitor);

        return ST;
    }

}

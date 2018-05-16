package com.company;

import com.company.ASTnodes.*;

import com.company.SymbolTable.SymbolTable;
import com.company.Visitor.ASTVisitor;
import com.company.Visitor.ASTVisitorInterface;
import com.company.Visitor.CodeGenerator;
import com.company.Visitor.ParsetreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        //create variable for input
        CharStream Input;
        //try to read input into variable
        System.out.println(System.getProperty("user.dir"));
        try {
            //Input = CharStreams.fromString("matrix x = (2,2,1,1;2;2)" + "matrix y = (1,1,2,3;2;2);" );
            Input = CharStreams.fromFileName(args[0]);
        }catch (IOException e){
            //fail to read input abort procedure
            //System.err.println(e.getMessage());
            System.out.print("Can't read file");
            return;
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
            return;
        }

        ParsetreeVisitor ptv = new ParsetreeVisitor();

        AST ast = ptv.visit(cst);


        //create the symbol table
        SymbolTable ST = new SymbolTable();

        ST = SymbolTable.LoadDefaultValues(ST);


        //create the AST visitor for type and scope check (contextual analisys)
        ASTVisitorInterface visitor = new ASTVisitor(ST);
        //Contextual analysis
        ast.Accept(visitor);

        if (visitor.getErrorCount() != 0){
            System.err.println("Aborting compilation with: " + visitor.getErrorCount() + " error(s)");
            return;
        }
        //theese 2 lines are the setup for code gen i main
        ASTVisitorInterface CodeGenvisitor = new CodeGenerator();
        ast.Accept(CodeGenvisitor);

        long endTime = System.nanoTime();

        byte data[] = CodeGenvisitor.getCode().getBytes();
        FileOutputStream out = new FileOutputStream("output.c");
        out.write(data);
        out.close();

        System.out.println("Compilation completed in: " + (endTime - startTime) / 1000000 + " ms");

    }
}

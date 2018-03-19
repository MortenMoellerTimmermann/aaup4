package com.company;



import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Path;




public class Main {

    public static void main(String[] args) throws Exception {
        //create variable for input
        CharStream Input;

        //try to read input into variable
        try {
            Input = CharStreams.fromString("matrix x = (2,2;2;2);");
           //Input = CharStreams.fromFileName("/program.bets");

        }catch (Exception e){
            //fail to read input abort procedure
            System.out.print("Cant read string // hopefully soon file");
            return;
        }

        //lexer that takes input
        BETSLexer x = new BETSLexer(Input);

        //token stream using lexer
        CommonTokenStream stream = new CommonTokenStream(x);

        //BETS parser giv
        BETSParser parser = new BETSParser(stream);

        //Concrete Syntax Tree (.global() as this is first rule noted in the grammar)
        ParseTree cst = parser.global();

        //abort if any syntax errors detected.
        if (parser.getNumberOfSyntaxErrors() != 0){
            System.out.println("You have "+ parser.getNumberOfSyntaxErrors() + "Syntax errors detected");
            return;
        }else{
            System.out.println("Proceeding with no syntax errors");
        }

        //make AST

        //First i need to make a shit ton of classes...
        //really dont wanna do this at all
        //.....
        //sigh
        






    }
}

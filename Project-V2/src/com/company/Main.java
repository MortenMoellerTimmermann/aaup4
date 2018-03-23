package com.company;



import com.company.Visitor.ParsetreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;



public class Main {

    public static void main(String[] args) throws Exception {
        //create variable for input
        CharStream Input;
        //try to read input into variable
        try {
            Input = CharStreams.fromString("matrix x = (2,2,1,1;2;2); matrix \n" +
                    " y = (2,2,1,1;2;2);" );
           //Input = CharStreams.fromFileName("/program.bets");
        }catch (Exception e){
            //fail to read input abort procedure
            System.out.print("Cant read string // hopefully soon file");
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
        }else{
            System.out.println("Proceeding with no syntax errors");
        }

        ParsetreeVisitor ptv = new ParsetreeVisitor();

        ptv.visit(cst);


        //make AST
      //  BETSBaseVisitor<AST> astVisitor = new ASTVisitor();
        //AST ast = astVisitor.visitGlobal(cst);


        //First i need to make a shit ton of classes...
        //really dont wanna do this at all
        //.....
        //sigh
        






    }
}

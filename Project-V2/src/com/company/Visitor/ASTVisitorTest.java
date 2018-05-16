package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.SymbolTable.Symbol;
import com.company.SymbolTable.SymbolTable;
import com.company.SymbolTable.VariableAlreadyDeclaredException;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ASTVisitorTest {
    private final SymbolTable st = new SymbolTable();
    private final ASTVisitorInterface visitor = new ASTVisitor(st);


    /*
        while running this test 2 different error messages should be written in the console!
     */
    @Test
    public void assignmentTest() {
        //setup
        int expected = visitor.getErrorCount() + 1; //set to plus1 as this should be an error
        AssignmentNode assignmentNode = new AssignmentNode();

        /*
            Case 1
            assign float to int (int a = float value)
            copletes if the typechecker finds type error
         */

        //left side setup to int
        try {
            //insert for case 1 and 2
            st.insert("a", new Symbol("int"));
            st.insert("b", new Symbol("float"));



            //insert for case 3 and 4
            //matrix scope for new matrix
            MatrixScopeNode matrixScopeNode = new MatrixScopeNode();
            matrixScopeNode.setAwait(false);
            matrixScopeNode.setScopeName("X");
            st.insertMatrixScope(matrixScopeNode);
            //matrix to alter
            Symbol mSym = new Symbol("matrix");
            DeclareMatrixNode declareMatrixNode = new DeclareMatrixNode();
            declareMatrixNode.setRows(3);
            declareMatrixNode.setColumns(3);
            declareMatrixNode.setVarName("X");
            mSym.setDclNode(declareMatrixNode);
            st.insert("X", mSym);

        }catch (VariableAlreadyDeclaredException e){
            //cant throw exception as we are dealing with a empty symbol table
        }
        assignmentNode.setVarName("a");

        //right side set up to float
        SimpleExpressionNode simpleExpressionNode = new SimpleExpressionNode();
        Symbol sym = new Symbol("float");
        simpleExpressionNode.setNodeSym(sym);

        //final set up of assignmentnode
        assignmentNode.setNewValueNode(simpleExpressionNode);
        assignmentNode.setAssignOperetorAsString("=");

        //call the method
        assignmentNode.Accept(visitor);

        //check if we get the expected result
        int actual = visitor.getErrorCount();
        assertEquals(actual , expected);

        /*
            Case 2
            assign int to float (float a = integer value)
            complete if typechecker accepts this as valid input
        */

        //setup
        expected = visitor.getErrorCount();
        simpleExpressionNode.getNodeSym().setType("int");
        assignmentNode.setVarName("b");
        assignmentNode.setNewValueNode(simpleExpressionNode);

        //call and check
        assignmentNode.Accept(visitor);
        actual = visitor.getErrorCount();
        assertEquals(expected , actual);

        /*
            Case 3
            Assign matrix to a new matrix of WRONG size (matrix [3,3] = matrix[2,2]
            completes if type checker finds the error
         */

        //setup right side of assignment
        expected = visitor.getErrorCount() + 1 ;
        Symbol symbol = new Symbol("matrix");
        DeclareMatrixNode declareMatrixNode = new DeclareMatrixNode();
        declareMatrixNode.setColumns(2);
        declareMatrixNode.setRows(2);
        symbol.setDclNode(declareMatrixNode);
        simpleExpressionNode.setNodeSym(symbol);
        assignmentNode.setNewValueNode(simpleExpressionNode);

        //set up left side of assignment
        assignmentNode.setVarName("X");

        //call and check
        assignmentNode.Accept(visitor);
        actual = visitor.getErrorCount();

        assertEquals(expected, actual);


        /*
            Case 4
            assign matrix of the correct isde to new matrix (matrix[3,3] = matrix[3,3])
            completes if the type checker allows this
         */

        //setup
        expected = visitor.getErrorCount();

        //reuse left side of assignment from last case

        //setup right side of assignment
        declareMatrixNode.setColumns(3);
        declareMatrixNode.setRows(3);
        symbol.setDclNode(declareMatrixNode);
        simpleExpressionNode.setNodeSym(symbol);
        assignmentNode.setNewValueNode(simpleExpressionNode);

        //call and check
        assignmentNode.Accept(visitor);
        actual = visitor.getErrorCount();

        assertEquals(expected , actual);


    }

    @Test
    public void MultiplicationTest() {
       int expected = visitor.getErrorCount();
       MultiplicationNode multiplicationNode = new MultiplicationNode();
       SimpleExpressionNode simpleExpressionNode = new SimpleExpressionNode();
       //first setup
       try {
           Symbol mSym = new Symbol("matrix");
           DeclareMatrixNode declareMatrixNode = new DeclareMatrixNode();
           declareMatrixNode.setRows(3);
           declareMatrixNode.setColumns(3);
           declareMatrixNode.setVarName("Y");
           mSym.setDclNode(declareMatrixNode);
           st.insert("Y", mSym);
       }catch (VariableAlreadyDeclaredException e){

       }

       /*
            Case 1
            Multiply 2 matrices with same size (matrix[3,3] * matrix[3,3])
            Completes if type checker allows this multiplication
        */

       //setup right node of multiplication
        Symbol symbol = new Symbol("matrix");
        DeclareMatrixNode declareMatrixNode = new DeclareMatrixNode();
        declareMatrixNode.setColumns(3);
        declareMatrixNode.setRows(3);
        symbol.setDclNode(declareMatrixNode);
        simpleExpressionNode.setNodeSym(symbol);
        multiplicationNode.setRightOperandNode(simpleExpressionNode);

        //setup the multiplication node
        multiplicationNode.setLeftOperand("Y");

        multiplicationNode.Accept(visitor);
        int actual = visitor.getErrorCount();

        assertEquals(expected, actual);

        /*
            Case 2
            multiply 2 matrices with different sizes (matrix[3,3] * matrix [4,3])
         */

        expected = visitor.getErrorCount() + 1;
        //set up right side of multiplication
        Symbol sym = new Symbol("matrix");
        declareMatrixNode.setColumns(3);
        declareMatrixNode.setRows(4);
        sym.setDclNode(declareMatrixNode);
        simpleExpressionNode.setNodeSym(sym);
        multiplicationNode.setRightOperandNode(simpleExpressionNode);

        //call and test
        multiplicationNode.Accept(visitor);
        actual = visitor.getErrorCount();

        assertEquals(expected, actual);

    }

    @Test
    public void visit2() {
       // int expected = 0;
//
//
       // int actual = visitor.getErrorCount();
       // assertEquals(actual , expected);
    }
}
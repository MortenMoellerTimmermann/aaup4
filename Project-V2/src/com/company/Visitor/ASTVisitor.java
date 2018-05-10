package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.SymbolTable.Symbol;
import com.company.SymbolTable.SymbolTable;
import com.company.SymbolTable.VariableAlreadyDeclaredException;
import com.company.SymbolTable.VariableNotDeclaredException;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor implements ASTVisitorInterface {
    private Integer errorCount = 0;
    public List<AST> NodesWithErrors = new ArrayList<AST>();

    private boolean checkOnRunTime = false;

    private boolean lookingForChildScope = false;
    private MatrixScopeNode parentNode;

    SymbolTable st;

    public ASTVisitor(SymbolTable st){
        this.st = st;
    }


    @Override
    public void Visit(AST root){
        //st.openScope();
        for (AST child : root.NestedNodes)
        {

            if (child != null && (child.getClass().getSimpleName().equals( new  FunctioDefinitionNode().getClass().getSimpleName()))){
                checkOnRunTime = true;
                child.Accept(this);
                checkOnRunTime = false;
            }

        }

        for (AST child : root.NestedNodes)
        {
            if (child != null  && !(child.getClass().getSimpleName().equals( new  FunctioDefinitionNode().getClass().getSimpleName())))
                child.Accept(this);
        }

       // st.closeScope();
        //return null;
    }



    @Override
    public void Visit(AndNode node) {
        //System.out.println(node.getClass().getSimpleName());
        Symbol nodesym = new Symbol("bool");

        node.getLeftOperandNode().Accept(this);
        node.getRightOperandNode().Accept(this);

        nodesym.setDclNode(node);
        node.setNodeSym(nodesym);

        if ( node.getLeftOperandNode().getNodeSym().getType() == null || node.getRightOperandNode().getNodeSym().getType() == null){
            return;
        }

        String leftType = node.getLeftOperandNode().getNodeSym().getType();
        String rightType = node.getRightOperandNode().getNodeSym().getType();

        if (!leftType.equals(rightType)){
            //must both be of type bool or error
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " AND (&&) must have of type bool on both sides instead found: " + leftType + " && " + rightType);
            return;
        }

    }

    @Override
    public void Visit(AssignmentNode node) {
        //System.out.println(node.getClass().getSimpleName());
        //System.out.println(node.getLeftOperand());



      Symbol leftSym;
      try {
          leftSym = st.lookup(node.getVarName());
      }catch (VariableNotDeclaredException e){
          errorCount++;
          NodesWithErrors.add(node);
          System.err.println("On line: " + node.getLineNum()+ e.Message());
          return;
      }

      node.getNewValueNode().Accept(this);

      if (node.getNewValueNode().getNodeSym() == null){
          return;
      }

      //System.out.println(leftSym.getType().equals("float")  + "  " + leftSym.getType());

      if (leftSym.getType().equals("float") && node.getNewValueNode().getNodeSym().getType().equals("int")){
          return;
      }


      if (!leftSym.getType().equals( node.getNewValueNode().getNodeSym().getType())){
          errorCount++;
          NodesWithErrors.add(node);
          System.err.println("On line: " + node.getLineNum()+ " Assignment must have same type on both sides of operator but found: " + leftSym.getType() + node.getAssignOperetorAsString() + node.getNewValueNode().getNodeSym().getType());
          return;
      }
      Symbol rightSym = node.getNewValueNode().getNodeSym();
      if (checkOnRunTime){
          return;
      }

      if (leftSym.getType().equals("matrix")){
          try {
              DeclareMatrixNode someNode = (DeclareMatrixNode) leftSym.getDclNode();
              Symbol symbols = st.lookup("this");
              DeclareMatrixNode Node = (DeclareMatrixNode) symbols.getDclNode();
              if (!someNode.getVarName().equals(Node.getVarName())){
                  System.err.println("on line: " +node.getLineNum()+ " Cannot change the value of matrix: " + someNode.getVarName() + " when not in a scope extending that matrix");
              }

          }catch (VariableNotDeclaredException e){

          }
      }

      if (leftSym.getType().equals("matrix") && rightSym.getType().equals("matrix")){
          //if here both we have matrix = matrix
          if (!node.getNewValueNode().getNodeSym().getDclNode().getClass().getSimpleName().equals(new DeclareMatrixNode().getClass().getSimpleName()))
              return;
          DeclareMatrixNode leftmatrix = (DeclareMatrixNode) leftSym.getDclNode();
          DeclareMatrixNode rightmatrix = (DeclareMatrixNode) node.getNewValueNode().getNodeSym().getDclNode();

          if (leftmatrix.getRows() != rightmatrix.getRows() || leftmatrix.getColumns() != rightmatrix.getColumns()){
              errorCount++;
              System.err.println("on line: " + node.getLineNum() + " matrices must have same dimensions to assign, but found dimensions: " + leftmatrix.getRows() + " , " + leftmatrix.getColumns() + " = " + rightmatrix.getRows() + " , " +rightmatrix.getColumns());
          }
      }
    }

    @Override
    public void Visit(CaseNode node) {
        //System.out.println(node.getClass().getSimpleName());
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        st.openScope();
        for (AST child : node.NestedNodes){
            if (child != null)
                child.Accept(this);
        }
        st.closeScope();
        String x = Float.toString(node.getNumberToEval());
        try {
            Integer.parseInt(x);
        }catch (NumberFormatException e){
            symbols = new Symbol("float");
            symbols.setDclNode(node);
            node.setNodeSym(symbols);
            return;
        }
        symbols = new Symbol("int");
        symbols.setDclNode(node);
        node.setNodeSym(symbols);

    }

    @Override
    public void Visit(DeclareMatrixNode node) {
        //System.out.println(node.getClass().getSimpleName());

        if (node.getValueNode() != null) {
            node.getValueNode().Accept(this);

            if (node.getValueNode().getNodeSym().getType() == null)
                return;

            if (node.getTypeAsString().equals("matrix") && node.getValueNode().getNodeSym().getType().equals("matrix"))
                return;

            if (!node.getTypeAsString().equals( node.getValueNode().getNodeSym().getType())){
                errorCount++;
                NodesWithErrors.add(node);
                System.err.println("On line: " + node.getLineNum()+ " Cant assign variable of type: " + node.getTypeAsString() + " to type: " + node.getValueNode().getNodeSym().getType());
                return;
            }
        }

    
        if (node.getColumns() != null && node.values.size() != node.getColumns() * node.getRows() && node.values.size() > 0){
            errorCount++;
            this.NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " matrix declaration " + node.getVarName() + " does not have the inputs matching the given matrix size");
        }
        //System.out.println(node.getTypeAsString() + " +++++++++++++");
        try {
            Symbol sym =  new Symbol(node.getTypeAsString());
            sym.setDclNode(node);
            st.insert(node.getVarName(),sym);

        }catch (VariableAlreadyDeclaredException e){
            System.err.println("On line: " + node.getLineNum()+ e.Message());
            errorCount++;
            NodesWithErrors.add(node);
            return;
        }
    }


    @Override
    public void Visit(DivisionNode node) {

        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        Symbol childSymbol = new Symbol(null);

        String leftType = null;
        //System.err.println("In Division");
        if (PlusNodeHelper(node.getLeftOperand()).equals("int") || PlusNodeHelper(node.getLeftOperand() ).equals("float")){
            //check if the leftoperand is a constant
            leftType = PlusNodeHelper(node.getLeftOperand());
        }

        if (leftType == null) {
            //only look up for variable if its not defined as constant
            try {

                 childSymbol = st.lookup(node.getLeftOperand());
                 leftType = childSymbol.getType();
            } catch (VariableNotDeclaredException e) {
                errorCount++;
                NodesWithErrors.add(node);
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                return;
            }
        }

        node.getRightOperandNode().Accept(this);

        if (node.getRightOperandNode().getNodeSym().getType() == null){
            return;
        }

        if (!leftType.equals(node.getRightOperandNode().getNodeSym().getType()) ){
            if (leftType.equals("matrix")){
                //if the left side is a matrix, i doesnt matter what type the right side is (int float or matrix) it will always return a matrix
                if (node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
                    errorCount++;
                    System.err.println("on line: " + node.getLineNum() + " cant divde 2 matrices");
                    return;
                }

                node.getNodeSym().setType("matrix");
                node.getNodeSym().setDclNode(childSymbol.getDclNode());


            }else if (node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
                //if here we have (int | float) / matrix : that is not a valid operation
                errorCount++;
                NodesWithErrors.add(node);
                System.err.println("On line: " + node.getLineNum()+ " cant divide number with matrix: try to divide matrix by number instead");
                return;
            }else {
                //if here we have either (int / float) | (float / int) both returns a float
                node.getNodeSym().setType("float");
            }
        }else {
            //if both sides of the division operator is the same the returntype of the division is the same as that type
            //only place it can set type to type int
            node.getNodeSym().setType(leftType);
        }
        return;
    }

    @Override
    public void Visit(ElseIfNode node) {
       // System.out.println(node.getClass().getSimpleName());
        node.getPredicate().Accept(this);

        if (node.getPredicate().getNodeSym().getType() == null){
            st.openScope();
            node.getBodyNode().Accept(this);
            st.closeScope();
            return;
        }

        if (node.getPredicate().getNodeSym().getType() != "bool"){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " Elseif expression must evaluate a boolean value");
            return;
        }
        st.openScope();
        node.getBodyNode().Accept(this);
        st.closeScope();
    }

    @Override
    public void Visit(ElseNode node) {
       // System.out.println(node.getClass().getSimpleName());
        st.openScope();
        node.getBodyNode().Accept(this);
        st.closeScope();
    }

    @Override
    public void Visit(EqualNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getLeftOperandNode().Accept(this);
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getNodeSym().getType() == null || node.getRightOperandNode().getNodeSym().getType() == null){
            node.getNodeSym().setType("bool");
            return;
        }
       if (node.getLeftOperandNode().getNodeSym().getType().equals( "matrix")  || node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
           if (!node.getRightOperandNode().getNodeSym().getType().equals("matrix") || !node.getLeftOperandNode().getNodeSym().getType().equals("matrix")){
               //cant compare matrix to number
               errorCount++;
               NodesWithErrors.add(node);
               System.err.println("On line: " + node.getLineNum()+ " Cant compare a matrix to a number but found: " + node.getLeftOperandNode().getNodeSym().getType() + " == " + node.getRightOperandNode().getNodeSym().getType());
               return;
           }
       }
       node.getNodeSym().setType("bool");
    }

    @Override
    public void Visit(ForNode node) {
        //System.out.println(node.getClass().getSimpleName());
        st.openScope();
        for (AST dcl : node.Dcls){
            if (dcl != null)
                dcl.Accept(this);
        }

        for (String varName : node.Ids){
            try {
                st.lookup(varName);
            }catch (VariableNotDeclaredException e){
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                NodesWithErrors.add(node);
                return;
            }
        }
       node.getPredicate().Accept(this);

        if (node.getPredicate().getNodeSym().getType() == null){
            node.getBodyNode().Accept(this);
            st.closeScope();
            return;
        }
       if (!node.getPredicate().getNodeSym().getType().equals("bool")){
           errorCount++;
           NodesWithErrors.add(node);
           System.err.println("On line: " + node.getLineNum()+ " in For-loop predicate expexted type bool but found: " + node.getPredicate().getNodeSym().getType());
           st.closeScope();
           return;
       }

        for (String varToAlter : node.varsToAlter){
            try {
                Symbol sym = st.lookup(varToAlter);
                if (sym.getType().equals("matrix")){
                    errorCount++;
                    System.err.println("On line: " + node.getLineNum()+ " in forloop: cant increment or decrement type of " + sym.getType());
                    NodesWithErrors.add(node);
                }
            }catch (VariableNotDeclaredException e){
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                return;
            }
        }


        node.getBodyNode().Accept(this);

        st.closeScope();

    }

    @Override
    public void Visit(FunctioDefinitionNode node) {
        try {
            Symbol sym =  new Symbol(node.getReturnTypeName());
            sym.setDclNode(node);
            st.insert(node.getFunctionName(), sym);
            //System.out.println(node.getFunctionName());
        }catch (VariableAlreadyDeclaredException e){
            System.err.println("On line: " + node.getLineNum()+ e.Message());
            errorCount++;
            return;
        }

        //open scope for the function body and parameters
        st.openScope();

        //no problem doing a explicit typecast as this should always be of that type (from parsetreevisitor)
        if (node.getParmaterNode() != null) {


            ParametersNode pn = (ParametersNode) node.getParmaterNode();

            for (AST param : pn.ParameterNodes) {

                if (param != null) {
                    SimpleExpressionNode sn = (SimpleExpressionNode) param;
                    try {

                        st.insert(sn.getVariableName(), new Symbol(sn.getNodeSym().getType()));
                        //System.out.println(sn.getVariableName());
                    } catch (VariableAlreadyDeclaredException e) {
                        errorCount++;
                        NodesWithErrors.add(node);
                        System.err.println("On line: " + node.getLineNum() + e.Message());
                        return;
                    }
                }
            }
        }
        AST bodynode= node.NestedNodes.get(0);
        bodynode.Accept(this);



        st.closeScope();

    }



    @Override
    public void Visit(FunctionCallNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        ///System.out.println(node.getClass().getSimpleName());
        FunctioDefinitionNode fdNode;
        try {
            Symbol sym = st.lookup(node.getFunctionId());
            //node.getNodeSym().setType(sym.getType());
            node.setNodeSym(sym);
            fdNode = (FunctioDefinitionNode) sym.getDclNode();
        }catch (VariableNotDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ e.Message()); // this eroor should be rethought to define that it's a undefined function
            return;
        }

        if (fdNode.getParmaterNode() == null){
            return;
        }
        ParametersNode parametersNode = (ParametersNode) fdNode.getParmaterNode();
        //check if the function call has the same amount of parameters as the function definition
        if (parametersNode.ParameterNodes.size() != node.ParamValueNodes.size()){
            System.err.println("On line: " + node.getLineNum()+ " Function call must have same amount of parameters (" + node.ParamValueNodes.size() +")as defined in function definition(" + parametersNode.ParameterNodes.size()+ ")");
            errorCount++;
            return;
        }
        //validate that parameters has been defined and is of right type
        for (int i = 0; i < node.ParamValueNodes.size(); i++) {
            AST param = node.ParamValueNodes.get(i);
            param.Accept(this);
            if (!param.getNodeSym().getType().equals(parametersNode.ParameterNodes.get(i).getNodeSym().getType())){
                System.err.println("On line: " + node.getLineNum()+ " In function call of function: " + node.getFunctionId() + " Expected parameter of type " + parametersNode.ParameterNodes.get(i).getNodeSym().getType() + " but fount type " + param.getNodeSym().getType());
                errorCount++;
                return;
            }
        }



    }

    @Override
    public void Visit(GreaterOrEqualNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        //System.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getNodeSym().getType() == null || node.getRightOperandNode().getNodeSym().getType() == null){
            node.getNodeSym().setType("bool");
            return;
        }
        if (node.getLeftOperandNode().getNodeSym().getType().equals("matrix") || node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " Cant use operator '=>' on type matrix");
            return;
        }
        node.getNodeSym().setType("bool");

    }

    @Override
    public void Visit(GreaterThanNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getNodeSym() == null || node.getRightOperandNode().getNodeSym() == null){
            node.getNodeSym().setType("bool");
            return;
        }
        if (node.getLeftOperandNode().getNodeSym().getType().equals("matrix") ||node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " Cant use operator '>' on type matrix");
            return;
        }
        node.getNodeSym().setType("bool");
    }

    @Override
    public void Visit(IfNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getPredicate().Accept(this);

        if (node.getPredicate().getNodeSym().getType() != null) {


            if (!node.getPredicate().getNodeSym().getType().equals("bool")) {
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " Predicate in If statement must evaluate to type bool");
                return;
            }
        }
        st.openScope();
        node.getBodyNode().Accept(this);
        st.closeScope();
        for (AST elseifs : node.ElseIfNodes){
            if (elseifs != null)
                elseifs.Accept(this);

        }
        if (node.getOptionalElse() != null)
            node.getOptionalElse().Accept(this);



    }

    @Override
    public void Visit(LessOrEqualNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getNodeSym().getType() == null || node.getRightOperandNode().getNodeSym().getType() == null){
            node.getNodeSym().setType("bool");
            return;
        }

        if (node.getLeftOperandNode().getNodeSym().getType().equals("matrix") ||node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " Cant use operator '=<' on type matrix");
            return;
        }
        node.getNodeSym().setType("bool");

    }

    @Override
    public void Visit(LessThanNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        //System.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);
        if (node.getLeftOperandNode().getNodeSym().getType() == null || node.getRightOperandNode().getNodeSym().getType() == null){
            node.getNodeSym().setType("bool");
            return;
        }
        if (node.getLeftOperandNode().getNodeSym().getType().equals("matrix") ||node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ "C ant use operator '<' on type matrix");
            return;
        }
        node.getNodeSym().setType("bool");
    }

    @Override
    public void Visit(MatrixCrossProductNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);
        //System.out.println(node.getClass().getSimpleName());

        node.getRightOperandNode().Accept(this);
        if (node.getRightOperandNode().getNodeSym().getType() == null){
            return;
        }
        String leftType = PlusNodeHelper(node.getLeftOperand());
        if (leftType.equals("varName") || leftType.equals("this")){
            try {

               Symbol sym = st.lookup(node.getLeftOperand());

               if (!sym.getType().equals("matrix") && !node.getRightOperandNode().getNodeSym().getType().equals("matrix")){
                   System.err.println("On line: " + node.getLineNum()+ " Both types must be of type matric but found types : " + sym.getType() + " :x " + node.getRightOperandNode().getNodeSym().getType());
                   errorCount++;
                   return;

               }else{
                   DeclareMatrixNode leftMatrix = (DeclareMatrixNode) sym.getDclNode();
                   DeclareMatrixNode rightMatrix = (DeclareMatrixNode) node.getRightOperandNode().getNodeSym().getDclNode();

                   if (leftMatrix.getRows() != rightMatrix.getRows() || leftMatrix.getColumns() != rightMatrix.getColumns()){
                       errorCount++;
                       System.err.println("on line: " + node.getLineNum() + " Invalid matrix size in crossproduct");
                       return;
                   }
                   //success
                   node.getNodeSym().setType("matrix");
                   node.getNodeSym().setDclNode(leftMatrix);
                   return;
               }

            }catch (VariableNotDeclaredException e){
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                return;
            }

        }
        else {
            errorCount++;
            System.err.println("On line: " + node.getLineNum()+ " Both types must be of type matric but found types : " + leftType + " :x " + node.getRightOperandNode().getNodeSym().getType());
        }

    }

    @Override
    public void Visit(MatrixScopeNode node) {
        //System.out.println(node.getClass().getSimpleName());

        if (node.getScopeName() != null && !node.isAwait()) {
            try {
                st.lookup(node.getScopeName());
            } catch (VariableNotDeclaredException e) {
                System.err.println("On line: " + node.getLineNum() + " matrixScope must extend a declared matrix, but no matrix by name: " + node.getScopeName() + " could be found");
                errorCount++;

            }
        }else if (node.getScopeName() != null && node.isAwait()){
            try {
                st.lookUpMatrixScope(node.getScopeName());
            } catch (VariableNotDeclaredException e) {
                System.err.println("On line: " + node.getLineNum() + e.Message());
                errorCount++;

            }
        }else{
            node.setScopeName("emptyName");
        }

        if (lookingForChildScope == true) {
            node.setParentScope(parentNode);
        }

        if (node.isAwait() && node.getScopeName().equals("emptyName")){
            st.openScope();
            node.getBodyNode();

            st.closeScope();
            return;
        }


        try {
            st.insertMatrixScope(node);
            //st.insert(node.getScopeName(), new Symbol(node.isAwait()? "await matrixscope" : "matrixscope"));
        }catch (VariableAlreadyDeclaredException    e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ e.Message());

        }
        
        st.openScope();
        node.getBodyNode().Accept(this);
        st.closeScope();
    }

    @Override
    public void Visit(MinusNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getRightOperandNode().Accept(this);
        String leftType = PlusNodeHelper(node.getLeftOperand());
        Symbol leftSym = new Symbol(null);

        if (leftType.equals("varName") || leftType.equals("this")){
            try {
                leftSym = st.lookup(node.getLeftOperand());
                leftType = leftSym.getType();
            }catch (VariableNotDeclaredException e){
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                return;
            }
        }
        if (node.getRightOperandNode().getNodeSym().getType() == null)
            return;

        if (leftType.equals(node.getRightOperandNode().getNodeSym().getType())){
            //if both types are equal so is the return of the minus operation

            if (leftType.equals("matrix")){
                DeclareMatrixNode leftMatrix = (DeclareMatrixNode) leftSym.getDclNode();
                DeclareMatrixNode rightMatrix = (DeclareMatrixNode) node.getRightOperandNode().getNodeSym().getDclNode();

                if (leftMatrix.getRows() != rightMatrix.getRows() || leftMatrix.getColumns() != rightMatrix.getColumns()){
                    errorCount++;
                    System.err.println("on line: " + node.getLineNum() + " Invalid matrix size in minus operation - must be the same size");
                    return;
                }

                node.getNodeSym().setType("matrix");
                node.getNodeSym().setDclNode(leftMatrix);
                return;
            }

            node.getNodeSym().setType(leftType);
            return;
        }

        String rightType = node.getRightOperandNode().getNodeSym().getType();

        if (leftType.equals("matrix") || rightType.equals("matrix")){
            errorCount++;
            System.err.println("On line: " + node.getLineNum()+ " invalid operation: " + leftType + " - " + rightType);
            return;
        }

        //only options here are: (float - int) or (int - float)
        node.getNodeSym().setType("float");


    }

    @Override
    public void Visit(ModuloNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getRightOperandNode().Accept(this);

        String leftType = PlusNodeHelper(node.getLeftOperand());
        String rightType = node.getRightOperandNode().getNodeSym().getType();

        Symbol lefSym = new Symbol(null);


        if (leftType.equals("varName") || leftType.equals("this")){
            try {
                Symbol sym = st.lookup(leftType);
                leftType = sym.getType();
            }catch (VariableNotDeclaredException e){
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                return;
            }
        }
        if (node.getRightOperandNode().getNodeSym().getType() == null)
            return;

        if (rightType.equals("matrix")){
            errorCount++;
            System.err.println("On line: " + node.getLineNum()+ " cant use modulo on type matrix: ");
            return;
        }

        if (leftType.equals("matrix")) {
            node.getNodeSym().setDclNode(lefSym.getDclNode());
            node.getNodeSym().setType(leftType);
        }else {
            node.getNodeSym().setType(rightType);
        }


    }

    @Override
    public void Visit(MultiplicationNode node) {
        Symbol symbols = new Symbol(null);
        node.setNodeSym(symbols);

        node.getRightOperandNode().Accept(this);

        String rightType = null;
        if (node.getRightOperandNode().getNodeSym() != null)
            rightType = node.getRightOperandNode().getNodeSym().getType();
        String leftType = PlusNodeHelper(node.getLeftOperand());

        Symbol leftSym = new Symbol(null);

        if (leftType.equals("varName") || leftType.equals("this")) {
            try {
                leftSym = st.lookup(node.getLeftOperand());
                leftType = leftSym.getType();
            } catch (VariableNotDeclaredException e) {
                System.err.println("On line: " + node.getLineNum()+ e.Message());
                errorCount++;
                return;
            }
        }

        if (node.getRightOperandNode().getNodeSym() == null)
            return;

        if (leftType.equals(rightType)) {
            node.getNodeSym().setType(leftType);

            if (checkOnRunTime)
                return;
            if (leftType.equals("matrix")){
                DeclareMatrixNode leftMatrix = (DeclareMatrixNode) leftSym.getDclNode();
                DeclareMatrixNode rightMatrix = (DeclareMatrixNode) node.getRightOperandNode().getNodeSym().getDclNode();

                if (leftMatrix.getColumns() != rightMatrix.getRows()){
                    errorCount++;
                    System.err.println("on line: " + node.getLineNum() + " Invalid matrix size in multiplication operation - must left matrix must have same amount of columns as right matrix has rows");
                    node.getNodeSym().setType(null);
                    return;
                }

                node.getNodeSym().setType("matrix");

                DeclareMatrixNode mn = new DeclareMatrixNode();
                mn.setRows(leftMatrix.getRows());
                mn.setColumns(rightMatrix.getColumns());

                node.getNodeSym().setDclNode(mn);
                return;
            }

            return;
        }

        if (leftType.equals("matrix") || rightType.equals("matrix")) {
            //matrix * float , matrix * int , int * matrix , float * matrix
            node.getNodeSym().setType("matrix");

            if (leftType.equals("matrix"))
                node.getNodeSym().setDclNode(leftSym.getDclNode());

            if (rightType.equals("matrix"))
                node.getNodeSym().setDclNode(node.getRightOperandNode().getNodeSym().getDclNode());


            return;
        }

        //float * int , int * float
        node.getNodeSym().setType("float");


    }

        @Override
        public void Visit (NotEqualNode node){
            Symbol symbols = new Symbol(null);
            node.setNodeSym(symbols);

            node.getLeftOperandNode().Accept(this);
            node.getRightOperandNode().Accept(this);

            if (node.getRightOperandNode().getNodeSym().getType() == null || node.getLeftOperandNode().getNodeSym().getType() == null )
                return;
            String  leftType = node.getLeftOperandNode().getNodeSym().getType();
            String rightType = node.getRightOperandNode().getNodeSym().getType();

            if (!leftType.equals(rightType) && (leftType.equals("matrix") || rightType.equals("matrix"))) {
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " cant use != operator on matrix and number but found: " + leftType + " != " + rightType + "as this always evaluates to false");
                return;
            }
            node.getNodeSym().setType("bool");
        }

        @Override
        public void Visit (NotNode node){

            //no way to produce a not node as follows of thee grammar

        }

        @Override
        public void Visit (OrNode node){
            Symbol symbols = new Symbol(null);
            node.setNodeSym(symbols);

            node.getLeftOperandNode().Accept(this);
            node.getRightOperandNode().Accept(this);

            if (node.getRightOperandNode().getNodeSym().getType() == null || node.getLeftOperandNode().getNodeSym().getType() == null )
                return;

            String  leftType = node.getLeftOperandNode().getNodeSym().getType();
            String rightType = node.getRightOperandNode().getNodeSym().getType();

            if (!leftType.equals(rightType) && !leftType.equals("bool")) {
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " Or expression must have boolean values on both sidesbut found: " + leftType + " || " + rightType);
                return;
            }


        }

        @Override
        public void Visit (ParametersNode node){
            //System.out.println(node.getClass().getSimpleName());

            //Type is set in parsetreevisitor and read directly from users code file
            //and further processed in visit function definition
        }

        @Override
        public void Visit (ParenthesisExpressionNode node){
            Symbol symbols = new Symbol(null);
            node.setNodeSym(symbols);

            for (AST child : node.NestedNodes) {
                if (child != null) {

                    child.Accept(this);
                    node.getNodeSym().setType(child.getNodeSym().getType());
                    return;
                }
            }

        }

        @Override
        public void Visit (ParenthesisLogicalNode node){
            Symbol symbols = new Symbol(null);
            node.setNodeSym(symbols);

            //should only ever be one, but to avoid any null childs it's in for-loop
            for (AST child : node.NestedNodes) {
                if (child != null) {
                    child.Accept(this);
                    node.getNodeSym().setType(child.getNodeSym().getType());
                    return;
                }
            }


        }

        @Override
        public void Visit (PlusNode node){
            Symbol symbols = new Symbol(null);
            node.setNodeSym(symbols);

            String leftNameOrNumber = node.getLeftOperand();
            String leftType = PlusNodeHelper(leftNameOrNumber);

            node.getRightOperandNode().Accept(this);

            Symbol leftSym = new Symbol(null);

            if (leftType.equals("varName") || leftType.equals("this")) {
                try {
                    leftSym = st.lookup(node.getLeftOperand());
                    leftType = leftSym.getType();
                } catch (VariableNotDeclaredException e) {
                    System.err.println("On line: " + node.getLineNum()+ e.Message());
                    errorCount++;
                    return;
                }
            }

            if (node.getRightOperandNode().getNodeSym() == null)
                return;

            String rightType = node.getRightOperandNode().getNodeSym().getType();

            if (leftType.equals(node.getRightOperandNode().getNodeSym().getType())){
                //if both types are equal so is the return of the plus operation
                if (leftType.equals("matrix")){
                    DeclareMatrixNode leftMatrix = (DeclareMatrixNode) leftSym.getDclNode();
                    DeclareMatrixNode rightMatrix = (DeclareMatrixNode) node.getRightOperandNode().getNodeSym().getDclNode();

                    if (leftMatrix.getRows() != rightMatrix.getRows() || leftMatrix.getColumns() != rightMatrix.getColumns()){
                        errorCount++;
                        System.err.println("on line: " + node.getLineNum() + " Invalid matrix size in plus operation - must be the same size");
                        return;
                    }

                    node.getNodeSym().setType("matrix");
                    node.getNodeSym().setDclNode(leftMatrix);
                    return;
                }
                node.getNodeSym().setType(leftType);
                return;
            }
            if (leftType.equals("matrix") || rightType.equals("matrix")){
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " invalid operation: " + leftType + " + " + rightType);
                return;
            }


            //only options here are: (float  + int) or (int + float)
            node.getNodeSym().setType("float");

        }

    private String PlusNodeHelper(String leftNameOrNumber){
        try {
            int x = Integer.parseInt(leftNameOrNumber);
        }catch (NumberFormatException e){
            //System.out.println(leftNameOrNumber + " is not int");
            try {
                 Float y = Float.parseFloat(leftNameOrNumber);
            }catch (NumberFormatException ex){
                // System.out.println(leftNameOrNumber + " is not float");
                if (leftNameOrNumber.equals( "this")){
                    //Check if "this" can refer to anything in this context
                    return leftNameOrNumber;
                }else {
                    //HERE we can treat the leftoprand as variable name
                    //needs to check if this is declared
                    return "varName";
                }
            }
            return "float";
        }
        return "int";
    }


    @Override
    public void Visit(SimpleExpressionNode node) {
        //System.out.println(node.getClass().getSimpleName());

        if (node.getNodeSym() != null)
            if (node.getNodeSym().getType() != null)
                return;

        Symbol symbols;


        try {
            symbols = st.lookup(node.getVariableName());
            node.setNodeSym(symbols);
        }catch (VariableNotDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ e.Message());
            return;
        }



    }

    @Override
    public void Visit(ReturnNode node) {
        Symbol nodeSym = new Symbol(null);
        node.setNodeSym(nodeSym);

        node.getReturnValueNode().Accept(this);
        if (node.getReturnValueNode().getNodeSym().getType() == null)
            return;

        node.getNodeSym().setType(node.getReturnValueNode().getNodeSym().getType());
        if (!node.getReturnValueNode().getNodeSym().getType().equals(node.getExpectedReturnType())){
            System.err.println("On line: " + node.getLineNum()+ " Wrong return type in function, expected type: " + node.getExpectedReturnType() + " but found type: " + node.getReturnValueNode().getNodeSym().getType());
            errorCount++;
            return;
        }

    }

    @Override
    public void Visit(SwitchNode node) {
        Symbol nodeSym = new Symbol(null);
        node.setNodeSym(nodeSym);

        String typeToEval = null;
        node.getPredicate().Accept(this);
        typeToEval = node.getPredicate().getNodeSym().getType();

        st.openScope();
        for (AST Case : node.CaseNodes) {
            Case.Accept(this);
            if (!Case.getNodeSym().getType().equals(typeToEval)) {
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " Cases must represent the same type as the type being switched but found: switch(" + typeToEval+ ") and case(" + Case.getNodeSym().getType() + ")" );
                //closing switch scope
                st.closeScope();
                return;
            }
        }
        //opening an extra new scope for the defaulr body
        st.openScope();
        node.getDefaultNode().Accept(this);
        //closing scope for the default body
        st.closeScope();

        //closing switch scope
        st.closeScope();


    }

    @Override
    public void Visit(VariableDeclarationNode node) {
        //Symbol nodeSym = new Symbol(null);
        //node.setNodeSym(nodeSym);

        node.getValueNode().Accept(this);

        if (node.getValueNode().getNodeSym().getType() == null)
            return;
        if (node.getTypeAsString().equals("float") && node.getValueNode().getNodeSym().getType().equals("int"))
            return;

        if (!node.getTypeAsString().equals( node.getValueNode().getNodeSym().getType())){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ " Cant assign variable of type: " + node.getTypeAsString() + " to type: " + node.getValueNode().getNodeSym().getType());
            return;
        }
        try {
            st.insert(node.getVarName(), new Symbol(node.getTypeAsString()));
        }catch (VariableAlreadyDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("On line: " + node.getLineNum()+ e.Message());
        }

    }

    @Override
    public void Visit(WhileNode node) {
        //System.out.println(node.getClass().getSimpleName());
        node.getPredicate().Accept(this);

        if (node.getPredicate().getNodeSym().getType() != null) {

            if (!node.getPredicate().getNodeSym().getType().equals("bool")) {
                errorCount++;
                System.err.println("On line: " + node.getLineNum()+ " predicate in while loop must evaluate to a boolean value, but found type: " + node.getPredicate().getNodeSym().getType());
                return;
            }
        }

        st.openScope();
        node.getBodyNode().Accept(this);
        st.closeScope();

    }

    @Override
    public Integer getErrorCount() {
        return errorCount;
    }

    @Override
    public String getCode() { return null; }


}
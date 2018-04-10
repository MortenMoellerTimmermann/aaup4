package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.SymbleTable.Symbel;
import com.company.SymbleTable.SymbelTable;
import com.company.SymbleTable.VariableAlreadyDeclaredException;
import com.company.SymbleTable.VariableNotDeclaredException;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor implements ASTVisitorInterface {
    public int errorCount = 0;
    public List<AST> NodesWithErrors = new ArrayList<AST>();

    SymbelTable st;

    public ASTVisitor(SymbelTable st){
        this.st = st;
    }


    @Override
    public void Visit(AST root){
        //st.openScope();
        for (AST child : root.NestedNodes)
        {

            if (child != null && (child.getClass().getSimpleName().equals( new  FunctioDefinitionNode().getClass().getSimpleName()))){
                child.Accept(this);
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
    public void Visit(AdditionNode node) {
        //This shouldn't be here..
        //should be romved from interface this is handled by PlusNode

    }


    @Override
    public void Visit(AndNode node) {
        //System.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this);
        node.getRightOperandNode().Accept(this);

        String leftType = node.getLeftOperandNode().getType();
        String rightType = node.getRightOperandNode().getType();

        if (!leftType.equals(rightType)){
            //must both be of type bool or error
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println(" AND (&&) must have of type bool on both sides instead found: " + leftType + " && " + rightType);
            return;
        }
        node.setType("bool");
    }

    @Override
    public void Visit(AssignmentNode node) {
        //System.out.println(node.getClass().getSimpleName());
        //System.out.println(node.getLeftOperand());

      Symbel leftSym;
      try {
          leftSym = st.lookup(node.getVarName());
      }catch (VariableNotDeclaredException e){
          errorCount++;
          NodesWithErrors.add(node);
          System.err.println(e.Message());
          return;
      }

      node.getNewValueNode().Accept(this);

      if (!leftSym.getType().equals( node.getNewValueNode().getType())){
          errorCount++;
          NodesWithErrors.add(node);
          System.err.println("Assignment must have same type on either side of operator but found: " + leftSym.getType() + node.getAssignOperetorAsString() + node.getNewValueNode().getType());
          return;
      }
    }

    @Override
    public void Visit(CaseNode node) {
        //System.out.println(node.getClass().getSimpleName());
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
            node.setType("float");
            return;
        }
        node.setType("int");

    }

    @Override
    public void Visit(DeclareMatrixNode node) {
        //System.out.println(node.getClass().getSimpleName());
        if (node.values.size() != node.getCollums() * node.getRows()){
            errorCount++;
            this.NodesWithErrors.add(node);
            System.err.println("matrix declaration " + node.getVarName() + " does not have the inputs matching the given matrix size");
            return;
        }
        //System.out.println(node.getTypeAsString() + " +++++++++++++");
        try {
            st.insert(node.getVarName(), new Symbel(node.getTypeAsString()));
        }catch (VariableAlreadyDeclaredException e){
            System.err.println(e.Message());
            errorCount++;
            NodesWithErrors.add(node);
            return;
        }
    }


    @Override
    public void Visit(DivisionNode node) {
        //System.out.println(node.getClass().getSimpleName());
        String leftType = null;
        //System.err.println("In Division");
        if (PlusNodeHelper(node.getLeftOperand()) == "int" || PlusNodeHelper(node.getLeftOperand() ) == "float"){
            //check if the leftoperand is a constant
            leftType = PlusNodeHelper(node.getLeftOperand());
        }

        if (leftType == null) {
            //only look up for variable if its not defined as constant
            try {
                leftType = st.lookup(node.getLeftOperand()).getType();
            } catch (VariableNotDeclaredException e) {
                errorCount++;
                NodesWithErrors.add(node);
                System.err.println(e.Message());
                return;
            }
        }
        node.getRightOperandNode().Accept(this);


        if (!leftType.equals(node.getRightOperandNode().getType()) ){
            if (leftType.equals("matrix")){
                //if the left side is a matrix, i doesnt matter what type the right side is (int float or matrix) it will always return a matrix

                node.setType("matrix");
                //System.err.println("Made It " + node.getType());
            }else if (node.getRightOperandNode().getType().equals("matrix")){
                //if here we have (int | float) / matrix : that is not a valid operation
                errorCount++;
                NodesWithErrors.add(node);
                System.err.println("cant divide number with matrix: try to divide matrix by number instead");
                return;
            }else {
                //if here we have either (int / float) | (float / int) both returns a float
                node.setType("float");
            }
        }else {
            //if both sides of the division operator is the same the returntype of the division is the same as that type
            //only place it can set type to type int
            node.setType(leftType);
        }
        return;
    }

    @Override
    public void Visit(ElseIfNode node) {
       // System.out.println(node.getClass().getSimpleName());
        node.getPredicate().Accept(this);

        if (node.getPredicate().getType() != "bool"){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("Elseif expression must evaluate a boolean value");
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
        //System.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this);
        node.getRightOperandNode().Accept(this);

       if (node.getLeftOperandNode().getType() == "matrix"  || node.getRightOperandNode().getType() == "matrix"){
           if (node.getRightOperandNode().getType() != "matrix" || node.getLeftOperandNode().getType() != "matrix"){
               //cant compare matrix to number
               errorCount++;
               NodesWithErrors.add(node);
               System.err.println("Cant compare a matrix to a number but found: " + node.getLeftOperandNode().getType() + " == " + node.getRightOperandNode().getType());
               return;
           }
       }
       node.setType("bool");
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
                System.err.println(e.Message());
                errorCount++;
                NodesWithErrors.add(node);
                return;
            }
        }
       node.getPredicate().Accept(this);

       if (!node.getPredicate().getType().equals("bool")){
           errorCount++;
           NodesWithErrors.add(node);
           System.err.println("in For-loop predicate expexted type bool but found: " + node.getPredicate().getType());
           st.closeScope();
           return;
       }

        for (String varToAlter : node.varsToAlter){
            try {
                Symbel sym = st.lookup(varToAlter);
                if (sym.getType().equals("matrix")){
                    errorCount++;
                    System.err.println(" in forloop: cant increment or decrement type of " + sym.getType());
                    NodesWithErrors.add(node);
                }
            }catch (VariableNotDeclaredException e){
                System.err.println(e.Message());
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
            Symbel sym =  new Symbel(node.getReturnTypeName());
            sym.setDclNode(node);
            st.insert(node.getFunctionName(), sym);
            //System.out.println(node.getFunctionName());
        }catch (VariableAlreadyDeclaredException e){
            System.err.println(e.Message());
            errorCount++;
            return;
        }

        //open scope for the function body and parameters
        st.openScope();

        //no problem doing a explicit typecast as this should always be of that type (from parsetreevisitor)
        ParametersNode pn = (ParametersNode) node.getParmaterNode();

        for (AST param : pn.ParameterNodes)
        {

            if (param != null){
                SimpleExpressionNode sn = (SimpleExpressionNode) param;
                try {

                    st.insert(sn.getVariableName(), new Symbel(sn.getType()));
                    //System.out.println(sn.getVariableName());
                }catch (VariableAlreadyDeclaredException e){
                    errorCount++;
                    NodesWithErrors.add(node);
                    System.err.println(e.Message());
                    return;
                }
            }
        }
        AST bodynode= node.NestedNodes.get(0);
        bodynode.Accept(this);

        st.closeScope();

    }

    @Override
    public void Visit(FunctionCallNode node) {
        ///System.out.println(node.getClass().getSimpleName());
        FunctioDefinitionNode fdNode;
        try {
            Symbel sym = st.lookup(node.getFunctionId());
            node.setType(sym.getType());
            fdNode = (FunctioDefinitionNode) sym.getDclNode();
        }catch (VariableNotDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println(e.Message()); // this eroor should be rethought to define that it's a undefined function
            return;
        }
        ParametersNode parametersNode = (ParametersNode) fdNode.getParmaterNode();
        //check if the function call has the same amount of parameters as the function definition
        if (parametersNode.ParameterNodes.size() != node.ParamValueNodes.size()){
            System.err.println("Function call must have same amount of parameters (" + node.ParamValueNodes.size() +")as defined in function definition(" + parametersNode.ParameterNodes.size()+ ")");
            errorCount++;
            return;
        }
        //validate that parameters has been defined and is of right type
        for (int i = 0; i < node.ParamValueNodes.size(); i++) {
            AST param = node.ParamValueNodes.get(i);
            param.Accept(this);
            if (!param.getType().equals(parametersNode.ParameterNodes.get(i).getType())){
                System.err.println("In function call of function: " + node.getFunctionId() + " Expected parameter of type " + parametersNode.ParameterNodes.get(i).getType() + " but fount type " + param.getType());
                errorCount++;
                return;
            }
        }



    }

    @Override
    public void Visit(GreaterOrEqualNode node) {
        //System.out.println(node.getClass().getSimpleName());
    }

    @Override
    public void Visit(GreaterThanNode node) {
        //ystem.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getType().equals("matrix") ||node.getRightOperandNode().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("Cant use operator '>' on type matrix");
            return;
        }
        node.setType("bool");
    }

    @Override
    public void Visit(IfNode node) {
       // System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(LessOrEqualNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(LessThanNode node) {
        //System.out.println(node.getClass().getSimpleName());
        node.getLeftOperandNode().Accept(this );
        node.getRightOperandNode().Accept(this);

        if (node.getLeftOperandNode().getType().equals("matrix") ||node.getRightOperandNode().getType().equals("matrix")){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("Cant use operator '<' on type matrix");
            return;
        }
        node.setType("bool");
    }

    @Override
    public void Visit(MatrixCrossProductNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(MatrixScopeNode node) {
        //System.out.println(node.getClass().getSimpleName());
        st.openScope();
        try {
            st.insert(node.getScopeName(), new Symbel(node.isAwait()? "await matrixscope" : "matrixscope"));
        }catch (VariableAlreadyDeclaredException    e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println(e.Message());

        }

        for (AST child : node.NestedNodes){
            if (child != null)
                child.Accept(this);
        }

        st.closeScope();

    }

    @Override
    public void Visit(MinusNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(ModuloNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(MultiplicationNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(NotEqualNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(NotNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(OrNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(ParametersNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(ParenthesisExpressionNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(ParenthesisLogicalNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(PlusNode node) {
        //System.out.println(node.getClass().getSimpleName());

        String leftNameOrNumber = node.getLeftOperand();
        String leftType = PlusNodeHelper(leftNameOrNumber);
        System.out.println(leftNameOrNumber + " is a " + PlusNodeHelper(leftNameOrNumber));

        if (leftType == "int"){
            //left operator is a int
        }
        else if (leftType == "float"){
            //left is a float
        }
        else if(leftType == "this"){
            //check if this is valid in this context and refer to a proper variable
            //and type check of course
        }
        else {
            //left operator is a variable name check if this is exist and what type it has
        }

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

                if (leftNameOrNumber == "this"){
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
    public void Visit(ReturnNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(SimpleExpressionNode node) {
        //System.out.println(node.getClass().getSimpleName());
        if (node.getType() != null)
            return;;
        Symbel sym;
        try {
            sym = st.lookup(node.getVariableName());
        }catch (VariableNotDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println(e.Message());
            return;
        }


        node.setType(sym.getType());
    }

    @Override
    public void Visit(SubtractionNode node) {
        //System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(SwitchNode node) {
       // System.out.println(node.getClass().getSimpleName());

    }

    @Override
    public void Visit(VariableDeclarationNode node) {
       // System.out.println(node.getClass().getSimpleName());
        node.getValueNode().Accept(this);
        //System.out.println(node.getTypeAsString() + node.getValueNode().getType() + "     " + (node.getTypeAsString().compareTo(node.getValueNode().getType())));
        if (!node.getTypeAsString().equals( node.getValueNode().getType())){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println("Cant assign variable of type: " + node.getTypeAsString() + " to type: " + node.getValueNode().getType());
            return;
        }
        try {
            st.insert(node.getVarName(), new Symbel(node.getTypeAsString()));
        }catch (VariableAlreadyDeclaredException e){
            errorCount++;
            NodesWithErrors.add(node);
            System.err.println(e.Message());
        }

    }

    @Override
    public void Visit(WhileNode node) {
        //System.out.println(node.getClass().getSimpleName());
    }
}
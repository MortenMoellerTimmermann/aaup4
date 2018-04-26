package com.company.Visitor;

import com.company.ASTnodes.*;

public class CodeGenerator implements ASTVisitorInterface {


    private StringBuilder sb = new StringBuilder();

    @Override
    /*
        Denne metode er hvor vi starter (den der bliver kaldt i main)
        den bliver både kaldt i starten, og hver gang der er en body (if, else , for osv..)
     */
    public void Visit(AST root) {
        for (AST child : root.NestedNodes)
        {
            if (child != null  && !(child.getClass().getSimpleName().equals( new  FunctioDefinitionNode().getClass().getSimpleName())))
                /*
                    måden du skal besøge det nodes der er i gennem træet er ved at kalde Node.Accept og give den 'this' med som parameter altid.
                 */
                child.Accept(this);
        }
    }

    @Override
    public void Visit(AndNode node) {
        /*
            Denne node har 2 nodes i sig - en på hver side af operatoren
            som ses under
         */



        node.getLeftOperandNode().Accept(this);
        sb.append("&&");
        node.getRightOperandNode().Accept(this);

    }

    @Override
    public void Visit(AssignmentNode node) {
        /*
            Her har du en assignment den ser ud således:   node.varname = node.newValueNode
         */

        node.getAssignOperetorAsString(); //den assign operator der er blevet brugt (= , += , -=)
        node.getVarName(); //var name som string
        node.getNewValueNode().Accept(this);
    }

    @Override
    public void Visit(CaseNode node) {

        /*
            tallet casen skal evluere på formen: case(numbertoeval):{}
        */
        node.getNumberToEval();
        /*
            Forloop til at besøge alle nested statements i casen - burde altid kun være 1 child men i forloop i case af null childs
         */
        for (AST child : node.NestedNodes){
            if (child != null)
                child.Accept(this);
        }


    }

    @Override
    public void Visit(DeclareMatrixNode node) {
        /*
            Du har navnet rows og collums, samt alle værdierne i et arraylist af floats
         */
        node.getCollums();
        node.getRows();
        node.getVarName();
        node.values.size();
    }

    @Override
    public void Visit(DivisionNode node) {
        /*
            Her er der left operand som er et id til en variable og rightoperand node som kan være et længere expression
         */
        node.getLeftOperand();
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(ElseIfNode node) {
        /*
            predicate er det der skal evalueres: if (predicate){}
            og en body node der indeholder alt nested inden i
         */
        node.getPredicate().Accept(this);
        node.getBodyNode().Accept(this);
    }

    @Override
    public void Visit(ElseNode node) {
        /*
            har kun en body
         */
        node.getBodyNode().Accept(this);
    }

    @Override
    public void Visit(EqualNode node) {
        /*
            Det her er operatoren '=='
            og du har en venstre side af den og en højre
         */
        node.getLeftOperandNode().Accept(this);
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(ForNode node) {
        /*
            først har vi alle nye variable der er blevet defineret : for(int i = 0, int j = 2 ; osv )
         */
        for (AST dcl : node.Dcls){
            if (dcl != null)
                dcl.Accept(this);
        }
        /*
            Her er alle de variable der er declared andet steds: for(i, x ; osv)
         */
        for (String varName : node.Ids){

        }

        /*
            her har vi det predicate det skal evalueres hver iteraration
         */
        node.getPredicate().Accept(this);

        /*
            Her har vi alle de variable der skal ændres per iteration
            der er altid det samme antal i disse 2 arrays!
         */
       node.varsToAlter.size();
       /*
            og her har vi hvordan de skal ændres fx: (++, --)
            der er altid det samme antal i disse 2 arrays!
        */
       node.howToAlter.size();

       /*
            Forloop body
        */
        node.getBodyNode().Accept(this);
    }

    @Override
    public void Visit(FunctioDefinitionNode node) {
        /*
            Herfra antager jeg du har fanget det spørg hvis der er noget
        */
        node.getFunctionName();
        node.getReturnTypeName();

        if (node.getParmaterNode() != null) {
            ParametersNode pn = (ParametersNode) node.getParmaterNode();
            for (AST param : pn.ParameterNodes) {
                //parameter er altid en simple expression node
                SimpleExpressionNode sn = (SimpleExpressionNode) param;

            }
        }
    }

    @Override
    public void Visit(FunctionCallNode node) {

    }

    @Override
    public void Visit(GreaterOrEqualNode node) {

    }

    @Override
    public void Visit(GreaterThanNode node) {

    }

    @Override
    public void Visit(IfNode node) {
        sb.append("if(");
        node.getPredicate().Accept(this);
        sb.append("){");

        node.getBodyNode().Accept(this);
        sb.append("}");

    }

    @Override
    public void Visit(LessOrEqualNode node) {

    }

    @Override
    public void Visit(LessThanNode node) {

    }

    @Override
    public void Visit(MatrixCrossProductNode node) {

    }

    @Override
    public void Visit(MatrixScopeNode node) {

    }

    @Override
    public void Visit(MinusNode node) {

    }

    @Override
    public void Visit(ModuloNode node) {

    }

    @Override
    public void Visit(MultiplicationNode node) {
        node.getNodeSym().getType();
    }

    @Override
    public void Visit(NotEqualNode node) {

    }

    @Override
    public void Visit(NotNode node) {

    }

    @Override
    public void Visit(OrNode node) {

    }

    @Override
    public void Visit(ParametersNode node) {

    }

    @Override
    public void Visit(ParenthesisExpressionNode node) {

    }

    @Override
    public void Visit(ParenthesisLogicalNode node) {

    }

    @Override
    public void Visit(PlusNode node) {

    }

    @Override
    public void Visit(ReturnNode node) {

    }

    @Override
    public void Visit(SimpleExpressionNode node) {

    }

    @Override
    public void Visit(SwitchNode node) {

    }

    @Override
    public void Visit(VariableDeclarationNode node) {

    }

    @Override
    public void Visit(WhileNode node) {

    }

    @Override
    public Integer getErrorCount() {
        return null;
    }
}

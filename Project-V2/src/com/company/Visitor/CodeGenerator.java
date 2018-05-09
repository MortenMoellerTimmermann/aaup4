package com.company.Visitor;

import java.util.List;
import java.util.ArrayList;

import com.company.ASTnodes.*;
import com.company.Helpers.*;
import com.company.aRayParser.MatrixScopeContext;
import com.company.Generator.*;


public class CodeGenerator implements ASTVisitorInterface {


    private String code = "";

    private void Code(String c)
    {
        code = code + c;
    }

    private void Code(float c)
    {
        code = code + c;
    }

    private List<MatrixDeclaration> mdcls = new ArrayList<MatrixDeclaration>();
    private DeclareMatrixNode currentDeclarationNode;
    private MatrixDeclaration assignmentDeclaration;
    private Target MTarget = new Target();
    private int ScopeLevel = 0;

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
        Code("&&");
        node.getRightOperandNode().Accept(this);

    }

    @Override
    public void Visit(AssignmentNode node) {
        /*
            Her har du en assignment den ser ud således:   node.varname = node.newValueNode
         */

        Code(node.getVarName() + " " + node.getAssignOperetorAsString());
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
        Code("else if (");
        node.getPredicate().Accept(this);
        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    @Override
    public void Visit(ElseNode node) 
    {
        Code("else {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    @Override
    public void Visit(EqualNode node) {
        /*
            Det her er operatoren '=='
            og du har en venstre side af den og en højre
         */
        node.getLeftOperandNode().Accept(this);
        Code("==");
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
        node.getLeftOperandNode().Accept(this);
        Code(">=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(GreaterThanNode node) {
        node.getLeftOperandNode().Accept(this);
        Code(">");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(IfNode node) {
        Code("if(");
        node.getPredicate().Accept(this);
        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");

    }

    @Override
    public void Visit(LessOrEqualNode node) {
        node.getLeftOperandNode().Accept(this);
        Code("<=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(LessThanNode node) {
        node.getLeftOperandNode().Accept(this);
        Code("<");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(MatrixCrossProductNode node) {

    }

    @Override
    public void Visit(DeclareMatrixNode node) {
        /*
            Du har navnet rows og collums, samt alle værdierne i et arraylist af floats
         */
        if (node.getCollums() == null) {
            MatrixDeclaration md = new MatrixDeclaration(node);
            assignmentDeclaration = md;
            Code(md.GetCode());
            node.getValueNode().Accept(this);
        } else {
            MatrixDeclaration md = new MatrixDeclaration(node.getVarName(), node.getCollums(), node.getRows(), node.values);
            if (ScopeLevel > 0) {
                Code(md.GetCode());
            } else {
                MatrixDeclaration.Declarations.add(md);
            }
        }        
    }

    @Override
    public void Visit(MatrixScopeNode node) 
    {
        MatrixScope mscope = new MatrixScope(node.getScopeName());
        if (ScopeLevel == 0) {
            MatrixScope.Scopes.add(mscope);
            Code(mscope.GetParamLessHead());
        }
        
        ScopeLevel++;
        node.getBodyNode().Accept(this);
        Code(ScopeLevel == 1 ? "}" : "");
        ScopeLevel--;
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
        node.getLeftOperandNode().Accept(this);
        Code("!=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(NotNode node) {

    }

    @Override
    public void Visit(OrNode node) {
        node.getLeftOperandNode().Accept(this);
        Code("||");
        node.getRightOperandNode().Accept(this);
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
    public void Visit(PlusNode node) 
    {
        if (node.getNodeSym().getType() == "matrix" && assignmentDeclaration != null)
        {
            currentDeclarationNode = (DeclareMatrixNode)node.getNodeSym().getDclNode();
            assignmentDeclaration.DclNode.setRows(currentDeclarationNode.getRows());
            assignmentDeclaration.DclNode.setCollums(currentDeclarationNode.getCollums());

            MTarget.M_ONE = node.getLeftOperand();
            MTarget.M_TARGET = assignmentDeclaration.Name;
            
            node.getRightOperandNode().Accept(this);
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" + ");
            node.getRightOperandNode().Accept(this);
        }        
    }

    @Override
    public void Visit(ReturnNode node) {

    }

    @Override
    public void Visit(SimpleExpressionNode node) {
        if (node.getVariableName() == null)
        {
            Code(node.getNumber());
        }
        else
        {
            if (assignmentDeclaration != null)
            {
                MTarget.M_TWO = node.getVariableName();
                Code(assignmentDeclaration.GetAdditionDeclarationCode(MTarget));
                assignmentDeclaration = null;
            }
            else 
            {
                Code(node.getVariableName());
            }
            
        }
    }

    @Override
    public void Visit(SwitchNode node) {

    }

    @Override
    public void Visit(VariableDeclarationNode node) {
        // type
        Code(node.getTypeAsString());
        // varname
        Code(" " + node.getVarName());
        // =
        Code(" = ");
        node.getValueNode().Accept(this);
    }

    @Override
    public void Visit(WhileNode node) {

    }

    @Override
    public Integer getErrorCount() {
        return null;
    }

    public String getCode()
    {
        Bootstrapper b = new Bootstrapper(code);
        return b.BuildCode();
    }
}

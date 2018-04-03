package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;


public class ParsetreeVisitor extends aRayBaseVisitor<AST> {


    @Override
    public AST visitGlobal(aRayParser.GlobalContext ctx) {

        AST TheASTRoot = new AST();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            //not sure if need to be in loop - will know when i can test.
            TheASTRoot.NestedNodes.add(visitChildren(ctx));
        }

        return TheASTRoot;
    }

    @Override
    public AST visitBody(aRayParser.BodyContext ctx) {
        AST bodyRoot = new AST();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            //not sure if need to be in loop - will know when i cant test.
            bodyRoot.NestedNodes.add(visitChildren(ctx));
        }
        return bodyRoot;
    }

    @Override
    public AST visitFunctionBody(aRayParser.FunctionBodyContext ctx) {
        return visitChildren(ctx);
    }

    //Make a matrix from standard declaration
    @Override
    public AST visitMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx) {
        //Test to find parent.. works somewhat.. but need to google better way.
        System.out.println("Here:  "  + ctx.getParent().toInfoString(new aRayParser(null)).subSequence(18,24));

        DeclareMatrixNode newNode = new DeclareMatrixNode();
        //setting collums of new matrix
        Integer x = Integer.parseInt(ctx.collums.getText());
        newNode.setCollums(x);
        //setting rows of new matrix
        x = Integer.parseInt(ctx.rows.getText());
        newNode.setRows(x);
        newNode.setVarName(ctx.varName.getText());
        //load all values of the matrix into one list
        for (int i = 0; i < ctx.numbers.size(); i++) {
            Float nextValue;
            try {
                nextValue = Float.parseFloat(ctx.numbers.get(i).getText());
            }catch (Exception e){
                //should create error message here saying that a matrix must be declared only with numbers!
                //rethink the return value!
                System.err.println("Declare matrix with numbers only... i mean really...");
                break;
            }
            newNode.values.add(nextValue);
        }

        return newNode;
    }

    @Override
    public AST visitMatrixDcl(aRayParser.MatrixDclContext ctx) {
        DeclareMatrixNode newNode = new DeclareMatrixNode();
        //Set the defined variable name
        newNode.setVarName(ctx.varName.getText());


        /*
         Something is missing from the grammar?
         we assign matrix to what?
         if this is a left terminal of any kind this must be visited

         */
        return newNode;
    }

    @Override
    public AST visitMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx) {

        /*
            Dont understand the purpose of this declaration.
         */
        return null;
    }

    @Override
    public AST visitMatrixScope(aRayParser.MatrixScopeContext ctx) {
        MatrixScopeNode newNode = new MatrixScopeNode();

        //set the name of the matrix scope
        newNode.setScopeName(ctx.varName.getText());




        if (ctx.getChild(0).getText() == "await"){
            //If here this is the AWAIT part of matrixscope declared in aRay.g4

            //again not sure what to do here

            //visit the children (body) and add nodes to list of nested nodes Defined in AST.java
            newNode.NestedNodes.add(visitChildren(ctx));

        }else {
            //If here we have the "standard"(1'st) version of the matrix scope declared in aRay.g4

            //again not sure what to do here

            //visit the children (body) and add nodes to list of nested nodes Defined in AST.java
            //not sure if this is the correct way to do, will know when i can test
            newNode.NestedNodes.add(visitChildren(ctx));

        }

        //return the new node
        return newNode;
    }

    @Override
    public AST visitAwaitScope(aRayParser.AwaitScopeContext ctx) {

        /*
            Dont understand this either
         */
        return null;
    }

    @Override
    public AST visitFunctionDcl(aRayParser.FunctionDclContext ctx) {
        FunctioDefinitionNode newNode = new FunctioDefinitionNode();

        //This line should be implemented once again after the antlr has generated a new recognizer and files has been swapped. - when swapping files remember to delete content of VaseVisitor and make it abstract.
        newNode.setFunctionName(ctx.functionName.getText());

        // This line same as before
        //This node should possible be changed type in the FunctionDefinitionNode to fit a custom made NodeClass that fits the parameter
        //setup

        newNode.setParmaterNode(visitParameter(ctx.parameters));

        //same as first
        newNode.NestedNodes.add(visitFunctionBody(ctx.FuncBody));

        //Set the returnType as a String, so its the return type as written by the programmer.
        newNode.setReturnTypeName(ctx.returnType.getText());


        return newNode;
    }

    @Override
    public AST visitStandardDcl(aRayParser.StandardDclContext ctx) {
        //declaration : type=TYPE leftId=ID ASSIGN rightExpr=expression
        VariableDeclarationNode newNode = new VariableDeclarationNode();

        //must be visitChildren as expreesion has multiple choices of different visitor functions
        //Thus the autoGenerated visitChildren SHOULD be able to determine the right one, but this return AST,
        //thus the valueNode in AssignmentNode must be AST (might have to rework this system into visitFunctionDcl())
        //visitChildren SHOULD work fine as standardDCL only has one left terminal
        AST valueNode = visitChildren(ctx);
        newNode.setValueNode(valueNode);

        //Copy in after new recognizer form antlr just recompile and swap files.
        newNode.setVarName(ctx.leftId.getText());

        //set the type of the variable as a String property.
        newNode.setTypeAsString(ctx.type.getText());


        return newNode;
    }

    @Override
    public AST visitParameter(aRayParser.ParameterContext ctx) {
        //parameter : (paramTypes+=(TYPE | EXTENDEDTYPE) paramNamesInOrder+=ID COMMA)* (lastParamType=(TYPE | EXTENDEDTYPE) lastParamName=ID)? ;
        ParametersNode newNode = new ParametersNode();

        //add all the parameter names into list
        for (int i = 0; i < ctx.paramNamesInOrder.size(); i++) {
            newNode.ParameterNames.add(ctx.paramNamesInOrder.get(i).getText()) ;
        }
        //add the last one, or the only one if only one was defined.
        newNode.ParameterNames.add(ctx.lastParamName.getText());

        //add all the parameter types into list
        for (int i = 0; i < ctx.paramTypes.size(); i++) {
            newNode.ParameterTypes.add(ctx.paramTypes.get(i).getText()) ;
        }
        //add the last one, or the only one; if only one was defined.
        newNode.ParameterTypes.add(ctx.lastParamType.getText());

        return newNode;

    }

    @Override
    public AST visitDcl(aRayParser.DclContext ctx) {
        //statement : declaration #Dcl

        //Needs to return the defenition of a standard declaration
        //this SHOULD be done by the visitChildren method
        return visitChildren(ctx);
    }

    @Override
    public AST visitIDAssignExp(aRayParser.IDAssignExpContext ctx) {
        // statement : varName=(THIS | ID) operator=(ASSIGNMENTOPERATOR | ASSIGN) rightExpr=expression
        AssignmentNode newNode = new AssignmentNode();

        //set VariableName
        newNode.setVarName(ctx.varName.getText());

        //Set the operator as String
        newNode.setAssignOperetorAsString(ctx.operator.getText());

        //Set the new value as a node of the Expression
        newNode.setNewValueNode(visit(ctx.rightExpr));

        return newNode;
    }

    @Override
    public AST visitReturnExp(aRayParser.ReturnExpContext ctx) {
        //statement : (RETURN expression)?

        if (ctx.getChildCount() == 0){
            //as this statement can be nothing (think its denoted lambda)
            //we need to check if this is the case
            //if here, it is.
            return null;
        }
        ReturnNode newNode =new ReturnNode();

        //should only ever be one child if any
        newNode.setReturnValueNode(visitChildren(ctx));

        return newNode;
    }

    @Override
    public AST visitExpInvocation(aRayParser.ExpInvocationContext ctx) {
        // expression : invocation

        //only consists of a left terminal
        return visitChildren(ctx);
    }

    @Override
    public AST visitExpNum(aRayParser.ExpNumContext ctx) {
        // expression : value=NUM

        SimpleExpressionNode newNode = new SimpleExpressionNode();
        float value;
        try {
            value = Float.parseFloat(ctx.value.getText());
        }catch (Exception e){
            //Make some sort of error here and log it to add all errors together
            System.err.print("What you have entered is not a valid number!");
            //might have to rethink this return
            return null;
        }
        newNode.setNumber(value);

        return newNode;
    }

    @Override
    public AST visitExpId(aRayParser.ExpIdContext ctx) {
           //  expression :  varName=ID           #ExpId
        SimpleExpressionNode newNode = new SimpleExpressionNode();

        newNode.setVariableName(ctx.varName.getText());

        return newNode;
    }

    @Override
    public AST visitExpThis(aRayParser.ExpThisContext ctx) {
        //  expression :  THIS
        SimpleExpressionNode newNode = new SimpleExpressionNode();

        newNode.setVariableName("this");

        return newNode;
    }

    @Override
    public AST visitExpOperator(aRayParser.ExpOperatorContext ctx) {
        // expression :  leftIdOrNumber=(ID | THIS | NUM) operator=(OPERATOR | MATRIXOPERATOR) rightExpr=expression                #ExpOperator
        // OPERATOR : '*' | '+' | '-' | '/' | '%';
        //MATRIXOPERATOR: ':x'; A LOT OF OPERATORS MISSING



        //switch to see what operator is used and create fitting node
        switch (ctx.operator.getText()){
            case ("*"):
                MultiplicationNode newNode = new MultiplicationNode();
                newNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newNode;
            case ("+"):
                PlusNode newPlusNode = new PlusNode();
                newPlusNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newPlusNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newPlusNode;
            case ("-"):
                MinusNode newMinusNode = new MinusNode();
                newMinusNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newMinusNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newMinusNode;
            case ("/"):
                DivisionNode newDivisionNode = new DivisionNode();
                newDivisionNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newDivisionNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newDivisionNode;
            case ("%"):
                ModuloNode newModuloNode = new ModuloNode();
                newModuloNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newModuloNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newModuloNode;

            //Here starts the Matrix Operators  -- A lot is missing there are nodes for them.
            case (":x")  :
                DotProductNode newDotPNode = new DotProductNode();
                newDotPNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newDotPNode.setRightOperandNode(visitChildren(ctx.rightExpr));
                return  newDotPNode;
        }


        return null;
    }

    @Override
    public AST visitExpParenthesis(aRayParser.ExpParenthesisContext ctx) {
       //expression :   LP expr=expression RP
        ParenthesisExpressionNode newNode = new ParenthesisExpressionNode();
        //all useful information is stored in the expression.
        newNode.NestedNodes.add(visitChildren(ctx));

        return newNode;
    }

    @Override
    public AST visitExpDotPro(aRayParser.ExpDotProContext ctx) {
        //this should not be made.. this line in the grammar should be removed completely
        //This is because it can be made with  visitExpOperator all ready.
        return null;
    }

    @Override
    public AST visitLogOnlyExp(aRayParser.LogOnlyExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AST visitLogExpExp(aRayParser.LogExpExpContext ctx) {
        // leftexpr=expression operator=(LOGICALOPERATOR | CONDITIONALOPERATOR) rightLogicalexp=logicalExpression #LogExpExp
        //LOGICALOPERATOR : '==' | '!=' | '<' | '>' | '=<' | '=>' ;

        //makes no sense that conditional operator is in this? this is handled by the visitLogExpCondit method
        //So have removed this
        String op = ctx.operator.getText();
        switch (op){
            case ("=="):
                EqualNode eqNode = new EqualNode();
                eqNode.setLeftOperandNode(visit(ctx.leftexpr));
                eqNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                return eqNode;
            case ("!="):
                NotEqualNode NeqNode = new NotEqualNode();
                NeqNode.setLeftOperandNode(visit(ctx.leftexpr));
                NeqNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                return NeqNode;
            case ("<") :
                LessThanNode LTNode = new LessThanNode();
                LTNode.setLeftOperandNode(visit(ctx.leftexpr));
                LTNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                return LTNode;
            case (">"):
                GreaterThanNode GTNode = new GreaterThanNode();
                GTNode.setLeftOperandNode(visit(ctx.leftexpr));
                GTNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                return GTNode;
            case ("=<"):
                LessOrEqualNode LOENode = new LessOrEqualNode();
                LOENode.setLeftOperandNode(visit(ctx.leftexpr));
                LOENode.setRightOperandNode(visit(ctx.rightLogicalexp));
                return LOENode;
            case("=>"):
                GreaterOrEqualNode GOENode = new GreaterOrEqualNode();
                GOENode.setLeftOperandNode(visit(ctx.leftexpr));
                GOENode.setRightOperandNode(visit(ctx.rightLogicalexp));
        }
        System.err.println(op +" Is not valid Operator, it should be a operator returning a bool value.");
        return null;
    }

    @Override
    public AST visitLogExpCondit(aRayParser.LogExpConditContext ctx) {
        //logicalExpression : leftLogicalexp=logicalExpression operator=CONDITIONALOPERATOR rightLogicalexp=logicalExpression              #LogExpCondit
        //CONDITIONALOPERATOR : '||' | '&&' ;

        //If this is a OR expression
        if (ctx.operator.getText() == "||"){
            OrNode newOrNode = new OrNode();
            //set right node
            newOrNode.setRightOperandNode(visit(ctx.rightLogicalexp));
            //set left node
            newOrNode.setLeftOperandNode(visit(ctx.leftLogicalexp));
            return newOrNode;
        }else {
            //if this is a AND expression
            AndNode newAndNode = new AndNode();
            //set right node
            newAndNode.setRightOperandNode(visit(ctx.rightLogicalexp));
            //set left node
            newAndNode.setLeftOperandNode(visit(ctx.leftLogicalexp));
            return newAndNode;


        }

    }

    @Override
    public AST visitLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx) {
        // logicalExpression : LP logicalExpression RP
        ParenthesisLogicalNode newNode = new ParenthesisLogicalNode();
        newNode.NestedNodes.add(visitChildren(ctx));
        return newNode;
    }

    @Override
    public AST visitInvocation(aRayParser.InvocationContext ctx) {
    //invocation : (leftSideAssignVarNameOptional=ID assignOperator=ASSIGNMENTOPERATOR)? functionId=ID LP (parameters+=expression COMMA)* lastOrSingleParameter=expression? RP ;

        FunctionCallNode newNode = new FunctionCallNode();

        if (ctx.leftSideAssignVarNameOptional.getText() != null){
            newNode.setLeftSideVarName(ctx.leftSideAssignVarNameOptional.getText());
            newNode.setAssignOperatorAsString(ctx.assignOperator.getText());
        }
        
        newNode.setFunctionId(ctx.functionId.getText());
        for (int i = 0; i < ctx.parameters.size(); i++) {
            newNode.ParamValueNodes.add(visit(ctx.parameters.get(i)));
        }
        if (ctx.lastOrSingleParameter != null)
            newNode.ParamValueNodes.add(visit(ctx.lastOrSingleParameter));

        return newNode;
    }

    @Override
    public AST visitSelection(aRayParser.SelectionContext ctx) {
        //selection : ifStatement | switchStatement;
        //only options is leftterminals
        return visitChildren(ctx);
    }

    @Override
    public AST visitIteration(aRayParser.IterationContext ctx) {
        //iteration : forIteration | whileIteration;
        //only options is leftterminals
        return visitChildren(ctx);
    }

    @Override
    public AST visitIfStmt(aRayParser.IfStmtContext ctx) {
        //ifStatement : IF LP exprToEvaluate=logicalExpression RP ifBody=body elseIfs+=elseIfStatement* optionalElse=elseStatement?       #IfStmt;
        IfNode newNode = new IfNode();
        //return the expression to evaluate as node stored in the new node
        newNode.setPredicate(visit(ctx.exprToEvaluate));
        //set the boddy of the if stmt as a node to the body root
        newNode.setBodyNode(visit(ctx.ifBody));

        //set all the else ifs as a list of node to iterate
        for (int i = 0; i < ctx.elseIfs.size(); i++) {
            newNode.ElseIfNodes.add(visit(ctx.elseIfs.get(i)));
        }
        //set the optional else node if one is defined
        if (ctx.optionalElse != null)
            newNode.setOptionalElse(visit(ctx.optionalElse));

        return newNode;
    }

    @Override
    public AST visitElseIfStatement(aRayParser.ElseIfStatementContext ctx) {
       // elseIfStatement : ELSEIF LP expressionToEvaluate=logicalExpression RP elsifBody=body?
        ElseIfNode newNode = new ElseIfNode();
        //set predicate to eval
        newNode.setPredicate(visit(ctx.expressionToEvaluate));

        //set the root of the body as a node
        newNode.setBodyNode(visit(ctx.elsifBody));

        return newNode;
    }

    @Override
    public AST visitElseStmt(aRayParser.ElseStmtContext ctx) {
        //elseStatement : ELSE elseBody=body                                                           #ElseStmt;
        ElseNode newNode = new ElseNode();

        //set the body of the else node
        newNode.setBodyNode(visit(ctx.elseBody));

        return newNode;
    }

    @Override
    public AST visitSwitchStmt(aRayParser.SwitchStmtContext ctx) {
        //switchStatement : SWITCH LP expToEvaluate=expression RP LC cases+=caseBody* defaultBod=defaultBody RC

        SwitchNode newNode = new SwitchNode();

        //set the switch expression that will be evaluated
        newNode.setPredicate(visit(ctx.expToEvaluate));

        //add all cases to a list
        for (int i = 0; i < ctx.cases.size(); i++) {
            newNode.CaseNodes.add(visit(ctx.cases.get(i)));
        }
        //set the default case as a node
        newNode.setDefaultNode(visit(ctx.defaultBod));

        return newNode;
    }

    @Override
    public AST visitCaseBody(aRayParser.CaseBodyContext ctx) {
        //caseBody : CASE number=NUM COL (statement SEMI)* BREAK SEMI ;
        CaseNode newNode = new CaseNode();
        float val;
        try {
            val = Float.parseFloat(ctx.number.getText());
        }catch (Exception e){
            //make some sort of error managment here
            System.err.println("Must be number that should be evaluated in a case");
            //rethink return value;
            return null;
        }
        newNode.setNumberToEval(val);

        for (int i = 0; i < ctx.stmts.size(); i++) {
            newNode.NestedNodes.add(visit(ctx.stmts.get(i)));
        }

        return newNode;
    }

    @Override
    public AST visitDefaultBody(aRayParser.DefaultBodyContext ctx) {
        //defaultBody : DEFAULT COL (stmts+=statement SEMI)* BREAK;

        //only thing needed to contain the information of this node is the nested nodes list
        //cant be nothered making new node for that
        AST newNode = new AST();

        for (int i = 0; i < ctx.stmts.size(); i++) {
            newNode.NestedNodes.add(visit(ctx.stmts.get(i)));
        }
        return newNode;
    }

    @Override
    public AST visitForIte(aRayParser.ForIteContext ctx) {
        //forIteration : FOR LP (dcl=declaration | varId=ID) (COMMA (declaration | ID ))* SEMI expToEval=logicalExpression SEMI varToAlter=ID inOrDecre=INORDECREMENT (COMMA ( ID INORDECREMENT))* RP forBody=body #ForIte;
        ForNode newNode = new ForNode();


        return null;
    }

    @Override
    public AST visitWhileIte(aRayParser.WhileIteContext ctx) {

        WhileNode newNode = new WhileNode();

        
        return null;
    }
}


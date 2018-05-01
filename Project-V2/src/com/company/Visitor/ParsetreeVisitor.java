package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.SymbleTable.Symbel;
import com.company.aRayBaseVisitor;
import com.company.aRayParser;
import jdk.nashorn.api.tree.GotoTree;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;


public class ParsetreeVisitor extends aRayBaseVisitor<AST> {

    private String lastExpectedType;
    @Override
    public AST visitGlobal(aRayParser.GlobalContext ctx) {

        AST TheASTRoot = new AST();
       for (int i = 0; i < ctx.getChildCount(); i++) {
            TheASTRoot.NestedNodes.add(visit(ctx.getChild(i)));
        }

        return TheASTRoot;
    }

    @Override
    public AST visitBody(aRayParser.BodyContext ctx) {
        AST bodyRoot = new AST();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            //not sure if need to be in loop - will know when i cant test.
            bodyRoot.NestedNodes.add(visit(ctx.getChild(i)));
        }
        return bodyRoot;
    }


    //Make a matrix from standard declaration
    @Override
    public AST visitMatrixStandardDcl(aRayParser.MatrixStandardDclContext ctx) {
        //Test to find parent.. works somewhat.. but need to google better way.
        //System.out.println("Here:  "  + ctx.getParent().toInfoString(new aRayParser(null)).subSequence(18,24));

        //System.err.println(  ctx.start.getLine());
        DeclareMatrixNode newNode = new DeclareMatrixNode();
        //setting collums of new matrix
        Integer x = Integer.parseInt(ctx.collums.getText());
        newNode.setCollums(x);
        //setting rows of new matrix
        x = Integer.parseInt(ctx.rows.getText());
        newNode.setRows(x);
        newNode.setVarName(ctx.varName.getText());
        newNode.setTypeAsString("matrix");
        //load all values of the matrix into one list
        for (int i = 0; i < ctx.numbers.size(); i++) {
            Float nextValue;
            try {
                nextValue = Float.parseFloat(ctx.numbers.get(i).getText());
            }catch (Exception e){
                //should create error message here saying that a matrix must be declared only with numbers!
                //rethink the return value!
                System.err.println("This cant happen");
                break;
            }
            newNode.values.add(nextValue);
        }
        Float lastVal;
        try {
            lastVal = Float.parseFloat(ctx.lastNumber.getText());
        }catch (Exception e) {
            //should create error message here saying that a matrix must be declared only with numbers!
            //rethink the return value!
            System.err.println("Cant happen");
            return null;
        }
        newNode.values.add(lastVal);

        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitMatrixDclWithNamePara(aRayParser.MatrixDclWithNameParaContext ctx) {

        DeclareMatrixNode newNode = new DeclareMatrixNode();
        //setting collums of new matrix
        Integer x = Integer.parseInt(ctx.collums.getText());
        newNode.setCollums(x);
        //setting rows of new matrix
        x = Integer.parseInt(ctx.rows.getText());
        newNode.setRows(x);
        newNode.setVarName(ctx.varName.getText());
        newNode.setTypeAsString("matrix");

        newNode.setLineNum(ctx.start.getLine());
        return newNode;

    }

    @Override
    public AST visitMatrixScope(aRayParser.MatrixScopeContext ctx) {
        MatrixScopeNode newNode = new MatrixScopeNode();

        //set the name of the matrix scope
        newNode.setScopeName(ctx.varName.getText());




        if (ctx.getChild(0).getText().equals("await")){
            //If here this is the AWAIT part of matrixscope declared in aRay.g4

            //again not sure what to do here
            newNode.setAwait(true);
            //visit the children (body) and add nodes to list of nested nodes Defined in AST.java
            newNode.NestedNodes.add(visitChildren(ctx));

        }else {
            //If here we have the "standard"(1'st) version of the matrix scope declared in aRay.g4

            //again not sure what to do here

            //visit the children (body) and add nodes to list of nested nodes Defined in AST.java
            //not sure if this is the correct way to do, will know when i can test
            newNode.NestedNodes.add(visitChildren(ctx));

        }
        newNode.setLineNum(ctx.start.getLine());
        //return the new node
        return newNode;
    }

    @Override
    public AST visitAwaitScope(aRayParser.AwaitScopeContext ctx) {

        MatrixScopeNode newNode = new MatrixScopeNode();
        newNode.NestedNodes.add(visitChildren(ctx));

        newNode.setAwait(true);

        return newNode;
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



        //Set the returnType as a String, so its the return type as written by the programmer.
        newNode.setReturnTypeName(ctx.returnType.getText());

        lastExpectedType = newNode.getReturnTypeName();
        //same as first
        newNode.NestedNodes.add(visit(ctx.FuncBody));

        newNode.setLineNum(ctx.start.getLine());

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

        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitBoolDcl(aRayParser.BoolDclContext ctx) {
        SimpleBoolNode newNode = new SimpleBoolNode();
        Symbel sym = new Symbel("bool");
        newNode.setNodeSym(sym);
        newNode.setLineNum(ctx.start.getLine());

        newNode.setVarName(ctx.leftId.getText());

        if (ctx.val.equals("true")){

            newNode.setValue(true);
        }
        if (ctx.val.equals("false")){
            newNode.setValue(false);
        }

        if (ctx.valueNode!= null){
            newNode.setValueNode(visit(ctx.valueNode));
        }



        return newNode;
    }

    @Override
    public AST visitParameter(aRayParser.ParameterContext ctx) {
        //parameter : (paramTypes+=(TYPE | EXTENDEDTYPE) paramNamesInOrder+=ID COMMA)* (lastParamType=(TYPE | EXTENDEDTYPE) lastParamName=ID)? ;

        ParametersNode newNode = new ParametersNode();

        if (ctx.getText().equals(""))
            return null;

        if (ctx.paramNamesInOrder.size()!= ctx.paramTypes.size()){
            System.err.println("Error in declaration of function parameters - must ahve same amount of types and variable names");
            return null;
        }
        SimpleExpressionNode sn;
        //add all the parameter names into list
        for (int i = 0; i < ctx.paramNamesInOrder.size(); i++) {
            sn = new SimpleExpressionNode();

            Symbel sym = new Symbel(null);
            sn.setNodeSym(sym);

            sn.setVariableName(ctx.paramNamesInOrder.get(i).getText());
            sn.getNodeSym().setType(ctx.paramTypes.get(i).getText());
            newNode.ParameterNodes.add(sn);
        }
        sn = new SimpleExpressionNode();

        Symbel sym = new Symbel(null);
        sn.setNodeSym(sym);

        sn.setVariableName(ctx.lastParamName.getText());
        sn.getNodeSym().setType(ctx.lastParamType.getText());
        newNode.ParameterNodes.add(sn);


       // //add all the parameter names into list
       // for (int i = 0; i < ctx.paramNamesInOrder.size(); i++) {
       //     newNode.ParameterNames.add(ctx.paramNamesInOrder.get(i).getText()) ;
       // }
       // //add the last one, or the only one if only one was defined.
       // newNode.ParameterNames.add(ctx.lastParamName.getText());
//
       // //add all the parameter types into list
       // for (int i = 0; i < ctx.paramTypes.size(); i++) {
       //     newNode.ParameterTypes.add(ctx.paramTypes.get(i).getText()) ;
       // }
       // //add the last one, or the only one; if only one was defined.
       // newNode.ParameterTypes.add(ctx.lastParamType.getText());
        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());


        return newNode;
    }

    @Override
    public AST visitReturnExp(aRayParser.ReturnExpContext ctx) {
        //statement : (RETURN expression)?


        ReturnNode newNode =new ReturnNode();
        //System.out.println(lastExpectedType);
        newNode.setExpectedReturnType(lastExpectedType);
        //should only ever be one child if any

        newNode.setReturnValueNode(visitChildren(ctx));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitExpInvocation(aRayParser.ExpInvocationContext ctx) {
        // expression : invocation

        //only consists of a left terminal
        return visit(ctx.getChild(0));
    }

    @Override
    public AST visitExpNum(aRayParser.ExpNumContext ctx) {
        // expression : value=NUM

        SimpleExpressionNode newNode = new SimpleExpressionNode();

        Symbel sym = new Symbel(null);
        newNode.setNodeSym(sym);

        float value;
        try {
            value = Integer.parseInt(ctx.value.getText());
        }catch (Exception e){
            try {
                value = Float.parseFloat(ctx.value.getText());
            }catch (Exception ex){
                //Make some sort of error here and log it to add all errors together
                System.err.print("What you have entered is not a valid number!");
                //might have to rethink this return
                return null;
            }
            newNode.setNumber(value);
            newNode.getNodeSym().setType("float");

            return newNode;
        }
        newNode.setNumber(value);
        newNode.getNodeSym().setType("int");
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitExpId(aRayParser.ExpIdContext ctx) {
           //  expression :  varName=ID           #ExpId
        SimpleExpressionNode newNode = new SimpleExpressionNode();

        newNode.setVariableName(ctx.varName.getText());
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitExpThis(aRayParser.ExpThisContext ctx) {
        //  expression :  THIS
        SimpleExpressionNode newNode = new SimpleExpressionNode();

        newNode.setVariableName("this");
        newNode.setLineNum(ctx.start.getLine());
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
                newNode.setRightOperandNode(visit(ctx.rightExpr));
                newNode.setLineNum(ctx.start.getLine());
                return  newNode;
            case ("+"):
                PlusNode newPlusNode = new PlusNode();
                newPlusNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newPlusNode.setRightOperandNode(visit(ctx.rightExpr));
                newPlusNode.setLineNum(ctx.start.getLine());
                return  newPlusNode;
            case ("-"):
                MinusNode newMinusNode = new MinusNode();
                newMinusNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newMinusNode.setRightOperandNode(visit(ctx.rightExpr));
                newMinusNode.setLineNum(ctx.start.getLine());
                return  newMinusNode;
            case ("/"):
                DivisionNode newDivisionNode = new DivisionNode();
                newDivisionNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newDivisionNode.setRightOperandNode(visit(ctx.rightExpr));
                newDivisionNode.setLineNum(ctx.start.getLine());
                return  newDivisionNode;
            case ("%"):
                ModuloNode newModuloNode = new ModuloNode();
                newModuloNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newModuloNode.setRightOperandNode(visit(ctx.rightExpr));
                newModuloNode.setLineNum(ctx.start.getLine());
                return  newModuloNode;

            //Here starts the Matrix Operators  -- A lot is missing there are nodes for them.
            case (":x")  :
                MatrixCrossProductNode newDotPNode = new MatrixCrossProductNode();
                newDotPNode.setLeftOperand(ctx.leftIdOrNumber.getText());
                //Not sure if this should be called with only vistChildren(ctx).
                newDotPNode.setRightOperandNode(visit(ctx.rightExpr));
                newDotPNode.setLineNum(ctx.start.getLine());
                return  newDotPNode;
        }


        return new ErrorNode();
    }

    @Override
    public AST visitExpParenthesis(aRayParser.ExpParenthesisContext ctx) {
       //expression :   LP expr=expression RP
        ParenthesisExpressionNode newNode = new ParenthesisExpressionNode();
        //all useful information is stored in the expression.
        newNode.NestedNodes.add(visit(ctx.getChild(0)));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitExpDotPro(aRayParser.ExpDotProContext ctx) {

        //| leftVar=ID DOT rightVar=ID

        FunctionCallNode newNode = new FunctionCallNode();
        newNode.setFunctionId(ctx.rightVar.getText());
        SimpleExpressionNode nn = new SimpleExpressionNode();
        nn.setVariableName(ctx.leftVar.getText());
        newNode.ParamValueNodes.add(nn);
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitLogOnlyExp(aRayParser.LogOnlyExpContext ctx) {
        return visit(ctx.getChild(0));
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
                eqNode.setLineNum(ctx.start.getLine());
                return eqNode;
            case ("!="):
                NotEqualNode NeqNode = new NotEqualNode();
                NeqNode.setLeftOperandNode(visit(ctx.leftexpr));
                NeqNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                NeqNode.setLineNum(ctx.start.getLine());
                return NeqNode;
            case ("<") :
                LessThanNode LTNode = new LessThanNode();
                LTNode.setLeftOperandNode(visit(ctx.leftexpr));
                LTNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                LTNode.setLineNum(ctx.start.getLine());
                return LTNode;
            case (">"):
                GreaterThanNode GTNode = new GreaterThanNode();
                GTNode.setLeftOperandNode(visit(ctx.leftexpr));
                GTNode.setRightOperandNode(visit(ctx.rightLogicalexp));
                GTNode.setLineNum(ctx.start.getLine());
                return GTNode;
            case ("=<"):
                LessOrEqualNode LOENode = new LessOrEqualNode();
                LOENode.setLeftOperandNode(visit(ctx.leftexpr));
                LOENode.setRightOperandNode(visit(ctx.rightLogicalexp));
                LOENode.setLineNum(ctx.start.getLine());
                return LOENode;
            case("=>"):
                GreaterOrEqualNode GOENode = new GreaterOrEqualNode();
                GOENode.setLeftOperandNode(visit(ctx.leftexpr));
                GOENode.setRightOperandNode(visit(ctx.rightLogicalexp));
                GOENode.setLineNum(ctx.start.getLine());
                return GOENode;
        }
        System.err.println(op +" Is not valid Operator, it should be a operator returning a bool value.");
        return null;
    }

    @Override
    public AST visitLogExpCondit(aRayParser.LogExpConditContext ctx) {
        //logicalExpression : leftLogicalexp=logicalExpression operator=CONDITIONALOPERATOR rightLogicalexp=logicalExpression              #LogExpCondit
        //CONDITIONALOPERATOR : '||' | '&&' ;

        //If this is a OR expression
        if (ctx.operator.getText().equals( "||")){
            OrNode newOrNode = new OrNode();
            //set right node
            newOrNode.setRightOperandNode(visit(ctx.rightLogicalexp));
            //set left node
            newOrNode.setLeftOperandNode(visit(ctx.leftLogicalexp));
            newOrNode.setLineNum(ctx.start.getLine());
            return newOrNode;
        }else {
            //if this is a AND expression
            AndNode newAndNode = new AndNode();
            //set right node
            newAndNode.setRightOperandNode(visit(ctx.rightLogicalexp));
            //set left node
            newAndNode.setLeftOperandNode(visit(ctx.leftLogicalexp));
            newAndNode.setLineNum(ctx.start.getLine());
            return newAndNode;
        }

    }

    @Override
    public AST visitLogExpParenthesis(aRayParser.LogExpParenthesisContext ctx) {
        // logicalExpression : LP logicalExpression RP
        ParenthesisLogicalNode newNode = new ParenthesisLogicalNode();
        newNode.NestedNodes.add(visit(ctx.loexp));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitInvocation(aRayParser.InvocationContext ctx) {
    //invocation : (leftSideAssignVarNameOptional=ID assignOperator=ASSIGNMENTOPERATOR)? functionId=ID LP (parameters+=expression COMMA)* lastOrSingleParameter=expression? RP ;

        FunctionCallNode newNode = new FunctionCallNode();

      // if (ctx.leftSideAssignVarNameOptional != null){
      //     newNode.setLeftSideVarName(ctx.leftSideAssignVarNameOptional.getText());
      //     newNode.setAssignOperatorAsString(ctx.assignOperator.getText());
      // }
        
        newNode.setFunctionId(ctx.functionId.getText());
        for (int i = 0; i < ctx.parameters.size(); i++) {
            newNode.ParamValueNodes.add(visit(ctx.parameters.get(i)));
        }
        if (ctx.lastOrSingleParameter != null)
            newNode.ParamValueNodes.add(visit(ctx.lastOrSingleParameter));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitSelection(aRayParser.SelectionContext ctx) {
        //selection : ifStatement | switchStatement;
        //only options is leftterminals
        if (ctx.ifstmt != null)
            return visit(ctx.ifstmt);

        return visit(ctx.switchstmt);
    }

    @Override
    public AST visitIteration(aRayParser.IterationContext ctx) {
        //iteration : forIteration | whileIteration;
        //only options is leftterminals

        if (ctx.forite != null)
            return visit(ctx.forite);

        return visit(ctx.whileite);
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
        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitElseStmt(aRayParser.ElseStmtContext ctx) {
        //elseStatement : ELSE elseBody=body                                                           #ElseStmt;
        ElseNode newNode = new ElseNode();

        //set the body of the else node
        newNode.setBodyNode(visit(ctx.elseBody));
        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());
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
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitForIte(aRayParser.ForIteContext ctx) {
        //forIteration : FOR LP (dcl=declaration | varId=ID) (COMMA (dcls+=declaration | ids+=ID ))* SEMI expToEval=logicalExpression SEMI varToAlter=ID inOrDecre=INORDECREMENT (COMMA idsToAlter+=ID howToAlterIds+=INORDECREMENT)* RP forBody=body #ForIte;
        ForNode newNode = new ForNode();

        newNode.setPredicate(visit(ctx.expToEval));

        //Set all declartions into a list of nodes
        if (ctx.dcl != null)
            newNode.Dcls.add(visit(ctx.dcl));
        for (int i = 0; i < ctx.dcls.size(); i++) {
            newNode.Dcls.add(visit(ctx.dcls.get(i)));
        }

        //set all variable IDS into a list of strings
        if (ctx.varId != null)
            newNode.Ids.add(ctx.varId.getText());
        for (int i = 0; i < ctx.ids.size(); i++) {
            newNode.Ids.add(ctx.ids.get(i).getText());

        }

        //Set all the variable ids into a list of strings
        if (ctx.varToAlter != null)
            newNode.varsToAlter.add(ctx.varToAlter.getText());
        for (int i = 0; i < ctx.idsToAlter.size(); i++) {
            newNode.varsToAlter.add(ctx.idsToAlter.get(i).getText());

        }

        //set how theese vars should be altered into a list of strings.
        if (ctx.inOrDecre != null)
            newNode.howToAlter.add(ctx.inOrDecre.getText());
        for (int i = 0; i < ctx.howToAlterIds.size(); i++) {
            newNode.howToAlter.add(ctx.howToAlterIds.get(i).getText());

        }

        //set the root of the body
        newNode.setBodyNode(visitBody(ctx.body()));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }

    @Override
    public AST visitWhileIte(aRayParser.WhileIteContext ctx) {
        //whileIteration : WHILE LP expToEval=logicalExpression RP whileBody=body                               #WhileIte;
        WhileNode newNode = new WhileNode();

        newNode.setPredicate(visit(ctx.expToEval));
        newNode.setBodyNode(visitBody(ctx.whileBody));
        newNode.setLineNum(ctx.start.getLine());
        return newNode;
    }
}


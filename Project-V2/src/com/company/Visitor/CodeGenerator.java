package com.company.Visitor;

import com.company.ASTnodes.*;
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

    private MatrixScope currentScope;
    private String TargetMatrix;

    private int ScopeLevel = 0;


    @Override
    public void Visit(AST root)
    {
        for (AST child : root.NestedNodes)
        {
            if (child != null)
                child.Accept(this);
        }
    }

    @Override
    public void Visit(SimpleBoolNode node) {

    }

    @Override
    public void Visit(AndNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("&&");
        node.getRightOperandNode().Accept(this);

    }

    @Override
    public void Visit(AssignmentNode node)
    {
        if (node.getNodeSym() != null & node.getNodeSym().getType().equals("matrix"))
        {
            TargetMatrix = node.getVarName();
        }
        else
        {
            Code(node.getVarName() + " " + node.getAssignOperetorAsString());
        }

        node.getNewValueNode().Accept(this);
    }

    @Override
    public void Visit(CaseNode node)
    {
        Code("case (" + node.getNumberToEval() + "):");
        for (AST child : node.NestedNodes){
            if (child != null)
                child.Accept(this);
        }


    }

    @Override
    public void Visit(DivisionNode node)
    {
        if (MatchType(node, "matrix"))
        {
            MatrixOperation(node, "MatrixDiv");
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" / ");
            node.getRightOperandNode().Accept(this);
        }
    }

    @Override
    public void Visit(ElseIfNode node)
    {
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
    public void Visit(EqualNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("==");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(ForNode node)
    {
        Code("for(");
        for (AST dcl : node.Dcls)
        {
            if (dcl != null)
            {
                dcl.Accept(this);
                if (dcl != node.Dcls.get(node.Dcls.size() - 1))
                    Code(",");
            }
        }

        for (String varName : node.Ids)
        {
            Code(varName);
            if (!varName.equals(node.Ids.get(node.Ids.size() - 1)))
                Code(",");
        }

        Code(";");
        node.getPredicate().Accept(this);
        Code(";");

        for (int i = 0; i < node.varsToAlter.size(); i++)
        {
            Code(node.varsToAlter.get(i) + node.howToAlter.get(i));
            if (i+1 < node.varsToAlter.size())
                Code(",");
        }

        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    @Override
    public void Visit(FunctionDefinitionNode node)
    {

        Code(node.getReturnTypeName() + " " + node.getFunctionName());
        Code("(");

        if (node.getParameterNode() != null)
        {
            ParametersNode pn = (ParametersNode) node.getParameterNode();
            for (AST param : pn.ParameterNodes)
            {
                SimpleExpressionNode sn = (SimpleExpressionNode) param;
            }
        }

        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    @Override
    public void Visit(FunctionCallNode node)
    {
        Code(node.getFunctionId());
        Code("(");

        for (AST param : node.ParamValueNodes)
        {
            param.Accept(this);
        }

        Code(")");
    }

    @Override
    public void Visit(GreaterOrEqualNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code(">=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(GreaterThanNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code(">");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(IfNode node)
    {
        Code("if(");
        node.getPredicate().Accept(this);
        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    @Override
    public void Visit(LessOrEqualNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("<=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(LessThanNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("<");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(MatrixCrossProductNode node)
    {


    }

    @Override
    public void Visit(DeclareMatrixNode node)
    {
        if (node.values.size() == 0)
        {
            MatrixDeclaration md = new MatrixDeclaration(node);
            currentScope.LocalDeclarations.add(md);
            Code(md.declareMatrixOnly());
            TargetMatrix = node.getVarName();
            node.getValueNode().Accept(this);
        }
        else
        {
            MatrixDeclaration md = new MatrixDeclaration(node.getVarName(), node.getColumns(), node.getRows(), node.values);
            if (ScopeLevel > 0)
            {
                if (currentScope != null) 
                {
                    // FREE LATER
                    currentScope.LocalDeclarations.add(md);
                }
                
                Code(md.GetCode());
            }
            else
            {
                MatrixDeclaration.Declarations.add(md);
            }
        }        
    }

    @Override
    public void Visit(MatrixScopeNode node) 
    {
        MatrixScope mscope = new MatrixScope(node.getScopeName());
        if (ScopeLevel == 0)
        {
            currentScope = mscope;
            MatrixScope.Scopes.add(mscope);
            Code(mscope.GetParamLessHead());
        }
        
        ScopeLevel++;
        if (ScopeLevel == 1)
        {
            Code("dim3 dimBlock(BLOCK_SIZE, BLOCK_SIZE)");
        }
        node.getBodyNode().Accept(this);
        for (MatrixDeclaration localDcl : currentScope.LocalDeclarations)
        {
            Code("cudeFree(" + localDcl.DeviceName() + ");");
            Code("cudaFreeHost(" + localDcl.HostName() + ");");
        }
        Code(ScopeLevel == 1 ? "}" : "");
        ScopeLevel--;
    }

    @Override
    public void Visit(MinusNode node)
    {
        if (MatchType(node, "matrix"))
        {
            MatrixOperation(node, "MatrixSub");
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" - ");
            node.getRightOperandNode().Accept(this);
        }
    }

    @Override
    public void Visit(ModuloNode node)
    {
        if (MatchType(node, "matrix"))
        {
            MatrixOperation(node, "MatrixMod");
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" % ");
            node.getRightOperandNode().Accept(this);
        }
    }

    @Override
    public void Visit(MultiplicationNode node)
    {
        if (MatchType(node, "matrix"))
        {
            MatrixOperation(node, "MatrixMul");
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" * ");
            node.getRightOperandNode().Accept(this);
        }
    }

    @Override
    public void Visit(NotEqualNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("!=");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(NotNode node)
    {

    }

    @Override
    public void Visit(OrNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code("||");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(ParametersNode node)
    {

    }

    @Override
    public void Visit(ParenthesisExpressionNode node)
    {

    }

    @Override
    public void Visit(ParenthesisLogicalNode node)
    {

    }

    @Override
    public void Visit(PlusNode node) 
    {
        if (MatchType(node, "matrix"))
        {
            MatrixOperation(node, "MatrixAdd");
        }
        else
        {
            Code(node.getLeftOperand());
            Code(" + ");
            node.getRightOperandNode().Accept(this);
        }        
    }

    private boolean MatchType (Node node, String type)
    {
        return node.getNodeSym().getType().equals(type);
    }


    @Override
    public void Visit(ReturnNode node)
    {
        Code("return ");
        node.getReturnValueNode().Accept(this);
        Code(";");
    }

    @Override
    public void Visit(SimpleExpressionNode node)
    {
        if (node.getVariableName() == null)
        {
            Code(node.getNumber());
        }
        else
        {
            if (node.getNodeSym().getType().equals("matrix"))
            {
                Code("device_" + ActualVarName(node.getVariableName()));
                return;
            }

            Code(ActualVarName(node.getVariableName()));
        }
    }

    @Override
    public void Visit(SwitchNode node)
    {
        Code("switch(");
        node.getDefaultNode().Accept(this);
        Code(") {");

        for (AST child : node.CaseNodes)
        {
            child.Accept(this);
        }

        Code("}");
    }

    @Override
    public void Visit(VariableDeclarationNode node)
    {
        // type
        Code(node.getTypeAsString());
        // varname
        Code(" " + node.getVarName());
        // =
        Code(" = ");
        node.getValueNode().Accept(this);
    }

    @Override
    public void Visit(WhileNode node)
    {
        Code("while(");
        node.getPredicate().Accept(this);
        Code(") {");
        node.getBodyNode().Accept(this);
        Code("}");
    }

    private String ActualVarName (String name)
    {
        if (name.equals("this"))
            return currentScope.Name;

        return name;
    }

    private void MatrixOperation (ExpressionNode node, String operationName)
    {
        DeclareMatrixNode dmn = (DeclareMatrixNode) node.getNodeSym().getDclNode();

        Code("dim3 dimGrid" + node.getLeftOperand() + "(");
        Code("(" + dmn.getRows() + " + BLOCK_SIZE - 1) / BLOCK_SIZE");
        Code(",");
        Code("(" + dmn.getColumns() + " + BLOCK_SIZE - 1) / BLOCK_SIZE");
        Code(");");

        Code(operationName + "<<<dimGrid" + node.getLeftOperand() + ", dimBlock>>>(");
        Code("device_" + node.getLeftOperand() + ", ");
        node.getRightOperandNode().Accept(this);
        Code(", " + "device_" + TargetMatrix);
        Code(");");
    }

    @Override
    public Integer getErrorCount()
    {
        return null;
    }

    public String getCode()
    {
        Bootstrapper b = new Bootstrapper(code);
        return b.BuildCode();
    }
}

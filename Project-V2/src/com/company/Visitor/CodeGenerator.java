package com.company.Visitor;

import com.company.ASTnodes.*;
import com.company.Generator.*;
import java.util.List;

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
    private DeclareMatrixNode TargetMatrix;

    private int ScopeLevel = 0;
    private boolean inFunctionBody = false;


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
    public void Visit(MatrixPropertyNode node)
    {
        switch (node.getPropertyId())
        {
            case "Transpose":
                TransposeMatrix(node);
                break;
            case "Sum":
                SimpleMatrixOperation(node, "MatrixSum", node.getMatrixName());
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
            TargetMatrix = (DeclareMatrixNode) node.getNodeSym().getDclNode();
        }
        else
        {
            Code(node.getVarName() + " " + node.getAssignOperetorAsString() + " ");
        }

        node.getNewValueNode().Accept(this);
        Code(";");
    }

    @Override
    public void Visit(CaseNode node)
    {
        Code("case (" + ActualNumber(node) + "):");
        for (AST child : node.NestedNodes){
            if (child != null)
                child.Accept(this);
        }
        Code("break;");
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
        Code(" == ");
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
        String returntype = node.getReturnTypeName();
        if (returntype.equals("matrix"))
        {
            returntype = "float *";
        }

        Code(returntype + " " + node.getFunctionName());
        Code("(");

        if (node.getParameterNode() != null)
        {
            ParametersNode pn = (ParametersNode) node.getParameterNode();
            for (AST param : pn.ParameterNodes)
            {
                SimpleExpressionNode sn = (SimpleExpressionNode) param;
                String type = sn.getNodeSym().getType() + " ";
                if (sn.getNodeSym().getType().equals("matrix"))
                {
                    // CPY MEM / VALUES FROM GPU?????
                    type = "float *";
                }
                Code(type + sn.getVariableName() + ", ");
            }

            if (pn.ParameterNodes.size() > 0)
                code = code.substring(0, code.length() - 2);
        }

        Code(") {");
        inFunctionBody = true;
        node.getBodyNode().Accept(this);
        inFunctionBody = false;
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
            Code(", ");
        }

        if (node.ParamValueNodes.size() > 0)
            code = code.substring(0, code.length() - 2);

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
        Code(" > ");
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
        Code(" <= ");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(LessThanNode node)
    {
        node.getLeftOperandNode().Accept(this);
        Code(" < ");
        node.getRightOperandNode().Accept(this);
    }

    @Override
    public void Visit(MatrixCrossProductNode node)
    {


    }

    @Override
    public void Visit(DeclareMatrixNode node)
    {
        MatrixDeclaration md = new MatrixDeclaration(node);
        if (node.values.size() == 0 && !node.isRandom())
        {
            currentScope.LocalDeclarations.add(md);
            Code(md.declareMatrixOnly());
            TargetMatrix = node;
            node.getValueNode().Accept(this);
        }
        else
        {
            if (ScopeLevel > 0 || inFunctionBody)
            {
                if (currentScope != null && !inFunctionBody)
                {
                    // FREE LATER
                    currentScope.LocalDeclarations.add(md);
                }
                
                Code(md.GetCode());
            }
            else
            {
                MatrixDeclaration.Declarations.add(md);
                return;
            }
        }

        Code(";");
    }

    @Override
    public void Visit(MatrixScopeNode node) 
    {
        MatrixScope mscope = new MatrixScope(node.getScopeName(), node.isAwait());
        if (ScopeLevel == 0 && !inFunctionBody)
        {
            currentScope = mscope;
            MatrixScope.Scopes.add(mscope);
            Code(mscope.GetParamLessHead());
        }

        ScopeLevel++;
        if (ScopeLevel == 1)
        {
            Code("dim3 dimBlock(BLOCK_SIZE, BLOCK_SIZE);");
            Code("$DIM3");
        }
        node.getBodyNode().Accept(this);
        for (MatrixDeclaration localDcl : currentScope.LocalDeclarations)
        {
            Code("cudeFree(" + localDcl.DeviceName() + ");");
            Code("cudaFreeHost(" + localDcl.HostName() + ");");
        }
        Code((ScopeLevel == 1 && !inFunctionBody) ? "}" : "");
        replaceDim3Placeholders();
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
        Code("!" + node.getLeftOperand());
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
            Code(ActualNumber(node));
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

        Code("default:");
        node.getDefaultBody().Accept(this);
        Code("break;");

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
        Code(";");
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

    private String ActualNumber (SimpleExpressionNode node)
    {
        String num = Float.toString(node.getNumber());
        if (node.getNodeSym().getType().equals("int")) {
            num = num.replaceAll("\\.0*$", "");
        }

        return num;
    }

    private String ActualNumber (CaseNode node)
    {
        String num = Float.toString(node.getNumberToEval());
        if (node.getNodeSym().getType().equals("int")) {
            num = num.replaceAll("\\.0*$", "");
        }

        return num;
    }

    private void MatrixOperation (ExpressionNode node, String operationName)
    {
        DeclareMatrixNode dmn = (DeclareMatrixNode) node.getNodeSym().getDclNode();

        currentScope.Dim3Declarations.add(setDim3(node.getLeftOperand(), dmn.getRows(), dmn.getColumns()));

        Code(operationName + getDim3Call(node.getLeftOperand()));
        Code("(device_" + node.getLeftOperand() + ", ");
        node.getRightOperandNode().Accept(this);
        Code(", " + "device_" + TargetMatrix.getVarName());
        Code(")");
    }

    private void SimpleMatrixOperation (MatrixPropertyNode node, String operationName, String... params)
    {
        currentScope.Dim3Declarations.add(setDim3(node.getMatrixName(), node.getMatrixNode().getRows(), node.getMatrixNode().getColumns()));

        Code(operationName);
        Code(getDim3Call(node.getMatrixName()));
        Code("(");
        for(int i = 0; i < params.length; i++)
        {
            Code("device_" + params[i]);
            if (i + 1 != params.length) {
                Code(", ");
            }
        }
        Code(")");
    }

    private void TransposeMatrix (MatrixPropertyNode node)
    {
        int oldRows = TargetMatrix.getRows();
        TargetMatrix.setRows(TargetMatrix.getColumns());
        TargetMatrix.setColumns(oldRows);


        currentScope.Dim3Declarations.add(setDim3(node.getMatrixName(), node.getMatrixNode().getRows(), node.getMatrixNode().getColumns()));
        Code("MatrixTra" + getDim3Call(node.getMatrixName()) + "(device_" + node.getMatrixName() + ", device_" + TargetMatrix.getVarName() + ")");
    }

    private String setDim3 (String name, int rows, int cols)
    {
        String c = "";
        c += "dim3 dimGrid" + name + "(";
        c += "(" + rows + " + BLOCK_SIZE - 1) / BLOCK_SIZE";
        c += ",";
        c += "(" + cols + " + BLOCK_SIZE - 1) / BLOCK_SIZE";
        c += ");";

        return c;
    }

    private String getDim3Call(String mname)
    {
        return "<<<dimGrid" + mname + ", dimBlock>>>";
    }

    private void replaceDim3Placeholders ()
    {
        code = code.replaceAll("\\$DIM3", String.join("\n", currentScope.Dim3Declarations));
    }

    @Override
    public Integer getErrorCount()
    {
        return null;
    }

    public String getCode()
    {
        code = code.replaceAll(";", ";\n");
        Bootstrapper b = new Bootstrapper(code);
        return b.BuildCode();
    }
}

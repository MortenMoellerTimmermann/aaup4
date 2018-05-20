package com.company.ASTnodes;

import com.company.Visitor.ASTVisitorInterface;

public class MatrixPropertyNode extends ExpressionNode {
    private String matrixName;
    private String propertyId;
    private String returnType;

    private DeclareMatrixNode matrixNode;

    public String getMatrixName()
    {
        return matrixName;
    }

    public String getPropertyId()
    {
        return propertyId;
    }

    public String getReturnType()
    {
        return getReturnType();
    }

    public DeclareMatrixNode getMatrixNode()
    {
        return matrixNode;
    }

    public void setMatrixName (String name)
    {
        matrixName = name;
    }

    public void setPropertyId (String id)
    {
        propertyId = id;
    }

    public void setReturnType (String type)
    {
        returnType = type;
    }

    public void setMatrixNode (DeclareMatrixNode node)
    {
        matrixNode = node;
    }

    @Override
    public void Accept(ASTVisitorInterface visitor) {
        visitor.Visit(this);
    }

}

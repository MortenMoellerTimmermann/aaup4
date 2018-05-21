package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixDeclaration
{
    public String Name;
    public int Width;
    public int Height;
    public List<Float> Values;
    private String Code = "";

    public static List<MatrixDeclaration> Declarations = new ArrayList<MatrixDeclaration>();

    public DeclareMatrixNode DclNode;

    public String DeviceName ()
    {
        return "device_" + this.Name; 
    }

    public String HostName ()
    {
        return "host_" + this.Name;
    }

    public MatrixDeclaration (String name, int width, int height, List<Float> values)
    {
        this.Name = name;
        this.Width = width;
        this.Height = height;
        this.Values = values;

        declareMatrix();
    }

    public MatrixDeclaration (DeclareMatrixNode node)
    {
        this.Name = node.getVarName();
        this.Values = node.values;
        this.Width = node.getColumns();
        this.Height = node.getRows();

        this.DclNode = node;
    }

    public String GetCode ()
    {
        return this.Code;
    }

    private void declareMatrixBy ()
    {
        this.Width = DclNode.getColumns();
        this.Height = DclNode.getRows();

        this.Code += emit("float *" + this.HostName());
        this.Code += emit("float *" + this.DeviceName());

        allocateMatrixHost();        
        allocateMatrixDevice();
    }

    private void declareMatrix ()
    {
        this.Code += emit("float *" + this.HostName());
        this.Code += emit("float *" + this.DeviceName());

        allocateMatrixHost();
        allocateMatrixDevice();
        PopulateMatrix();
        memDeviceCopy();
    }

    public String declareMatrixOnly ()
    {
        this.Code = "";

        this.Code += emit("float *" + this.HostName());
        this.Code += emit("float *" + this.DeviceName());

        allocateMatrixHost();
        allocateMatrixDevice();
        memDeviceCopy();

        return this.Code;
    }

    private void PopulateMatrix ()
    {
        this.Code += emit("float " + this.Name + "_values[" + this.Values.size() + "] = " + this.Values);
        this.Code += emit("for (int i = 0; i < " + this.Height + "; ++i) {");
        this.Code += emit("for (int j = 0; j < " + this.Height + "; ++j) {");
        this.Code += emit(this.HostName() + "[i * " + this.Width + " + j] = " + this.Name + "_values" + "[i * " + this.Width + " + j]");
        this.Code += emit("}");
        this.Code += emit("}");
    }

    private void allocateMatrixHost ()
    {
        this.Code += emit("cudaMallocHost((void**) &" + this.HostName() + ", " + this.SizeofString() + ")");        
    }

    private void allocateMatrixDevice ()
    {
        this.Code += emit("cudaMalloc((void**) &" + this.DeviceName() + ", " + this.SizeofString() + ")");
    }

    private void memDeviceCopy ()
    {
        this.Code += emit("cudaMemcpy(" + this.DeviceName() + ", " + this.HostName() + ", " + this.SizeofString() + ", cudaMemcpyHostToDevice)");
    }

    private String SizeofString ()
    {
        return "sizeof(float)*" + this.Width + "*" + this.Height;
    }

    private String emit (String code)
    {
        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{' && lastChar != ' ')
        {
            code += ";";
        } 
        return code + "\n";
    }
}

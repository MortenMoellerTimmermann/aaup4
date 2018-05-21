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

    private boolean randomized;


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

    public MatrixDeclaration (DeclareMatrixNode node)
    {
        this.Name = node.getVarName();
        this.Values = node.values;
        this.Width = node.getColumns();
        this.Height = node.getRows();
        this.randomized = node.isRandom();

        this.DclNode = node;

        if (node.isRandom() || node.values.size() != 0)
            declareMatrix();
    }

    public String GetCode ()
    {
        return this.Code;
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
        if (!this.randomized)
            this.Code += emit("float " + this.Name + "_values[" + this.Values.size() + "] = " + this.Values);

        String value = this.Name + "_values" + "[i * " + this.Width + " + j]";
        if (this.randomized)
            value = GetRandomRange();

        this.Code += emit("for (int i = 0; i < " + this.Height + "; ++i) {");
        this.Code += emit("for (int j = 0; j < " + this.Height + "; ++j) {");
        this.Code += emit(this.HostName() + "[i * " + this.Width + " + j] = " + value);
        this.Code += emit("}");
        this.Code += emit("}");
    }

    private String GetRandomRange ()
    {
        String code = "";
        if (this.DclNode.getRandomRangeFrom() != null) {
            code += this.DclNode.getRandomRangeFrom() + " + ";
        }

        code += "rand() % ";
        if (this.DclNode.getRandomRangeTo() != null)
            code += this.DclNode.getRandomRangeTo();
        else
            code += "1024";

        code += ";";
        return code;
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

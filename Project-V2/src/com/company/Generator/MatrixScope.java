package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixScope
{
    public String Name;
    public String FuncName;
    public String Parameters = "";
    public boolean Await = false;

    private String Code = "";

    public static List<MatrixScope> Scopes = new ArrayList<MatrixScope>();
    public List<MatrixDeclaration> LocalDeclarations = new ArrayList<MatrixDeclaration>();
    public List<String> Dim3Declarations = new ArrayList<String>();

    public MatrixScope (String name, boolean await)
    {
        this.Await = await;
        this.Name = name;
        this.FuncName = "mscope_" + this.Name;
    }

    private void MakeFunction ()
    {
        SetParams();
        this.Code += emit("__device__ void " + this.FuncName + this.Parameters + " { ");
    }

    public String GetParamLessHead ()
    {
        return "__device__ void " + this.FuncName + "() {";
    }

    public String GetHeadWithParams ()
    {
        SetParams();
        return "__device__ void " + this.FuncName + this.Parameters + " { ";
    }

    public String GetCode () 
    {
        MakeFunction();
        return this.Code;
    }
    

    private void SetParams ()
    {
        String params = "(";
        for (MatrixDeclaration m : MatrixDeclaration.Declarations)
        {
            params += "float *" + m.DeviceName() + ", ";
        }
        
        params = params.substring(0, params.length() - 2);
        params += ")";
        this.Parameters = params;
    }

    private String emit (String code)
    {
        if (code.length() == 0) {
            return code + "\n";
        }
        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{' && lastChar != ' ' && lastChar != '\n')
        {
            code += ";";
        } 
        return code + "\n";
    }

    public static void InsertParams (String headless)
    {

    }
}

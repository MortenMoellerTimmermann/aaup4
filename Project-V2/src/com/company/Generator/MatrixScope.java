package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixScope
{
    public String Name;
    public String FuncName;
    public String Parameters = "";

    private String Code = "";
    private String Body = "";

    public static List<MatrixScope> Scopes = new ArrayList<MatrixScope>();
    public List<MatrixScope> Children = new ArrayList<MatrixScope>();
    

    public MatrixScope (String name)
    {
        this.Name = name;
        this.FuncName = "mscope_" + this.Name;
    }

    public void SetChild (MatrixScope mscope)
    {
        mscope.FuncName += "_in_" + this.Name;
        Children.add(mscope);
    }

    public void AppendBody (String body)
    {
        this.Body += emit(body);
        this.Body += emit("}");
    }

    private void MakeFunction ()
    {
        SetParams();
        this.Code += emit("__global__ void " + this.FuncName + this.Parameters + " { ");
        this.Code += emit(this.Body);
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
}

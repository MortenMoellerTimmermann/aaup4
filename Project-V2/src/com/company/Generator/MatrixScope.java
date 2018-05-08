package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixScope
{
    public String Name;
    private String Code = "";

    public static List<MatrixScope> Scopes = new ArrayList<MatrixScope>();

    public MatrixScope (String name)
    {
        this.Name = name;
    }

    public String GetCode () 
    {
        return this.Code;
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

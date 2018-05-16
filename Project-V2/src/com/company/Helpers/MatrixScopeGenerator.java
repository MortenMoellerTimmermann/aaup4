package com.company.Helpers;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixScopeGenerator 
{
    public static String GeneratorScopeFunction (String name)
    {
        String code = "";
        code += "void function mscope_" + name;
        code += "(float *matrix) {";
        return code;
    }

    public static String Close ()
    {
        return "}";
    }
}

package com.company.Helpers;

import java.util.*;

import com.company.ASTnodes.*;



public class CGenerator {
    public static String DeclareMatrix (int width, int height, String name)
    {
        String code = "";
        code += Indent("float *" + name);
        code += AllocateMatrix(width, height, name);
        return code;
    }
    
    private static String AllocateMatrix (int width, int height, String name)
    {
        String code = "";
        code += Indent(name + " = " + "malloc(sizeof(float)*" + width + "*" + height + ")");
        return code;
    }

    public static String PopulateMatrix (int width, int height, String name, List<Float> values)
    {
        String code = "";
        code += Indent("float " + name + "_values[" + values.size() + "] = " + values);
        code += Indent("for (int i = 0; i < " + height + "; ++i) {");
        code += Indent("for (int j = 0; j < " + width + "; ++j) {", 1);
        code += Indent(name + "[i * " + width + " + j] = " + name + "_values" + "[i * " + width + " + j]", 2);
        code += Indent("}", 1);
        code += Indent("}");
        return code;
    }

    private static String Indent (String code, int... level)
    {
        String indents = "";
        if (level.length > 0)
        {
            for (int i = 1; i <= level[0]; i++) {
                indents += "\t";
            }
        }

        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{')
        {
            code += ";";
        } 
        
        return indents + code + "\n";
    }
}

package com.company.Helpers;

import java.util.*;

import com.company.ASTnodes.*;


public class CGenerator {

    public static String Bootstrap (String code)
    {
        String boot = "";
        boot += Indent("#include <stdlib.h>");
        boot += Indent("#include <stdio.h>");
        boot += Indent("int main (void) {");
        boot += code;
        boot += Indent("return 0", 1);
        boot += Indent("}");

        return boot;
    }

    public static String DeclareMatrix (int width, int height, String name)
    {
        String code = "";
        code += Body("float *" + name);
        code += AllocateMatrix(width, height, name);
        return code;
    }
    
    private static String AllocateMatrix (int width, int height, String name)
    {
        String code = "";
        code += Body(name + " = " + "malloc(sizeof(float)*" + width + "*" + height + ")");
        return code;
    }

    public static String PopulateMatrix (int width, int height, String name, List<Float> values)
    {
        String code = "";
        code += Body("float " + name + "_values[" + values.size() + "] = " + values);
        code += Body("for (int i = 0; i < " + height + "; ++i) {");
        code += Body("for (int j = 0; j < " + width + "; ++j) {", 1);
        code += Body(name + "[i * " + width + " + j] = " + name + "_values" + "[i * " + width + " + j]", 2);
        code += Body("}", 1);
        code += Body("}");
        return code;
    }

    private static String Body (String code, int... level)
    {
        return "\t" + Indent(code, level);
    }

    private static String Indent (String code, int... level)
    {
        String Bodys = "";
        if (level.length > 0)
        {
            for (int i = 1; i <= level[0]; i++) {
                Bodys += "\t";
            }
        }

        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{' && lastChar != ' ')
        {
            code += ";";
        } 
        
        return Bodys + code + "\n";
    }
}

package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Beautify
{
    public static String Pretty (String code)
    {
        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{' && lastChar != ' ')
        {
            code += ";";
        } 
        return code + "\n";
    }
}

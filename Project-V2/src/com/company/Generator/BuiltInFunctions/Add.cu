package com.company.Generator.BuiltInFunctions;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Add
{
    public String AddFunction()
    {
        String code = "";
        code += "MatrixAdd(";
        //code += target.Device("M_ONE") + ", ";
        //code += target.Device("M_TWO") + ", ";
        //code += target.Device("TARGET") + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        //code += target.Device("TARGET")+ "[i][j] =" + target.Device("M_ONE")+ "[i][j] + " + target.Device("M_TWO") + "[i][j];";

        return code;
    }

    public String CallAddFunction()
    {
        String code = "";

        return code;
    }
}

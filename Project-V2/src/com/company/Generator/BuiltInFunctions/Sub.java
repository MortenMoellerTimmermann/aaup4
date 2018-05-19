package com.company.Generator.BuiltInFunctions;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;
import com.company.Generator.*;

public class Sub
{
    public String SubFunction()
    {
        String code = "";
        code += "MatrixSub(";
        //code += target.Device("M_ONE") + ", ";
        //code += target.Device("M_TWO") + ", ";
        //code += target.Device("TARGET") + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        // code += target.Device("TARGET")+ "[i][j] =" + target.Device("M_ONE")+ "[i][j] - " + target.Device("M_TWO") + "[i][j];";

        return code;
    }

    public String CallSubFunction()
    {
        String code = "";

        return code;
    }
}

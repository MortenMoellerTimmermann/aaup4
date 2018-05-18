package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Add
{
    public String AddFunction(Target target)
    {
        String code = "";
        code += "MatrixAdd(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += emit("int i = threadIdx.x;");
        code += emit("int j = threadIdx.y;");
        code += emit(target.Device("TARGET")+ "[i][j] =" + target.Device("M_ONE")+ "[i][j] + " + target.Device("M_TWO") + "[i][j];")

        return code;
    }

    public String CallAddFunction(Target target)
    {
        String code = "";

        return code;
    }
}

package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Sub
{
    public String SubFunction(Target target)
    {
        String code = "";
        code += "MatrixSub(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += emit("int i = threadIdx.x;");
        code += emit("int j = threadIdx.y;");
        code += emit(target.Device("TARGET")+ "[i][j] =" + target.Device("M_ONE")+ "[i][j] - " + target.Device("M_TWO") + "[i][j];")

        return code;
    }

    public String CallSubFunction(Target target)
    {
        String code = "";

        return code;
    }
}

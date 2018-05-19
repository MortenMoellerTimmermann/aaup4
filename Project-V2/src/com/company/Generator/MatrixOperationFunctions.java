package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixOperationFunctions
{
    public static String MatrixAdd (Target target)
    {

        String code = "";
        code += "MatrixAdd(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + ")";
        return code;
    }

    public static String MatrixSub (Target target)
    {

        String code = "";
        code += "MatrixSub(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + ")";
        return code;
    }

    public static String MatrixMul (Target target)
    {

        String code = "";
        code += "MatrixMul(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + ")";
        return code;
    }
}

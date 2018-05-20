package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixOperationFunctions
{
    public static String MatrixAdd (Target target)
    {

        String code = "";
        code += "__device__ void "
        code += "MatrixAdd(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += emit("int i = threadIdx.x;");
        code += emit("int j = threadIdx.y;");
        code += emit(target.Device("TARGET") + "[i][j] =" + target.Device("M_ONE") + "[i][j] + " + target.Device("M_TWO") + "[i][j];")
        code += emit("}")
        return code;
    }

    public static String MatrixSub (Target target)
    {

        String code = "";
        code += "__device__ void "
        code += "MatrixSub(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += emit("int i = threadIdx.x;");
        code += emit("int j = threadIdx.y;");
        code += emit(target.Device("TARGET") + "[i][j] =" + target.Device("M_ONE") + "[i][j] - " + target.Device("M_TWO") + "[i][j];")
        code += emit("}")
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

    public static String MatrixTrans (Target target)
    {
        String code = "";
        code += "__device__ void "
        code += "MatrixTrans(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("TARGET") + "){";
        code += emit("int x = blockIdx.x * blockDim.x + threadIdx.x;");
        code += emit("int y = blockIdx.y * blockDim.y + threadIdx.y;");
        code += emit("if(x >= matrixSize || y>= matrixSize)");
        code += emit("return;");
        code += emit(target.Device("TARGET") + "[x][y] = " + target.Device("M_ONE") + "[x][y];");
        code += emit("}")
        return code;
    }
}

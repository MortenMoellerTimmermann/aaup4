package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixOperationFunctions
{
    public static String MatrixAdd (Target target)
    {

        String code = "";
        code += "__device__ void ";
        code += "MatrixAdd(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        code += target.Device("TARGET") + "[i][j] =" + target.Device("M_ONE") + "[i][j] + " + target.Device("M_TWO") + "[i][j];";
        code += "}";
        return code;
    }

    public static String MatrixSub (Target target)
    {

        String code = "";
        code += "__device__ void ";
        code += "MatrixSub(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("M_TWO") + ", ";
        code += target.Device("TARGET") + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        code += target.Device("TARGET") + "[i][j] =" + target.Device("M_ONE") + "[i][j] - " + target.Device("M_TWO") + "[i][j];";
        code += "}";
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
        code += "__device__ void ";
        code += "MatrixTrans(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("TARGET") + "){";
        code += "int x = blockIdx.x * blockDim.x + threadIdx.x;";
        code += "int y = blockIdx.y * blockDim.y + threadIdx.y;";
        code += "if(x >= matrixSize || y>= matrixSize)";
        code += "return;";
        code += target.Device("TARGET") + "[x][y] = " + target.Device("M_ONE") + "[x][y];";
        code += "}";
        return code;
    }
    
    public static String MatrixSum (Target target)
    {
        String code = "";
        code += "__device__ void ";
        code += "MatrixSum(";
        code += target.Device("M_ONE") + ", ";
        code += target.Device("TARGET") + "){";
        code += "__shared__ int LocalSum[N];";
        code += "int x = blockIdx.x * blockDim.x + threadIdx.x;";
        code += "for(int i = 0; i < N; i++){"
        code += "LocalSum[x] +=" + target.Device("M_ONE") + "[x][i];"
        code += "}";
        code += "__syncthreads();";
        code += target.Device("TARGET") + "[0][x] = LocalSum[x];"
        code += "}";
        return code;
    }
}

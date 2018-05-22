package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixOperationFunctions
{
    public static String MatrixAdd ()
    {

        String code = "";
        code += "__device__ void ";
        code += "MatrixAdd(";
        code += "float* A" + ", ";
        code += "float* B" + ", ";
        code += "float* C" + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        code += "C[i][j] = A[i][j] + " + "B[i][j];";
        code += "}";
        return code;
    }

    public static String MatrixSub ()
    {

        String code = "";
        code += "__device__ void ";
        code += "MatrixSub(";
        code += "float* A" + ", ";
        code += "float* B" + ", ";
        code += "float* C" + "){";
        code += "int i = threadIdx.x;";
        code += "int j = threadIdx.y;";
        code += "C[i][j] = A[i][j] - " + "B[i][j];";
        code += "}";
        return code;
    }

    public static String MatrixMul ()
    {

        String code = "";
        code += "MatrixMul(";
        code += "float* A" + ", ";
        code += "float* B" + ", ";
        code += "float* C" + "){";
        return code;
    }

    public static String MatrixTrans ()
    {
        String code = "";
        code += "__device__ void ";
        code += "MatrixTrans(";
        code += "float* A" + ", ";
        code += "float* B" + "){";
        code += "int x = blockIdx.x * blockDim.x + threadIdx.x;";
        code += "int y = blockIdx.y * blockDim.y + threadIdx.y;";
        code += "if(x >= matrixSize || y>= matrixSize)";
        code += "return;";
        code += "B[x][y] = A[x][y];";
        code += "}";
        return code;
    }
    
    public static String MatrixSum ()
    {
        String code = "";
        code += "__device__ void ";
        code += "MatrixSum(";
        code += "float* A" + ", ";
        code += "float* B" + "){";
        code += "__shared__ int LocalSum[N];";
        code += "int x = blockIdx.x * blockDim.x + threadIdx.x;";
        code += "for(int i = 0; i < N; i++){";
        code += "LocalSum[x] +=A[x][i];";
        code += "}";
        code += "__syncthreads();";
        code += "B[0][x] = LocalSum[x];";
        code += "}";
        return code;
    }
}

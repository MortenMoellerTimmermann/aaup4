package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class MatrixOperationFunctions
{
    public static String MatrixAdd ()
    {
        return "__global__ void matrix_add(float* A, float* B, float* C, unsigned int rows, unsigned int cols)\n" +
                "{\n" +
                "    unsigned int idx = blockIdx.x * blockDim.x + threadIdx.x;\n" +
                "    unsigned int idy = blockIdx.y * blockDim.y + threadIdx.y;\n" +
                "\n" +
                "    if (idx < cols && idy < rows) \n" +
                "    {\n" +
                "        unsigned int pos = idy * cols + idx;\n" +
                "        C[pos] = A[pos] + B[pos];\n" +
                "    }\n" +
                "}";
    }

    public static String MatrixScalar ()
    {
        return "" +
                "__global__ void matrix_scalar(float* A, float*B, float x, unsigned int rows, unsigned int cols)\n" +
                "{\n" +
                "    unsigned int idx = blockIdx.x * blockDim.x + threadIdx.x;\n" +
                "    unsigned int idy = blockIdx.y * blockDim.y + threadIdx.y;\n" +
                "\n" +
                "    if (idx < cols && idy < rows) \n" +
                "    {\n" +
                "        unsigned int pos = idy * cols + idx;\n" +
                "        B[pos] = A[pos] * x;\n" +
                "    }\n" +
                "  \n" +
                "}";
    }

    public static String MatrixSub ()
    {

        return "__global__ void matrix_sub(float* A, float* B, float* C, unsigned int rows, unsigned int cols)\n" +
                "{\n" +
                "    unsigned int idx = blockIdx.x * blockDim.x + threadIdx.x;\n" +
                "    unsigned int idy = blockIdx.y * blockDim.y + threadIdx.y;\n" +
                "\n" +
                "    if (idx < cols && idy < rows) \n" +
                "    {\n" +
                "        unsigned int pos = idy * cols + idx;\n" +
                "        C[pos] = A[pos] - B[pos];\n" +
                "    }\n" +
                "}";
    }

    public static String MatrixMul ()
    {

        return "__global__ void matrix_mul(float *a,float *b, float *c, int m, int n, int k)\n" +
                "{ \n" +
                "    int row = blockIdx.y * blockDim.y + threadIdx.y; \n" +
                "    int col = blockIdx.x * blockDim.x + threadIdx.x;\n" +
                "    float sum = 0;\n" +
                "    if( col < k && row < m) \n" +
                "    {\n" +
                "        for(int i = 0; i < n; i++) \n" +
                "        {\n" +
                "            sum += a[row * n + i] * b[i * k + col];\n" +
                "        }\n" +
                "        c[row * k + col] = sum;\n" +
                "    }\n" +
                "}";
    }

    public static String MatrixTrans ()
    {
        return "__global__ void matrix_transpose(float* mat_in, float* mat_out, unsigned int rows, unsigned int cols) \n" +
                "{\n" +
                "    unsigned int idx = blockIdx.x * blockDim.x + threadIdx.x;\n" +
                "    unsigned int idy = blockIdx.y * blockDim.y + threadIdx.y;\n" +
                "\n" +
                "    if (idx < cols && idy < rows) \n" +
                "    {\n" +
                "        unsigned int pos = idy * cols + idx;\n" +
                "        unsigned int trans_pos = idx * rows + idy;\n" +
                "        mat_out[trans_pos] = mat_in[pos];\n" +
                "    }\n" +
                "}";
    }
    
    public static String MatrixSum ()
    {
        return "__global__ void matrix_sum(float *A, float *FinalSum, unsigned int cols, unsigned int rows)\n" +
                "{ \n" +
                "    float sum = 0;\n" +
                "    for (int i = 0; i < rows; ++i) {\n" +
                "        for (int j = 0; j < cols; ++j) {\n" +
                "            sum += A[i * cols + j];\n" +
                "        }\n" +
                "    }\n" +
                "    *FinalSum = sum;\n" +
                "}";
    }
}

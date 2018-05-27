package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Bootstrapper
{
    private String Code = "";
    public Bootstrapper (String body)
    {
        Includes();
        DeclareBuildInFunctions();
        //FunctionDeclarations(body);
        MainBody(body);
        Code = Code.replaceAll("\\{", "{\n");
        Code = Code.replaceAll("\\}", "}\n");
        CleanUp();
    }

    public String BuildCode ()
    {
        return this.Code;
    }

    private void Includes ()
    {
        this.Code += "#include <stdio.h>\n";
        this.Code += "#include <stdlib.h>\n";
        this.Code += "#include <assert.h>\n";
        // Define BLOCK SIZE
        this.Code += "#define BLOCK_SIZE 32\n";
    }

    private void DeclareBuildInFunctions ()
    {
        this.Code += MatrixOperationFunctions.MatrixAdd() + "\n";
        this.Code += MatrixOperationFunctions.MatrixMul() + "\n";
        this.Code += MatrixOperationFunctions.MatrixSub() + "\n";
        this.Code += MatrixOperationFunctions.MatrixSum() + "\n";
        this.Code += MatrixOperationFunctions.MatrixScalar() + "\n";
        this.Code += MatrixOperationFunctions.MatrixTrans() + "\n";
    }

    private void FunctionDeclarations (String body)
    {
        String params = "";
        for (MatrixDeclaration md : MatrixDeclaration.Declarations)
        {
            params += "float *" + md.DeviceName() + ",";
        }

        for (MatrixScope ms : MatrixScope.Scopes)
        {
            body = body.replace(ms.GetParamLessHead(), ms.GetHeadWithParams());
        }
        this.Code += body;
    }

    private void DeclareMatrix (MatrixDeclaration md)
    {
        Emit("float *" + md.HostName() + ";");
        Emit("cudaMallocHost((void **) &" + md.HostName() + ", sizeof(float)*" + md.Width + "*" + md.Height + ");");
        Emit(md.PopulateMatrix());
        Emit("float *" + md.DeviceName() + ";");
        Emit("cudaMalloc((void **) &" + md.DeviceName() + ", sizeof(float)*" + md.Width + "*" + md.Height + ");");
        Emit("cudaMemcpy(" + md.DeviceName() + "," + md.HostName() + ", " + "sizeof(float)*" + md.Width + "*" + md.Height + ", cudaMemcpyHostToDevice);");
        Emit("dim3 dimGrid" + md.Name + "((" + md.Width + " + BLOCK_SIZE - 1) / BLOCK_SIZE, (" + md.Height + " + BLOCK_SIZE - 1) / BLOCK_SIZE);");
    }

    private void CallFunctions ()
    {
        for (MatrixScope ms : MatrixScope.Scopes)
        {
            String cleanParams = ms.Parameters.replaceAll("([A-z]*.\\*)", "");
            this.Code += emit(ms.FuncName + "<<<dimGrid, dimBlock>>>" + cleanParams);
            if (ms.Await)
            {
                this.Code += emit("cudaDeviceSynchronize()");
            }
        }
    }

    private void MainBody (String c)
    {
        this.Code += emit("int main (int argc, char const *argv[]) {");
        Emit("dim3 dimBlock(BLOCK_SIZE, BLOCK_SIZE);");
        for (MatrixDeclaration md : MatrixDeclaration.Declarations)
        {
            DeclareMatrix(md);
        }
        this.Code += emit(c);
        this.Free();
        this.Code += emit("return 0");
        this.Code += emit("}");
    }

    private void Free ()
    {
        for (MatrixDeclaration m : MatrixDeclaration.Declarations)
        {
            Emit("cudaFree(" + m.DeviceName() + ")");
            Emit("cudaFreeHost(" + m.HostName() + ")");
        }
    }

    private String emit (String code)
    {
        Character lastChar = code.charAt(code.length() - 1);
        if (lastChar != '}' && lastChar != '{' && lastChar != ' ')
        {
            code += ";";
        } 
        return code + "\n";
    }

    private void CleanUp ()
    {
        //Code = Code.replaceAll("\n", "");
        Code = Code.replaceAll(";\\s\\n;", ";");
        Code = Code.replaceAll(";;", ";");
    }

    private void Emit (String code)
    {
        this.Code += code + "\n";
    }
}

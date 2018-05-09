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
        FunctionDeclarations(body);
        MainBody();
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
        this.Code += "#define BLOCK_SIZE 16\n";
    }

    private void FunctionDeclarations (String body)
    {
        String params = "";
        for (MatrixDeclaration md : MatrixDeclaration.Declarations)
        {
            params += "float *" + md.DeviceName() + ",";
        }
        params = params.substring(0, params.length() - 1);
        for (MatrixScope ms : MatrixScope.Scopes)
        {
            body = body.replace(ms.GetParamLessHead(), ms.GetHeadWithParams());
        }
        this.Code += body;
    }

    private void MatrixDeclarations ()
    {   
        String ccode = "";
        for (MatrixDeclaration m : MatrixDeclaration.Declarations)
        {
            ccode += m.GetCode();
        }

        this.Code += ccode;
    }

    private void CallFunctions ()
    {
        for (MatrixScope ms : MatrixScope.Scopes)
        {
            String cleanParams = ms.Parameters.replaceAll("([A-z]*.\\*)", "");
            this.Code += emit(ms.FuncName + "<<<dimGrid, dimBlock>>>" + cleanParams); 
        }
    }

    private void MainBody ()
    {
        this.Code += emit("int main (int argc, char const *argv[]) {");
        this.MatrixDeclarations();
        this.CallFunctions();
        this.Free();
        this.Code += emit("return 0");
        this.Code += emit("}");
    }

    private void Free ()
    {
        for (MatrixDeclaration m : MatrixDeclaration.Declarations)
        {
            this.Code += emit("cudeFree(" + m.DeviceName() + ")");
            this.Code += emit("cudaFreeHost(" + m.HostName() + ")");
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
}

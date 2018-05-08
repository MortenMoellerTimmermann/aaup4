package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Bootstrapper
{
    private String Code = "";
    public Bootstrapper (String main)
    {
        Includes();
        FunctionDeclarations();
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
    }

    private void FunctionDeclarations ()
    {
        String ccode = "";
        for (MatrixScope ms : MatrixScope.Scopes)
        {
            ccode += ms.GetCode();
        }

        this.Code += ccode;
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

    private void MainBody ()
    {
        this.Code += emit("int main (int argc, char const *argv[]) {");
        this.MatrixDeclarations();
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

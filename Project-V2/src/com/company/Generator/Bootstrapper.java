package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Bootstrapper
{
    private String Code = "";
    public Bootstrapper ()
    {
        Includes();
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

    }

    private void MainBody ()
    {

    }

    private void Free ()
    {

    }
}

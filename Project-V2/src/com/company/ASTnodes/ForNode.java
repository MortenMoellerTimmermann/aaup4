package com.company.ASTnodes;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ForNode extends IterationNode {
    //forIteration : FOR LP (dcl=declaration | varId=ID) (COMMA (dcls+=declaration | ids+=ID ))* SEMI expToEval=logicalExpression SEMI varToAlter=ID inOrDecre=INORDECREMENT (COMMA idsToAlter+=ID howToAlterIds+=INORDECREMENT)* RP forBody=body #ForIte;

    public List<String> Ids = new ArrayList<String>();
    public List<AST> Dcls = new ArrayList<AST>();

    public List<String> varsToAlter = new ArrayList<String>();
    public List<String> howToAlter = new ArrayList<String>();




}

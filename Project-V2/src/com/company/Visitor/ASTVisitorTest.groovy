package com.company.Visitor

import com.company.ASTnodes.AssignmentNode
import com.company.SymbleTable.SymbelTable

class ASTVisitorTest extends GroovyTestCase {

    ASTVisitorInterface visitor = new ASTVisitor(new SymbelTable());

    void testVisit() {

        AssignmentNode newNode = new AssignmentNode();

        visitor.Visit(newNode);
        assertEquals(0, visitor.getErrorCount());

    }

    void testVisit1() {


    }
}

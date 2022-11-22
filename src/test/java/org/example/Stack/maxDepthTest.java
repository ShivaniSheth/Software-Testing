package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class maxDepthTest {
maxDepth m= new maxDepth();
    @Test
    void maxdepth() {
        //for test paths
        assertEquals(0,m.maxdepth("##"),"maxdepth Test successful");
        assertEquals(0,m.maxdepth(")"),"maxdepth Test successful");
        assertEquals(0,m.maxdepth("("),"maxdepth Test successful");
        assertEquals(2,m.maxdepth("(())"),"maxdepth Test successful");
        //for prime paths
        assertEquals(1,m.maxdepth("()"),"maxdepth Test successful");
        assertEquals(0,m.maxdepth(""),"maxdepth Test successful");

    }
}
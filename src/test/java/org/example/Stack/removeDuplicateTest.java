package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeDuplicateTest {

    @Test
    void removeduplicates() {
        removeDuplicate r=new removeDuplicate();
        assertEquals("ca",r.removeduplicates("abbaca"),"maxdepth Test successful");
        //test paths
        assertEquals("",r.removeduplicates("aa"),"maxdepth Test successful");
        //prime paths
        assertEquals("ab",r.removeduplicates("ab"),"maxdepth Test successful");
        assertEquals("a",r.removeduplicates("a"),"maxdepth Test successful");
        assertEquals("a",r.removeduplicates("abb"),"maxdepth Test successful");
        assertEquals("aba",r.removeduplicates("aba"),"maxdepth Test successful");
        assertEquals("",r.removeduplicates("abba"),"maxdepth Test successful");


    }
}
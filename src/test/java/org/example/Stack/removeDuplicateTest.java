package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeDuplicateTest {

    @Test
    void removeduplicates() {
        removeDuplicate r=new removeDuplicate();
        assertEquals("ca",r.removeduplicates("abbaca"),"maxdepth Test successful");
    }
}
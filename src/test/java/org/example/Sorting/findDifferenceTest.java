package org.example.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findDifferenceTest {
findDifference f=new findDifference();
    @Test
    void finddifference() {

        // Test cases for edge coverage
        assertEquals('a',f.finddifference("",""));
        assertEquals('e',f.finddifference("abcd","abcde"));

        // Test cases for prime path coverage
        assertEquals('y',f.finddifference("","y"));
        assertEquals('a',f.finddifference("",""));
        assertEquals('e',f.finddifference("abc","abce"));
        assertEquals('a',f.finddifference("b","ba"));
        assertEquals('b',f.finddifference("a","ab"));
    }
}
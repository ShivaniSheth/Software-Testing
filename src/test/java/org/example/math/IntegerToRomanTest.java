package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman itr = new IntegerToRoman();
    @Test
    void intToRoman() {
        //edge coverage
        assertEquals("M",itr.intToRoman(1000));
        //prime path coverage
        assertEquals("CM",itr.intToRoman(900));
        assertEquals("",itr.intToRoman(0));
        assertEquals("MCM",itr.intToRoman(1900));
    }
}
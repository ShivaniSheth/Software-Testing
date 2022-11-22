package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman itr = new IntegerToRoman();
    @Test
    void intToRoman() {
        assertEquals("VIII",itr.intToRoman(8));
    }
}
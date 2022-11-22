package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    CountPrimes c = new CountPrimes();

    @Test
    void countPrimes() {
        assertEquals(4, c.countPrimes(10));
    }
}
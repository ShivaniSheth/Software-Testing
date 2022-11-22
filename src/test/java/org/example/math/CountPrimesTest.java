package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {
CountPrimes c=new CountPrimes();

    @Test
    void countPrimes() {

        //edge coverage
        assertEquals(1,c.countPrimes(3));
        assertEquals(2,c.countPrimes(5));
        // prime path coverage
        assertEquals(0,c.countPrimes(2));

}
}
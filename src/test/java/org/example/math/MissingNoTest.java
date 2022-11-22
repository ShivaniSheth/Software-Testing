package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNoTest {
    MissingNo obj = new MissingNo();
    @Test

    void missingNumber() {
        int arr1[] = {1,0};
        int arr2[] = {0};
        int arr3[] = {};

        //edge coverage
        assertEquals(1, obj.missingNumber(arr2));
        //prime path coverage
        assertEquals(2, obj.missingNumber(arr1));
        assertEquals(0, obj.missingNumber(arr3));
    }
}
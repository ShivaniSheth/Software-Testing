package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNoTest {
    MissingNo obj = new MissingNo();
    @Test

    void missingNumber() {
        int arr[] = {1,2,4,0};
        assertEquals(3, obj.missingNumber(arr));
    }
}
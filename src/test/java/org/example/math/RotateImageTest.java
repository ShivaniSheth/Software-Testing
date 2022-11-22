package org.example.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {
    RotateImage obj = new RotateImage();
    @Test
    void rotate() {

        int arr[][] = {{1,2},{3,4}};
        int exp[][] = {{3,1},{4,2}};
        obj.rotate(arr);
        assertArrayEquals(exp, arr);
//        assertArrayEquals(exp[1], arr[1]);//Equals(exp, obj.rotate(arr));
    }
}
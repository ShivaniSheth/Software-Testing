package org.example.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {

    PrimeFactorization  obj = new PrimeFactorization();
    public static void func1(int arr[])
    {
        ArrayList<Integer> array_list =
                new ArrayList<Integer>();

        // Using add() method to add elements in array_list
        for (int i = 0; i < arr.length; i++)
            array_list.add(arr[i]);
        System.out.print(array_list);
    }
    @Test
    void primeFactorization() {
        Object arr1[] = {};
        Object arr2[] = {2,3};
        Object arr3[] = {2,3,5};

        Object arr4[] = {2,5,7};
        Object arr5[] = {2,7};
        Object arr6[] = {2};
        Object arr7[] = {2,5};
        Object arr8[] = {3,5,7};

        //edge coverage
        assertArrayEquals(arr1, obj.primeFactorization(1).toArray());
        assertArrayEquals(arr2, obj.primeFactorization(6).toArray());
        assertArrayEquals(arr3, obj.primeFactorization(30).toArray());
        //prime path coverage
        assertArrayEquals(arr4, obj.primeFactorization(70).toArray());
        assertArrayEquals(arr5, obj.primeFactorization(14).toArray());
        assertArrayEquals(arr6, obj.primeFactorization(4).toArray());
        assertArrayEquals(arr7, obj.primeFactorization(20).toArray());
        assertArrayEquals(arr8, obj.primeFactorization(105).toArray());
    }
}
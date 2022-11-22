package org.example.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class squaresofSortedArrayTest {
squaresofSortedArray s=new squaresofSortedArray();
    @Test
    void sortedSquares() {

        // Test cases for edge coverage
        int list1[]={};
        int list2[]={};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{3};
        list2=new int[]{9};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{-1,3,7};
        list2=new int[]{1,9,49};
        assertArrayEquals(list2,s.sortedSquares(list1));

        // Test cases for prime path coverage
        list1=new int[]{};
        list2=new int[]{};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{3};
        list2=new int[]{9};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{3,6};
        list2=new int[]{9,36};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{2,5,7};
        list2=new int[]{4,25,49};
        assertArrayEquals(list2,s.sortedSquares(list1));

        list1=new int[]{-4,1,2};
        list2=new int[]{1,4,16};
        assertArrayEquals(list2,s.sortedSquares(list1));
    }
}
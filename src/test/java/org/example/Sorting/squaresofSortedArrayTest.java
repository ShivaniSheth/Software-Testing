package org.example.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class squaresofSortedArrayTest {
squaresofSortedArray s=new squaresofSortedArray();
    @Test
    void sortedSquares() {
        int list1[]={-4,-1,0,3,10};
        int list2[]={0,1,9,16,100};
        assertArrayEquals(list2,s.sortedSquares(list1));
    }
}
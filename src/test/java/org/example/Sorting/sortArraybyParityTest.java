package org.example.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortArraybyParityTest {
sortArraybyParity s=new sortArraybyParity();

    @Test
    void sortarrayByparity() {
        // Test cases for edge coverage
        int list1[]={2,3,8,9};
        int list2[]={2,8,3,9};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

        list1=new int[]{3,1,2,4};
        list2=new int[]{2,4,3,1};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

        // Test cases for prime path coverage
        list1=new int[]{2,4};
        list2=new int[]{2,4};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

        list1=new int[]{1,4};
        list2=new int[]{4,1};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

        list1=new int[]{4,9};
        list2=new int[]{4,9};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

        list1=new int[]{11,9};
        list2=new int[]{11,9};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

    }
}
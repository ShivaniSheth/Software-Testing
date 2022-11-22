package org.example.Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sortArraybyParityTest {
sortArraybyParity s=new sortArraybyParity();

    @Test
    void sortarrayByparity() {
        int list1[]={3,1,2,4};
        int list2[]={2,4,3,1};
        assertArrayEquals(list2,s.sortarrayByparity(list1));

    }
}
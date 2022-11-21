package org.example.Sorting;

public class squaresofSortedArray {
    public  int[] sortedSquares(int[] nums) {
        int length = nums.length;
        if (length == 0) return new int[0];

        int[] result = new int[length];
        int l = 0, r = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            int start = nums[l] * nums[l];
            int end = nums[r] * nums[r];
            if (start > end) {
                result[i] = start;
                l++;
            } else {
                result[i] = end;
                r--;
            }
        }
        return result;
    }
}

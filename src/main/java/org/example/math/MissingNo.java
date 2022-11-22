package org.example.math;

public class MissingNo {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println( (n*(n+1)/2 - sum)  );
        return n*(n+1)/2 - sum;
    }
}

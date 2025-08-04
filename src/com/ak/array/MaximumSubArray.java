package com.ak.array;

public class MaximumSubArray {
    public static void main(String[] args) {

        int[] nums={-2,1,-3,1,-1};
        System.out.println(maxsubarray(nums));
    }

    static  int maxsubarray(int [] nums){
        int sum  =0;
        int max_sum =  nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum  =  sum + nums[i];
            if (sum> max_sum){
                max_sum= sum;
            }
            if (sum< 0){
                sum  =0;
            }
        }
return max_sum;

    }
}

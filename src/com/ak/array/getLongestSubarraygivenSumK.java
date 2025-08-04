package com.ak.array;

public class getLongestSubarraygivenSumK {
    public static void main(String[] args) {

        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongest(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    static int getLongest(int [] nums ,  int k){
        int n = nums.length;
        int max_sum = 0;
int sum =0;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];

                if (sum == k) {

                    max_sum = Math.max(max_sum, j - i + 1);
                }
            }
        }
return max_sum;
    }
}

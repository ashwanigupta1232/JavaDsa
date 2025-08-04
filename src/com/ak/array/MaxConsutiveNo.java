package com.ak.array;

public class MaxConsutiveNo {

    static int maxCounsutive(int[] ar){
        int count =  0;
        int max_count  =0;
        for (int i = 0 ; i<ar.length;i++) {
            if (ar[i]==1){
                count++;
                max_count =  Math.max(count ,  max_count);
            }
            else {
                count =0;
            }
        }
        return max_count;
    }

    public static void main(String[] args) {

        int[] nums  =  {1, 0, 0, 1, 1, 1};

        System.out.println(maxCounsutive(nums));

    }
}

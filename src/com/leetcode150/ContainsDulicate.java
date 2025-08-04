package com.leetcode150;

import java.util.HashSet;

public class ContainsDulicate {


    public static boolean containDuplicate(int [] nums){

        HashSet<Integer> hs =  new HashSet<>();
        for (int num : nums){
            if (hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        int ar[] = {1,3,3,6,7,8};

        System.out.println(containDuplicate(ar));




    }
}

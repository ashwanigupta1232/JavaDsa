package com.ak.Java8programs;

import java.util.Arrays;


public class findsmallestNofromArray {
    public static void main(String[] args) {

        int[] ar = { 2, 4, 5, 6, 7, 8,  13, 65, 78 };
// first approch
       int  firstNo =Arrays.stream(ar).distinct().min().getAsInt();
        System.out.println(firstNo);


        // second approch
        int min_num = Arrays.stream(ar).distinct().skip(1)
                .min().getAsInt();

        System.out.println(min_num);
    }
}

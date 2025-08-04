package com.ak.Java8programs;

import java.util.Arrays;

import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromarray {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};

        Set<Integer> ls1  =Arrays.stream(numbers).boxed()
             .collect(Collectors.toSet());

        System.out.println(ls1);

        System.out.println("********************");

        int [] uniqeelement  =
                Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(uniqeelement));





    }
}

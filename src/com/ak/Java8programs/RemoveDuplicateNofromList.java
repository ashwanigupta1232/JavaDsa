package com.ak.Java8programs;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNofromList {
    public static void main(String[] args) {


        List<Integer> withdup = Arrays.asList(2,3,4,5,3,2,3,1);

        List<Integer> withoutDuplicate =

                withdup.stream().distinct().toList();

        System.out.println(withoutDuplicate);

    }
}

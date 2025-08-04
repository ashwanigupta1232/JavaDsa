package com.ak.Java8programs;

import java.util.Arrays;

public class LargestWordinsString {


    public static void main(String[] args) {

        String str = "This is a simple Java program";
        String larget =

                Arrays.stream(str.split("\\s+")).
                        max((a , b) -> a.length()-b.length())
                        .orElse("//");

        System.out.println(larget);

    }
}



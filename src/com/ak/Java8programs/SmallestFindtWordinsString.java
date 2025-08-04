package com.ak.Java8programs;

import java.util.Arrays;

public class SmallestFindtWordinsString {

    public static void main(String[] args) {

        String str = "This is a simple Java program";

        String smallest =
                Arrays.stream(str.split("\\s+")).min(
                        (a,b) -> a.length()-b.length()
                ).orElse("//");
        System.out.println(smallest);

    }
}

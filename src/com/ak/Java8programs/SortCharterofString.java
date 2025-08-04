package com.ak.Java8programs;


import java.util.stream.Collectors;

public class SortCharterofString {
    public static void main(String[] args) {

        String str = "hello this is ashwani";

        String shorting =
           str.chars().sorted().
                        mapToObj(c ->String.valueOf((char) c))
                        .collect(Collectors.joining());


        System.out.println(shorting);

    }
}

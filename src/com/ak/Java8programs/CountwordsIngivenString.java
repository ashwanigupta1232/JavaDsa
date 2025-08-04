package com.ak.Java8programs;

import java.util.Arrays;

public class CountwordsIngivenString {

    public static void main(String[] args) {

        String str= "hello this is ashwani gupta from puranpur";

        Long count =  Arrays.stream
                (str.trim().split("\\s+")).count();
        System.out.println(count);

    }
}

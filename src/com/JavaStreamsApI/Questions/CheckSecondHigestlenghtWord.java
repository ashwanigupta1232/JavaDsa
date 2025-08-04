package com.JavaStreamsApI.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class CheckSecondHigestlenghtWord {

    public static void main(String[] args) {

        String str = "hello my name is ashwani gupta";

        String result = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).
                skip(1).findFirst().get();

        System.out.println(result);
    }
}

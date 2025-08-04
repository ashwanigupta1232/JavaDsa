package com.JavaStreamsApI.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class RetunnLengthofSecondHigestWord {
    public static void main(String[] args) {


        String str = "hello my name is ashwani gupta";

        Integer result = Arrays.stream(str.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).
                skip(1).findFirst().get();

        System.out.println(result);
    }
}

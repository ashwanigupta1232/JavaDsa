package com.JavaStreamsApI.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class FindHigestLenghtWords {

    public static void main(String[] args) {

        String str = "hello this is ashwani gupta";

        String result = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(result);

    }

}

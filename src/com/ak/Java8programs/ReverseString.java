package com.ak.Java8programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {

        String str =  "hello world";
// first approch
        String revserString = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i)+"")
                .collect(Collectors.joining());

        System.out.println(revserString);
        System.out.println("********************************");

        // second approch

        String reversed = str.chars()  // Convert string to an IntStream of ASCII values
                .mapToObj(c -> String.valueOf((char) c))  // Convert int (ASCII) to char and then to String
                .reduce("", (reversedStr, c) -> c + reversedStr);  // Reverse by prepending chars

        System.out.println(reversed);
    }
}

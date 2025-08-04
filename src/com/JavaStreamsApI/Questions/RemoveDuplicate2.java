package com.JavaStreamsApI.Questions;

import java.util.Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {


        // remove duplicates and return string in same order

        String str = "absbdbabbd";
//Aprroch 1
        Arrays.stream(str.split("")).distinct().forEach(System.out::println);

        //Approch 2str.c

    //    str.chars().distinct().mapToObj(x -> (char) x).forEach(s-> System.out.println(s));

    }
}

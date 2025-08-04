package com.ak.Java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {

    // reverse words like sentence in using stream api opeartions
    public static void main(String[] args) {

        String sentence = "       java is fun and java is powerful      ";

        // first approch
      String rev =  Arrays.stream(sentence.split(" ")).collect
              (Collectors.collectingAndThen(Collectors.toList() , list ->{
                  Collections.reverse(list);
                  return list.stream();
             })).collect(Collectors.joining(" "));

        System.out.println(rev);
        System.out.println("*************************");

        // second approch using reduce funtion


        String rev1 = Arrays.stream(sentence.trim().split(" "))
                .reduce((w1 ,w2) -> w2 + " "+ w1).orElseThrow( () -> new NumberFormatException("no String"));

        System.out.println(rev);

    }
}

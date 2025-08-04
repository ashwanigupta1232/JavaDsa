package com.ak.Java8programs;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharcterFrequncy {

    public static void main(String[] args) {

        String input  = "hello world";

        Map<Character, Long> hmap = input.chars()
                .filter(c-> c !=' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));

        hmap.forEach((a,b) -> System.out.println(a + " "+ b));

    }
}

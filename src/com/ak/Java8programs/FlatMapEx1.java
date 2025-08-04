package com.ak.Java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx1 {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(2,3,4,5,3,2,1,1,15);
        List<Integer> l2  = Arrays.asList(2,3,4,5,3,2,1,1,15);

        List<Integer> flatList = Stream.of(l1,l2).distinct().flatMap(l ->l.stream()).
                collect(Collectors.toList());

        System.out.println(flatList);
    }
}

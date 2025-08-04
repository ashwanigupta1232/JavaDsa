package com.ak.Java8programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementinArray {

    /*
    i will use three 3 approch here one using with hashmap and one with set and third in

    optinol for trying using list.

     */
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 1, 4, 5, 6, 2, 7, 3};

        Map<Integer, Long> frequncy = Arrays.stream(numbers)
                .boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Repeating element");

        frequncy.entrySet().stream().filter(n -> n.getValue()>1).map(e -> e.getKey())
                .forEach(System.out::println);

        //
        int[] numbers1 = {1, 2, 3, 1, 4, 5, 6, 2, 7, 3};

        Set<Integer> seen = new HashSet<>();
        List<Integer> repeatingElements = Arrays.stream(numbers)
                .boxed()
                .filter(seen::add) // Add returns false if the element is already in the set
                .distinct()
                .toList();

        System.out.print("Repeating Elements: " + repeatingElements);

//
        int[] numbers2 = {1, 2, 3, 1, 4, 5, 6, 2, 7, 3};

        List<Integer> repeatingElements2 = Arrays.stream(numbers)
                .boxed()
                .filter(num -> Arrays.stream(numbers).filter(x -> x == num).count() > 1)
                .distinct()
                .collect(Collectors.toList());

        System.out.print("Repeating Elements: " + repeatingElements);
    }
    }


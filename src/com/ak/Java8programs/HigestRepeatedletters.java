package com.ak.Java8programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HigestRepeatedletters {

    public static void main(String[] args) {


        String str = " hello programming word";

        String repeated = Arrays.stream(str.split("\\s+"))
                .max(Comparator.comparing(word ->word.chars()
                        .boxed().collect(Collectors.groupingBy
                                (c -> c ,Collectors.counting())
                        ).values().stream().max(Long::compare)
                        .orElse(0L)
                )).orElse("");

        System.out.println(repeated);

    }
}

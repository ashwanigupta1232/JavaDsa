package com.ak.Java8programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountsWords {
    public static void main(String[] args) {

        List<String> ls1 = Arrays.asList("AA", "BB", "cc", "AA");

        // Count word occurrences using streams
        Map<String, Long> wordCountMap = ls1.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), // Group by the word itself
                        Collectors.counting() // Count occurrences
                ));

        // Print the result
        System.out.println(wordCountMap);

        // Optional: Filter and print only repeated words (count > 1)
        Map<String, Long> repeatedWords = wordCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Keep only entries with count > 1
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Repeated Words: " + repeatedWords);

        CountsWordsExample2.CountsWords2();
    }
}

 class CountsWordsExample2{

    public static void CountsWords2() {
        List<String> ls2 = Arrays.asList("AAyy", "rrBB", "rrcc", "rrcc");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the list and count words
        for (String word : ls2) {
            if (wordCountMap.containsKey(word)) {
                // If the word is already in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the result
        System.out.println(wordCountMap);

        // Optional: Filter and print only repeated words (count > 1)
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Repeated Word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}

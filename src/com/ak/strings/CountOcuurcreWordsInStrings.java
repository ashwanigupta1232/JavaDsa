package com.ak.strings;

import java.util.HashMap;
import java.util.Map;

public class CountOcuurcreWordsInStrings {
    public static void main(String[] args) {
        String str = "This is a test. This test is easy.";

        String[]words = str.toLowerCase().split("\\s+");

        Map<String , Integer> hm =  new HashMap<>();
        for (String word :  words){
            hm.put(word ,hm.getOrDefault(word ,0)+1);

        }
// use var instead of map.entry
        for (Map.Entry<String , Integer> hmp : hm.entrySet()){
            System.out.println(hmp.getKey());
            System.out.println(hmp.getValue());
        }
    }
}

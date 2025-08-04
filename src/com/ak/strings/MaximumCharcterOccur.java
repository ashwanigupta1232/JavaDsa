package com.ak.strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumCharcterOccur {

    public static void main(String[] args) {

        String  str ="Ashwani gupta";
        Map<Character , Integer> hmap =  new HashMap<>();
        for (char ch :  str.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch ,0)+1);

        }

        char maximumoccur= ' ';
        int maxfreeuncy=0;

    for(Map.Entry<Character , Integer> map:   hmap.entrySet()){
        if (map.getValue()>maxfreeuncy){
            maxfreeuncy= map.getValue();
            maximumoccur = map.getKey();
        }
    }
        System.out.println("Maximum occurring character: '" + maximumoccur + "' with a frequency of " + maxfreeuncy);



    }
}

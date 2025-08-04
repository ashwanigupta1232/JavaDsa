package com.ak.java;

import java.util.HashMap;

import java.util.Map;

public class HashMapWorking {

    public static void main(String[] args) {

        Map<Integer ,String> hm =  new HashMap<>();

        hm.put(1,"ak");
        hm.put(2,"vk");
        hm.put(1 ,"ok");

        for (Integer i:  hm.keySet()){
            System.out.println(i.hashCode());
        }
    }
}

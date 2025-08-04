package com.ak.strings;

import java.util.Arrays;
import java.util.List;

public class FindNameWithJ {

    public static void main(String[] args) {

        String[] ar ={"John", "Megha" ,"Ruby", "jacky"};

        for (String s :  ar){
            if(s.toUpperCase().startsWith("J")){
                System.out.println(s);
            }
        }

        // another approched using stream

        List<String> ls1 = Arrays.stream(ar).filter(e ->e.toUpperCase().startsWith("J")).toList();

        System.out.println(ls1);

    }
}

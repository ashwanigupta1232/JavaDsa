package com.ak.strings;

public class RemoveSpecialCharcter {
    public static void main(String[] args) {

        String s = "Abc@%dbdhdhs@%$*";
        System.out.println(removeSpclCharcter(s));

    }

    static String removeSpclCharcter(String str){
        return str.replaceAll("[^A-Za-z0-9]" ,"");


    }
}

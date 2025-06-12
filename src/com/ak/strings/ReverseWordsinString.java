package com.ak.strings;

public class ReverseWordsinString {

    public static void main(String[] args) {

        String str = "hello the blue is sky";
        System.out.println(reverseWords(str));
    }
static  String reverseWords(String str){
        String rev ="";
        String [] words =  str.split("\\s+");
    for (int i = words.length-1; i >=0 ; i--) {
      rev =  rev + words[i];
      if (i!=0){
          rev = rev+" ";
      }


    }
    return rev;

}

}



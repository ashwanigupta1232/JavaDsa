package com.ak.strings.SubStrings;

public class LargestoddNofromString {

    public static void main(String[] args) {

        String s = "22";
        System.out.println(findlargestoddNo(s));
        System.out.println(findlargestoddNo2(s));

    }

    //Apprcoh 1
   static String findlargestoddNo(String str){
       int len = str.length() - 1;

       while (len >= 0) {
           char ch = str.charAt(len);
           if (Character.isDigit(ch) && ((ch - '0') % 2 != 0)) {
               return str.substring(0, len + 1);
           }
           len--;
       }

       return "no odd number found";
    }
    // Apprcch 2

    static String findlargestoddNo2(String str){
        int len = str.length() ;
        for (int i = len-1; i >=0 ; i--) {
            char ch =  str.charAt(i);
            if (Character.isDigit(ch) && ((ch - '0') % 2 != 0));{
            return str.substring(0, i + 1);
        }
}
        return "no odd number found";
        }
    }



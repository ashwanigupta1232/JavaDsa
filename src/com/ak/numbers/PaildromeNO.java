package com.ak.numbers;

public class PaildromeNO {

    public static void main(String[] args) {

      if (checkPaildrome(121)){
          System.out.println("No is palindrome");
      }
      else {
          System.out.println("no is not palindrome");
      }

    }

    static boolean checkPaildrome(int n){
        int orignalno =n;
        int rev = 0;
        while (n!=0){
            int digit =  n%10;
          rev =  rev*10+digit;
            n =  n/10;
        }
        return orignalno == rev;
    }
}

package com.ak.numbers;

public class ReverseNo {

    public static void main(String[] args) {


        int n = 121;
        int rev = 0;
        int painldrome =  n;


        while (n != 0) {

int digit =  n%10;
rev =  rev*10+digit;
n= n/10;

        }
      if (rev == painldrome){
          System.out.println("no is paildrome");
      }
else {
          System.out.println("no is not paildrome");
      }

    }
}

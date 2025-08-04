package com.ak.numbers;

public class ArmStrongNo {

    public static void main(String[] args) {

       /*
       * a number is said to be an Armstrong number
       * if the sum of its own digits raised to a power of digits results in the number itself. For instance,
       * the Armstrong numbers 0, 1, 153, 370,
       * 371, 407, 1634, 8208, and 9474 are both three-
       * and four-digit Armstrong numbers.
        *
       * */

        int n =  154 ;

        int ref =  n ;
        int cube  =  0;
        int rem ;

        while(n!=0){
            rem =  n%10;
            cube += (int) Math.pow(rem , 3);
            n = n/10;

        }
        if (cube==ref){
            System.out.println(ref + " is an arm strong no");
        }
        else {
            System.out.println(ref+ " is an not arm strong number");
        }
    }
}

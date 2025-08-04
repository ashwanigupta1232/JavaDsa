package com.ak.numbers;

public class GCDTwoNumber {

    public static void main(String[] args) {

        int n1 =12;
        int n2 =  28;
        int gcd = gdctwoNumber(12, 18);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);


    }

    static int gdctwoNumber(int n1 , int n2){
        if (n2==0){
            return n1;

        }
        else {
            return gdctwoNumber(n2 , n1%n2);
        }
    }
}

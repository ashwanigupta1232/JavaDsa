package com.ak.numbers;

public class LCMTwoNumber {
    public static void main(String[] args) {
        int a = 12, b = 18;

        int lcm = lcmtwoNumber(a, b);

        // Display LCM
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);

    }

    static int lcmtwoNumber(int n1 , int n2){
        return (n1*n2) /gdctwoNumber(n1,n2);
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

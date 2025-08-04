package com.ak.numbers;


public class FindPrimeNo {
    public static void main(String[] args) {
//            boolean flag =  false;
//        for (int i  =  2 ; i < 12; i++){
//            if (isPrime(i)){
//                flag = true;
//                System.out.println(i+" ");
//            }
//        }
        int primeNo =  29;
        if (isPrime(primeNo)){
            System.out.println(primeNo +" : no is prime");
        }
        else {
            System.out.println(primeNo+ " : no is not prime ");
        }

    }

    public static boolean isPrime(int n){
        if (n<=1){
            return  false;

        }
     for (int i =2 ; i<= n/2;i++){
         if (n%2==0){
             return  false;
         }
     }
     return  true;
    }
}

package com.ak.numbers;

public class CountDigit {

    public static void main(String[] args) {

        int No = 123453000;
    int count =  countDigit(No);
        System.out.println(count);

    }

    public static  int countDigit(int number){
    int count =0;
       int orgNo = number ;
       while
       (orgNo!=0){
           orgNo/=10;
           count++;
       }
       if (number==0) {
           count = 1;
       }
       return count;
    }
}

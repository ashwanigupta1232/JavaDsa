package com.ak.array;

public class LeftRotateanarraybyoneplace {


    public static void main(String[] args) {

        int ar[]= {2,3,4,2,23,42};
        int temp = ar[0];
        int n =  ar.length;
        for (int i = 0; i <n-1 ; i++) {
            ar[i] = ar[i+1];
        }
        ar[n-1]=   temp;

        for (int i = 0; i < n; i++) {
            System.out.println(ar[i] + " ");
        }


    }
}

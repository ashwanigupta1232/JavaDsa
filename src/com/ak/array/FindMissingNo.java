package com.ak.array;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] ar = {2,3,5,6};
        int n =  ar.length;
        int sum  = ( n*(n+1))/2;
        int temp = 0;
        for (int j : ar) {
            temp = temp + j;
        }
      //  int sum  = ( n*(n+1))/2;
        int missingNo =  sum-temp;
        System.out.println(missingNo);
    }
}

package com.ak.array;

public class CheckArraySorted {


    static boolean ifsorted(int ar[]) {

        for (int i = 1; i < ar.length ; i++) {
            if (ar[i]< ar[i-1])
                return false;
        }
return true;
    }


    public static void main(String[] args) {
      //  int ar[] = {2, 4, 5, 23, 42};
        int ar[] = {32 ,2, 4, 5, 23, 42};
        int n = ar.length;
        //  int ar [] = {1,2,3,4};
        System.out.println(ifsorted(ar ));
    }
}
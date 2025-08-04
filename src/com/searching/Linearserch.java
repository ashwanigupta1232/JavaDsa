package com.searching;

public class Linearserch {
    public static void main(String[] args) {

        //  check if k = 3 is persent in array

        int k  =3;
        int ar[] = {2,3,5,6};
        int i;
        for (i = 0; i <ar.length ; i++) {
            if (ar[i]==k){
                System.out.println("element in present in the array index " + i);
                break;
            }

        }
       if (i==ar.length){
           System.out.println("element is not  present in the array ");
       }
    }
}

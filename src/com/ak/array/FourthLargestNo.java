package com.ak.array;

public class FourthLargestNo {
    public static void main(String[] args) {
        int[] ar = {2, 4, 5, 6, 7, 8, 3, 13, 65, 78};

        int temp;
        int size = ar.length;

       for (int i = 0; i < size; i++) {
        for (int j = i+1; j < size; j++) {
            if (ar[i] > ar[j]) {
               temp = ar[i];
               ar[i] = ar[j];
               ar[j]= temp; 
                
            }
        }
       
       }
        System.out.println(ar[size-4]);
    }
}

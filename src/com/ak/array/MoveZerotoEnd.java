package com.ak.array;

import java.util.Arrays;

public class MoveZerotoEnd {


    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j==-1){
            System.out.println(Arrays.toString(arr));
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

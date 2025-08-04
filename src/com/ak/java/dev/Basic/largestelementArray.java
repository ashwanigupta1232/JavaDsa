package com.ak.java.dev.Basic;

public class largestelementArray {

	// op[timal approch
	public static void main(String[] args) {

		/*
		 * int[] arr = {1,4,9,6,7}; int max = 0;
		 *
		 * for(int i = 0 ; i<arr.length;i++) { if(arr[i]>max) { max = arr[i]; } }
		 * System.out.println(max); }
		 */
		// find smallest no in array

		int[] arr = { 1, 4, 9, 6, 7 };
		int min = arr[0];

		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		System.out.println(min);

	}

}

package com.ak.java.dev.Basic;

public class AvrageArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5, 5, 9 };
		int n = arr.length;
		double av = avragearay(arr, n);
		System.out.println(av);
		int dup = removeduplicatelment(arr, n);
		System.out.println(dup);
	}

	public static double avragearay(int arr[], int n) {
		int sum = 0;
		for (int element : arr) {

			sum += (double) element;
		}
		double average = sum / n;

		return average;

	}

	// remove duplicate element of array
	public static int removeduplicatelment(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("size of array");
		return n;

		// return duplicate;
	}

}

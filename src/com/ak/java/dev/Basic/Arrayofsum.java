package com.ak.java.dev.Basic;

public class Arrayofsum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 4, 5, 5, 9 };
		int n = arr.length;

		// int sum = sumarray(arr);

		// System.out.println("The sum of the elements of the array is " + sum);

//	        int[] rev = reverseArray(arr, n);
//	        System.out.println("Reversed Array:");
//	        for (int i = 0; i < n; i++) {
//	            System.out.print(rev[i] + " ");
//	        }
		int dup = DuplicateArray(arr, n);
		System.out.println(dup);
	}

	// static int sumarray(int []arr ) {
//		int sum  = 0;
//		for (int i = 0;  i<arr.length ;i++) {
//			sum+=arr[i];
//		}
//		return sum;
//
//	}
//
	public static int[] reverseArray(int[] arr, int n) {
		int[] reversedArray = new int[n];
		int j = n - 1;

		for (int i = 0; i < n; i++) {
			reversedArray[j] = arr[i];
			j--;
		}

		return reversedArray;
	}

	public static int DuplicateArray(int[] arr, int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
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

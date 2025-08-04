package com.ak.array;

public class RotateArrayKposition {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;

		roataeArrayKth(ar, k);
		printarray(ar);
	}

	/**
	 * step 1- reverse array step -2 roate array in seconnd method step 3 - print
	 * the result
	 */

	public static int[] reverseArray(int[] num, int start, int end) {
		while (start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
		return num;
	}

	public static void roataeArrayKth(int[] ar, int k) {
		k = k % ar.length;
		reverseArray(ar, 0, ar.length - 1);
		reverseArray(ar, 0, k - 1);
		reverseArray(ar, k, ar.length - 1);

	}

	public static void printarray(int[] ar) {
		for (int i : ar) {
			System.out.println(i);
		}

	}
}

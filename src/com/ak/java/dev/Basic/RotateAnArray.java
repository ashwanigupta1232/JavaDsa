package com.ak.java.dev.Basic;

public class RotateAnArray {

	// theme rotate array

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int k = 2;
		roate(ar, k);
		for (int i : ar) {
			System.out.print(i + " ");
		}

	}

	public static void roate(int[] num, int k) {
		if (k > num.length)
			k = k % num.length;

		int[] result = new int[num.length];

		for (int i = 0; i < k; i++) {
			result[i] = num[num.length - k + i];
		}
		int j = 0;
		for (int i = k; i < num.length; i++) {
			result[i] = num[j];
		}
		System.arraycopy(result, 0, num, 0, num.length);
	}
}

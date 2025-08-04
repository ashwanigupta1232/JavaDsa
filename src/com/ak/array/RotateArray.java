package com.ak.array;

public class RotateArray {
	public static void main(String[] args) {

		int[] ar = { 3, 4, 72, 86, 14, 67, 35 };
		int order = 0;

		if (ar == null || order < 0) {
			throw new IllegalArgumentException("illigeal");

		}
		for (int i = 0; i < order; i++) {
			for (int j = ar.length - 1; j > 0; j++) {
				int temp = ar[j];
				ar[j] = ar[j - 1];
				ar[j - 1] = temp;

			}

		}

	}

}

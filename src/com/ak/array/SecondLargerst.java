package com.ak.array;

public class SecondLargerst {

	public static void main(String[] args) {
		int[] ar = { 2, 4, 5, 6, 7, 8, 3, 13, 65, 78 };

		int large = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;

		// using sorting technique
		int secondLargest = ar[ar.length - 2];
		// System.out.println(secondLargest);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > large) {
				slarge = large;
				large = ar[i];
			} else if (ar[i] > slarge && ar[i] != large) {
				slarge = ar[i];
			}
		}
		System.out.println(slarge);

	}

}

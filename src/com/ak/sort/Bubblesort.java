package com.ak.sort;

public class Bubblesort {
	public static void main(String[] args) {
		int[] ar = { 19, 112, 4, 13, 26, 46 };
		for (int i = ar.length - 1; i > 0; i--) {
			for (int j = 0; j < ar.length-i-1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		for (int i : ar) {
			System.out.println(i);
		}

	}

}

package com.ak.array;

public class CountFrequncyofElement {

	public static void main(String[] args) {
		int[] ar = { 2, 4, 5, 6, 7, 8, 8, 3, 13, 65, 78 };
		int count = 1;
		// Map<Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}
			}
			System.out.println(ar[i] + " " + count);
		}

	}
}

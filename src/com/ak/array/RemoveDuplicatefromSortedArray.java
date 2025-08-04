package com.ak.array;

import java.util.HashSet;

public class RemoveDuplicatefromSortedArray {

	public static void main(String[] args) {

		int[] ar = { 2, 4, 5, 6, 7, 8, 8, 3, 13, 65, 78 };
		int j = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[j] != ar[i]) {
				j++;
				ar[j] = ar[i];

			}

		}
		for (int i = 0; i <= j; i++) {
			System.out.println(ar[i]);
		}
		System.out.println(j + 1);




	}

	// approch two



}

package com.ak.array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElement {

	public static void main(String[] args) {
		int[] ar = { 2, 4, 5, 6, 7, 8, 3, 13, 65, 78 };
		int max = ar[0];
		// use sorting technoirs
		// Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max) {
				max = ar[i];
			}

		}
		System.out.println(max);

		int max1 = Arrays.stream(ar).skip(1).min().getAsInt();

		System.out.println(max1);

		int secondL =  Arrays.stream(ar).boxed().distinct().sorted(Comparator.reverseOrder()).
				skip(1).findFirst().orElseThrow(() -> new RuntimeException("Array must have at least two distinct numbers"));

	}

}

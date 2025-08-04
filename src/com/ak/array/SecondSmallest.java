package com.ak.array;

import java.util.Arrays;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] ar = { 2, 4, 5, 6, 7, 8, 3, 13, 65, 78 };

		List<Integer> ls = Arrays.asList(2, 4, 5, 6, 7, 8, 3, 13, 65, 78);

		int max = ls.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(max);

		int firstsmallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < firstsmallest) {
				secondsmallest = firstsmallest;
				firstsmallest = ar[i];

			} else if (ar[i] < secondsmallest && ar[i] != firstsmallest) {
				secondsmallest = ar[i];
			}
		}
		// System.out.println(secondsmallest);
	}

}

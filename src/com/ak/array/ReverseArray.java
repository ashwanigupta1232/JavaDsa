package com.ak.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// using for loop Using a Temporary Array
		int ar[] = { 2, 4, 5, 7, 6 };
		int[] rev = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			rev[i] = ar[ar.length - 1 - i];

		}
		for (int i : rev) {
			System.out.println(i);
		}
		System.out.println("......................");
		// using while loop In-Place Reversal
		int ar1[] = { 2, 4, 5, 7, 6 };
		int start = 0, end = ar.length - 1;

		while (start < end) {
			int temp = ar1[start];
			ar1[start] = ar1[end];
			ar1[end] = temp;
			start++;
			end--;
		}
		for (int i : ar1) {
			System.out.println(i);
		}
		System.out.println("************");

		// using collection

		Integer ar2[] = { 2, 4, 5, 7, 6 };

		List<Integer> list = Arrays.asList(ar2);

		Collections.reverse(list);

		ar2 = list.toArray(new Integer[0]);
		for (int i : ar2) {
			System.out.println(i);
		}
		// using stream api
		System.out.println("******************");
		int[] ar3 = { 2, 4, 5, 7, 6 };
		ar3 = Arrays.stream(ar3).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		for (int i : ar3) {
			System.out.println(i);
		}

	}

}

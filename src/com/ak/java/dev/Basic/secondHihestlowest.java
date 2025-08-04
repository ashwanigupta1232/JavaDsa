package com.ak.java.dev.Basic;

import java.util.Arrays;
import java.util.List;

public class secondHihestlowest {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 1, 9, 3, 6, 7, 4 }; // Sample array of numbers

		// Finding the second lowest number
		int secondLowest = Arrays.stream(numbers).sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array is empty or has only one element"));

		// Finding the second highest number
		int secondHighest = Arrays.stream(numbers).boxed() // Convert int to Integer for reverse sorting
				.sorted((a, b) -> b.compareTo(a)) // Reverse sorting
				.skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array is empty or has only one element"));

		System.out.println("Second lowest number: " + secondLowest);
		System.out.println("Second highest number: " + secondHighest);

		List<Integer> l1 = Arrays.asList(3, 2, 4, 5, 3, 2);

		int n = l1.stream().distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("array is null"));
		System.out.println(n);
		int k = l1.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("array is null"));
		System.out.println(k);

	}

}

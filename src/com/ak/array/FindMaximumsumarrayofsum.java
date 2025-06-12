package com.ak.array;

public class FindMaximumsumarrayofsum {
	public static void main(String[] args) {

		// using kadane alogorithms

		int[] ar = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int sum = 0;
		int max_sum = ar[0]; //

		for (int i = 0; i < ar.length; i++) {
			sum += ar[i]; // Update sum with the current element
			if (sum > max_sum) {
				max_sum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		System.out.println("Maximum sum: " + max_sum);

	}
}

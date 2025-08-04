package com.ak.array;

public class FindTwoSumArray {

	static int[] findtwosum(int ar[], int target) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}

	public static void main(String[] args) {

		int ar[] = { 2, 3, 4, 5, 6, 7, 4 };
		int target = 5;

		int result[] = findtwosum(ar, target);
		if (result.length > 0) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No solution found.");
		}
	}

}

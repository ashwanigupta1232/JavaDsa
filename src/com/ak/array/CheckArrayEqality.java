package com.ak.array;

public class CheckArrayEqality {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };

		// First, check if the lengths are different
		if (a.length != b.length) {
			System.out.println("Arrays are not equal.");
		} else {
			// Assume arrays are equal unless proven otherwise
			boolean arraysEqual = true;

			// Check if all elements match
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					arraysEqual = false;
					break; // No need to check further once a mismatch is found
				}
			}

			// Print the result once after checking all elements
			if (arraysEqual) {
				System.out.println("Arrays are equal.");
			} else {
				System.out.println("Arrays are not equal.");
			}
		}
	}

}

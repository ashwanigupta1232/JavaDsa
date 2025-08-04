package com.ak.java.dev.Basic;

public class Pildromenumber {
	public static void main(String[] args) {

		int[] a = { 121, 12, 14, 111, 565 };

		for (int i : a) {
			if (!paidromearray(i)) {
				System.out.print(i + "s");
			}
		}

	}

	// find paildrome no from array

	static boolean paidromearray(int n) {
		int rev = 0;
		int org = n;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev == org;

	}
}

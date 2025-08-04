package com.ak.java.dev.Basic;

public class ReverseArray {

	public static void main(String[] args) {

		String A = "madam";
		/* Enter your code here. Print output to STDOUT. */
		String rev = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			rev = rev + A.charAt(i);
		}
		if (rev.equals(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

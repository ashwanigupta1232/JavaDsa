package com.ak.strings;

public class Reversestring {

	// string using stringbulider
	static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	// reversting using for loop
	static void reversestrng(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("paildrome");
		} else {
			System.out.println("not paildrome");
		}
	}

	// using char array
	static void revchar(String s) {
		String rev = "";
		int len = s.length();

		for (char c : s.toCharArray()) {
			rev = c + rev; // c will be first
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {

		String str = "hello";
		String rev = "madam";
		reversestrng("aba");
		revchar("aba");
		// System.out.println(reverseString(str));

	}
}

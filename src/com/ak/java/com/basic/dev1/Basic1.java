package com.ak.java.com.basic.dev1;

public class Basic1 {
	static String reverse(String z) {
		return new StringBuilder(z).reverse().toString();
	}

	public static String compareNM(int n, int m) {
		// code here
		if (n > m) {
			return "lesser";
		}
		return "equal";
	}

	public static void main(String[] args) {

		// reverse string first way
		String s = "hello";
		String z = s;
		String rev = "";
		StringBuilder sb = new StringBuilder(s);
		String reverse = sb.reverse().toString();
		System.out.println(sb);
		if (reverse.equals(z)) {

			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println("***********************************************");

		// revser string using second way
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		String str = "hello india";
		System.out.println(reverse(str));
		System.out.println(compareNM(28, 23));

	}

}

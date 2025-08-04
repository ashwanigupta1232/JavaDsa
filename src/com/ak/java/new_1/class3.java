package com.ak.java.new_1;

public class class3 {
	public static int main(String[] args) {
		// Calculate factorial for large No
		/*
		 * int n, c; BigInteger inc = new BigInteger("1"); BigInteger fact = new
		 * BigInteger("1"); Scanner input = new Scanner(System.in);
		 * System.out.println("Input an integer"); n = input.nextInt(); for (c = 1; c <=
		 * n; c++) { fact = fact.multiply(inc); inc = inc.add(BigInteger.ONE); }
		 * System.out.println(n + "! = " + fact);
		 */
		// print star using console
		int row;
		int num;
		for (row = 1; row <= 10; row++) {
			for (num = 1; num <= row; num++) {
				System.out.print("$");
			}
			System.out.println();
		}
		int v = 56;
		int rev = 0;
		while (v != 0) {
			rev = rev * 10;
			rev = rev + v % 10;
			v = v / 10;

		}
		System.out.println(rev);

		int n = 2;

		while (true) {
			// System.out.println("Input an integer");

			if (v != 0) {
				System.out.println("You entered " + n);
				continue;
			} else {
				break;
			}
		}
/// reverse string 

		String original = "abb";
		char[] charArray = original.toCharArray();
		String reverse = "";
		String pailString = "abba";

		for (char c : charArray) {
			reverse = c + reverse;
		}

		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reverse);

		if (reverse.equals(pailString)) {
			System.out.println("paildrome");
		} else {
			System.out.println("not paildrome");
		}

		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(" " + ch);

		}
// print table
		int n1 = 6;

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * n1);
		}
		return row;
	}
}
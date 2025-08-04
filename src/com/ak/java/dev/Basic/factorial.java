package com.ak.java.dev.Basic;

public class factorial {

	public static void main(String[] args) {
		int X = 5;
		int result = factorial(X);
		System.out.println("The factorial of " + X + " is " + result);
		// System.out.println(Reberse("hello"));
		String jString = "aba";
		String kString = Reberse(jString);
		String mString = jString;
		if (mString == kString) {
			System.out.println("paildrome");
		} else {
			System.out.println("not paildrome");
		}
	}

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// String Paoildrome

	static String Reberse(String s) {
		String kString = s;
		StringBuilder sBuilder = new StringBuilder(s);

		return sBuilder.toString();

	}
}

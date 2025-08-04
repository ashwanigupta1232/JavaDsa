package com.ak.strings;

public class reverseVowells {
	public static void main(String[] args) {

		System.out.println(reverseVowels("hello"));

	}

	public static String reverseVowels(String s) {
		for (int i = s.length() - 1; i > 0; i--) {
			char rev = 'a';
			if (rev == 'a' || rev == 'e' || rev == 'i' || rev == 'o' || rev == 'u') {
				rev = (char) (rev + s.charAt(i));

			}

		}
		return s;
	}

}

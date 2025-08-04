package com.ak.strings;

public class StringCountPrograms {

	// count vowles constant , and space in string in using two approches
	static void countvob(String s) {
		int vowel = 0;
		int constant = 0;
		int whitespace = 0;
		int len = s.length();
		String str = s.toLowerCase();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else if (ch >= 'a' && ch <= 'z') {
				constant++;
			} else if (ch == ' ') {
				whitespace++;
			}
		}
		System.out.println("vowel " + vowel);
		System.out.println("constant " + constant);
		System.out.println("whitespaces " + whitespace);

	}

	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" ");
			}
		}
		return reversed.toString();
	}

	// remove white space from string
	static String removeSpaces(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		countvob("hello india");
		System.out.println(reverseWords("hello my name is mark"));
		System.out.println(removeSpaces("hello my name is mark"));
	}
}

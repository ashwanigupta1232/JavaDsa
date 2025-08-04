package com.ak.strings;

public class CountLenght {

// find the count of alst word in string

	public static void main(String[] args) {

		int count = countLastwordlenght("hello india");
		System.out.println(count);
	}

	static int countLastwordlenght(String str) {

		String s = str.trim();
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}

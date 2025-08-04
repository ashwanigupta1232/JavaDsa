package com.ak.strings;

public class BracketMatch {
	public static void isBracketMatched(String str) {
		int count1 = 0, count2 = 0, count3 = 0; // Counters for (), [], {}
		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				count1++;
			} else if (ch == ')') {
				count1--;
				if (count1 < 0) {
					System.out.println("Brackets are not properly matched.");
					return;
				}
			} else if (ch == '[') {
				count2++;
			} else if (ch == ']') {
				count2--;
				if (count2 < 0) {
					System.out.println("Brackets are not properly matched.");
					return;
				}
			} else if (ch == '{') {
				count3++;
			} else if (ch == '}') {
				count3--;
				if (count3 < 0) {
					System.out.println("Brackets are not properly matched.");
					return;
				}
			}
		}
		if (count1 == 0 && count2 == 0 && count3 == 0) {
			System.out.println("Brackets are properly matched.");
		} else {
			System.out.println("Brackets are not properly matched.");
		}
	}

	public static void main(String[] args) {
		String str = "{[()]}"; // Example string with properly matched brackets
		isBracketMatched(str);
	}
}

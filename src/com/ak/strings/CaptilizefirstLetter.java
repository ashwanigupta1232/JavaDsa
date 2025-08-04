package com.ak.strings;

public class CaptilizefirstLetter {

	public static void main(String[] args) {

		String str = "hello my name is ashwani gupta";
		String str1 = str.trim() + " ";
		str.toLowerCase();
		String wordString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch)) {
				String word1 = "";
				for (int j = 0; j < wordString.length(); j++) {
					char ch1 = wordString.charAt(i);
					if (j == 0 || j == wordString.length() - 1) {
						ch1 = Character.toUpperCase(ch1);
					}
					word1 = word1 + ch1;
				}
				System.out.println(word1);
				wordString = "";
			} else {
				wordString = wordString + ch;
			}
		}

	}

}

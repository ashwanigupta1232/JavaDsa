package com.ak.strings;

public class FindhigestWordfromString {

	public static void main(String[] args) {

		String sentence = "i love my india";

		FindhigestWordfromString fn = new FindhigestWordfromString();
		fn.higestWord(sentence);

	}

	public void higestWord(String s) {

		String[] words = s.split("\\s+");
		String largest_word = "";
		for (String word : words) {
			if (word.length() > largest_word.length()) {
				largest_word = word;
			}
		}
		System.out.println(largest_word);

	}
}

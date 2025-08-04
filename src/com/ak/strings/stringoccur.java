package com.ak.strings;


import java.util.Map;
import java.util.TreeMap;

public class stringoccur {

	static void countfrequncy(String str) {
		StringBuilder sb = new StringBuilder();
	//	str.trim();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i) + " element Count :  " + count);
		}
	}

	static void stringOccur(String s) {
		Map<Character, Integer> occurrenceMap = new TreeMap<>();

		for (char c : s.toCharArray()) {
			occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	// counts word in string

	static void countwords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count = count + 1;

		}
		System.out.println("total words in string " + count);
	}

	static void removewhitespace(String str) {
		for (int i = 0; i < str.length(); i++) {
			str.trim();

		}
	}

	public static void main(String[] args) {
		stringOccur("hello");
		//countwords("HI AMY AND JAY bro");
		countfrequncy("hello");

	}
}

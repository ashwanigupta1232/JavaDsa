package com.ak.strings;

import java.util.HashMap;

public class ValidAnagram {

	static boolean validanagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> mp1 = frequncycharcter(str1);
		HashMap<Character, Integer> mp2 = frequncycharcter(str1);

		return mp1.equals(mp2);

	}

	static HashMap<Character, Integer> frequncycharcter(String str) {
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (!hMap.containsKey(ch)) {
				hMap.put(ch, 1);
			} else {
				int freq = hMap.get(ch);
				hMap.put(ch, hMap.get(ch) + 1);
			}
		}
		return hMap;
	}

	public static void main(String[] args) {
		boolean angram = validanagram("Cat", "cat");
		System.out.println(angram);

	}

}

package com.ak.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindNonrepatingcharters {

	// ApprocOne

	public static void findNonrepeatingcharterApproch1(String str) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (char ch : str.toCharArray()) {
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		boolean flag = false;
		for (char ch : str.toCharArray()) {
			if (hmap.get(ch) == 1) { // Characters that appear only once
				System.out.print(ch + " ");
				flag = true;
			}
		}
	}

	public static void findNonrepeatingcharterApproch2(String str) {
		if (str.isEmpty() || str.isBlank()) {
			throw new IllegalArgumentException("not string found");
		}

		HashMap<Character, Integer> countmap = new HashMap<>();
		for (char ch : str.toCharArray()) {
			countmap.put(ch, countmap.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> hm : countmap.entrySet()) {
			if (hm.getValue() == 1) {
				System.out.println(hm.getKey());
			}
		}

	}

	public static void findNonrepeatingcharterApproch3(String str) {

		HashSet<Character> hs = new HashSet<>();

	}

	public static void main(String[] args) {

		String str = "javaprogramming";
		findNonrepeatingcharterApproch2(str);

	}

}

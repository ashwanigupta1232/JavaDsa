package com.ak.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequncyGivenString {

	public static void main(String[] args) {

		String str = "hello ";

		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> hmap : hm.entrySet()) {
			if (hmap.getValue() > 1)
				System.out.println(hmap.getKey());
		}

	}

}

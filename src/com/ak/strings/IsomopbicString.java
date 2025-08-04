package com.ak.strings;

import java.util.HashMap;

public class IsomopbicString {

	public static void main(String[] args) {
		IsomopbicString obj = new IsomopbicString();
		System.out.println(obj.isIsomorpbic("egg", "adad")); // true
		System.out.println(obj.isIsomorpbic("foo", "bar")); // false
		System.out.println(obj.isIsomorpbic("paper", "title")); // true
	}

	boolean isIsomorpbic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> hMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character ch1 = s.charAt(i);
			Character ch2 = t.charAt(i);

			if (hMap.containsKey(ch1)) {
				if (hMap.get(ch1) != ch2) {
					return false;
				}
			} else {
				if (hMap.containsValue(ch2)) {
					return false;
				}
				hMap.put(ch1, ch2);
			}
		}
		return true;
	}

}

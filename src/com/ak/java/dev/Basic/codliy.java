package com.ak.java.dev.Basic;

import java.util.HashMap;

public class codliy {

	public static String solution(String S) {
		// Implement your Solution here
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = S.length() - 1; i >= 0; i--) {
			if (hMap.containsKey(S.charAt(i))) {
				int count = hMap.get(S.charAt(i));
				hMap.put(S.charAt(i), ++count);
			} else {
				hMap.put(S.charAt(i), 1);
			}
		}
		for (char key : hMap.keySet()) {
			if (hMap.get(key) > 1) {
				System.out.print(key + " ");
			}
		}
		return S;
	}

	public static void main(String[] args) {

		String inputString = "SSDRRRTTYYTYTR";
		String result = solution(inputString);

	}
}

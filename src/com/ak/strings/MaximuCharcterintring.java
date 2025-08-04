package com.ak.strings;

import java.util.HashMap;

public class MaximuCharcterintring {

	public static void main(String[] args) {
		String str = "abscissas";

		maximucharteroccur("maximum charter occur " + str);

	}

	public static void maximucharteroccur(String str) {
		HashMap<Character, Integer> charcount = new HashMap<>();

		// Populate the HashMap with character frequencies
		for (char ch : str.toCharArray()) {
			charcount.put(ch, charcount.getOrDefault(ch, 0) + 1); // Increment count using getOrDefault
		}

		// Variables to track the character with the maximum count
		char maxChar = ' ';
		int maxCount = 0;

		// Iterate through the map to find the maximum occurring character
		for (var entry : charcount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		// Output the result
		System.out.println("Maximum occurring character: " + maxChar + " (Occurs " + maxCount + " times)");
	}
}

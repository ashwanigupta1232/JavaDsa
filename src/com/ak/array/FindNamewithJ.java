package com.ak.array;

import java.util.Arrays;
import java.util.List;

public class FindNamewithJ {

	public static void main(String[] args) {
		String[] words = { "John", "Megha", "Jason", "Akash", "Mona" };
		boolean found = false; // Flag to check if any name starts with "J"

		// Iterate through the array of names
		for (String name : words) {
			if (name.trim().startsWith("J")) { // Use trim() to remove any leading spaces
				System.out.println(name);
				found = true; // Set the flag to true if a name is found
			}
		}

		// Print "no name found" if no names starting with "J" were found
		if (!found) {
			System.out.println("no name found");
		}
		List<String> ls1 = Arrays.asList(words);

		ls1.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
		// System.out.println(ls1);

	}
}

package com.ak.array;

import java.util.HashSet;

public class FindDuplicateinArray {

	public static void main(String[] args) {

		int[] ar = { 2, 3, 4, 5, 6, 7, 82, 1, 3, 3, 2 };

		// find duplicate element in array

		// using hash set approach
		HashSet<Integer> hs = new HashSet<>();
        for (int j : ar) {
            if (hs.contains(j)) {

                System.out.println(j);
            } else {
                hs.add(j);
            }
        }

	}

}

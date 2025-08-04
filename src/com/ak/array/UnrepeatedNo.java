package com.ak.array;

import java.util.HashMap;

public class UnrepeatedNo {

	public static void main(String[] args) {

		int[] ar = { 3, 4, 5, 6, 7, 8, 9, 2, 3, 42, 3, 43 };

		HashMap<Integer, Integer> hMap = new HashMap<>();

		for (int i : ar) {
			if (hMap.containsKey(i)) {
				hMap.put(i, hMap.get(i) + 1);
			} else {
				hMap.put(i, 1);
			}
		}
		for (var e : hMap.entrySet()) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey() + " ");

			}
		}

	}
}

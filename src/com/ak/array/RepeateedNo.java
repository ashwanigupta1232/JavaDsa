package com.ak.array;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeateedNo {

	public static void main(String[] args) {
		int[] ar = { 3, 4, 5, 6, 5, 4, 7, 8, 9, 2, 3, 42, 42, 3, 43 };

		HashMap<Integer, Integer> hMap = new LinkedHashMap<>();
		for (int i : ar) {
			if (hMap.containsKey(i)) {
				hMap.put(i, hMap.get(i) + 1);
			} else {
				hMap.put(i, 1);
			}
		}

		for (var i : hMap.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println(i.getKey() + " = " + i.getValue());
			}
		}
	}
}

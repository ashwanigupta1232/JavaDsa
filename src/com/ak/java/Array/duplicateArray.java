package com.ak.java.Array;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar = { 1, 2, 3, 4, 5, 1 };
		int[] ar1 = { 1, 2, 3, 4, 5, 1 };
		int n = ar.length;
		// Duplicate(ar);
		System.out.println("hashset");
		Duplicateval(ar1);

	}
	// using java 8

	static void Duplicate(int[] arr) {

		List<int[]> withdup = List.of(arr);

		List<int[]> withoutdup = withdup.stream().distinct().collect(Collectors.toList());

		System.out.println(withoutdup);

	}

	// using hashset

	static void Duplicateval(int[] arr) {

		HashSet<Integer> hSet = new HashSet<>();

		for (int j : arr) {
			hSet.add(j);
		}
		System.out.println(hSet);

	}

}

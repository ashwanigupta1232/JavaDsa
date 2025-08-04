package com.ak.java.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Array2 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 5, 6, 9 };

		int[] arr = { 1, 2, 3, 5, 5, 6, 6, 9 };
		int n1 = arr.length;
		revrsearry(arr, n1);
		System.out.println("after using collection");
		revrsearryCollection(arr1);
		countfrequncy(arr);
		System.out.println("frequncy using hashmap");
		frequncy(arr, n1);
		System.out.println("repeating elemt");
		repeatelemmnt(arr);
	}

	/// funtion using reverse array

	static void revrsearry(int arr[], int n) {

		for (int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}
	}

	// reverse array using collecytiom

	static void revrsearryCollection(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));

	}

	// Count frequency of each element in the array

	static void countfrequncy(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}

		// Count frequency of each element in the array using Map
	}

	static void frequncy(int[] arr, int n) {

		HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int j : arr) {
            if (hMap.containsKey(j)) {
                hMap.put(j, hMap.get(j) + 1);
            } else {
                hMap.put(j, 1);
            }
        }
		for (Map.Entry<Integer, Integer> i : hMap.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());

		}

	}

	static void repeatelemmnt(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1])
				System.out.println("repeating element :" + ar[i]);

		}
	}

	static int removeDup(int[] ar) {

		return (int) Arrays.stream(ar).distinct().count();
	}
}

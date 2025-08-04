package com.ak.array;

import java.util.Arrays;
import java.util.HashSet;

public class PairGivenofwwosum {

	// first approch
	public static boolean twosum(int[] ar, int target) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == target) {
					return true;
				}
			}

		}
		return false;

	}
	// secnd apprch using hashset

	public static boolean twosumupairsingHashset(int[] ar, int target) {

		HashSet<Integer> hSet = new HashSet<>();
		for (int i = 0; i < ar.length; i++) {
			int check = target - ar[i];
			if (hSet.contains(check)) {
				return true;
			}

			hSet.add(ar[i]);
		}
		return false;

	}
// using two pointer while loop

	public static boolean twosumupairtwopinter(int[] ar, int target) {

		Arrays.sort(ar);
		int left = 0;
		int right = ar.length - 1;
		while (left < right) {
			int sum = ar[left] + ar[right];
			if (sum == target) {
				return true;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		int[] ar = { 0, -1, 2, -3, 1 };
		int target = -7;
		System.out.println(twosum(ar, target));
		System.out.println(twosumupairsingHashset(ar, target));
		System.out.println(twosumupairtwopinter(ar, target));

	}

}

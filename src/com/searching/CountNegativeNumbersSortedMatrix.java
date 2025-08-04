package com.searching;

public class CountNegativeNumbersSortedMatrix {

	public static int findnegativeNo(int ar[][]) {

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0) {
					count++;
				}
			}

		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("hello");
	}

}

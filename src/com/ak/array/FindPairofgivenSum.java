package com.ak.array;

public class FindPairofgivenSum {

	static boolean findPairofGivenSum(int[] ar, int target) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] + ar[j] == target) {
					return true;
				}

			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;
		if (findPairofGivenSum(arr, target)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

//        if (A> B){
//            System.out.println("A is greater "+ A);
//        }
//        else if (B>A && C){
//            System.out.println("B is Greater"+ B);
//        }
//        else {
//            System.out.println("C is Greater"+C);
//        }

	}
}

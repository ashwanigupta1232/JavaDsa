package com.ak.array;

public class BestTimebuyandsellstocks {

	public static int maxprofit(int[] price) {

		int n = price.length;
		int res = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				res = Math.max(res, price[j] - price[i]);
			}

		}
		return res;

	}

	public static void main(String[] args) {
		int[] prices = { 7, 10, 1, 3, 6, 9, 2 };
		System.out.println(maxprofit(prices));

	}

}

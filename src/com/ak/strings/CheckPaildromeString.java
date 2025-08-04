package com.ak.strings;

public class CheckPaildromeString {

	static boolean checkpaildrome(String s) {

		String orignal = s;
		String revString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
			if (revString.equals(orignal)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		if (checkpaildrome("madamk")) {
			System.out.println("string is paildrome");
		} else {
			System.out.println("not paidrome");
		}

	}

}

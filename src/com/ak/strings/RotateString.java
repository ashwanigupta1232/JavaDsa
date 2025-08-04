package com.ak.strings;

public class RotateString {

	public static void main(String[] args) {
		String originalString = "HelloWorld";
		int rotationCount = 3;

		rotateString(originalString, rotationCount);
		System.out.println("Original String: " + originalString);
		// System.out.println("Rotated String: " + rotatedString);
	}

	private static void rotateString(String str, int rotateBy) {
		int length = str.length();

		// Ensure a positive rotation count
		rotateBy = rotateBy % length;
		if (rotateBy < 0) {
			rotateBy = length + rotateBy;
		}

		// Rotate the string
		String rotatedString = str.substring(rotateBy) + str.substring(0, rotateBy);

		System.out.println(rotatedString);
	}
}

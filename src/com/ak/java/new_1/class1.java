package com.ak.java.new_1;

import java.math.BigInteger;
import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		System.out.println(1 + 2);

		/**
		 * 
		 * 
		 * // print integer with program /* for (int i = 1; i <= 10; i++) {
		 * System.out.println(i);
		 * 
		 * }
		 */
		// command line argument in java
		for (String strting : args) {
			// System.out.println(strting);
		}

		// convert farnehite to celcicius
		float temprature = 96;

		temprature = ((temprature - 32) * 5 / 9);
		// System.out.println("temprature " + temprature );

		// swap two numbers

		int r1 = 4;
		int r2 = 3;

		int temp = 0;

		// temp = r1;
		// r1= r2;
		// r2 =temp;

		r1 = r1 + r2;
		r2 = r1 - r2;
		r1 = r1 - r2;

		System.out.println(r1);
		System.out.println(r2);

		// add two large number

		String s1 = "1234556789";
		String s2 = "1234556789";

		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		BigInteger sum;
		sum = b1.add(b2);
		if (!b1.equals(b2))
			throw new ArithmeticException();
		else
			System.out.println(sum);

		boolean learn = false;

		if (learn) {
			return;
		} else {
			System.out.println("notlearning");
		}

		// if else condison;

		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = 12;
		if (marksObtained >= 9089) {
			if (marksObtained > 90)
				grade = 'A';

			else if (marksObtained > 75)
				grade = 'B';
			else if (marksObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		}

		int n = 9;
		int c = 1;
		int fact = 1;

		for (c = 1; c <= n; c++) {
			fact = fact * c;
			System.out.println(fact);
		}

	}
}

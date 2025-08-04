package com.ak.java.new_1;

class main {

	public void car(int caespeed) {
		if (caespeed > 50) {
			System.out.println("super car");
		} else {
			System.out.println("normal car");
		}
	}

}

public class class2 extends main {
	public static void main(String[] args) {
		class2 cl = new class2();

		cl.car(100);
	}

}

package com.ak.java.Array;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("hello");
		al.add("india");
		al.set(0, "Hi");

		for (String name : al) {

			if (name.contains("Hiii")) {
				break;
			} else {
				System.out.println(name);
			}

		}
	}

}

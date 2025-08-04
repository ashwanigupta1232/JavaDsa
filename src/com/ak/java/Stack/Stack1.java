package com.ak.java.Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();

		Boolean result = s1.isEmpty();

		System.out.println("result : " + result);

		s1.push(1);
		s1.push(2);
		System.out.println("stack limit : " + s1);
		result = s1.isEmpty();

		System.out.println("result : " + result);
		s1.pop();
		System.out.println("after poping : " + s1);

	}

}

package com.codingProblem;

public class TowerofHanoi {

	public static void towerofhanoi(int n, char source, char destination, char auxiliary) {

		if (n == 1) {
			System.out.println("Move disk 1 from " + source + " to " + destination);
			return;

		}
		towerofhanoi(n - 1, source, destination, auxiliary);

		System.out.println("Move disk 1 from " + source + " to " + destination);

		towerofhanoi(n - 1, auxiliary, destination, source);

	}

	public static void main(String[] args) {

		int n = 3; // Number of disks
		towerofhanoi(n, 'A', 'C', 'B');

	}

}

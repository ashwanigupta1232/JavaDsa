package com.ak.array;

public class DeleteElemnetFromArray {

	static int count = 5;

// delete from end

	static void deleteFromEnd(int ar[]) {
		if (ar.length <= 0)
			return;
		count--;

	}

	// delete specific element
	static int deleteSpecficelemt(int ar[], int val) {
		int i;
		for (i = 0; i < count; i++) {
			if (ar[i] == val) {
				break;
			}
		}
		if (i == count) {
			System.out.println("value doesnet in exsting array");
		}
		for (int j = i; j < count - 1; j++) {
			ar[j] = ar[j + 1];
		}
		return count--;
	}

	// print array
	static void print(int ar[]) {
		for (int i = 0; i < count; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int ar[] = { 13, 3, 68, 75, 42 };
		print(ar);
		// deleteFromEnd(ar);
		deleteSpecficelemt(ar, 68);
		print(ar);

	}

}

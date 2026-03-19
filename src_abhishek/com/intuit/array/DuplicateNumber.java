package com.intuit.array;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 90, 34, 12 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate: " + arr[i]);

				}

			}
		}

	}

}

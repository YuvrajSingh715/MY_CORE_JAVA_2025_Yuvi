package com.intuit.array;

public class CombinationArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

				}
			}

		}

	}
}

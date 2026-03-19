package com.intuit.array;

public class TargetPairSum {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 1, 5 };

		int target = 7;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}

		}

	}
}

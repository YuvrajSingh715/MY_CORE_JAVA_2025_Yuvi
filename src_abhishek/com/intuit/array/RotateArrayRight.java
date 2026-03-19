package com.intuit.array;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 67, 89 };
		int last = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = last;
		System.out.println(Arrays.toString(arr));
	}

}

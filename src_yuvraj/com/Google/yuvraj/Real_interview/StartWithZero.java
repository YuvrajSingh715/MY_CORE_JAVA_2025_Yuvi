package com.Google.yuvraj.Real_interview;

import java.util.Arrays;

public class StartWithZero {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int[] result = new int[arr.length];

		int index = 0;

		for (int value : arr) {
			if (value == 0) {
				result[index++] = 0;
			}
		}

		for (int value : arr) {
			if (value != 0) {
				result[index++] = value;
			}
		}

		System.out.println(Arrays.toString(result));
	}

}

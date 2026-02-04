package com.Google.Real_interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JoinArrays1 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6, 7 };

		int[] result = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();

		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));

		System.out.println("joined the arr1 and arr2: " + Arrays.toString(result));

	}
	
}
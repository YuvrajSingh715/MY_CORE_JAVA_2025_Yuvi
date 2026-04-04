package com.intuit.interview;

import java.util.Arrays;

public class SameElementInArray1 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 2, 3 };
		int[] arr2 = { 2, 3, 4, 5, 5, 5, 6, 7 };

		Arrays.stream(arr1).filter(a -> Arrays.stream(arr2).anyMatch(b -> b == a)).forEach(System.out::println);

	}

}



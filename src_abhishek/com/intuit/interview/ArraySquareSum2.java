package com.intuit.interview;

import java.util.Arrays;

public class ArraySquareSum2 {

	public static void main(String[] args) {

		int[] a = new int[] { 3, 5, 6, 7, 8 };

		int[] squaredArray = Arrays.stream(a).map(x -> x * x).toArray();

		int sum = Arrays.stream(squaredArray).sum();

		System.out.println("Squared Array =" + Arrays.toString(squaredArray));
		System.out.println("Sum of squares = " + sum);

	}

}

package com.intuit.interview;

import java.util.Arrays;

public class ArraySquareSum1 {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 5, 6, 7, 8 };

		int sumOfSquares = Arrays.stream(a).map(x -> x * x).sum();
		System.out.println(sumOfSquares);

	}

}

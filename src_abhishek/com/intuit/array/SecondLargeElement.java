package com.intuit.array;

import java.util.Arrays;

public class SecondLargeElement {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 56, 78, 90, 34, 56, 78 };
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;

			}

		}

		System.out.println("Second Largest Element: " + second);

	}

}

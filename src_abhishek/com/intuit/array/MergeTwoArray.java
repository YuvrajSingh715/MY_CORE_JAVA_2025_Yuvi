package com.intuit.array;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] a = { 12, 34, 56, 78, 89 };
		int[] b = { 34, 56, 78, 90 };

		int a_length = a.length;
		int b_length = b.length;

		int c_length = a_length + b_length;

		System.out.println(c_length);
		int[] c = new int[c_length];
		for (int i = 0; i < a_length; i++) {
			// System.out.println(a[i]);
			c[i] = a[i];
			System.out.println(c[i]);
		}
		for (int j = 0; j < b_length; j++) {
			System.out.println(c[j]);
			c[a_length + j] = b[j];
		}
		for (int value : c) {
			System.out.print(value + " ");

		}

	}
}

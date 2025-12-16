package com.intuit.array;

public class Array1 {

	public static void main(String[] args) {
		int[] a = { 12, 23, 45, 67, 12, 45 };
		// int target = 35;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			for (int j = i + 1; j < a.length; j++) {
				// System.out.println(a[j]);
				if (a[i] == a[j]) {
					System.out.println(a[i] + "  " + a[j]);

				}

			}
		}
	}

}

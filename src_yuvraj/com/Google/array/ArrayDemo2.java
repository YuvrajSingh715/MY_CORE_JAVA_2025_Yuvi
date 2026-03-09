package com.Google.array;

public class ArrayDemo2 {

	public static void main(String[] args) {

		String a1[] = new String[] { "JonSnow", "Ygriddie" };
		System.out.println(a1[0]);
		System.out.println(a1[1]);

		int[] a = new int[] { 3, 5, 6, 7, 8 };
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]); // Array Index Out of Bounds Exception Because
									// Index 5 is not available inside you array
	}

}

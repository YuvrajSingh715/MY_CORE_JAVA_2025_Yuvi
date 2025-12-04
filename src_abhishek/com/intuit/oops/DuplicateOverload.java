package com.intuit.oops;

public class DuplicateOverload {

	// void method(int ... a) {
	// System.out.println("1");

	// }
	static void method(int[] a) {
		System.out.println("2");
	}

	public static void main(String[] args) {

		method(new int[] { 2, 3 });
	}
}

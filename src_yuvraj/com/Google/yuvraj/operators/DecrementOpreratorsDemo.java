package com.Google.yuvraj.operators;

public class DecrementOpreratorsDemo {

	public static void main(String[] args) {
		// PreDecrement Operator Demo
		int x = 5;
		int y = --x;

		System.out.println(x + " and " + y);
		System.out.println("final value of x = " + x);
		System.out.println("final value of y = " + y);

		// PostDecrement Operator Demo
		int a = 3;
		int b = a--;

		System.out.println(a + " and " + b);
		System.out.println("final value of a = " + a);
		System.out.println("final value of b = " + b);
	}

}

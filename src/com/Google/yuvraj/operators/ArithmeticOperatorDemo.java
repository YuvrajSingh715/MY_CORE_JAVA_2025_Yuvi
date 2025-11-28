package com.Google.yuvraj.operators;



public class ArithmeticOperatorDemo {

	public static void main(String[] args) {

		int x = 4;
		int y = 2;

		System.out.println("Sum of x+y = " + (x + y));
		System.out.println("Subtraction of x-y = " + (x - y));
		System.out.println("Multiplication of x*y = " + (x * y));
		System.out.println("Division of x/y = " + (x / y));

		// The modulus operator (%) is known as the remainder operator
		System.out.println("Remainder when x is divided by y = " + (x % y));

		int a = 7;
		int b = 13;
		int c = 11;
		int d = 4;

		System.out.println("Remainder of b % d = " + (b % d));
		System.out.println("Remainder of b % a = " + (b % a));
		System.out.println("Remainder of a % d = " + (a % d));
		System.out.println("Remainder of b % c = " + (b % c));
	}

}


package com.persistent.operators;

public class IncrementOperatorDemo {

	public static void main(String[] args) {

		int x = 2;
		int y = x++;

		System.out.println("final value of x = " + x);
		System.out.println("final value of y = " + y);

		int a = 3;
		int b = ++a;

		System.out.println("final value of x = " + a);
		System.out.println("final value of y = " + b);
	}

}

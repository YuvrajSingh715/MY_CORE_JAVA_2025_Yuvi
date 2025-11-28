package com.Google.yuvraj.operators;

public class IncrementOperatorDemo {

	public static void main(String[] args) {

		// PreIncrement Operator Demo
		int x = 2;
		int y = x++;

		System.out.println(x+" and "+y);
		System.out.println("final value of x = " + x);
		System.out.println("final value of y = " + y);
  
		// PostIncrement Operator Demo
		int a = 3;
		int b = ++a;

		System.out.println(a+" and "+b);
		System.out.println("final value of x = " + a);
		System.out.println("final value of y = " + b);
	}

}

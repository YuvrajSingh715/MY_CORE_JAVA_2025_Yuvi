package com.yuvraj.operators;

public class CompoundAssignmentOperatorDemo2 {

	public static void main(String[] args) {

		int a = 25;
		a += 25; // same as [a = a+25 → 40]
		System.out.println("value of a = " + a);

		int b = 15;
		b -= 7; // same as [b = b-7 → 8]
		System.out.println("value of b = " + b);

		int c = 5;
		c *= 5; // same as [c = c*5 → 25]
		System.out.println("value of c = " + c);

		int d = 180;
		d /= 15; // same as [d = d/15 → 12]
		System.out.println("value of d = " + d);

		int e = 55;
		e %= 10; // same as [e = e%10 → 5]
		System.out.println("value of e = " + e);
	}

}

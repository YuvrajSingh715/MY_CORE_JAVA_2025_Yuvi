package com.persistent.operators;

public class CompoundAssignmentOperatorDemo1 {

	public static void main(String[] args) {

		byte a = 7;
		a = (byte) (a + 1);
		System.out.println("value of a = " + a);

		byte b = 7;
		b++;
		System.out.println("value of b = " + b);

		byte c = 7;
		c += 1;
		System.out.println("value of c = " + c);

		byte d = 127;
		d += 3;
		System.out.println("value of c = " + d);
	}

}

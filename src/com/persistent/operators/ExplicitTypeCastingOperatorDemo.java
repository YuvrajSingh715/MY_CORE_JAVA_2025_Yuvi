package com.persistent.operators;

public class ExplicitTypeCastingOperatorDemo {

	public static void main(String[] args) {

		double d1 = 364.4342;
		double d2 = 45.64;
		int a1 = 150;
		int a2 = 453;

		
		int i = (int) d1; // Here double is converted into integer [manually print int]
		long l = (long) d2; // Here double is converted into long [manually print long]
		byte b = (byte) a1; // Here integer is converted into byte [manually print byte]
		short s = (short) a2; // Here integer is converted into short [manually print short]

		
		System.out.println("d1 = " + d1 + " convert" + " int = " + i);
		System.out.println("d2 = " + d2 + " convert" + " long = " + l);
		System.out.println("a1 = " + a1 + " convert" + " byte = " + b);
		System.out.println("a2 = " + a2 + " convert" + " short = " + s);

	}

}

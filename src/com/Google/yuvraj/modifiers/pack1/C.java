package com.Google.yuvraj.modifiers.pack1;

public class C extends P {

	public static void m1() {
		System.out.println("This is child method...");
	}

	public static void main(String[] args) {

		// case 1
		P p = new P();
		p.m1();

		// case 2
		C c = new C();
		c.m1();

		// case 3
		P pc = new C();
		pc.m1();

		// case 4 -> This is not applicable in java
		// C cp = new P();

	}

}

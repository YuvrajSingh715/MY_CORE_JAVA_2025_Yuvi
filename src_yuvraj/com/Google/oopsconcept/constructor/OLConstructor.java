package com.Google.oopsconcept.constructor;

public class OLConstructor {

	OLConstructor(double a) {
		this(21);
		System.out.println(a + " | Double-Argument Constructor.");
	}

	OLConstructor() {
		System.out.println("No-Argument Constructor.");
	}

	OLConstructor(String a) {
		this(10.2);
		System.out.println(a + " | String-Argument Constructor.");
	}
	
	OLConstructor(int c) {
		this();
		System.out.println(c + " | int-Argument Constructor.");
	}

	public static void main(String[] args) {

		new OLConstructor();
		System.out.println("#=============================#");
		new OLConstructor(10);
		System.out.println("#=============================#");
		new OLConstructor(14.2);
		System.out.println("#=============================#");
		new OLConstructor("yuvi");
	}

}

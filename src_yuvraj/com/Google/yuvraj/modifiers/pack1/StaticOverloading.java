package com.Google.yuvraj.modifiers.pack1;

public class StaticOverloading {

	public static void main(String a) {

		System.out.println("This is main method with string argument | " + a);
	}

	public static void main(int b) {

		System.out.println("This is m1 method with int argument | " + b);

	}

	public static void main(String[] args) {

		StaticOverloading sol = new StaticOverloading();
		sol.main(123);
		sol.main("yuvi");
	}

}

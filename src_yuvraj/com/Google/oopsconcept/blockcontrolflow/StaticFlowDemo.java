package com.Google.oopsconcept.blockcontrolflow;

public class StaticFlowDemo {

//	Static Variable
	static int x = 23;

//	Static Block
	static {
		System.out.println("first step : this is first static block.");
		System.out.println("second step : "+x);
	}

//	Static Method
	static int m1() {
		System.out.println("forth step : m1 method executed.");
		return 10;
	}

//	Main Method
	public static void main(String[] args) {
		System.out.println("fifth step : Main Method.");
	}

//	Static Block
	static {
		System.out.println("thrid step : this is second static block.");
		m1();
	}

	/*
	 * ❎ Illegal forward reference we can't change the order other we get compile
	 * time error.
	 * 
	 * static 
	 * { 
	 * System.out.println(z); // compile-time error 
	 * }
	 * 
	 * static int z = 30;
	 */

}

package com.Google.yuvraj.modifiers.pack2;

public class Child extends Parent {
	
//	@Override    //This is not possible because static methods cannot be overridden in Java.
	public static void m1() {
		System.out.println("m1 method from child class.");
	}
	
	public static void m2() {
		System.out.println("m2 method from child class.");
	}

}

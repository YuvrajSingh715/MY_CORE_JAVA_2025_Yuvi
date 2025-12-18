package com.Google.oopsconcept.blockcontrolflow;

public class ClassLoadingDemo {

	static {
		System.out.println("this is first static block.");
	}

	{
		System.out.println("This is instance block.");
	}

	void m1(int a) {
		System.out.println(a + " | this is m1 method.");
	}

	static void m2() {
		System.out.println("this is m2 method.");
	}

	ClassLoadingDemo() {
		this(17);
		System.out.println("this is no-argument constructor.");
	}
	
	ClassLoadingDemo(int a){
		System.out.println(a + " | this is int-argument.");
	}

	static {
		System.out.println("this is second static block.");
	}

	public static void main(String[] args) {
		
		System.out.println("this is main method.");
		ClassLoadingDemo ts = new ClassLoadingDemo();
//		ClassLoadingDemo ts1 = new ClassLoadingDemo(12);
		ts.m1(12);
		m2();
	}

}

package com.Google.oopsconcept.blockcontrolflow;

public class SCFChild extends SCFParent {

	static int y = n1();
	
	static 
	{
	    System.out.println("-------> child 2nd static block.");	
	}

	static {
		System.out.println("step-5 : child 1st static block.");
		m2();
	}

	public static int n1() {
		System.out.println("step-4 : child static variable initialized.");
		return 21;
	}

	public static void m2() {
		System.out.println("step-6 : child static method.");
	}

	public static void main(String[] args) {
		System.out.println("step-7 : child main method.");
		System.out.println("x : " + x + " | " + "y : " + y);
	}

}

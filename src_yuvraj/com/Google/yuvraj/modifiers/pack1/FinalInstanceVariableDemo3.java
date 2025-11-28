package com.Google.yuvraj.modifiers.pack1;

public class FinalInstanceVariableDemo3 {

	final int n; // declaration

	{ // it is working before the constructor
		System.out.println("Instance block executed");
		n = 10; // initialization by instance block
	}

	// Constructor
	FinalInstanceVariableDemo3() {
		System.out.println("Constructor executed");

	}

	public static void main(String[] args) {
		System.out.println("main method executed");

		FinalInstanceVariableDemo3 fiv = new FinalInstanceVariableDemo3();

		System.out.println("final value of n = " + fiv.n);

	}

}

package com.Google.yuvraj.modifiers.pack1;

public class FinalInstanceVariableDemo2 {

	final int n; //declaration

	FinalInstanceVariableDemo2() {  //initialization by constructor
		n = 10;
	}
	
	@Override
	public String toString() {
		return "final value of n = " + n;
	}



	public static void main(String[] args) {

		FinalInstanceVariableDemo2 fivd = new FinalInstanceVariableDemo2();
		
		System.out.println(fivd);

	}
}

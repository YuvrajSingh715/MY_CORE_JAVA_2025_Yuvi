package com.Google.yuvraj.interfaces;

public class VariableTest implements Variable { 
	
	@Override
	public void m1() {
		System.out.println("This is a overrided method");
	}
	
	public static void main(String[] args) {
		
//	    	n = 128; //we can't modifie  the value of interface variable inside the implements class
		int m = 34;  // This variable is declare as a new variable inside the VariableTest class
	        m = 23;  // we can modifie the value of variable which is declare inside the class
 		
		System.out.println("The value of n from parent class = "+n);
		System.out.println("The value of m from child class = "+m);
	}

}

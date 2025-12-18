package com.Google.oopsconcept.blockcontrolflow;

public class SCFParent {
	
	static int x = m1();
	
	static 
	{
		System.out.println("step-2 : parent 1st static block.");
		m2();
	}
	
	static 
	{
	    System.out.println("-------> parent 2nd static block.");	
	}
	
	public static int m1() {
		System.out.println("step-1 : parent static variable initialized.");
		return 12;
	}
	
	public static void m2() {
		System.out.println("step-3 : parent static method.");
	}
	
	public static void main(String [] args) {
		System.out.println("parent main method.");
	}

}

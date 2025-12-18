package com.Google.oopsconcept.constructor;

public class RecursiveMethod {
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		
		RecursiveMethod rm = new RecursiveMethod();
		System.out.println("There is no compile time error but it will show StackOverflowError.");
		rm.m1();
		rm.m2();
	}

}

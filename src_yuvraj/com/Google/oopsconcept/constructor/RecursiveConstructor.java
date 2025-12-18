package com.Google.oopsconcept.constructor;

public class RecursiveConstructor {
	
	/*
	 * RecursiveConstructor(){ this(32); }
	 * 
	 * RecursiveConstructor(int a){ this(); }
	 */
	
	
	public static void main(String[] args) {
		System.out.print("Recursive Concept is not applicable inside the Constructor. ");
		System.out.println("we will get compile time error.");
	}
}

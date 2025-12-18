package com.Google.oopsconcept.constructor;

public class ConstructorC extends ConstructorP {

//	Before a child constructor executes, the parent constructor must execute first.
	
	/*
	 * ConstructorC(){ super(); }
	 */
	
	/*
	 * ConstructorC(){ this(); }
	 */
	
	/*
	 * ConstructorC() { this('f'); }
	 */
	
	ConstructorC() {
		super('f');
		System.out.println("child no-argument constructor.");
	}
	
	ConstructorC(String s) {
//		super();
		this();
		System.out.println("child string-agrument constructor.");
	}
	 

	public static void main(String[] args) {
		
		new ConstructorC();
		System.out.println("#=============================#");
		new ConstructorC("star"); 
		
	}
}

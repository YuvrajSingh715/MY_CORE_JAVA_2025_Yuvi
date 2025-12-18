package com.Google.oopsconcept.constructor;

public abstract class AbstractP {

//	Practiced with variables, constructors, concrete methods, and abstract methods. 

	// variable
	int x;
	double y;

	// constructor
	AbstractP() {
		x = 11;
		System.out.println("Parent abstract class constructor.");
	}

	// non-abstract method
	protected void n1() {
		System.out.println(x + " | this is non-abstract method from Parent class.");
	}

	// abstract method
	abstract void m1();

}

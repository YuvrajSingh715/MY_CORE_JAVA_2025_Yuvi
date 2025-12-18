package com.Google.oopsconcept.constructor;

import java.io.IOException;

public class ExceptionP {
	
	ExceptionP() throws IOException{
		System.out.println("checked exception.");
	}
	
}


/*
 * If a parent class constructor throws a checked exception, then the child
 * class constructor must handle it in one of these ways:
 * ------------------------------------------------------>
 * - Declare the same checked exception, or 
 * - Declare its parent (super) checked exception, or 
 * - If the child constructor does not do any of these, the code will NOT compile code.
 * - we can't handle with unchecked exception but you have to add checked exception addationally. 
 */
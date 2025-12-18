package com.Google.oopsconcept.constructor;

 class Parent {}
 
	/*
	 * ❌ private class Parent {}   
	 * ✅ class Parent {}           
	 * ❌ protected class Parent {}
	 * ✅ public class Parent {}
	 */
	
    /*
	 * If no constructor is written, the compiler automatically generates 
	 * a default constructor that calls super().
	 * ------------------------------------------------------------------
	 * 
	 * A() { 
	 * super(); 
	 * }
	 * 
	 */


/*
 * The compiler-generated default constructor always has the same access level
 * as the class, and this applies only to public and default classes.
 */

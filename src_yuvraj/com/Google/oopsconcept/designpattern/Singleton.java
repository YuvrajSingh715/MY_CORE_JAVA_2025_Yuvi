package com.Google.oopsconcept.designpattern;

public class Singleton {
	
	// private variable
	private static Singleton st;
 
    // private constructor
	private Singleton() {
		
	}

	// getSingle Method and its datatype SingleTon
	public static Singleton getSingle() {
		if (st == null) {
			st = new Singleton();
		}
		return st;

	}
}

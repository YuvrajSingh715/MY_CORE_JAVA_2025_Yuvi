package com.intuit.design.pattern;

public class Samosa {
	// lazy way
	private static Samosa samosa;

	// Constructor
	private Samosa() {

	}

	// Lazy way of creating singleton object
	public static Samosa getSamosa() { // not good way to synchronized method (wrong way) thread will be in waiting
										// stage

		// object of this class

		synchronized (Samosa.class) {  //synchronized on block level  good way 
			if (samosa == null) {

				samosa = new Samosa();
			}
		}
		return samosa;
	}

}

//constructor private
//object create with the help of method
//create field to store object is private
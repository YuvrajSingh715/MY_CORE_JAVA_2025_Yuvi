package com.Google.oopsconcept.blockcontrolflow;

public class StaticFlowDemo2 {

	//throw the static block
	static {
		System.out.println("without main method i print this line by use static block.");
		System.exit(0);
	}
	
//	public static void main(String[] args) {
//	
//	}
	
	/*
	 * Clarified that Java 1.6 (JDK 6) and below allow execution without main() when
	 * logic is inside a static block Documented that Java 7+ (JDK 7, 8, 11, 17, 21)
	 * requires a main() method even if static blocks execute first
	 */
}

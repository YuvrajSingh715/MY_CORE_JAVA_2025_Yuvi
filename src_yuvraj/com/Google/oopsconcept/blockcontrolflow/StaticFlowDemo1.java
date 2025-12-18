package com.Google.oopsconcept.blockcontrolflow;

public class StaticFlowDemo1 {
	
	//throw the static variable
	static int a = m1();
	
	public static int m1() {
		System.out.println("hellow guys how are you..?");
		System.exit(0);
		return 12;
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

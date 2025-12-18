package com.Google.oopsconcept.constructor;

public class Child extends Parent{
	
	/* 
	 * WE CAN MAKE THESE CONSTRUCTOR MANUALLY
	 * =======================================
	 * private Child() {} 
	 * Child() {} 
	 * protected Child() {} 
	 * private Child() {}
	 * 
	 */	
	
	
	public static void main(String[] args) {

		Parent a = new Parent();
		System.out.println(a.getClass());
	}

}

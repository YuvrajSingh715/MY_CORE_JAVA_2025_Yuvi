package com.Google.yuvraj.interfaces;

public interface RightC1 {
	
	public void m1();   // by-default = public,abstract
	
	private void m2() {
		System.out.println("this is private method inside the interface RightC1");
	}
	
	default void m3() {
		System.out.println("this is default method inside the interface RightC1");
	}
	
	static void m4() {
		System.out.println("this is static method inside the interface RightC1.");
	}

}

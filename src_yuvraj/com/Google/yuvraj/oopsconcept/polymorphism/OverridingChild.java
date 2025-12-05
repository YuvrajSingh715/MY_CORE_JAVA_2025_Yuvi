package com.Google.yuvraj.oopsconcept.polymorphism;

public class OverridingChild extends OverridingParent {
	
	@Override
	protected void m1() {
		System.out.println("this is overrided method from child class.");
	}
	
	private void n1() {
		System.out.println("this is child private n1 method.");
	} // we can't override this private method.
	
	void m2() {
		System.out.println("this is child method.");
	}

}

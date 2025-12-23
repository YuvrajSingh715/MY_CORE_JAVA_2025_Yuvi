package com.intuit.interview;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("this is overidden method from child class");

	}
	
	public void m2() {
		System.out.println("this is not overridden method from child class");
	}

}

package com.Google.InnerClass;

//Type- Normal or Regular Inner calsses.
//Accessing inner class code from instance area of outer class.

public class OuterDemo2 {

	class Inner{
		
		public void m1() {
			System.out.println("Inner Class Method.");
		}
	}
	
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	
	public static void main(String[] args) {
		OuterDemo2 o = new OuterDemo2();
		o.m2();
	}
	
}

package com.Google.InnerClass;

//Type- Normal or Regular Inner calsses.
//Accessing inner class code from static area of outer class.

public class OuterDemo1 {
	
	class Inner{
		
		public void m1() {
			
			System.out.println("Inner class method :)");
			
		}
	}
	
	public static void main(String[] args) {
		
		OuterDemo1 o = new OuterDemo1();
		OuterDemo1.Inner inner = o.new Inner();
		inner.m1();

		//BOTH ARE SIMILAR...	
		
//		new OuterDemo1().new Inner().m1();
		
	}
	
}

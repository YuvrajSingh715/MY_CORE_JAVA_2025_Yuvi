package com.Google.InnerClass;

//Type- Normal or Regular Inner calsses.
//From the inner class we can access all members of outer class (both static & non-static) member directly

public class OuterDemo4 {

	static int x = 1;
	String y = "JonSnow";
	
	class Inner{
		
		public void m4() {
			System.out.println("value of x: "+x);
			System.out.println("value of y: "+y);
		}
	}
	
	public static void main(String[] args) {
		
		OuterDemo4 o4 = new OuterDemo4();
		OuterDemo4.Inner inner = o4.new Inner();
		inner.m4();
		
//		new OuterDemo4(). new Inner().m4();
		
	}
}

package com.Google.InnerClass;

//Type- Normal or Regular Inner calsses.

public class OuterDemo5 {

	int x = 9;

	class Inner {

		int x = 99;

		public void m5() {
			int x = 999;
			System.out.println("value of x: " + x); // for variable
			System.out.println("value of x: " + this.x); // for Inner class object
			System.out.println("value of x: " + OuterDemo5.this.x); // for Outer class object
		}
	}

	public static void main(String[] args) {

		OuterDemo5 o5 = new OuterDemo5();
		OuterDemo5.Inner inner = o5.new Inner();
		inner.m5();

		new OuterDemo5().new Inner().m5();

	}
}

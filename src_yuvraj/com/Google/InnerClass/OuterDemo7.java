package com.Google.InnerClass;

//Type- Method Local Inner Classes.
/*
If we declare inner class inside instance method then we can access both 
static & non-static variables of outer class directly from that inner class.
*/

public class OuterDemo7 {

	int x = 2;
	static int y = 3;
	
	public void m1() {
		 
		class Inner{
			
			public void m2() {
				System.out.println("value of x: "+ x);
				System.out.println("value of y: "+ y);
			}
		}
		
		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		
		OuterDemo7 o7 = new OuterDemo7();
		o7.m1();
	}
}

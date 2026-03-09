package com.Google.InnerClass;

//Type- Method Local Inner Classes.
/*
If we declare inner class inside static method then we can access only 
static members of outer class directly from that inner class.
*/

public class OuterDemo8 {
	
	int x = 2;
	static int y = 3;
	
	public static void m1() {
		 
		class Inner{
			
			public void m2() {
//				System.out.println("value of x: "+ x);
				System.out.println("value of y: "+ y);
			}
		}
		
		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		
		m1();
		
//		OuterDemo8 o8 = new OuterDemo8();
//		o8.m1();
		
	}

}

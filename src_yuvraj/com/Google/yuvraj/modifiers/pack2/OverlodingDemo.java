package com.Google.yuvraj.modifiers.pack2;

public class OverlodingDemo {
	
	public static void main(String[] args) {
		
		OverlodingDemo old = new OverlodingDemo();
		
		old.m1();
		System.out.println("-------------------------------------------");
		old.m1("Yvuraj Singh Kushwah");
		System.out.println("-------------------------------------------");
		old.m1(18);
		System.out.println("-------------------------------------------");
		old.m1(18, 19);
		System.out.println("-------------------------------------------");
		old.m1("Yuvraj Singh Kushwah", 18, 'A');
		System.out.println("-------------------------------------------");
		old.m1('B');
		
		
	}
	
	
	//------------------Method Overloading---------------------\\

	public void m1() {
		System.out.println("Zero argument method");
	}

	public void m1(String a) {
		System.out.println("One string type argument method");
		System.out.println(a);
	}

	public void m1(int a) {
		System.out.println("one int type argument method");
		System.out.println(a);
	}

	public void m1(int a, int b) {
		System.out.println("two int type argument method");
		System.out.println(a + " , " + b);
	}
	
	public void m1(String b, int a, char c) {
		System.out.println("three int and string type argument method");
		System.out.println(a + " , " + b + " , " + c);
	}
	
	public static void main (char s) {
		System.out.println("this is a string type main method");
		System.out.println(s);
	} 

}

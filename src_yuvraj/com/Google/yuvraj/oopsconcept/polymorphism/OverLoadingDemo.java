package com.Google.yuvraj.oopsconcept.polymorphism;

public class OverLoadingDemo {
	
	public static void main(String[] args) {
		
		OverLoadingDemo old = new OverLoadingDemo();
		
		old.m1();
		System.out.println("-------------------------------------------");
		old.m1("Yvuraj Singh Kushwah");
		System.out.println("-------------------------------------------");
		old.m1(18, 19);
		System.out.println("-------------------------------------------");
		old.m1("Yuvraj Singh Kushwah", 18, 'A');
		System.out.println("-------------------------------------------");
		old.m1('c');
		System.out.println("-------------------------------------------");
		old.main('s');
		
		
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
		System.out.println("one int type argument method.");
		System.out.println(a);
	}

	public void m1(int a, int b) {
		System.out.println("two int type argument method");
		System.out.println(a + " , " + b);
	}
	
	public void m1(String a, int b, char c) {
		System.out.println("string, int and char type argument method");
		System.out.println(a + " , " + b + " , " + c);
	}
	
	public static void main (char s) {
		System.out.println("this is a char type main method");
		System.out.println(s);
	} 

}

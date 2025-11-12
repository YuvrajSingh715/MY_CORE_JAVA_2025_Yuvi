package com.yuvraj.varialbes;

public class WithoudVarArgDemo {

	public static void main(String[] args) {
		
		m1();
		
		m1(10);
		
		m1(10,20);
		
		m1(10,20,30);

	}
	
	public static void m1() {
		System.out.println("m1 with zero argument");
	}
	
	
	public static void m1(int a) {
		
		System.out.println("m1 with one argument "+a);
	}
	
	public static void m1(int a, int b) {
		System.out.println("m1 with two argument");
	}
	
	public static void m1(int a, int b, int c) {
		System.out.println("m1 with three argument ");
	}

}

package com.Google.yuvraj.interfaces;

public class B extends A{
//public class C extends  A,B   -> we can't do like this we can extends one class at a time.
	                             // Java does not support multiple class inheritance
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
	}

}

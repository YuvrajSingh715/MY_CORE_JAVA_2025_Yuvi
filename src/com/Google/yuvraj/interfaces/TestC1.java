package com.Google.yuvraj.interfaces;

public class TestC1 implements RightC1, LeftC1 {

	@Override
	public void m1() {

		System.out.println("Comman method of RightC1 and LeftC1 interfaces.");
	}

	@Override
	public void m3() {
		System.out.println("this is Overrided default method inside the interfaces LeftC1 and RightC1.");
	}
	
	public void m5() {    //this is a normal method of TestC1 class  
		System.out.println("this is a TestC1 class method.");
		System.out.println("this is the end count one to ten...");
	}
	
	public static void main(String[] args) {

		TestC1 testC1 = new TestC1(); // we can do like this but it is not recommended way
		testC1.m1();
        testC1.m3();
        testC1.m5();
        
//		RightC1 rightC1 = new RightC1();     // we can't do like this because object creation isn’t 
//      LeftC1 leftC1 = new	LeftC1();	    // allowed inside an interface.

		RightC1 rightC1 = new TestC1(); // this is recommended way using interface reference
		rightC1.m1(); // normal method
		rightC1.m3(); // default method
		RightC1.m4(); // static method

		LeftC1 leftC1 = new TestC1();   // this is recommended way using interface reference
		leftC1.m1(); // normal method
		leftC1.m3(); // default method
		LeftC1.m4(); // static method

	}

}

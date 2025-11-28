package com.Google.yuvraj.interfaces;

public class TestC2 implements RightC2, LeftC2 {

	@Override
	public void m2() {
		System.out.println("This is m2 method from LeftC2 interface.");
	}

	@Override
	public void m2(int x) {
		System.out.println("value of x = "+x+" | This is m2 method from RightC2 interface.");
	}

	public static void main(String[] args) {

		TestC2 testC2 = new TestC2();
		testC2.m2();
		testC2.m2(23);
		
		RightC2 rightC2 = new TestC2();
		rightC2.m2(33);
		
		LeftC2 leftC2 = new TestC2();
		leftC2.m2();

	}

}

package com.Google.yuvraj.oopsconcept.polymorphism;

public class ORCVReturnTypeChild extends ORCVReturnTypeParent {
	
	@Override
	public Thread m1(int a) {
		System.out.println("this is overrided m1 method from child class.");
		return null;
	}
	
	@Override
	public Integer m2(int y) {
		System.out.println("this is overrided m2 method from child class.");
		return null;
	}
	
	public String m3(int c) {
		System.out.println("this is child m3 method.");
		return "yuvi";
	}

}

package com.Google.oopsconcept.polymorphism;

public class ORCVReturnTypeChild extends ORCVReturnTypeParent {
	
	@Override
	public Thread m1(int a) {
		System.out.println("this is overrided m1 method in child class.");
		return null;
	}
	
	@Override
	public Double m2(int y) {
		System.out.println("this is overrided m2 method in child class.");
		return null;
	} 
//	DoubleAdder, Float, Integer, Long, LongAccumulator...etc
	
	public String m3(int c) {
		System.out.println("this is child m3 method.");
		return "yuvi";
	}

}

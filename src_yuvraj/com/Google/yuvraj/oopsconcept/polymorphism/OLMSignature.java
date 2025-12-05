package com.Google.yuvraj.oopsconcept.polymorphism;

public class OLMSignature {

	public void m1(int a) {
		System.out.println("this is string a type method.");
	}

//	public void m1(int b) {
//		System.out.println("this is string b type method.");
//	}

	/*
	 * Here we will get the method ambiguity error because compiler will be confuse
	 * which method will have to call.
	 */

	public static void main(String[] args) {
		OLMSignature oms = new OLMSignature();
		oms.m1(23);
	}
}

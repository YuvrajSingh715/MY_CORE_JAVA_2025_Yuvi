package com.Google.yuvraj.oopsconcept.polymorphism;

public class OLMResolution {

	public void m1(Object obj) {
		System.out.println("this is Object version.");
	}

	public void m1(String str) {
		System.out.println("this is String version.");
	}

	public static void main(String[] args) {

		OLMResolution omr = new OLMResolution();

		omr.m1(new Object());
		omr.m1("Akanksha");
		omr.m1(null);      //child class will get more priority.
	}

}

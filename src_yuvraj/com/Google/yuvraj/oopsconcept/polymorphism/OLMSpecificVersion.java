package com.Google.yuvraj.oopsconcept.polymorphism;

public class OLMSpecificVersion {

	public void m1(StringBuffer sb) {
		System.out.println("this is stringBuffer method.");
	}

	public void m1(String str) {
		System.out.println("This is string method.");
	}

	public static void main(String[] args) {

		OLMSpecificVersion omsv = new OLMSpecificVersion();

		omsv.m1(new StringBuffer("yuvi"));
		omsv.m1("Akanksha Didi Party 🎉🥳");
//		omsv.m1(null);   //in this scenario we will get ambiguity error.

	}

}

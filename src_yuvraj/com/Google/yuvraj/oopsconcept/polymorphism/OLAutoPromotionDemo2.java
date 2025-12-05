package com.Google.yuvraj.oopsconcept.polymorphism;

public class OLAutoPromotionDemo2 {

	public static void main(String[] args) {

		OLAutoPromotionDemo2 old = new OLAutoPromotionDemo2();
//		old.m1(19);
//		old.m1(12.6);
		old.m1(835.0f);
	}

	public void m1(int a) {
		System.out.println(a + " | " + "this is int argument method." + " | " + "1st priority");
	}

	public void m1(long b) {
		System.out.println(b + " | " + "this is long argument for m1 method." + " | " + "2rd priority");
	}

	public void m1(float c) {
		System.out.println(c + " | " + "this is float argument for m1 method." + " | " + "3th priority");
	}

	public void m1(double d) {
		System.out.println(d + " | " + "this is double argument for m1 method." + " | " + "4th priority");
	}

	public void m1(Integer e) {
		System.out.println(e + " | " + "this is Integer argument method inside the wrapper class." + " | " + "5nd priority");
	}
	
	public void m1(Float f) {
		System.out.println(f + " | " + "this is Float argument method inside the wrapper class.");
	}

	public void m1(Double g) {
		System.out.println(g + " | " + "this is Double argument method inside the wrapper class.");
	}
	
	public void m1(Long l) {
		System.out.println(l + " | " + "this is Long argument method inside the wrapper class.");
	}

}

package com.Google.yuvraj.oopsconcept.polymorphism;

public class OLAutoPromotionDemo1 {

	public static void main(String[] args) {

		OLAutoPromotionDemo1 old = new OLAutoPromotionDemo1();
		old.m1('a');  //unicode no. 97
//		old.m1(478787l);
//		old.m1(43.0f);
		
	}

	public void m1(char a) {
		System.out.println(a + " | " + "this is char argument for m1 method." + " | " + "1st priority");
	}

	public void m1(int b) {
		System.out.println(b + " | " + "this is int argument for m1 method." + " | " + "2nd priority");
	}

	public void m1(long c) {
		System.out.println(c + " | " + "this is long argument for m1 method." + " | " + "3rd priority");
	}

	public void m1(float d) {
		System.out.println(d + " | " + "this is float argument for m1 method." + " | " + "4th priority");
	}

	public void m1(double e) {
		System.out.println(e + " | " + "this is double argument for m1 method." + " | " + "5th priority");
	}

}

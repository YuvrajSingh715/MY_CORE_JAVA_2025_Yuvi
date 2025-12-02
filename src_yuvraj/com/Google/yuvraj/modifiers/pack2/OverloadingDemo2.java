package com.Google.yuvraj.modifiers.pack2;

public class OverloadingDemo2 {

	public static void main(String[] args) {

		OverloadingDemo2 old = new OverloadingDemo2();
		old.m1('a');
	}

	public void m1(char a) {
		System.out.println(a + " | " + "this is char argument for m1 method." + " | " + "1st priority");
	}

	public void m1(int a) {
		System.out.println(a + " | " + "this is int argument for m1 method." + " | " + "2nd priority");
	}

	public void m1(long a) {
		System.out.println(a + " | " + "this is long argument for m1 method." + " | " + "3rd priority");
	}

	public void m1(float a) {
		System.out.println(a + " | " + "this is float argument for m1 method." + " | " + "4th priority");
	}

	public void m1(double a) {
		System.out.println(a + " | " + "this is double argument for m1 method." + " | " + "5th priority");
	}

}

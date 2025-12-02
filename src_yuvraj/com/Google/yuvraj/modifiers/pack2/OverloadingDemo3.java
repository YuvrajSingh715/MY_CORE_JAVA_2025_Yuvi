package com.Google.yuvraj.modifiers.pack2;

public class OverloadingDemo3 {

	public static void main(String[] args) {

		OverloadingDemo3 old = new OverloadingDemo3();
		old.m1(19);
	}

	public void m1(int a) {
		System.out.println(a + " | " + "this is int argument method." + " | " + "1st priority");
	}

	public void m1(Integer a) {
		System.out.println(a + " | " + "this is int argument method inside the rapper class." + " | " + "2nd priority");
	}

}

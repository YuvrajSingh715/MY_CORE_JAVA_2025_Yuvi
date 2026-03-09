package com.Google.InnerClass;

public class StaticInnerCls1 {

	static class Inner {

		public void m1() {
			System.out.println("this is m1 method from static inner class.");
		}
	}

	public static void main(String[] a) {

		StaticInnerCls1.Inner sici = new StaticInnerCls1.Inner();
		sici.m1();

	}

}

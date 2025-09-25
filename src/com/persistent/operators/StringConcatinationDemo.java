package com.persistent.operators;

public class StringConcatinationDemo {

	static int a = 7;
	static int b = 8;
	static int c = 9;
	static int d = 10;
	static String e = "Yuvraj";

	public static void main(String[] args) {

		System.out.println(a + b + c + d + e);     // 34Yuvraj
		System.out.println(b + c + d + e + a);     // 27Yuvraj7
		System.out.println(c + d + e + a + b);     // 19Yuvraj78
		System.out.println(d + e + a + b + c);     // 10Yuvraj789
		System.out.println(e + a + b + c + d);     // Yuvraj78910
	}

}

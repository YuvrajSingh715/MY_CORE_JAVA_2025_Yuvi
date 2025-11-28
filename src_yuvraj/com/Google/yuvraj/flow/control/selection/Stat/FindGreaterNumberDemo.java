package com.Google.yuvraj.flow.control.selection.Stat;

public class FindGreaterNumberDemo {

	public static void main(String[] args) {

		int a = 32;
		int b = 24;
		int c = 14;

		if (a > b && a > c) {
			System.out.println("a is greater");
		}else if (b > c && b > a) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
		
	}
}

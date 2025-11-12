package com.yuvraj.flow.control.selection.Stat;

public class FindGreaterNumberDemo1 {

	public static void main(String[] args) {

		int a = 23;
		int b = 25;
		int c = 34;
		int greater;

		if (a > b) {
			greater = a;

		} else  {
			greater = b;

		}
		if (c > greater) {
			greater = c;
		}
		System.out.println("the greatest number is " + greater);
	}

}

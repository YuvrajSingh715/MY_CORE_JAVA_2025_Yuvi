package com.Google.ExceptionHandling;

//ArrayIndexOutOfBoundsException

public class Top10ExceptionAIOOBExc {

	public static void main(String[] args) {

		int[] a = new int[5];
		
		a[4] = 11;
//		a[5] = 12;

		System.out.println(a[4]);
		System.out.println(a[5]);

	}

}

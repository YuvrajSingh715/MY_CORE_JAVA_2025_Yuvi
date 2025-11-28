package com.Google.yuvraj.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] a = new int[5];
		
		a [0] = 00;
		a [1] = 11;
		a [2] = 22;
		a [3] = 33;
		a [4] = 44;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);   //this statement gives you ArrayIndexOutOfBoundsException Error
	}

}

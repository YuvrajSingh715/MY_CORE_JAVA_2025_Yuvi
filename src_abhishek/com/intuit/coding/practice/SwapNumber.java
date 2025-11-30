package com.intuit.coding.practice;

public class SwapNumber {

	public static void main(String[] args) {
		
		//1. Swap using a Temporary Variable (Most common & safest)
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a + ", b = " + b);
		
		//Swap Without Temporary Variable (Using Arithmetic)
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = " + a + ", b = " + b);
		
		//Swap Using XOR (Bitwise Operator – Safe & No Overflow)
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a = " + a + ", b = " + b);
		
		//Swap Using Java 8 (Only for Objects like Integer)
		int[] arr = {10,20};
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
		
		System.out.println(arr[0] + " " + arr[1]);

	}

}

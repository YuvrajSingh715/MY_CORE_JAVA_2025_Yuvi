package com.Google.yuvraj.flow.control.selection.Stat;

public class FindOddOrEvenNumberDemo {

	public static void main(String[] args) {

		int c = 32;
		int d = 21;

		if (c % 2 == 0 && d % 2 == 0) {
			System.out.println("c & d both are even number");

		} else if (c % 2 != 0 && d % 2 != 0) {
			System.out.println("c & d both are odd number");

		} else if (c % 2 == 0) {
			System.out.println("c is even number and d is odd number");

		} else {
			System.out.println("c is odd number and d is even number");
		}

	}

}

package com.intuit.loop;

public class CountWithWhileLoop {

	public static void main(String[] args) {
		int num = 12345;
		int count = 0;

		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println(count);

	}

}

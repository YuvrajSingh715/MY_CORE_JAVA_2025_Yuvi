package com.yuvraj.operators;

public class RelationOperatorDemo {
	public static boolean lessthan(int a, int b) {
		return (a < b);
	}

	public static boolean greaterthan(int a, int b) {
		return (a > b);
	}

	public static boolean lessthan_equal(int a, int b) {
		return (a <= b);
	}

	public static boolean greaterthan_equal(int a, int b) {
		return (a >= b);
	}

	public static boolean not_equal(int a, int b) {
		return (a != b);
	}

	public static void main(String[] args) {

		System.out.println(lessthan(2, 3));
		System.out.println(greaterthan(2, 3));
		System.out.println(lessthan_equal(2, 3));
		System.out.println(greaterthan_equal(2, 3));
		System.out.println(not_equal(2, 3));
	}
}

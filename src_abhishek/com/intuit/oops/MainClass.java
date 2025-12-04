package com.intuit.oops;

public class MainClass {

	public static void main(String[] args) {
		X x = new Y();
		x.calculate(10, 20);
		Y y = (Y)x;
		y.calculate(100, 500);
		Z z = (Z)y;
		z.calculate(100, 200);
	}

}

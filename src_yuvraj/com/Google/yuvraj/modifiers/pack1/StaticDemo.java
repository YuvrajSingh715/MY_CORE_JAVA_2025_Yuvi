package com.Google.yuvraj.modifiers.pack1;

public class StaticDemo {

	static int x = 55;
	int y = 243;

	public static void main(String[] args) {

		StaticDemo sd1 = new StaticDemo();
		sd1.x = 12;
		sd1.y = 34;

		StaticDemo sd2 = new StaticDemo();
		
		
		System.out.println("value of x = " + sd1.x);
		System.out.println("value of y = " + sd1.y);
		
		System.out.println("++++++++++++++++");

		System.out.println("value of x = " + sd2.x);
		System.out.println("value of y = " + sd2.y);
	}

}

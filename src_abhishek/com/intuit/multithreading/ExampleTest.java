package com.intuit.multithreading;

public class ExampleTest {

	public static void main(String[] args) {
		Example1 e1 = new Example1();
	e1.start();
		//e1.run();
		for(int i = 0; i<=5; i++) {
			System.out.println(i);
		}
	}
}

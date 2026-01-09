package com.intuit.collection;

public class Test {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {

			@Override
			public void m1(int a) {
				System.out.println(a);

			}

		};
		myFunctionalInterface.m1(0);
		
		MyFunctionalInterface myFunctionalInterface2 = (x) -> {
			System.out.println();
		};
		myFunctionalInterface2.m1(0);

	}

}

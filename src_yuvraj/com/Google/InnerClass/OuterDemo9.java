package com.Google.InnerClass;

//Type- Method Local Inner Classes.
/*
From method local inner class we can't access local variable of the method in which we declared it. 
but if that local variable declared as the final then we can access. but this is applicable only before the java 8 version.
 */

public class OuterDemo9 {

	int x = 31;

	public void m1() {

		int y = 51;
		final int z = 11;

		class Inner {

			public void m2() {
				System.out.println("value of x: " + x);
				System.out.println("value of y: " + y);
				System.out.println("value of z: " + z);
			}
		}

		Inner i = new Inner();
		i.m2();

	}

	public static void main(String[] args) {

		OuterDemo9 o9 = new OuterDemo9();
		o9.m1();
	}
}

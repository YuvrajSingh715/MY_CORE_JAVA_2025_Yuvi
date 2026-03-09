package com.Google.InnerClass;

public class DemoTest {

	int x = 110;
	final static int y = 9999;

	public void m1() // static method of outer class.
	{
		int z = 345;

		class Inner {
			int x = 55;
			int y = 999999;

			public void m2() {
				System.out.println(x);// inner method called
				System.out.println(y);
				System.out.println(z);
				System.out.println(this.x);
				System.out.println(DemoTest.this.x);// outer class variable called.
			}
		}
		Inner i = new Inner();
		i.m2();// inner class method called directly.

	}

	public static void main(String[] args) {

		new DemoTest().m1();// static method declared directly.

		DemoTest test = new DemoTest() {
			public void m1() {
				System.out.println(y - x);// in this case y,x values taken from outer class.

			}

		};

		test.m1();// anonymous class
	}
}

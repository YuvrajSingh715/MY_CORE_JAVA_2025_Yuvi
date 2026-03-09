package com.Google.InnerClass;

//Type- Method Local Inner Classes.
//The only applicable modifires for method local inner classes are final, abstract, strictfp

public class OuterDemo6 {

	public void m6() {

		class Inner {

			public void sum(int x, int y) {
				System.out.println("sum of x and y is: " + (x + y));
			}
		}

		Inner i = new Inner();
		i.sum(11, 32);
		i.sum(12, 50);

	}

	public static void main(String[] args) {

		OuterDemo6 o6 = new OuterDemo6();

		o6.m6();
	}
}

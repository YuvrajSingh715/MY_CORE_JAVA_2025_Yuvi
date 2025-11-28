package com.Google.yuvraj.operators;

public class ShortCircuitOperatorDemo2 {

	public static void main(String[] args) {

		// First scenario
		int x = 16;
		int y = 13;

		if (++x >= 18 || ++y <= 12) { // both are evaluated because both results are false
			System.out.println("if first scenario is true then");
			++x;
		} 
		else {
			System.out.println("if first scenario is false then");
			++y;
		}

		System.out.println("x = " + x + " And" + " y = " + y);

		// Second scenario
		int a = 21;
		int b = 19;

		if (++a >= 17 && ++b <= 15) { // b will be evaluated because first result is true
			System.out.println("if second scenario is true then");
			++a;
		} 
		else {
			System.out.println("if second scenario is false then ");
			++b;
		}

		System.out.println("a = " + a + " And" + " b = " + b);

		// Third scenario
		int p = 14;
		int q = 17;

		if (++p >= 16 && ++q <= 10) { // q will not be evaluated because first result is false
			System.out.println("if third scenario is true then");
			++p;
		} 
		else {
			++q;
			System.out.println("if third scenario is false then");
		}

		System.out.println("p = " + p + " And" + " q = " + q);
		
		// Fourth scenario
		int c = 8;
		int d = 9;

		if (++c >= 7 && ++d <= 10) { // both are evaluated because both results are true
			System.out.println("if fourth scenario is true then");
			++c;
		} 
		else {
			++d;
			System.out.println("if fourth scenario is false then");
		}

		System.out.println("c = " + c + " And" + " d = " + d);
	}

}

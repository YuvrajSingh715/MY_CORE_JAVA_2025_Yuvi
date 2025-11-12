package com.yuvraj.operators;

public class ShortCircuitOperatorDemo1 {
	public static void main(String[] args) {
    
		// First scenario
		int x = 15;
		int y = 12;

		if (--x >= 14 && --y <= 12) { //both are evaluated because both results are true
			System.out.println("if first scenario is true then");
			--x;
		}
		else {
			System.out.println("if first scenario is false then");
			--y;
		}

		System.out.println("x = " +x+ " And" +" y = " +y );
		
		//Second scenario
		int a = 15;
		int b = 12;

		if (--a >= 13 && --b <= 10) { //b will be evaluated because first result is true
            System.out.println("if second scenario is true then");
            --a;
		}
		else {
			 System.out.println("if second scenario is false then ");
			 --b;
		}

		System.out.println("a = " +a+ " And" +" b = " +b );
	
		// Third scenario
		int p = 15;
		int q = 12;

		if (--p >= 15 && --q <= 10) { //q will not be evaluated because first result is false
            System.out.println("if third scenario is true then");
            --p;
		}
		else {
			--q; System.out.println("if third scenario is false then");
		}

		System.out.println("p = " +p+ " And" +" q = " +q );
		
		//Fourth scenario
		int n = 16;
		int m = 13;

		if (++n >= 18 && ++m <= 12) { // both are evaluated because both results are false
			System.out.println("if first scenario is true then");
			++n;
		} 
		else {
			System.out.println("if first scenario is false then");
			++m;
		}

		System.out.println("n = " + n + " And" + " m = " + m);
	}
}
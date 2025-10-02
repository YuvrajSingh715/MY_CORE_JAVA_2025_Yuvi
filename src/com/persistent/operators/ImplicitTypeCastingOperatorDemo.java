package com.persistent.operators;

public class ImplicitTypeCastingOperatorDemo {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;
		int z = 11;
		
		
		double d1 = x; //Here Integer converts into double [automatically without print anything extra]
		double d2 = y; //Here Integer converts into double [automatically without print anything extra]
		double d3 = z; //Here Integer converts into double [automatically without print anything extra]
		int a1 = 'A'; //Here char converts into integer [automatically without print anything extra]
		int b1 = 'a'; //Here char converts into integer [automatically without print anything extra ]
		
		
		System.out.println("x = " +x+ " convert into" + " double = " +d1 );
		System.out.println("y = " +y+ " convert into" + " double = " +d2 );
		System.out.println("z = " +z+ " convert into" + " double = " +d3 );
		System.out.println("char a1 convert into integer = " +a1);
		System.out.println("char b1 convert into integer = " +b1);
		
	}

}

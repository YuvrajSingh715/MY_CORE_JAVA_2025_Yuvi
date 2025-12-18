package com.Google.oopsconcept.typecasting;

public class ABCTest {

	public static void main(String[] args) {

		// Experiment with variables.
		C c = new C();
		System.out.println(c.i);
		System.out.println(c.d);

		B b = new C();
		System.out.println(b.i);
		System.out.println(b.d);

		A a = new C();
		System.out.println(a.i);
		System.out.println(a.d);
		
		C o = new C();  // calls all class variable throw the one object
		System.out.println(((C)o).i);
		System.out.println(((C)o).d);
		System.out.println(((B)o).i);
		System.out.println(((B)o).d);
		System.out.println(((A)o).i);
		System.out.println(((A)o).d);

		System.out.println("############################");

		// Experiment with I-Method.
		C c1 = new C();
//		((C)c1).n1();         // Similar to => c1.n1();
		c1.n1();
		System.out.println(c1.i);
		System.out.println(c1.d);

		B b1 = new C();
//		((B)b1).n1();         // Similar to => b1.n1();
		b1.n1();	
		System.out.println(b1.i);
		System.out.println(b1.d);
		
		A a1 = new C();
//		((A)a1).n1();         // Similar to => a1.n1();
		a1.n1();	
		System.out.println(a1.i);
		System.out.println(a1.d);

		System.out.println("############################");

		// Experiment with S-Method.
		C c2 = new C();
//		((C)c2).m1();         // Similar to => c2.m1();
		c2.m1();
		System.out.println(c2.i);
		System.out.println(c2.d);
		
		B b2 = new C();
//		((B)b2).m1();         // Similar to => b2.m1();
		b2.m1();
		System.out.println(b2.i);
		System.out.println(b2.d);
		
		A a2 = new C();
//		((A)a2).m1();         // Similar to => a2.m1();
		a2.m1();
		System.out.println(a2.i);
		System.out.println(a2.d);

	}

}

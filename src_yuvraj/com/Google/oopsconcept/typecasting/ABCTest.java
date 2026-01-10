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
		
		C o = new C();  // calls all class variable throw the one object creation.
		System.out.println(((C)o).i);
		System.out.println(((C)o).d);
		System.out.println(((B)o).i);
		System.out.println(((B)o).d);
		System.out.println(((A)o).i);
		System.out.println(((A)o).d);

		System.out.println("###################################");

		// Experiment with I-Method.
		C c1 = new C();
		c1.n1();
		
		B b1 = new C();
		b1.n1();	
		
		A a1 = new C();
		a1.n1();	
		
		C i = new C();  // calls all class instance method throw the one object creation.
		((C)i).n1();
		((B)i).n1();
		((A)i).n1();

		System.out.println("###################################");

		// Experiment with S-Method.
		C c2 = new C();
		c2.m1();
		
		B b2 = new C();
		b2.m1();
		
		A a2 = new C();
		a2.m1();
		
		C s = new C();  // calls all class static method throw the one object creation.
		((C)i).m1();
		((B)i).m1();
		((A)i).m1();

	}

}

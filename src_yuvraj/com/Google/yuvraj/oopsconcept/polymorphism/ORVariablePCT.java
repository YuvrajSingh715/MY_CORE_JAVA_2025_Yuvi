package com.Google.yuvraj.oopsconcept.polymorphism;

public class ORVariablePCT {

	public static void main(String[] args) {

		ORVariableP p1 = new ORVariableP();
		System.out.println("x from parent = " + p1.x);  
		System.out.println("c from parent = " + p1.c); 
		System.out.println("s from parent = " + p1.s);
		System.out.println("d from parent = " + p1.d);
		System.out.println("f from parent = " + p1.f);

		
		ORVariableC c1 = new ORVariableC();
		System.out.println("x from child = " + c1.x);  
		System.out.println("c from child = " + c1.c);
		System.out.println("s from child = " + c1.s);   
		System.out.println("l from parent = " + c1.l);  
		System.out.println("d from parent = " + c1.d);  
		System.out.println("f from parent = " + c1.f);   
		     
		
		ORVariableP p2 = new ORVariableC();
		System.out.println("x from parent = " + p2.x);      
		System.out.println("c from parent = " + p2.c);
		System.out.println("s from parent = " + p2.s);
		System.out.println("d from parent = " + p1.d);
		System.out.println("f from parent = " + p1.f);
		
		
//		ORVariableC c2 = new ORVariableP();
//		we can't hold parent object inside the child reference.

	}

}

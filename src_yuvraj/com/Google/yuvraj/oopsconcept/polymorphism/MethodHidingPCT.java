package com.Google.yuvraj.oopsconcept.polymorphism;

public class MethodHidingPCT {

	public static void main(String[] args) {

//Calling the method directly using the class name because static methods don’t require an object. 
		MethodHidingP.m1();
		MethodHidingC.m1();
		MethodHidingC.m2();

		// case1
		MethodHidingP p1 = new MethodHidingP();
		p1.m1();

		// case2
		MethodHidingC c1 = new MethodHidingC();
		c1.m1();
		c1.m2();

		// case3
		MethodHidingP p2 = new MethodHidingC();
		p2.m1();

		// case4
//		Child c2 = new Parent();   
//This assignment is not applicable since a parent object cannot be stored in a child reference.

	}

}

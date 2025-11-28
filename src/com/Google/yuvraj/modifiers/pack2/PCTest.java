package com.Google.yuvraj.modifiers.pack2;

public class PCTest {

	public static void main(String[] args) {

//Calling the method directly using the class name because static methods don’t require an object. 
		Parent.m1();
		Child.m1();
		Child.m2();

		// case1
		Parent p1 = new Parent();
		p1.m1();

		// case2
		Child c1 = new Child();
		c1.m1();
		c1.m2();

		// case3
		Parent p2 = new Child();
		p2.m1();

		// case4
//		Child c2 = new Parent();   
//This assignment is not applicable since a parent object cannot be stored in a child reference.

	}

}

package com.Google.yuvraj.modifiers.pack1;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("This is child method...");
	}

	public static void main(String[] agrs) {

		// case 1
		Parent p = new Parent();
		p.m1();

		// case 2
		Child c = new Child();
		c.m1();

		// case 3
		Parent pc = new Child();
		pc.m1();
		
		// case 4  -> this is not applicable in java 
        //Child cp = new Parent();
	}

}

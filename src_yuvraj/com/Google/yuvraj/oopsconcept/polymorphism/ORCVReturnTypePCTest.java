package com.Google.yuvraj.oopsconcept.polymorphism;

public class ORCVReturnTypePCTest {

	public static void main(String[] args) {

		ORCVReturnTypeParent p = new ORCVReturnTypeParent();
		p.m1(1);
		p.m2(2);
		
		ORCVReturnTypeChild c = new ORCVReturnTypeChild();
		c.m1(3);
		c.m2(4);
		c.m3(5);
		
		ORCVReturnTypeParent pc = new ORCVReturnTypeChild();
		pc.m1(6);
		pc.m2(7);
		
//		ORRetrunTypeChild  cp = new ORRetrunTypeParent();
// we can't do this becuase child reference does't hold the parent object.  
		
	}

}

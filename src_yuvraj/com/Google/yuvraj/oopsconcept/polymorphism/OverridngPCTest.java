package com.Google.yuvraj.oopsconcept.polymorphism;

public class OverridngPCTest {

	public static void main(String[] args) {

		OverridingParent op = new OverridingParent();
		op.m1();
		
		OverridingChild  oc = new OverridingChild();
		oc.m1();
		oc.m2();
		
		OverridingParent pc = new OverridingChild();
		pc.m1();
		
//		OverridingChild cp = new OverridingParent();   //we can't do this.
	}

}

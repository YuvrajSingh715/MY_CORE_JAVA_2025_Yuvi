package com.Google.oopsconcept.blockcontrolflow;

public class ICFParent {

//	Instance Variable
	int x = m1();

//	Instance Block
	{
		System.out.println("step-2 : parent 1st Instance block.");
		m2();
	}

//	Instance Method
	public int m1() {
		System.out.println("step-1 : parent Instance variable initialized.");
		return 143;
	}

//	Instance Block
	{
		System.out.println("step-3 : parent 2nd Instance block.");
	}

//	Instance Method
	public void m2() {
		System.out.println("-------> parent Instance method.");
	}

//	Main Method
	public static void main(String[] args) {
		System.out.println("# PARENT CLASS MAIN METHOD #");
		System.out.println("#==========================#");
		ICFParent p = new ICFParent();
	}
	
//	Constructor
	ICFParent() {
		System.out.println("step-4 : this is parent coustructor.");
	}

}

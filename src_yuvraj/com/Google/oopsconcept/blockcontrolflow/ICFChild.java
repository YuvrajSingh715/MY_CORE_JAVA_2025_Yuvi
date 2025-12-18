package com.Google.oopsconcept.blockcontrolflow;

public class ICFChild extends ICFParent {

	int y = n1();

	{
		System.out.println("step-6 : child 1st Instance block.");
		n2();
	}

	public int n1() {
		System.out.println("step-5 : child Instance variable initialized.");
		return 221;
	}

	{
		System.out.println("step-7 : child 2nd Instance block.");
	}
 
	public void n2() {
		System.out.println("-------> child Instane method.");
	}

	ICFChild() {
		System.out.println("step-8 : this is child constructor.");
	}

	public static void main(String[] args) {
		System.out.println("# CHILD CLASS MAIN METHOD #");
		System.out.println("#=========================#");
		ICFChild c = new ICFChild();
		System.out.println("x : " + c.x + " | " + "y : " + c.y);
	}

}

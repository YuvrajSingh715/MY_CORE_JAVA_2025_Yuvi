package com.Google.oopsconcept.constructor;

public class AbstractC extends AbstractP {

	int y;
	
	AbstractC() {
//		this(21);    // if we uncommit this line then there is recursion issue.
//		super();     // calls Parent constructor.
		y = 22;
		System.out.println("child class no-argument constructor.");
	}
	
	AbstractC(int a) {
//		super();      // Java inserts super() automatically if it is missing.
//		this();       // calls another construtor from same class.
		System.out.println(a + " | child class int-argument constructor.");
	}
	
	@Override
	public void n1() {
		System.out.println("concrete method from child class.");
	}
	
	@Override
	void m1() {
		System.out.println("implemented Abstract method  from child class.");
	}
	
	public static void main(String[] args) {
		System.out.println("# THIS IS MAIN METHOD #");
		System.out.println("=========================================-> PART-01 {C&M&V}");
		
		
		AbstractC c1 = new AbstractC();   // Child object creation.
		c1.n1();
		c1.m1();
		System.out.println("value of x = " + c1.x);     // from Parent
		System.out.println("value of y = " + c1.y);     // from child
		System.out.println("=========================================-> PART-02 {C&M&V}");
		
		
		AbstractP p1 = new AbstractC();   // Child object creation with respect of parent.
		p1.n1();
		p1.m1();
		System.out.println("value of x = " + p1.x);     // from Parent
		System.out.println("value of y = " + p1.y);     // from child
		System.out.println("=========================================-> PART-03 {C&V}");
		
		
		AbstractC c2 = new AbstractC(11);
		System.out.println("value of x = " + c2.x);     // from Parent
		System.out.println("value of y = " + c2.y);     // from child
		System.out.println("=========================================-> CODE-END");
		
	}
}


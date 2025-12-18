package com.Google.oopsconcept.blockcontrolflow;

public class InstanceFlowDemo {

//	Instance Variable
	int x = m1();

//	Instance Block
	{
		System.out.println("step-3: " +x + " | this is 1st instance block.");
//		m1();
	}

//	Constructor
	InstanceFlowDemo() {
		System.out.println("step-6: " +"this is contructor.");
	}
	
//	Instance Method
	public void m2() {
		System.out.println("step-5: " +"this is instance method.");
	}

//	Main Method
	public static void main(String[] args) {
		System.out.println("step-1: " +"this is main method.");
		InstanceFlowDemo ifd = new InstanceFlowDemo();
//		System.out.println("hashcode of class -> " + ifd.hashCode());
	}
//	👉 Instance flow happens BEFORE constructor execution
//	👉 Main method runs first, but instance members run when object is created

//	Instance Method
	public int m1() {
		System.out.println("step-2: " +"this is instance variable initialized.");
		return 11;
	}

//	Instance Variable
	int y = 21;

//	Instance Block
	{
		System.out.println("step-4: " +y + " | this is 2nd instance block.");
		m2();
	}

	/*
	 * ❎ Illegal forward reference we can't change the order other we get compile
	 * time error.
	 * 
	 * { 
	 * System.out.println(z); // compile-time error 
	 * }
	 * 
	 * int z = 30;
	 */

}

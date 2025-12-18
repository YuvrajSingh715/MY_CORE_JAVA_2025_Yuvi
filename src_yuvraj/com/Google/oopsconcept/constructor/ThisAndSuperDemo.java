package com.Google.oopsconcept.constructor;

public class ThisAndSuperDemo {
	
//	Instance Block
	{
		System.out.println("=> " + this.hashCode());
		System.out.println("=> " + super.hashCode());
	}
	
//  Static Block
	static {
		System.out.println("this is static block.");
	}

//	Static Method
	public static void m1() {
		System.out.println("this is static method.");
//		System.out.println(super.hashCode());
//		System.out.println(this.hashCode());
//		super();    //we can use super() only inside the constructor.
//		this();     //we can use this() only inside the constructor.
	}
//	we can't use this and super key word inside the static area.

//	Constructor
	ThisAndSuperDemo(){
		super();   //Java inserts super() automatically if it is missing.
		System.out.println("this is no-argument constructor.");
	}
	
//	Instance Method
	public void m2() {
		System.out.println("Hashcode with this key word : " + this.hashCode());
		System.out.println("Hashcode with super key word : " + super.hashCode());
	}

//	Main Method 
	public static void main(String[] args) {
		System.out.println("This is main method.");
		ThisAndSuperDemo cd = new ThisAndSuperDemo();
		m1();
		cd.m2();
	}
}


//============Flow Control of this code===============\\

/*
Class load
→ static block
→ main()
→ object creation
→ super()
→ instance block
→ constructor body
→ static method
→ instance method
*/


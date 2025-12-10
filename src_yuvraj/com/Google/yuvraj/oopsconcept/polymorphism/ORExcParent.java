package com.Google.yuvraj.oopsconcept.polymorphism;

import java.sql.SQLException;

class ORExcParent {

	void m1() throws Throwable {
		System.out.println("this is parent exception.");
	}
	
	void m2() throws Throwable {
		System.out.println("this is parent exception.");
	}
	
	void m3() throws Exception {
		System.out.println("this is child exception.");
	}
	
	void m4() throws Exception {
		System.out.println("this is child exception.");
	}

	void m5() throws ClassNotFoundException {
		System.out.println("This is checked exception.");
	}

	void m6() throws ArithmeticException {
		System.out.println("this is uncheckout exception.");
	}
	 
	void m7() throws SQLException {
		System.out.println("this is checked exception.");
	}
	
	void m8() throws Exception {
		System.out.println("this is parent exception.");
	}
	
	void m9() throws NullPointerException{
		System.out.println("there is exception.");
	}
	
}

//    PARENT CLASS        ||       CHILD CLASS

//  Parent Exception      ->     Parent Exception            ✅
//  Child Exception       ->     Child Exception             ✅
//  Parent Exception      ->     Child Exception             ✅
//	Child Exception       ->     Parent Exception            ❎
//	Checked Exception     ->     Checked Exception           ✅
//	Unchecked Exception   ->     Checked Exception           ❎
//  Checked Exception     ->     Unchecked Exception         ✅
//	Parent Exception      ->     Checked Exception           ✅
//  Exception             ->     NO Exception                ✅
	
	


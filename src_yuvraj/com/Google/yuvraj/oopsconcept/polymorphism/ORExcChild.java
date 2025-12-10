package com.Google.yuvraj.oopsconcept.polymorphism;

import java.sql.SQLException;

public class ORExcChild extends ORExcParent{
	
	@Override
	void m1() throws Throwable {
		System.out.println("this is parent exception.");
	}
	
	@Override
	void m2() throws Exception {
		System.out.println("this is child exception.");
	}
	
	@Override
	void m3() throws Exception {
		System.out.println("this is child exception.");
	}
	
//	@Override
//	void m4() throws Throwable {
//		System.out.println("this is parent exception.");
//	}
//  we can't Override child exception into parent exception inside the child class.

	@Override
	void m5() throws ArrayIndexOutOfBoundsException {
		System.out.println("this is checked exception.");
	}
	   
//	@Override  
//	void m6() throws SQLException {
//		System.out.println("this is checked exception.");
//	}
//	we can't Override checked exception inside the child class. if you have unchecked 
//	method inside the parent class.
	
	@Override
	void m7() throws ArrayIndexOutOfBoundsException {
		System.out.println("this is unchecked exception.");
	}
	
	@Override  
	void m8() throws SQLException {
		System.out.println("this is checked exception.");
	}
	
	@Override
	void m9() {
		System.out.println("without any exception.");
	}

}

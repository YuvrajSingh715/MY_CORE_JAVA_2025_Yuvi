package com.Google.yuvraj.modifiers.pack1;

public class ProtectedDemoTest extends ProtectedDemo {

	public static void main(String[] args) {

		//case-1
		ProtectedDemo pd = new ProtectedDemo();
		pd.o1();
		
		//case-2
		ProtectedDemoTest pdt = new ProtectedDemoTest();
		pdt.o1();
		
		//case-3
		ProtectedDemo pc = new ProtectedDemoTest();
		pc.o1();
		
		//case-4  this case is not allowed because a child-class reference cannot hold a parent-class object.
	    // ProtectedDemoTest cp = new ProtectedDemo();
	    //cp.o1();
	    
	}
 
}

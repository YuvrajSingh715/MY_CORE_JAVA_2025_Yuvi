package com.Google.yuvraj.modifiers.pack2;

import com.Google.yuvraj.modifiers.pack1.ProtectedDemo;

public class ProtectedDemoTest extends ProtectedDemo {

	public static void main(String[] args) {

		//case-1
		ProtectedDemoTest pdt = new ProtectedDemoTest();
		pdt.o1();
		
		//case-2   we can't call protect method by the using of parent reference
		//ProtectedDemo pd = new ProtectedDemo();
        //pd.o1();
		
		//case-3   we can't call protect method by the using of parent reference
		//ProtectedDemo pc = new ProtectedDemoTest();
        //pc.o1();
		
	}

}

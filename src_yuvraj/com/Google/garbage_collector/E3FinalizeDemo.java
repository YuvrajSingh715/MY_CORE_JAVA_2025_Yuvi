package com.Google.garbage_collector;

public class E3FinalizeDemo {

	public static void main(String[] args) {
		
		E3FinalizeDemo efd = new E3FinalizeDemo();
		
//		efd.finalize();    //Line no. 1
		
		efd = null;
		
		System.gc();
		
		System.out.println("End of Main.");
		
	}
	
	@Override
	public void finalize() {
		System.out.println("finalize method called.");
		System.out.println(10/0);
	}
	
}

// 1. If we are not comment line 1 , then we are calling the finalize() method explicitly and the program will be terminated abnormally.
// 2. if we are commenting line 1, then G.C calls finalize() method & the raised Arithmetic exception is ignored by JVM. hence in this case 
//    the output is something like that you can see below the code.
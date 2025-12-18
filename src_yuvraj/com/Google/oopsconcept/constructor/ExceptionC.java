package com.Google.oopsconcept.constructor;

import java.io.IOException;

public class ExceptionC extends ExceptionP {

//	#===========================Checked Exceptions============================#
	
	ExceptionC() throws IOException {
		super();
	System.out.println("we can take same checked exception.");
	}

//	ExceptionC() throws Exception {
//		super();
//		System.out.println("we can take its parent exception.");
//	}
	 
//	#===========================Unchecked Exceptions============================#
	
//	ExceptionC() throws NullPointerException {
//		super();
//	System.out.println("we can't take unchecked exception.");
//	}
	
//	ExceptionC() throws NullPointerException, IOException {
//		super();
//	System.out.println("we can't take unchecked exception.");
//	}

}

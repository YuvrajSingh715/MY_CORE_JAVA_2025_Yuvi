package com.Google.oopsconcept.typecasting;

// type casting syntax : A a = (C) D
//RULE-02: C must be either same or derived type of A otherwise we will get compile time error.
//         saying that "incompatable type".

public class TC_Case2 {
	
	public static void main(String[] args) {

		Object obj = new String("Bhupesh");       // upcasting (Implicit) --> automatically
		String s1 = (String) obj;                 // safe downcasting (Explecit) --> manually

		System.out.println("HashCode-1 : " + obj.hashCode());
		System.out.println("HashCode-2 : " + s1.hashCode());

		
		String s2 = new String("jyoti");
		Object o = (String) s2;
//		StringBuffer sb = (Object) s2;
//		↪> Type mismatch: cannot convert from Object to StringBuffer.
			
//		Object o1 = (StringBuffer) s2;
//		↪> Cannot cast from String to StringBuffer because No relationship between these classes.

		System.out.println("HashCode-3 : " + s2.hashCode());
	}

}

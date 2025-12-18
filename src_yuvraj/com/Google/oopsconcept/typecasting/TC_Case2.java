package com.Google.oopsconcept.typecasting;

public class TC_Case2 {

	public static void main(String[] args) {

		Object obj = new String("Bhupesh");       // upcasting (Implicit) --> automatically
		String s1 = (String) obj;                 // safe downcasting (Explecit) --> manually

		System.out.println("HashCode 1 : " + obj.hashCode());
		System.out.println("HashCode 2 : " + s1.hashCode());

		
		
		String s2 = new String("jyoti");
//		StringBuffer sb = (Object) s2;
//		Type mismatch: cannot convert from Object to StringBuffer

		System.out.println("HashCode 3 : " + s2.hashCode());
	}

}

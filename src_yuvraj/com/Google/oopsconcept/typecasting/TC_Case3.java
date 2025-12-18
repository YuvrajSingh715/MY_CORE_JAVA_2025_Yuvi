package com.Google.oopsconcept.typecasting;

public class TC_Case3 {

	public static void main(String[] args) {

		// this is actuall type casting
		Object obj = new String("Abhishek");
		String s = (String) obj;

		System.out.println("Both hashcode is same" + obj == s);
		System.out.println("Both hashcode is same : " + (obj == s));
		System.out.println(obj == s);
		System.out.println("HashCode1 : " + obj.hashCode());
		System.out.println("HashCode2 : " + s.hashCode());
		
		Object obj1 = new String("Yuvraj");
		StringBuffer sb = (StringBuffer) obj1;

	}

}

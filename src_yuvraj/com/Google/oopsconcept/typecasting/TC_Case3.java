package com.Google.oopsconcept.typecasting;

//type casting syntax : A a = (C) D
//RULE-03: the underlying object type of D must be either same or derived type of C. otherwise
//         we will get runtime error saying that "class cast exception."

public class TC_Case3 {

	public static void main(String[] args) {

		// this is actuall type casting
		Object obj = new String("Abhishek");
		String s = (String) obj;

		System.out.println(obj == s);
		System.out.println("Both hashcode is same" + obj == s);
		System.out.println("Both hashcode is same : " + (obj == s));
		System.out.println("HashCode of obj : " + obj.hashCode());
		System.out.println("HashCode of s : " + s.hashCode());
		
		Object obj1 = new String("Yuvraj");
		StringBuffer sb = (StringBuffer) obj1;

	}

}

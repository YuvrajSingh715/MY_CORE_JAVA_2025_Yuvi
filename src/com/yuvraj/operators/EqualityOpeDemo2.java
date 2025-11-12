package com.yuvraj.operators;

public class EqualityOpeDemo2 {

	public static void main(String[] args) {

		String str = new String();
		Object obj = new Object();

		// In this case Here, both classes hash codes are compared
		System.out.println(str == obj);  //false
		System.out.println(str != obj);  //true
        System.out.println(str == null); //false
        System.out.println(str != null); //true
		
		
		Thread th1 = new Thread();
		Thread th2 = new Thread();

		// In this case Here, both classes hash codes are compared
		System.out.println(th1 == th2); // false
		System.out.println(th1 != th2); // true
        System.out.println(th1 == null); //false
		System.out.println(null == null); //true
		
		
		//System.out.println(obj.hashCode());
		
	}

}

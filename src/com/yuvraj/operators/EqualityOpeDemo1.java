package com.yuvraj.operators;

public class EqualityOpeDemo1 {

	public static void main(String[] args) {

		// some examples of equality operator [==]
		System.out.println(8 == 10);                    //false
		System.out.println('A' == 65);                  //true
		System.out.println(false == false);             //true
		System.out.println(70 == 'F');                  //true
		System.out.println(2.345 == 2.346);             //false
		System.out.println(true == true);               //true
		System.out.println('d' == 100);                 //true
		System.out.println(null== null);                //true

		// some examples of not-equal operator [!=]
		System.out.println(8 != 10);                    //true
		System.out.println('A' != 65);                  //false
		System.out.println(false != false);             //false
		System.out.println(70 != 'F');                  //false
		System.out.println(2.345 != 2.346);             //true
		System.out.println(true != true);               //false
		System.out.println('d' != 100);                 //false
        System.out.println(null != null);               //false
	}

}

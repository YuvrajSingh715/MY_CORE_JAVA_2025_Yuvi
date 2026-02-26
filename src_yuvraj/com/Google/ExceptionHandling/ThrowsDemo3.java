package com.Google.ExceptionHandling;

//we can't do this. 
//public class ThrowsDemo3 {
//
//	public static void main1() throws ThrowsDemo3{
//	//No exception of type ThrowsDemo3 can be thrown; an exception type must be a subclass of Throwable
//	
//	}
//}


//we can do this.
public class ThrowsDemo3 extends Exception {

	public static void main() throws ThrowsDemo3 {

	}
}

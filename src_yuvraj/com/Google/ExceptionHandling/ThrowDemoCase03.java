package com.Google.ExceptionHandling;

//secnario-1
//public class ThrowDemoCase03{ 

	
//secnario-2
public class ThrowDemoCase03 extends RuntimeException {
	
	
	public static void main(String[] args) {

		throw new ThrowDemoCase03();
		
	}

}

//we can use throw keyword only for throwable type otherwise we will get compiletime error saying incompatiable types.
package com.Google.multithreading;

public class E1ThreadTest {

	public static void main(String[] args) {

		E1Thread e1 = new E1Thread();
		
		e1.start();  
		//start() --> create new Thread --> after than calls run() --> now run() will excute.

		e1.run();          //this is normal calling of run() method without argument.
		e1.run("Yuvi");     //this is normal calling of run() method with argument.
		
		
		/*
		 * start() method internally always calls no argument run() method. 
		 * if you want the argument run() method then you have to call argumented run() method manually.
		 * __________________________
		 * in case of run() method 
		 * --------------------------
		 * when we override run() method there is no issue it will work properly
		 * but if we overloaded this run() method with any argument after then 
		 * it will work as a normal method.
		 * 
		 */
		
	}

}

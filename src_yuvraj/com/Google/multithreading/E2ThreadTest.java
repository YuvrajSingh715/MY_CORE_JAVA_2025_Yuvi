package com.Google.multithreading;

public class E2ThreadTest {

	public static void main(String[] args) {

		E2Thread e2 = new E2Thread();

		e2.start();
		System.out.println("main method");
//		e2.run();      //here we are calling run() method manually.

		/* __________________________
		 * in case of start() method 
		 * --------------------------
		 * when we override thread class strat() method after
		 * then it will work as a normal method. and it will never create any new
		 * thread. or never calls run() method. because its a normal method.
		 * 
		 * -> if you want the call Thread class strat() method then you have to use super.start() method 
		 *    inside your overrided start() method. start() behaves like a normal method and super.start()
		 *    method will call Thread class method. after then create a new Thread and calls run() method.
		 * 
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

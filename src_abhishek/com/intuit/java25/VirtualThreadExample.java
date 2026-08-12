package com.intuit.java25;

public class VirtualThreadExample {

	public static void main(String[] args) throws Exception {

		Runnable task = () -> {
			System.out.println("Running in :" + Thread.currentThread());
		};
		//Virtual Thread
		Thread vt = Thread.ofVirtual().start(task);
		
		vt.join();
		
		/*
		 * 🧠 समझो: Normal thread = heavy (OS thread) Virtual thread = lightweight
		 * (1000+ बना सकते हो)
		 * 
		 * 👉 Use case: Microservices, high concurrent apps
		 */
	}

}

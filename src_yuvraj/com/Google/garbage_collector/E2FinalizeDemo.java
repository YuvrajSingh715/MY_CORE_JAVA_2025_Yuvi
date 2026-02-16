package com.Google.garbage_collector;

public class E2FinalizeDemo {

	public static void main(String[] args) throws Throwable {

		E2FinalizeDemo efd = new E2FinalizeDemo();

		efd.finalize();
		efd.finalize();

		efd = null;

		System.gc();

		System.out.println("End of Main.");

	}

	@Override
	public void finalize() {
		System.out.println("Finalize method called.");
	}
	
}

// In the above program finalize() got executed 3 times, 2times explicitly by the programmer and one time by the Garbage collector.
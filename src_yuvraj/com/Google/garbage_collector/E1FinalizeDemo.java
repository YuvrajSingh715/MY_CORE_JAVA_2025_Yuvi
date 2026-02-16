package com.Google.garbage_collector;

public class E1FinalizeDemo {

	public static void main(String[] ages) {

//		String s = new String("Jack");
		E1FinalizeDemo s = new E1FinalizeDemo();
		
		s = null;
		System.gc();
		System.out.println("End of Main Method.");

	}

	@Override
	public void finalize() {
		System.out.println("Finalize method called.");
	}

}

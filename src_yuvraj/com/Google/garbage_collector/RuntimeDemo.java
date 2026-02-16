package com.Google.garbage_collector;

public class RuntimeDemo {

	public static void main(String[] args) {

		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();

		System.out.println("hashCode of r1: " + r1.hashCode());
		System.out.println("hashCode of r2: " + r2.hashCode());
		
		System.out.println("Free Memory of r1: " + r1.freeMemory());
		System.out.println("Total Memory of r1: " + r1.totalMemory());

		System.out.println("free Memory of r2: "+r2.freeMemory());
		r2.gc();
		System.out.println("free Memory of r2: "+r2.freeMemory());
		
	}

}

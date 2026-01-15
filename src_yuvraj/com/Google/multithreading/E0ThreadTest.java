package com.Google.multithreading;

//Thread Schedular is a part of JVM. due to unpredictable behaviour of Thread schedular 
//we can't expect exact output of our multithreading program's.  

public class E0ThreadTest {

	public static void main(String[] args) {

		E0Thread mt = new E0Thread();

		mt.start();  //new Thread will create 

		for (int i = 6; i <= 10; i++) {
			System.out.println(i + " - This is my thread test1");

		}

	}

}

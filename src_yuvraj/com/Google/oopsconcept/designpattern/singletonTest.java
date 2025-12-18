package com.Google.oopsconcept.designpattern;

public class singletonTest {

	public static void main(String[] args) {

		Singleton st1 = Singleton.getSingle();
		Singleton st2 = Singleton.getSingle();

		System.out.println("Hashcode of st1 : " + st1.hashCode());
		System.out.println("Hashcode of st2 : " + st2.hashCode());

		// The Runtime class in Java is a predefined singleton class.
		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime();

		System.out.println("Hashcode of rt1 : " + rt1.hashCode());
		System.out.println("Hashcode of rt1 : " + rt2.hashCode());

	}

}

package com.Google.oopsconcept.blockcontrolflow;

public class StaticFlowDemo4 {

//	StaticFlowDemo4 sf = new StaticFlowDemo4(); 
	/*
	 * Creating an object inside an instance variable causes infinite recursion
	 * because instance variables are initialized before instance blocks and
	 * constructors.
	 */

	static StaticFlowDemo4 sf = new StaticFlowDemo4();

	{
		System.out.println("hellow Guys.");
		System.exit(0);
	}

	public static void main(String[] args) {

	}

}

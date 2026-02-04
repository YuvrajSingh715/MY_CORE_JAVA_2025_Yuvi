package com.Google.multithreading;

public class E7GreetingDemo extends Thread {

	E7Greeting g;
	String name;

	public E7GreetingDemo(E7Greeting g, String name) {
		this.g = g;
		this.name = name;
	}

	@Override
	public void run() {
		g.wish(name);
	}

}

package com.intuit.multithreading;

public class JavaThreadsQuiz4 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		thread.start(); //It will throw java.lang.IllegalThreadStateException.
		//Because, we can’t start a thread twice.

	}

}

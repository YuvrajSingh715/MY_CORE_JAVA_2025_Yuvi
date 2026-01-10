package com.intuit.multithreading;

public class JavaThreadsQuiz6 {

	public static void main(String[] args) {
		Thread thread = new Thread();

		thread.start();
		thread.setDaemon(true);
		//java.lang.IllegalThreadStateException will be thrown.
		//Because, we can’t change the daemon status of a thread after starting a thread.

	}

}

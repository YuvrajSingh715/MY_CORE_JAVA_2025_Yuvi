package com.intuit.multithreading;

public class JavaThreadsQuiz3 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		String str = Thread.currentThread().getName();
		System.out.println(str);

	}

}

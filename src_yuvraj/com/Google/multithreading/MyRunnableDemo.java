package com.Google.multithreading;

public class MyRunnableDemo implements Runnable {

	@Override
	public void run() {
	}

	public static void main(String[] args) {

		// implementation by anonymous class
		MyRunnableDemo e5 = new MyRunnableDemo() {
			@Override
			public void run() {
				for (char c = 'a'; c < 'f'; c++)
					System.out.println(c + " - run() method by anonymous class");
			}
		};

		Thread t1 = new Thread(e5);
		t1.start();

		// Lambda Function
		Thread t2 = new Thread(() -> {
			for (char o = 'f'; o <= 'j'; o++)
				System.out.println(o + " - run() method by lambda Function");
		});

		t2.start();

	}

}

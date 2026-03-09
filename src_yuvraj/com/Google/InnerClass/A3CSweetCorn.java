package com.Google.InnerClass;

//Anonymous inner class that define inside method arrguement;

public class A3CSweetCorn {

	public static void main(String[] args) {

		Runnable rn = new Runnable() {

			@Override
			public void run() {
				System.out.println("This is first time overridden method.");
			}

		};

		// First Way
		Thread t1 = new Thread(rn);
		t1.start();

		// Second Way
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is second time overridden method.");
			}

		});

		t2.start();

		// Third way
		Thread t3 = new Thread(() -> System.out.println("This is third time overriden method."));
		t3.start();

	}

}

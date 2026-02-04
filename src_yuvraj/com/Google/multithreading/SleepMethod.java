package com.Google.multithreading;

public class SleepMethod extends Thread {

	public void run() {
		try {
			System.out.println("Waiter: May I take your order?");
			Thread.sleep(2000);
			System.out.println("Customer: Yes. I’d like vegetable biryani and butter naan.");
			Thread.sleep(3000);
			System.out.println("Waiter: Your order will be ready in 10 minutes.");
			Thread.sleep(5000);
			System.out.println("Customer: How much time will the order take? i am hungry..");
			Thread.sleep(500);
			System.out.println("Waiter: Sir, This is your order.");
			Thread.sleep(2000);
			System.out.println("Waiter: How is the food, sir?");
			Thread.sleep(1000);
			System.out.println("Customer: It’s very tasty. Thank you.");
			Thread.sleep(1000);
			System.out.println("Waiter: Sir, Here is your bill.");
			Thread.sleep(2000);
			System.out.println("Customer: Thank you. Keep the change.");
			Thread.sleep(700);
			System.out.println("Waiter: Thank you, sir. Have a nice day!");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}

}

// public static void sleep(long ms);   --> throws InterruptedException
// public static void sleep(long ms, int ns);   --> throws InterruptedException

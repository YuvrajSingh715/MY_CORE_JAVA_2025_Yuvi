package com.Google.multithreading;

public class JoinMethod extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i+" - Child Thread !");
		}
		
	}

}


// join methods are overloaded !!
// public final void join();   --> throws InterruptedException
// public final void join(long ms);   --> throws InterruptedException
// public final void join(long ms, int ns);   --> throws InterruptedException

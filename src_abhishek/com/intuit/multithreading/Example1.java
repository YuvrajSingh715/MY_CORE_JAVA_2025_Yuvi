package com.intuit.multithreading;

public class Example1 extends Thread{

	
	  public void start() {
	  super.start();
	  String str = "Abhishek"; System.out.println(str); 
	  
	
	  }
	 
	
	public void run(){
		for(char i = 'a'; i<='g'; i++) {
			System.out.println(i);
		}
	}

}

package com.intuit.interview;

public class SequencePrinterMain {

	public static void main(String[] args) {
		SequencePrinter printer = new SequencePrinter();
		
		Thread t1 = new Thread(() -> printer.print(1));
		Thread t2= new Thread(() -> printer.print(2));
		Thread t3= new Thread(() -> printer.print(3));
		
		t1.start();
		t2.start();
		t3.start();
	
		
	}
}

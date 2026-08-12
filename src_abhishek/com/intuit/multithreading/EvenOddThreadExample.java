package com.intuit.multithreading;

public class EvenOddThreadExample {

	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(() -> printNumbers.printOdd());
        Thread t2 = new Thread(() -> printNumbers.printEven());

        t1.start();
        t2.start();

	}

}

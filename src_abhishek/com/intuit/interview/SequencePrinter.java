package com.intuit.interview;

public class SequencePrinter {

	private int number = 1;
	private int turn = 1; // 1, 2, 3 (thread turn)
	private final int MAX = 9;

	public synchronized void print(int threadId) {

		while (number <= MAX) {

			while (turn != threadId) {

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			}
			if (number <= MAX) {
				System.out.println("Thread" + threadId + " : " + number++);

			}

			turn = turn % 3 + 1; // 1 2 3 1
			notifyAll();
		}

	}

}

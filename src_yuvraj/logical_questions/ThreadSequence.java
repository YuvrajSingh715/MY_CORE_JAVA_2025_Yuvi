package logical_questions;

public class ThreadSequence {

	private int turn = 1; // whose turn to print
	private final int MAX = 9;

	public synchronized void printNumber(int threadNumber) {

		for (int i = 1; i <= MAX / 3; i++) {

			while (turn != threadNumber) {
				try {
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}

			System.out.print(threadNumber + " → ");
			turn = turn % 3 + 1; // change turn (1→2→3→1)
			notifyAll();
		}
	}
}

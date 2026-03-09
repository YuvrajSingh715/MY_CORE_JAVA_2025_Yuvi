package logical_questions;

public class ThreadSequenceClient {
	
	public static void main(String[] args) {
		
		ThreadSequence ts = new ThreadSequence();
		
		Thread t1 = new Thread(() -> ts.printNumber(1));
		Thread t2 = new Thread(() -> ts.printNumber(2));
		Thread t3 = new Thread(() -> ts.printNumber(3));
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

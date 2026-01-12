package collectionframework.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AQueueDemo3 {

	public static void main(String[] args) {

		Queue<Character> queue = new ArrayBlockingQueue<>(2);
		// ❌ LinkedList queue is unbounded ( No exception & No false)
		// ✅ You must use a bounded queue → ArrayBlockingQueue

		// Insert elements in queue
		queue.add('A');
		queue.offer('B');

		System.out.println("Queue element: " + queue);
		System.out.println("Now Queue Capacity has fulled.");

		// offer() → insert element (returns false if fails)
		System.out.println("insert element using offer(): " + queue.offer('C'));

		// add() → insert element (exception if fails)
		System.out.println("insert element using add(): IllegalStateException");
//		System.out.println(queue.add('D'));

	}

}

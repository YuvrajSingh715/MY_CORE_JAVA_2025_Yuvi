package collectionframework.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {

		// PriorityQueue follows MIN-HEAP by default
		// This means the smallest value has the highest priority
		PriorityQueue<Integer> priority = new PriorityQueue<>();

		// Elements are NOT stored in insertion order
		priority.offer(22);
		priority.offer(44);
		priority.offer(11);
		priority.offer(33);
		priority.offer(11); // Duplicate values --> allowed
		priority.offer(66);
		priority.offer(55);
//		priority.offer(null);  //null value --> not allowed || Throws NullPointerException

		// sorting priority based
		System.out.println("Priority Queue element: " + priority);

		// poll() removes and returns the element with highest priority
		// Since this is MIN-HEAP, smallest element comes first
		System.out.println("Elements removed based on priority:");
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll());
		System.out.println("-> " + priority.poll()); // gives null --> becuse queue is empty

		System.out.println("Priority Queue element: " + priority);

		/*
		 * Using while loop to safely remove all elements 
		 * This avoids null values
		 * -----------------------------------------------------
		 * when queue becomes empty while (!priority.isEmpty()) {
		 * System.out.println(priority.poll()); 
		 * }
		 */

	}

}

package collectionframework.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {

		// 7 --> initial capacity
		PriorityQueue<Character> prior = new PriorityQueue<>(7, (a, b) -> b.compareTo(a)); // custom sorting

		prior.offer('V');
		prior.offer('T');
		prior.offer('E');
		prior.offer('K');
		prior.offer('E');  // Duplicate values --> allowed
		prior.offer('W');
		prior.offer('I');
		prior.offer('S');
		prior.offer('X');
//		prior.offer(null);   //null value --> not allowed || Throws NullPointerException

		System.out.println("PriorityQueue: " + prior);

		/*
		 * Iterator<Character> itr = prior.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 */

		// Sorting is visible ONLY when removing elements
		while (!prior.isEmpty()) {
			System.out.println("-> Sorted PriorityQueue: " + prior.remove());
		}
		
		System.out.println("PriorityQueue: " + prior);

	}

}

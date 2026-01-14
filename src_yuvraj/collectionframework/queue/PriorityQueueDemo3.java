package collectionframework.queue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo3 {

	public static void main(String[] args) {

		// initial capacity --> 5
		PriorityQueue<String> pq = new PriorityQueue<>(5, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1); // descending order -> custom sorting
			}
		});

		pq.offer("Yuvi");
		pq.offer("John");
		pq.offer("Carlos");
		pq.offer("Yuki");
		pq.offer("Max");
		pq.offer("Wei");
		pq.offer("Lucas");
		pq.offer("John");  /// Duplicate values --> allowed
//		pq.offer(null);    //null value --> not allowed || Throws NullPointerException
		

		System.out.println("PriorityQueue: " + pq);
		
		// Sorting is visible ONLY when removing elements
		while (!pq.isEmpty()) {
			System.out.println("-> Sorted PriorityQueue: " + pq.remove());
		}

		System.out.println("PriorityQueue: " + pq);
		
	}

}

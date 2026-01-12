package collectionframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RQueueDemo2 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		
		// remove() → remove head (NoSuchElementException if empty)
		// poll() → remove head (null if empty)

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Queue elements: " + queue);
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

		// poll() & remove() → remove head
		System.out.println("Remove Head using poll(): " + queue.poll());
		System.out.println("Remove Head using remove(): NoSuchElementException");
//		System.out.println(queue.remove());
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

	}

}

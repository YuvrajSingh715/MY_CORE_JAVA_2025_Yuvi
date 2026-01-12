package collectionframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GQueueDemo4 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		// element() → get head (NoSuchElementException if empty)
		// peek() → get head (null if empty)

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Queue elements: " + queue);
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

		// peek() & element() → Get head
		System.out.println("Head using peek(): " + queue.peek());
		System.out.println("Head using element(): NoSuchElementException");
//		System.out.println(queue.element());
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

	}

}

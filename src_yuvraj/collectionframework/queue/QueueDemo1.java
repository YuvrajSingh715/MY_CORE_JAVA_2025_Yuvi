package collectionframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		// add() → insert element (exception if fails)
		queue.add(10);
		queue.add(30);

		// offer() → insert element (returns false if fails)
		queue.offer(20);
		queue.offer(40);

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Queue elements: " + queue);

		// element() → get head (NoSuchElementException if empty)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Head using element(): " + queue.element());

		// peek() → get head (null if empty)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Head using peek(): " + queue.peek());

		// poll() → remove head (null if empty)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("1st time Remove Head using poll(): " + queue.poll());

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Queue elements: " + queue);

		// remove() → remove head (NoSuchElementException if empty)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("2nd time Remove Head using remove(): " + queue.remove());

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Queue elements: " + queue);
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

		System.out.println("3rd time Remove Head using remove(): " + queue.remove());
		System.out.println("4th time Remove Head using poll(): " + queue.poll());
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

		System.out.println("Queue elements: " + queue);
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");

	}

}

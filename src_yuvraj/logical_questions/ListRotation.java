package logical_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListRotation {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		System.out.println("Original List: " + list);

		// Left Side Rotation
		Collections.rotate(list, -3);
		System.out.println("After three time left rotation: " + list);

		// Right Side Rotation
		Collections.rotate(list, +3);
		System.out.println("After three time right rotation: " + list);

	}

}

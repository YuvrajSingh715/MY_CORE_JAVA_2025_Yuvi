package collectionframework.collections_and_arrays_classs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 6, 4, 1, 9, 8, 10);

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		Collections.sort(list, (l1, l2) -> l2.compareTo(l1));
		System.out.println(list);
	}

}

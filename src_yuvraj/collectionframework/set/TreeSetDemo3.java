package collectionframework.set;

import java.util.Comparator;
import java.util.TreeSet;

// Implement Comparator by Anonymous Class

public class TreeSetDemo3 {

	public static void main(String[] args) {

		TreeSet<Character> tree = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
//				return c1.compareTo(c2);   // Natural order of sorting
				return c2.compareTo(c1);   // Customized Order of Sorting
			}

		});

		tree.add('Y');
		tree.add('U');
		tree.add('V');
		tree.add('R');
		tree.add('A');
		tree.add('J');
		tree.add('A');
		
		System.out.println(tree);
		
	}
}

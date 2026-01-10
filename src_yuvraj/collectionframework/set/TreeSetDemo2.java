package collectionframework.set;

import java.util.TreeSet;

//Implement Comparator by Lambda ExpressionS

public class TreeSetDemo2 {

	public static void main(String[] args) {

	    TreeSet <String> tree = new TreeSet<>((a,b) -> a.compareTo(b));
//		TreeSet<String> tree = new TreeSet<>((a, b) -> b.compareTo(a));

		tree.add("Max");
		tree.add("lucas");
		tree.add("Dustin");
		tree.add("Mike");
		tree.add("Will");
		tree.add("Eleven");
		tree.add("Mike");

		for (String s : tree) {
			System.out.println(s);
		}

	}

}

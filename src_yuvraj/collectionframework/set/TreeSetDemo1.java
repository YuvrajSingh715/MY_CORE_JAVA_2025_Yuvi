package collectionframework.set;

import java.util.Set;
import java.util.TreeSet;

// Integer is already Comparable there is no need to implements the Integer

public class TreeSetDemo1 {
	
	public static void main(String[] args) {

		Set <Integer> tree = new TreeSet<>();
		
		tree.add(32);
		tree.add(36);
		tree.add(43);
		tree.add(65);
		tree.add(33);
		tree.add(65);
		tree.add(35);
		
		for (int num: tree) {
			System.out.println(num);
		}
		
	}

}

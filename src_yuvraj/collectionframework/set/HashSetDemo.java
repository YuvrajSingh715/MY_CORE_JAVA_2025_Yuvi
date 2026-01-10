package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet <Character> set = new HashSet<>();
		
		set.add('E');
		set.add('A');
		set.add('d');
		set.add('B');
		set.add('c');
		set.add(null);
		set.add('a');
		set.add(null);
		
		System.out.println(set.add('A')); //false
		System.out.println(set.add('F')); //true
		System.out.println("+++++++");
		
		Iterator <Character> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

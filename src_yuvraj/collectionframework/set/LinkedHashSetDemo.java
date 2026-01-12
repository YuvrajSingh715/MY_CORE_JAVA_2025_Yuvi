package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		HashSet <String> linked = new LinkedHashSet<>();
		
		linked.add("Yuvraj");
		linked.add("Abhishek");
		linked.add(null);
		linked.add("Pooja");
		linked.add("Bhupesh");
		linked.add(null);
		linked.add("Abhi");
		linked.add("Priyanka");
		linked.add("Yuvi");
		linked.add("Yuvi");
		
//		Map<Integer, List<String>> lengthCount = linked.stream()
//				.collect(Collectors.groupingBy(String::length));
//		System.out.println(lengthCount);
		
		System.out.println(linked.add("Bhupesh"));
		System.out.println(linked.add("Sunny"));
		
		Iterator <String> enu = linked.iterator();
		while(enu.hasNext()) {
			System.out.println(enu.next());
		}
		
		
	}

}

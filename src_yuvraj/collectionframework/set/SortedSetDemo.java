package collectionframework.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String[] args) {
		
		SortedSet <Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(50);
		set.add(30);
		set.add(10);    //duplicate value allowed --> but ignored
//		set.add(null);  //null values allowed --> null point exception
		
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Sorted Set: "+set);
		
		//first()
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("First element: "+set.first());
		
		//last()
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Last element: "+set.last());
		
		//headSet(toElement)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("HeadSet (<30): "+set.headSet(30));
		System.out.println("HeadSet (<obj): "+set.headSet(70));
		
		//tailSet(fromElement)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("TailSet (>=30): "+ set.tailSet(30));
		System.out.println("TailSet (>=obj): "+ set.tailSet(70));
		
		//subSet(fromElement, toElement)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("SubSet (F20 to T40): " + set.subSet(20, 50));
		System.out.println("SubSet {F(obj) to T(obj)}: " + set.subSet(60, 80));
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
	}

}

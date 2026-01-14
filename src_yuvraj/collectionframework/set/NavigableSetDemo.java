package collectionframework.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		//TreeMap stores entries in ascending order of values
		NavigableSet <Integer> navi = new TreeSet<>();
		
        navi.add(60);
        navi.add(90);
        navi.add(100);
        navi.add(80);
        navi.add(70);
     	navi.add(100);    //duplicate value allowed --> but ignored
//		navi.add(null);  //null values allowed --> null point exception
        
     	System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("sorted navigable set: "+ navi);
        
        //lower() --> greatest element < given element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("lower(80): " + navi.lower(80));
        
        //floor() -> greatest element <= given element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("floor(80): " + navi.floor(80));
        System.out.println("floor(75): " + navi.floor(75));
        
        //higher() -> smallest element > given element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("higher(80): " + navi.higher(80));
        
        //ceiling() -> smallest element >= given element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("ceiling(80): " + navi.ceiling(80));
        System.out.println("ceiling(85): " + navi.ceiling(85));
        
        //pollFirst() -> removes & returns first element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("pollFirst(): " + navi.pollFirst());
        System.out.println("After pollFirst(): " + navi);
        
       //pollLast() -> removes & returns last element
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("pollLast(): "+ navi.pollLast());
        System.out.println("After pollLast(): "+ navi);
        
        navi.add(60);
        navi.add(100);
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("sorted navigable set: "+navi);
        
        //descendingSet() -> reverse order view
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("Descending order of navigable set: "+navi.reversed());
        
        //headSet() -> elements less than given value
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("headSet(80): " + navi.headSet(80));
        System.out.println("headSet(80, true): " + navi.headSet(80, true));
        System.out.println("headSet(80, false): " + navi.headSet(80, false));
        
        //tailSet() -> elements greater than or equal
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("tailSet(80): "+ navi.tailSet(80));
        System.out.println("tailSet(80, false): " + navi.tailSet(80, false));
        System.out.println("tailSet(80, true): " + navi.tailSet(80, true));
        
        //subSet() -> range between two elements
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
        System.out.println("subSet(70, 100): " + navi.subSet(70, 100));
        System.out.println("subSet(70, true, 100, true): "+ navi.subSet(70, true, 100, true));
        System.out.println("subSet(70, false, 100, false): "+ navi.subSet(70, false, 100, false));
        System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
	
	}

}

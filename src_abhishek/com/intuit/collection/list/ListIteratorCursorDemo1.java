package com.intuit.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorCursorDemo1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();

		arr.add("CCC");
		arr.add("BBB");
		arr.add(null);
		arr.add("AAA");
		arr.add("DDD");
		arr.add(null);
		arr.add("EEE");
 
		ListIterator<String> i = arr.listIterator();
		
		System.out.println(">>>>>>>>> this is forward iteration demo <<<<<<<<<");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(System.lineSeparator());
		System.out.println(">>>>>>>>> this is backward iteration demo <<<<<<<<<");
		while (i.hasPrevious()) {
			String o = i.previous();
			System.out.println(o);
		}

		System.out.println(System.lineSeparator());
		System.out.println(">>>>>>>>> read, remove, replace, add operation <<<<<<<<<");
		while (i.hasNext()) {
		    String s = i.next();
		    System.out.println(s);

//		    if (s.equals("CCC")) {    //Wrong(❌) -> Throws NullPointerException if s is null
		    if ("CCC".equals(s)) {    //Correct(✔) -> Null-safe and recommended
		        i.add("ccc");   // add operation
		    }

		    if ("BBB".equals(s)) {
		        i.set("bbb");   // replace operation
		    }

		    if (s == null) {
		        i.remove();    // remove operation
		    }
		    
		    
		}
		
		System.out.println(System.lineSeparator());
		System.out.println(">>>>>>>>> after these operations <<<<<<<<<");
		System.out.println(arr);
		System.out.println(System.lineSeparator());
		
		System.out.println(">>>>>>>>> nextIndex $$ nextPrevious <<<<<<<<<");
		System.out.println("Previous Index : " + i.previousIndex());
        System.out.println("Next Index : " + i.nextIndex()); 
	}

}

package com.intuit.loop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorLoop {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

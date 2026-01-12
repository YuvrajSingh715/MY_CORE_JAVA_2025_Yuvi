package com.intuit.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationDemo {

    public static void main(String[] args) {

        LinkedList<Character> linkedList = new LinkedList<>();

        linkedList.add('a');
        linkedList.add('b');
        linkedList.add('c');
        linkedList.add('c');
        linkedList.add(null);
        linkedList.add('a');
        linkedList.add('b');
        linkedList.add(null);

        System.out.println("|++++++++++++ Iterate by Iterator ++++++++++++|");
        Iterator<Character> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("|++++++++++++ Iterate by ListIterator (Forward) ++++++++++++|");
        ListIterator<Character> listItr = linkedList.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("|++++++++++++ Iterate by ListIterator (Backward) ++++++++++++|");
        ListIterator<Character> revItr = linkedList.listIterator(linkedList.size());
        while (revItr.hasPrevious()) {
            System.out.println(revItr.previous());
        }

        System.out.println("|++++++++++++ Iterate by for loop ++++++++++++|");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("|++++++++++++ Iterate by reverse for loop ++++++++++++|");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("|++++++++++++ Iterate by enhanced for loop ++++++++++++|");
        for (Character ch : linkedList) {
            System.out.println(ch);
        }

        System.out.println("|++++++++++++ Iterate by forEach (Java 8) ++++++++++++|");
        linkedList.forEach(result -> System.out.println(result));

        System.out.println("|++++++++++++ Iterate by Iterator forEachRemaining ++++++++++++|");
        Iterator<Character> itr2 = linkedList.iterator();
        itr2.forEachRemaining(System.out::println);

        System.out.println("|++++++++++++ Iterate by Stream API ++++++++++++|");
        linkedList.stream().forEach(System.out::println);

        System.out.println("|++++++++++++ Iterate by Parallel Stream API ++++++++++++|");
        linkedList.parallelStream().forEach(System.out::println);

        System.out.println("|++++++++++++ Print full LinkedList (toString) ++++++++++++|");
        System.out.println(linkedList);
    }
}

/*
 ============================== NOTES ==================================

 ✔ VALID Iteration Methods for LinkedList:
    1. Iterator
    2. ListIterator (Forward)
    3. ListIterator (Backward)
    4. for loop (index-based)
    5. reverse for loop
    6. enhanced for loop (for-each)
    7. forEach() (Java 8)
    8. Iterator.forEachRemaining()
    9. stream().forEach()
   10. parallelStream().forEach()
   11. System.out.println(linkedList)

 ⚠ CONDITIONALLY VALID:
    - Removing elements inside enhanced for loop → ConcurrentModificationException

 ❌ INVALID / NOT APPLICABLE:
    - Enumeration (Not available directly on LinkedList)
    - elements() method (belongs to Vector only)

 =======================================================================
*/

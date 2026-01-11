package com.intuit.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterationDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i <= 7; i++) {
            vector.add(i);
        }

        System.out.println("|+++++++++++++++++ Iterate by Enumeration (Legacy) +++++++++++++++++|");
        Enumeration<Integer> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        System.out.println("|+++++++++++++++++ Iterate by Iterator +++++++++++++++++|");
        Iterator<Integer> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("|+++++++++++++++++ Iterate by ListIterator (Forward) +++++++++++++++++|");
        ListIterator<Integer> listItr = vector.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("|+++++++++++++++++ Iterate by ListIterator (Backward) +++++++++++++++++|");
        ListIterator<Integer> revItr = vector.listIterator(vector.size());
        while (revItr.hasPrevious()) {
            System.out.println(revItr.previous());
        }

        System.out.println("|+++++++++++++++++ Iterate by for loop +++++++++++++++++|");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("|+++++++++++++++++ Iterate by enhanced for loop +++++++++++++++++|");
        for (Integer v : vector) {
            System.out.println(v);
        }

        System.out.println("|+++++++++++++++++ Iterate by forEach (Java 8) +++++++++++++++++|");
        vector.forEach(v -> System.out.println(v));

        System.out.println("|+++++++++++++++++ Iterate by Iterator forEachRemaining +++++++++++++++++|");
        Iterator<Integer> itr2 = vector.iterator();
        itr2.forEachRemaining(System.out::println);

        System.out.println("|+++++++++++++++++ Iterate by Stream API +++++++++++++++++|");
        vector.stream().forEach(System.out::println);

        System.out.println("|+++++++++++++++++ Iterate by Parallel Stream API +++++++++++++++++|");
        vector.parallelStream().forEach(System.out::println);

        System.out.println("|+++++++++++++++++ Print complete Vector (toString) +++++++++++++++++|");
        System.out.println(vector);
    }
}

/*
 ============================== NOTES ==================================

 ✔ VALID Iteration Methods for Vector:
    1. Enumeration (Legacy)
    2. Iterator
    3. ListIterator (Forward)
    4. ListIterator (Backward)
    5. for loop (index-based)
    6. enhanced for loop (for-each)
    7. forEach() (Java 8)
    8. Iterator.forEachRemaining()
    9. stream().forEach()
   10. parallelStream().forEach()
   11. System.out.println(vector)

 ⚠ CONDITIONALLY VALID:
    - Removing elements directly inside enhanced for loop → ConcurrentModificationException

 ❌ INVALID / NOT APPLICABLE:
    - Direct use of Enumeration on List/ArrayList (works only for Vector)

 ========================================================================
*/

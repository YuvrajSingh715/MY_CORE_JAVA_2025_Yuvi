package com.meta.nareshit;

//ArrayListDemo.java
import java.util.ArrayList;

public class ArrayListDemo
{
 public static void main(String args[])
 {
     // Creating an ArrayList
     ArrayList al = new ArrayList();
     System.out.println("Initial size of ArrayList: " + al.size());

     // Add elements to the ArrayList
     al.add("Red");
     al.add("Green");
     al.add("Blue");
     al.add("Pink");
     al.add("Orange");

     System.out.println("\nSize of ArrayList after additions: " + al.size());

     // Display the ArrayList
     System.out.println("\nContents of ArrayList After add: " + al);

     // Remove 4th index element from ArrayList
     al.remove(4);
     System.out.println("\nContents of ArrayList after remove index: " + al);

     // Remove "Pink" element from ArrayList
     al.remove("Pink");
     System.out.println("\nContents of ArrayList after remove object: " + al);
     System.out.println("\nSize of ArrayList after deletions: " + al.size());

     // retrieving 1st index element
     String alElement = (String) al.get(1);
     System.out.println("\nalElement :" + alElement);

     // inserting at 2nd index
     al.add(2, alElement + " rose");
     System.out.println("\n" + al);
 }
}


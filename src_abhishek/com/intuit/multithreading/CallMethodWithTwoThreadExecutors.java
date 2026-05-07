package com.intuit.multithreading;

import java.util.concurrent.*;

public class CallMethodWithTwoThreadExecutors {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task 1
        Future<Integer> t1 = executor.submit(() -> add(10, 20));

        // Task 2
        Future<Integer> t2 = executor.submit(() -> add(30, 40));

        // Get result (blocking)
        int result = t1.get() + t2.get();

        System.out.println(result); // Output: 100

        executor.shutdown();
       
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
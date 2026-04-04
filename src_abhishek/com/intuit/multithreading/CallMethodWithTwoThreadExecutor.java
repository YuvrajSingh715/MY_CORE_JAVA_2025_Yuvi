package com.intuit.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallMethodWithTwoThreadExecutor {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		CompletableFuture<Integer> t1 = CompletableFuture.supplyAsync(() -> add(10 , 20), executor);
		
		CompletableFuture<Integer> t2 = CompletableFuture.supplyAsync(() -> add(30 , 40), executor);
		
		CompletableFuture<Integer> result = t1.thenCombine(t2, Integer::sum);
		
		System.out.println(result.join());
		executor.shutdown();
	}
	public static int add(int a,  int b) {
		return a + b;
	}

}

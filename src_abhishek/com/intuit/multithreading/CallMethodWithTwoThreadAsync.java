package com.intuit.multithreading;

import java.util.concurrent.CompletableFuture;

public class CallMethodWithTwoThreadAsync {

	public static int add(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		CompletableFuture<Integer> t1 = CompletableFuture.supplyAsync(() -> add(10, 20));
		CompletableFuture<Integer> t2 = CompletableFuture.supplyAsync(() -> add(30, 40));

		// Combine results
		int result = t1.join() + t2.join();
		System.out.println(result);
		CompletableFuture<Integer> resultFuture = t1.thenCombine(t2, (r1, r2) -> r1 + r2);
		System.out.println(resultFuture.join());

	}

}

package com.intuit.java11;

import java.util.function.BiFunction;

public class VarInLambdaParameters {

	public static void main(String[] args) {
		//Java 10 introduced var for local variables.
		//Java 11 says → you can use var inside lambda parameters also.
		
		BiFunction<Integer,Integer,Integer> add = (var a, var b) -> a + b;
		System.out.println(add.apply(5, 3));
		

	}

}

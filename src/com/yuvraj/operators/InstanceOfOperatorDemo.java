package com.yuvraj.operators;

class Animal {} //parent

class Deer extends Animal {} //child

class Fox extends Animal {} //child

class Tiger extends Animal {} //child

public class InstanceOfOperatorDemo {
	public static void main(String[] args) {

		Animal A = new Animal(); //simple case
		System.out.println(A instanceof Animal); //true [animal is an animal]
		System.out.println(A instanceof Deer); //false [animal is not necessarily a deer]
		System.out.println(A instanceof Fox); //false [animal is not necessarily a fox]
		System.out.println(A instanceof Tiger); //false [animal is not necessarily a tiger]
		System.out.println("-----");
		
		
		Animal D = new Deer(); // polymorphism
		System.out.println(D instanceof Animal); //true [deer is an animal]
		System.out.println(D instanceof Deer); //true [deer is a deer]
		System.out.println(D instanceof Fox); //false [deer can't only be a fox]
		System.out.println(D instanceof Tiger); //false [deer can't only be a tiger]
		System.out.println("-----");
		
		
		Animal F = new Fox(); // polymorphism
		System.out.println(F instanceof Animal); //true [fox is a animal]
		System.out.println(F instanceof Deer); //false [fox can't only be a deer]
		System.out.println(F instanceof Fox); //true [fox is a fox]
		System.out.println(F instanceof Tiger); // false [fox can't only be a tiger]
		System.out.println("-----");
		
		
		Animal T = new Tiger(); // polymorphism
		System.out.println(T instanceof Animal); //true [tiger is a animal]
		System.out.println(T instanceof Deer); //false [tiger can't only be a deer]
		System.out.println(T instanceof Fox); //false [tiger can't only be a fox]
		System.out.println(T instanceof Tiger); // true [tiger is a tiger]
	}
}
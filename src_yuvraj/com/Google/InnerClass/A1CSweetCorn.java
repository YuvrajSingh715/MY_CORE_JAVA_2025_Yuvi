package com.Google.InnerClass;

//Type-1: Annonymus Inner class that extends a class

public class A1CSweetCorn {

	public static void main(String[] args) {

		PSweetCorn psc = new PSweetCorn() {

			@Override
			public void sweety() {
				System.out.println("Overrided Parent Class Method.");
				this.spicy();
			}

			public void spicy() {
				System.out.println("it is very spicy.");
			}
			
		};

		psc.sweety();
//		psc.spicy();

	}

}

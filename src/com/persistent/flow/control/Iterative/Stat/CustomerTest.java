package com.persistent.flow.control.Iterative.Stat;

public class CustomerTest {

	public static void main(String[] args) {

//----------Array iteration by for loop---------\\		
		Customer[] customer = { new Customer("Yuvraj", 4732233, "MacBook"), new Customer("Bhupesh", 
			                 	8743278, "Iphone"),new Customer("Sunny", 7545743, "Samsung Galaxy"), 
			                 	new Customer("Mahesh", 8594389, "Tablet") };

		int size = customer.length;

		for (int i = 0; i < size; i++) {

			System.out.println("Customer " + (i + 1) + ": " + customer[i]);
		}

//----------Simple array iteration process---------\\
//	Customer [] customer = new Customer[3];
//	customer[0] = new Customer("Yuvraj",934399,"Vivo");
//	customer[1] = new Customer("Sunny",329493,"Oppo");
//	customer[2] = new Customer("Satyam",457348,"Realme");
//	
//	System.out.println(customer[0]);
//	System.out.println(customer[1]);
//	System.out.println(customer[2]);

	}
}

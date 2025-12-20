package com.intuit.flowcontroll;

public class CustomerTest {

	public static void main(String[] args) {

		// ----------Array iteration by for loop---------\\
		Customer[] customer = { new Customer("Abhishek", 967654, "MacBook"), new Customer("Kittu", 875643, "Asus"),
				new Customer("Shiva", 546789, "Sony"), new Customer("Lata", 567823, "ThinkPad")

		};

		int size = customer.length;

		for (int i = 0; i < size; i++) {
			// System.out.println(i);
			System.out.println("Customer" + (i + 1) + ": " + customer[i]);
		}
		//----------Simple array iteration process---------\\
		Customer[] customer1 = new Customer[4];
		customer1[0] = new Customer("Abhishek",897652,"Oppo");
		customer1[1] = new Customer("Shiva",456782,"Asus");
		customer1[2] = new Customer("Lavanya",567823,"Redmee");
		customer1[3] = new Customer("Yuvraj",567843,"Samsung");
		
		System.out.println(customer[0]);
		System.out.println(customer[1]);
		System.out.println(customer[2]);
		System.out.println(customer[3]);
		
				
		
	}

}

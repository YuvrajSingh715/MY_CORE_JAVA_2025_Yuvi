package com.Google.yuvraj.oopsconcept;

public class EncapsulationDemoTest {

	public static void main(String[] args) {

		EncapsulationDemo ed = new EncapsulationDemo("Yuvraj",44829);
		
		//Modifie the values
		ed.setAccountHolder("Yuvraj Singh");
		ed.setBalance(50000);
		
		//Print the values
		System.out.println("Current Balance = " + ed.getBalance());
		System.out.println("Account Holder = "+ed.getAccountHolder());
		System.out.println(ed);
		
//		System.out.println(ed);  //without toString method inside the model class.
        // Output:  com.yuvraj.oopsconcept.EncapsulationDemo@24d46ca6
		
//		System.out.println(ed);  //with toString method inside the model class.
		// Output:  Account Information = [Account Holder = Yuvraj, Balance = 49786.0]
		
//      Object reference internally call the toString method.
		// System.out.println(ed.toString);
		//System.out.println(ed);

	}

}

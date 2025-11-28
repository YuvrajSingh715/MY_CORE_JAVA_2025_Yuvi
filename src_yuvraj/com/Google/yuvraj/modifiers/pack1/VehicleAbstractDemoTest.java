package com.Google.yuvraj.modifiers.pack1;

public class VehicleAbstractDemoTest {

	public static void main(String[] args) {

		Truck truck = new Truck();
		Bus bus = new Bus();
//		VehicleAbstractDemo vd = new VehicleAbstractDemo();   //this is not possible becuase abstract class
		                                                      //can't provide permission to create a object
		
		System.out.println("Truck have " + truck.getNoOfWheels() + " wheels.");
		System.out.println("Bus have " +bus.getNoOfWheels()+ " wheels.");
		
//		System.out.println(truck.getNoOfWheels());
//		System.out.println("\"hellow jyoti\"");
//		System.out.println("hellow"+" jyoti");
		
	}

}

package com.Google.yuvraj.modifiers.pack1;

public abstract class VehicleAbstractDemo {
	
	public abstract int getNoOfWheels();
//	public abstract String carname();
	
}


class Truck extends VehicleAbstractDemo {

	public int getNoOfWheels() {
		return 8;
	}
		
//	public String carname() {
//		return "maruti";
//	}
	
}


class Bus extends VehicleAbstractDemo {

	public int getNoOfWheels() {
		return 6;
	}
}






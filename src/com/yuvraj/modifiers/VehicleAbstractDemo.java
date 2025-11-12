package com.yuvraj.modifiers;

public abstract class VehicleAbstractDemo {
	
	public abstract int getNoOfWheels();
	
}


class Truck extends VehicleAbstractDemo {

	public  int getNoOfWheels() {
		return 16;
	}
}


class Bus extends VehicleAbstractDemo {

	public int getNoOfWheels() {
		return 6;
	}
}






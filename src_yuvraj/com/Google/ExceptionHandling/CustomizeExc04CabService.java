package com.Google.ExceptionHandling;

public class CustomizeExc04CabService {

	static void cabBooking(int availableDrivers) throws CustomizeExc04CabBooking {

		if (availableDrivers == 0) {
			throw new CustomizeExc04CabBooking("No drivers available currenlty.");

		} else {
			System.out.println("Cab booked successfully.");
		}
	}
}

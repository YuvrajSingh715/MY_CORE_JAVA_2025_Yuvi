package com.Google.ExceptionHandling;

public class CustomizeExc04CabBookingClient {
	
	public static void main(String[] args) {
		
		try {
			CustomizeExc04CabService.cabBooking(0);  //here we can the value for testing purpose
		}catch(CustomizeExc04CabBooking cb) {
			cb.printStackTrace();
		}
		
	}

}

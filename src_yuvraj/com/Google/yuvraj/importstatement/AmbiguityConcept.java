package com.Google.yuvraj.importstatement;

import java.util.Date;
//import java.sql.*;

public class AmbiguityConcept {
	
	public static void main(String[] args) {
		
		long d = System.currentTimeMillis();
		
		Date date = new Date(d);
		
		System.out.println(date);
	}
	
}

// class Date {}
package com.Google.langpkg.String_StringBuffer_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class ImmPlacesClient{
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Indor");
		list.add("Bhopal");
		
		ImmPlaces ip = new ImmPlaces(list);
		
		ip.getLocations().add("Shimla");
		
		System.out.println(ip.getLocations());
		
	}

}

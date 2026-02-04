package com.Google.Internationalization;

import java.util.Locale;

public class LocaleDemo {
	
	public static void main(String[] args) {
		
		Locale l1 = Locale.getDefault();
//		System.out.println(l1.getCountry()+ " >---< "+ l1.getLanguage());
//		System.out.println(l1.getDisplayCountry()+ " >---< " + l1.getDisplayLanguage());
		
		Locale l2 = new Locale("hi" , "IN");
		Locale.setDefault(l2);
		
//		System.out.println(l2.getCountry()+" >---< "+l2.getLanguage());
//		System.out.println(l2.getDisplayCountry() +" >---< " +l2.getDisplayLanguage());
		
//		for (String lang : Locale.getISOLanguages()) {
//		    Locale locale = new Locale(lang);
//		    System.out.println(lang + " -> " + locale.getDisplayLanguage());
//		}
		
//		for (String country : Locale.getISOCountries()) {
//		    Locale locale = new Locale("", country);
//		    System.out.println(country + " -> " + locale.getDisplayCountry());
//		}


		Locale[] s = Locale.getAvailableLocales();
		for(Locale s1:s) {
			System.out.println(s1.getDisplayCountry()+ " >---< "+s1.getDisplayLanguage());
		}
		
	}
	
}

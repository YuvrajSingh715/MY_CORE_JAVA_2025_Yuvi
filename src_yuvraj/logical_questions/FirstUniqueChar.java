package logical_questions;

public class FirstUniqueChar {

	public static void main(String[] args) {

		 String s = "aaggeehrjhrkek";

	        for (int i = 0; i < s.length(); i++) {
	            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
	                System.out.println("First non-repeating char: "+s.charAt(i));
	                break;
               }

	     }
	        
	}

}

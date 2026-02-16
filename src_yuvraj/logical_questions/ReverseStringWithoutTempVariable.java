package logical_questions;

public class ReverseStringWithoutTempVariable {

	public static void main(String[] args) {
		
		String s = "ADVENTURE";

        for (int i = 0; i < s.length(); i++) {
            s = s.charAt(i) + s.substring(0, i) + s.substring(i + 1);
        }
		
		System.out.println("Reverse String Without Temporary Variable: "+s);
		
	}
	
}

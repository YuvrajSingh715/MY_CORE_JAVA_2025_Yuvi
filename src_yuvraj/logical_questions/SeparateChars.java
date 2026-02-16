package logical_questions;

public class SeparateChars {

	public static void main(String[] args) {

		String s = "Yuvi@213$$";
		String letters = "" , digits = "", symbols = "";
		
		for(char ch: s.toCharArray()) {
			if(Character.isLetter(ch)) {
				letters += ch;
			}else if(Character.isDigit(ch)) {
				digits += ch;
			}else {
				symbols += ch;
			}
		}
		
		System.out.println("Letters: " + letters);
		System.out.println("Digits: " + digits);
		System.out.println("Symbols: " + symbols);
		
	}

}

package logical_questions;

public class DoublingOfCharacters {

	public static void main(String[] args) {
		String input = "YUVRAJ";
		String doubledString = doubleCharacters(input);
		System.out.println("Doubled characters: " + doubledString);
	}

	public static String doubleCharacters(String str) {

		StringBuilder doubled = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch);  //make 2 copies...
		}

		return doubled.toString();
	}

}

package logical_questions;

public class FirstLongestWord {

	public static void main(String[] args) {
		
		String sentence = "Java makes logical thinking stronger";
		
		String[] words = sentence.split(" ");
		
		String longest = "";
		
		for(String word: words) {
			if(word.length() > longest.length())
				longest = word;
		}
		
		System.out.println("Longest word: " + longest);
		
	}
	
}

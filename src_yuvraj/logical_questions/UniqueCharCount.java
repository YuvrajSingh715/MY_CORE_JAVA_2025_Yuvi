package logical_questions;

public class UniqueCharCount {

	public static void main(String[] args) {

		String str = "JAVA IS A PROGRAMMING LANGUAGE";

		str.chars().distinct().mapToObj(a -> (char) a).forEach(System.out::println);
		
	}

}

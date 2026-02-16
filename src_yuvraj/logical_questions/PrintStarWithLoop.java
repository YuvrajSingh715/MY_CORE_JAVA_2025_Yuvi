package logical_questions;

public class PrintStarWithLoop {

	static void print(int n) {
		if (n == 0)
			return;
		System.out.println("*");
		print(n - 1);
	}

	public static void main(String[] args) {
		print(11);
	}

}

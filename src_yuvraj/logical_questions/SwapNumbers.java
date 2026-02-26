package logical_questions;

public class SwapNumbers {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		x = x + y; // x = 30
		y = x - y; // y = 10
		x = x - y; // x = 20

		System.out.println("X: " + x);
		System.out.println("Y: " + y);

	}

}

package com.Google.langpkg.Object;

public class CloneMethod2 {

	int x = 23;
	int y = 32;

	public CloneMethod2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public static void main(String[] args) {

		CloneMethod2 cm = new CloneMethod2(21, 43);

		System.out.println(cm);
		System.out.println(cm.sum(10, 60));

		System.out.println(cm.getClass().getName());
		System.out.println(cm.getClass());

	}

}

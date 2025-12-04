package com.intuit.oops;

public class OverloadedMethod {

	double overloadedMethod(double d) {
		return d *= d;
	}

	int overloadedMethod(int i) {
		return overloadedMethod(i *= i);
	}

	float overloadedMethod(float f) {
		return overloadedMethod(f *= f);

	}

	public static void main(String[] args) {
		OverloadedMethod overloaded = new OverloadedMethod();
		System.out.println(overloaded.overloadedMethod(100.0f));
		//It will throw java.lang.StackOverflowError at run time. Because, overloadedMethod(int) keeps calling itself.

	}

}

package FunctionalInterface.ImplementationConcept;

public class TraditionalMethod implements Functionalinterface {

	@Override
	public void m1(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		TraditionalMethod tM = new TraditionalMethod();
		tM.m1("Yuvi");
	}
}

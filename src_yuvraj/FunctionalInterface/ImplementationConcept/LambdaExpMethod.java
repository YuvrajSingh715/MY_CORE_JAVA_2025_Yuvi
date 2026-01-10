package FunctionalInterface.ImplementationConcept;

public class LambdaExpMethod {

	public static void main(String[] args) {

		Functionalinterface functionalInterface = x -> System.out.println(x);
		
		Functionalinterface functionalInterface1 = (y) -> {System.out.println(y);};
		
		functionalInterface.m1("Yuvraj");
		functionalInterface1.m1("Yuvi");
		
	}

}

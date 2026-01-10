package FunctionalInterface.ImplementationConcept;

public class AnonymousMethod {
	
	public static void main(String[] args) {
		
	Functionalinterface functionalInterface = new Functionalinterface() {
		
		@Override
		public void m1(String s) {
			System.out.println(s);
		}
		
	}; 

	functionalInterface.m1("Yuvraj");
	
	}
	
}

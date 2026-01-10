package FunctionalInterface.ImplementationConcept;

@FunctionalInterface
public interface Functionalinterface {
	
	public void m1(String s);
//	public void m2(int i);

}

/*
 Functional interface: 
 A functional interface in Java is an interface that contains exactly one 
 abstract method.
 */


/*
 
 With this Annotation (@FunctionalInterface):
 we can declare only one abstract method inside the functional interface.
 
 <+++++++++++-==================+++++++++++==================-+++++++++++>
 
 Without this Annotation (@FunctionalInterface);
 we can declare more than one abstract method in an interface. 
 However, in that case, it is no longer a functional interface; 
 it becomes a normal interface.
 
 */

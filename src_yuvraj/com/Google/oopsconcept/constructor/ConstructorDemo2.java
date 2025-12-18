package com.Google.oopsconcept.constructor;

public class ConstructorDemo2 {

	ConstructorDemo2() {
//		super(10);  //☑  ▶ super() calls parent class constructor.
		this(10);   //❎  ▶ this() calls another constructor in same class.
		System.out.println("non-argument constructor.");
	}

	ConstructorDemo2(int a) {
//		super();
		System.out.println("#=========================#");
		System.out.println("Value of a = " + a);
	}
//	Even though super() is commented, Java automatically adds it.

	@Override
	public String toString () {
		return "Hellow Guys this is cd reference variable...";
	}
	
	public static void main(String[] args) {
		ConstructorDemo2 cd = new ConstructorDemo2();
		System.out.println(cd);
		
        // They are constructor invocations
//		new ConstructorDemo();    // constructor call
//		new ConstructorDemo(20);  // constructor call
	}
}


//=======================flow control of this class=======================\\

/*  => OBJECT–1 FLOW → new ConstructorDemo()

main()
  ↓
new ConstructorDemo()
  ↓
ConstructorDemo()  // no-arg constructor
  ↓
this(10)           // calls parameterized constructor
  ↓
ConstructorDemo(int a)
  ↓
super()            // implicit → Object()      //written by own explicit
  ↓
print "#=========================#"
  ↓
print "Value of a = 10"
  ↓
return to ConstructorDemo()
  ↓
print "non-argument constructor."
  ↓
OBJECT–1 CREATED

*/

//------------------------------------------------\\

/*  => OBJECT–2 FLOW → new ConstructorDemo(20)

main()
  ↓
new ConstructorDemo(20)
  ↓
ConstructorDemo(int a)  // parameterized constructor
  ↓
super()                // implicit → Object()
  ↓
print "#=========================#"
  ↓
print "Value of a = 20"
  ↓
OBJECT–2 CREATED

*/
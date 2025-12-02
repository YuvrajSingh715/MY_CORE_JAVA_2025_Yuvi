package com.Google.yuvraj.oopsconcept;

public class PCTest {

	public static void main(String[] args) {

		// case1
		Parent p1 = new Parent();
		p1.m1();

		// case2
		Child c1 = new Child();
		c1.m1();
		c1.m2();                  

		// case3
		Parent p2 = new Child();
//		p2.m1();   //Without overriding, the child class calls the parent class’s m1 method.
		p2.m1();   //the method is overridden, the output comes from the child class m1 method.

		// case4
//		Child c2 = new Parent();   
//This assignment is not applicable since a parent object cannot be stored in a child reference.
		
//      Child c2 = (Child) new Parent(); 
// You can do this but it gives class cast exception.
	}

}
   ////////    //////////    //////////    //////////                        
       ///    ///    ///    ///    ///    ///    ///
      //////////    //////////    //////////    ////////

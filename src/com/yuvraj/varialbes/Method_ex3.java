package com.yuvraj.varialbes;

public class Method_ex3 {

	  public int substract(int a, int b, int c, int d) {
	        
	        return (a+d)-(b+c) ;
	        
	    }
	   
	  public int add (int a, int b, int c, int d) {
		  
		  return a+b+c+d;
	  }
	  
      public int multiply (int a, int b, int c, int d) {
		  
		  return a*d*c*b;
	  }
      
      public int divide (int a, int b, int c, int d) {
		  
		  return (a+d) / (b+c);
	  }
	  
	    public static void main(String[] args) {
	        
	    	Method_ex3 div =  new Method_ex3();
	    	Method_ex3 mul =  new Method_ex3();
	    	Method_ex3 sub =  new Method_ex3();
	    	Method_ex3 add =  new Method_ex3();
	    	
	    	
	        int substract = sub.substract(10,20,30,40);
	        int sum = add.add(10,20,30,40);
	        int divide = div.divide(10,20,30,40);
	        int multiply = mul.multiply(10,20,30,40);
	        
	        
	        System.out.println("Add = " + sum);
	        System.out.println("Substract = " + substract);
	        System.out.println("Multiply = " + multiply);
	        System.out.println("Divide = " + divide);
	        
	    }
}

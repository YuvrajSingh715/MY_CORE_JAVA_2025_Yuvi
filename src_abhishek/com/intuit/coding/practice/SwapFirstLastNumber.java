package com.intuit.coding.practice;
class SwapFirstLastNumber{
	
	public static void main (String[] args){

       int num = 12345;

      String str = String.valueOf(num);	

      char first = str.charAt(0);
      char  last = str.charAt(str.length()-1);

      String middle = str.substring(1,str.length()-1);	

      String result = ""+last+middle+first;
      System.out.println(result);	

     }

}
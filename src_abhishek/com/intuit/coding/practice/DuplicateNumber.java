package com.intuit.coding.practice;

class DuplicateNumber{
	
	public static void main (String[] args){

       int []num = {12,22,44,33,22,44,15};
	   
	   for(int i = 0; i<num.length; i++){
           for(int j = i+1; j<num.length; j++){
			   
			   if(num[i] == num[j]){
			   System.out.println("Duplicate :" + num[i]);
			   }
		   }
		   
	   }

     }

}

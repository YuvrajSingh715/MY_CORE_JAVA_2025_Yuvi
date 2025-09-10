package com.persistent.variable;

public class VarArg_ex2 {

public static void main(String[] args) {
        
        sum(11);
        
        sum(2,20);
        
        sum(1,2,30);

    }
    
    
    public static void sum(int... x) {    //x[0]=10, x[1]=20
        
        int total=0;
        
        for(int y:x) {
            total = total+y;
        }
        
        System.out.println("The sum : "+total);
        
    }
	
}


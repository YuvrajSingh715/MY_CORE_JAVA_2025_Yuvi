package com.persistent.variable;

public class VarArg_ex1 {

public static void main(String[] args) {
        
        m1();
        
        m1(10);
        
        m1(10,20);
        
        m1(10,20,30);

    }
    
    
    public static void m1(int...x) {
        System.out.println("Var Arg Method.");
    
    }
    
}

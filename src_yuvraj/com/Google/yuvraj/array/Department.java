package com.Google.yuvraj.array;

public class Department {

    private String[] empName;
    private int[] empNo;
    private double[] empSal;
    
    public static void main(String[] args) {
        
        Department department = new Department();
        
        department.empName = new String[11];
        department.empNo = new int[11];
        department.empSal = new double[11];
        
        department.empName[0] = "Yuvraj";
        department.empNo[0] = 101;
        department.empSal[0] = 45000.75;
        
        department.empName[1] = "Yuvi";
        department.empNo[1] = 102;
        department.empSal[1] = 40000.75;
        
        System.out.println(department.empNo[0]);
        System.out.println(department.empName[0]);
        System.out.println(department.empSal[0]);
        System.out.println("+++++++++");
        System.out.println(department.empNo[1]);
        System.out.println(department.empName[1]);
        System.out.println(department.empSal[1]);
        
    }
}

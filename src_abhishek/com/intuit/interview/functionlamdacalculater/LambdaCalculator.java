package com.intuit.interview.functionlamdacalculater;

public class LambdaCalculator {
    public static void main(String[] args) {

        // Lambda expressions (no class implementation needed)
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        };

        // Usage
        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
        System.out.println("Division: " + divide.calculate(10, 5));
    }
}


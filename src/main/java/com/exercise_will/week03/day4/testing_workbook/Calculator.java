package com.exercise_will.week03.day4.testing_workbook;

public class Calculator {

    public int add(int a, int b){
        return  a + b;
    }
    public double divide(double a, double b){
        if(a==0.0 || b==0.0){
            throw new ArithmeticException("Cannot divide by 0.");
        }
        return  a / b;
    }
}

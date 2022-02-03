package com.exercise_will.week01.basic_exercises;

public class Exercise4 {
    public static double decimalTotal(String input){
        String[] inputArray = input.split(", ");
        double sum = 0.0;
        for (String i : inputArray){
            sum+=Double.parseDouble(i);
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        String userInput = "0.90, 1.00, 9.00, 8.78, 0.01";
        decimalTotal(userInput);
    }
}

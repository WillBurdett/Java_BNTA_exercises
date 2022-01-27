package com.exercise_will.week02.day4.methods_exercises;

public class Exercise4 {
    // Write a method which takes two numbers as arguments and prints one of:

            // "The first number is larger"
            // "The second number is larger"
            // "The numbers are equal"

    public static String numCompare(int a, int b){
        if (a > b){
            return "The first number is larger";
        } else if (b > a){
            return "The second number is larger";
        } else {
            return "The numbers are equal";
        }
    }

    public static void main(String[] args) {
        System.out.println(numCompare(3,2));
    }
}

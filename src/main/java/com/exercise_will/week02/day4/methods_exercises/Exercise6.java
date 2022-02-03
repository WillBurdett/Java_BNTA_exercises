package com.exercise_will.week02.day4.methods_exercises;

public class Exercise6 {

    // Write a method which takes an array of strings as an argument
    // and returns the number of items in the array.

    public static int numItems(String[] input){
        return input.length;
    }

    public static void main(String[] args) {
        String[] test = {"hello", "world", ":)"};
        System.out.println(numItems(test));
    }
}

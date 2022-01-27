package com.exercise_will.week02.day4.methods_exercises;

public class Exercise5 {
    // Write a method which takes a string as an argument,
    // capitalises the first letter, lower the rest and returns the capitalised string.

    public static String cap(String input){
            return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(cap("willIAM"));
    }
}
package com.exercise_will.week02.day4.methods_exercises;

public class Exercise7 {
    public static int wordCount(String input){
        return input.split(" ").length;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("I am feeling great"));
    }
}

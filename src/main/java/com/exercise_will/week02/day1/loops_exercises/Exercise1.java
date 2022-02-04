package com.exercise_will.week02.day1.loops_exercises;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static String reverseStr(String input){
        if (input == null) return "You submitted an empty string.";
        String[] inputArray = input.split("");
        String result = "";
        for (int i = inputArray.length - 1; i >= 0; i--) {
            result+=inputArray[i];
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        reverseStr("Hello");
    }
}

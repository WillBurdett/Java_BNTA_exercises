package com.exercise_will.week02.day1.loops_exercises;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
    public static void oddOrEven(int[] input){
        for (int i : input){
            System.out.println(i % 2 == 0 ? "Even" : "Odd");
        }
    }

    public static void main(String[] args) {
        int[] test = {2,4,5,6};
        oddOrEven(test);
    }
}

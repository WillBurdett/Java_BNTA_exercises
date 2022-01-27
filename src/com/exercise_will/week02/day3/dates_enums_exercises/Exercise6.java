package com.exercise_will.week02.day3.dates_enums_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    // try catch
    // write a program that converts program arguments to an integer
    // if value cannot be converted to int store them somewhere
    // calculate sum for numbers that can be converted to an integer
    // finally print the numbers that cannot be converted to an int
    // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
    // output: Sum: 5 and a, b, foo are not numbers.

    // javac com/will/week02/day3/exercises/Exercise6.java
    // java com/will/week02/day3/exercises/Exercise6.java Hello World *pass args*
    public static void main(String[] args) {

        List <String> notNum = new ArrayList<>();
        int sum = 0;

        for (String s : args){
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e){
                notNum.add(s);
            }
        }

        System.out.println("The sum of all integers was " + sum + ".");
        System.out.println("Here are the arguments that were not integers:\n" + notNum);

    }
}

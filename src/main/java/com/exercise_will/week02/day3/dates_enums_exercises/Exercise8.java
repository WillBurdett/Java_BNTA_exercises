package com.exercise_will.week02.day3.dates_enums_exercises;

public class Exercise8 {
    // run 'int result = 10 / 0;' what error you get
    // then surround it with try catch block and catch the exception that was thrown
    // Inside catch the catch block print "cannot divide by 0"
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by 0.");
        }
    }
}

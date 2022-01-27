package com.exercise_will.week02.day2.classes_files_exercises.Exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static boolean validateEmail(String input) {
        Pattern validEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(validateEmail("hello@gmail.com"));
    }
}

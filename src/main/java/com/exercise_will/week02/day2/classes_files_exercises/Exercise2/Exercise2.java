package com.exercise_will.week02.day2.classes_files_exercises.Exercise2;

import java.time.LocalDate;
import java.time.Month;

public class Exercise2 {

//    Create a class that models a person with the following characteristics. - firstName - lastName - gender - dateOfBirth.
//    Then create 2 objects: one male and one female using a constructor that has all properties.

    public static void main(String[] args) {
        Person2 will = new Person2("Will", "Burdett", 'M', LocalDate.of(1995, Month.APRIL, 26));
        Person2 cindy = new Person2("Cindy", "Cheung", 'F', LocalDate.of(1994, Month.AUGUST, 14));
        System.out.println(will);
        System.out.println(cindy);
    }
}

package com.exercise_will.week02.day3.dates_enums_exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise5 {

    public static Long age(LocalDate userDate){
        Long diff = ChronoUnit.YEARS.between(userDate, LocalDate.now());
        System.out.println(diff);
        return diff;
    }

    public static void main(String[] args) {
        age(LocalDate.of(1995,04,26));
    }
}

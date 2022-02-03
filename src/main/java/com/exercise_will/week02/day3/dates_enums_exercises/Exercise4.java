package com.exercise_will.week02.day3.dates_enums_exercises;

// 1 - Print today's Date and Time using LocalDate
// 2 - Represent your date of birth using LocalDate
// 3 - Add 100 days to your dob and print it

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise4 {
    public static void main(String[] args) {
        // 1.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 2.
        LocalDate dob = LocalDate.of(1995, 04, 26);
        System.out.println(dob);

        // 3.
        System.out.println(dob.plusDays(100));




    }
}

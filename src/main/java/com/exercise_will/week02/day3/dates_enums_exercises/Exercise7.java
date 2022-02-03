package com.exercise_will.week02.day3.dates_enums_exercises;

import java.time.LocalDate;

// create a method that sums days of the month for a given array of LocalDate
public class Exercise7 {

    public static long sumDays(LocalDate[] dates){
        long sum = 0;
        for (LocalDate l : dates){
            sum += l.getDayOfMonth();
        }
        return sum;
    }
    public static void main(String[] args) {
        LocalDate[] localDates = {LocalDate.of(2000,04,10),LocalDate.of(2004,07,28)};
        System.out.println(sumDays(localDates));
    }
}

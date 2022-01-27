package com.exercise_will.week02.day3.dates_enums_exercises;

public class Exercise3 {
    // invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
    // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
    public static void main(String[] args) {
        TShirtSize[] tShirtSizes = TShirtSize.values();
        for (TShirtSize tShirtSize : tShirtSizes){
            System.out.println(tShirtSize.name().toLowerCase());
        }
    }
}

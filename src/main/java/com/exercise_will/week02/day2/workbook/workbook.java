package com.exercise_will.week02.day2.workbook;

import java.util.Arrays;

public class workbook {
    public static void main(String[] args) {
        String[] names = {"Michael", "Will", "Alimaa"};
        System.out.println(Arrays.toString(capitaliseList(names)));
    }

    private static String capitalise(String input){
        return input.toUpperCase();
    }

    private static int numLength(String foo){
        return foo.length();
    }

    private static void display(String input){
        System.out.println(capitalise(input));
        System.out.println(numLength(input));
    }

    private static String[] capitaliseList(String[] input){
        for (int i=0; i<input.length; i++){
            input[i] = input[i].toUpperCase();
        }
        return input;
    }

}

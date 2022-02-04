package com.exercise_will.week02.day1.loops_exercises;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static String fix(String input){
        String spacesRemoved = input.replaceAll(" ","");
        System.out.println(spacesRemoved);
        return spacesRemoved.substring(0,1).toUpperCase() + spacesRemoved.substring(1,6) + " " + spacesRemoved.substring(6,7).toUpperCase() + spacesRemoved.substring(7);
    }

    public static void main(String[] args) {
        System.out.println(fix("   b ri   ght net   work  "));
    }
}

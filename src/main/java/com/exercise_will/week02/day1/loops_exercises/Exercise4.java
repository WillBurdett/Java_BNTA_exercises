package com.exercise_will.week02.day1.loops_exercises;

import java.util.Scanner;

public class Exercise4 {
    /*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
    */
    public static boolean isPrime(int num){
        for (int i=2; i < num; i++){
            if (num % i == 0 && num != i || num == 0 || num == 1){
                return false;
            }
        };
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter an Integer:");
       Scanner scanner = new Scanner(System.in);
       int input = scanner.nextInt();
        System.out.println(isPrime(input));
    }
}

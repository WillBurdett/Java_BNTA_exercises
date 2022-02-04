package com.exercise_will.week02.day1.loops_exercises;

import java.util.Scanner;

public class Exercise5 {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void jokeMachine(){
        System.out.println("Would you like to hear a joke?\n\nPlease type 'yes' or 'no':");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        if (userInput.equals("yes")){
            Integer randomNum = (int) Math.floor(Math.random() * 6);
            switch (randomNum){
                case 1:
                    System.out.println("What do you call a fish with no eyes?\nA fsh\n");
                    jokeMachine();
                    break;
                case 2:
                    System.out.println("What’s the best thing about Switzerland?\nI don’t know, but the flag is a big plus.\n");
                    jokeMachine();
                    break;
                case 3:
                    System.out.println("Why don’t scientists trust atoms?\nBecause they make up everything.\n");
                    jokeMachine();
                    break;
                case 4:
                    System.out.println("What does a nosy pepper do?\nGets jalapeño business!\n");
                    jokeMachine();
                    break;
                case 5:
                    System.out.println("Why did the pianist keep banging his head against the keys?\nHe was playing by ear.\n");
                    jokeMachine();
                    break;
                default:
                    System.out.println("Why did the tortilla chip start dancing?\nBecause they put on the salsa.\n");
                    jokeMachine();
                    break;
            }
        } else if (userInput.equals("no")){
            System.out.println("How disappointing...");
            scanner.close();
        } else {
            System.out.println("Invalid response.");
            jokeMachine();
        }
    }
    public static void main(String[] args) {
        jokeMachine();
    }
}


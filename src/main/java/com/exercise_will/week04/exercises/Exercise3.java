package com.exercise_will.week04.exercises;

import java.util.InputMismatchException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public boolean bracketsMatch(String input){
        if (input == null){
            throw new NullPointerException("Input was null.");
        }
        String[] arr = input.replaceAll(" ", "").split("");
        Pattern pattern = Pattern.compile("[\\[\\](){}]");
        Stack<String> stack = new Stack<>();

        boolean containsBracket = false;
        for (String s : arr){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                containsBracket = true;
            }
        }
        if (!containsBracket){
            throw new InputMismatchException("No brackets in input.");
        }

        for (String s : arr) {
            Matcher matcher = pattern.matcher(s);
            if (!matcher.find()){
                continue;
            } else if (s.equals("(") || s.equals("{") || s.equals("[")){
                stack.push(s);
            } else if (s.equals(")")) {
                if (stack.peek().equals("(")) {
                    stack.pop();
                }
            } else if (s.equals("}")) {
                if (stack.peek().equals("{")) {
                    stack.pop();
                }
            } else if (s.equals("]")){
                if (stack.peek().equals("[")){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.bracketsMatch("((({{{[]}}})))"));
    }
}

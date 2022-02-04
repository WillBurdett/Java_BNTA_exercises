package com.exercise_will.week02.day1.loops_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exercise7 {
    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */

    // Version 1
    public static String[] longestStr(String[] input){
        int len = 0;
        for (String i : input){
            if (i.length() > len){
                len = i.length();
            }
        }
        List<String> result= new ArrayList<>();
        for (String i : input){
            if (i.length() == len){
                result.add(i);
            }
        }
        // converting my list to an array of the same size
        String[] answer = new String[result.size()];
        // System.out.println(Arrays.toString(answer));
        return result.toArray(answer);
    }

    // Version 2
    public static Stack<String> longest(String[] input){
        Stack<String> stack = new Stack<>();
        for (String s : input){
            if (stack.isEmpty()){
                stack.add(s);
            } else if (stack.peek().length() < s.length()){
                stack.clear();
                stack.push(s);
            } else if (stack.peek().length() == s.length() && !stack.contains(s)){
                stack.push(s);
            }
        }
        return stack;
    }


    public static void main(String[] args) {
        String[] test = {"Apple", "Orange", "Banana", "Kiwi", "Passion-fruit", "Pear","Passion-fruit"};
        // System.out.println(Arrays.toString(longestStr(test)));
        System.out.println(longest(test));
    }
}

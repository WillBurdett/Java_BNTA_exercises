package com.exercise_will.week04.data_structures;

import java.util.Stack;

public class Stacks {

    // STACKS

    // Remember Pringles
    // First in, last out
    // Methods:
    // - push
    // - peak
    // - pop
    // - search

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Hello");
        stack.push("World");
        stack.push(":)");
        stack.push("!");
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}

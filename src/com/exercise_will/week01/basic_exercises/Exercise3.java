package com.exercise_will.week01.basic_exercises;

import java.util.Locale;

public class Exercise3 {
    // Write a function that reverses an array (pre-update):
    public static String reverseQuestionArray(String[] content){
        String result = "";
        for (int i=content.length-1; i>=0; i--){
            content[i] = content[i].toLowerCase(Locale.ROOT);
            if (i == content.length-1){
                String capped = content[i].substring(0,1).toUpperCase(Locale.ROOT) + content[i].substring(1);
                result += capped + " ";
            } else if (i > 0){
                result += content[i] + " ";
            } else {
                result += content[i] + "?";
            }
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        String[] input = {"YoU", "aRe", "how", "hellO"};
        reverseQuestionArray(input);
    }
}

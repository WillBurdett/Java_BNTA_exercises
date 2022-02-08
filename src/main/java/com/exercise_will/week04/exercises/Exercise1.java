package com.exercise_will.week04.exercises;

import java.util.*;

public class Exercise1 {

    public List<String> occursMost(String[] input){
        if (input == null){
            throw new NullPointerException("input was null");
        }
        Map<String, Integer> map = new HashMap<>();
        for (String originalString : input) {
            if (originalString != null){
                String s = originalString.replaceAll(" ", "");
                if (!map.containsKey(originalString) && s != ""){
                    map.put(originalString, 1);
                } else if (s != ""){
                    map.put(s, map.get(originalString) + 1);
                }
            }
        }
        int highestNum = 0;
        for (String s : map.keySet()) {
            if (map.get(s) > highestNum){
                highestNum = map.get(s);
            }
        }
        List<String> result = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == highestNum){
                result.add(s);
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"1","1","1","1","3","4","5","6","7","7","7","7","8","8"};
        exercise1.occursMost(input);
    }
}

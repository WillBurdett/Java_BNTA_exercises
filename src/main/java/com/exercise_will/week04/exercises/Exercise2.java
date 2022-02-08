package com.exercise_will.week04.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
    public Map<String, Integer> howManyOccurrences(String[] input) {
        if (input == null){
            throw new NullPointerException("input was null");
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : input) {
            if (s != null) {
                String emptyString = s.replaceAll(" ", "");
                if (!map.containsKey(s) && emptyString != "") {
                    map.put(s, 1);
                } else if (emptyString != "") {
                    map.put(s, map.get(s) + 1);
                }
            }
        }
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        String[] input = {"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        exercise2.howManyOccurrences(input);
    }
}

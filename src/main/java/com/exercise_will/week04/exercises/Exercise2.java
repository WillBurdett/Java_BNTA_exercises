package com.exercise_will.week04.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
    public static Map<String, Integer> howManyOccurences(String[] input) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : input) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        String[] input = {"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        howManyOccurences(input);
    }
}

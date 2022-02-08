package com.exercise_will.week04.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {

    public static List<String> occursMost(String[] input){
        Map<String, Integer> map = new HashMap<>();
        for (String s : input) {
            if (!map.containsKey(s)){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
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
        String[] input = {"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        occursMost(input);

    }
}

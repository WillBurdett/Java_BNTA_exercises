package com.exercise_will.week04.data_structures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Sets {

    // SETS
    // Set's are like lists, but they don't have duplicates.
    // It is random e.g. with a sweet bag, you get what you get
    // The 'unordered' collection

    public static void main(String[] args) {
//        Set<Integer> hashSet = new HashSet<>();
//        // it's random, so there's no 'get'
//
//        hashSet.add("C");
//        hashSet.add("D");
//        hashSet.add("E");
//        hashSet.add("A");
//        hashSet.add("B");
//        hashSet.add("A"); // will not add the duplicate
//        hashSet.forEach(s -> System.out.println(s));
//
//        System.out.println(hashSet.contains("A"));

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        int[] arr = new int[hashSet.size()];
        int i = 0;
        for (Integer j : hashSet) {
            arr[i++] = j;
        }
            //System.out.println(Arrays.toString(arr));

        Set<String> states = new HashSet<>(50);
        states.add("A");
        System.out.println(states.size());
    }
}

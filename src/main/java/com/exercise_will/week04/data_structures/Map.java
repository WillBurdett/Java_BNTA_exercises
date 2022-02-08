package com.exercise_will.week04.data_structures;

import java.util.HashMap;

public class Map {

    // MAP
    // a collection of key/value pairs

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Sarina");
        map.put(2, "Aaron");
        map.put(3, "Rachel");
        map.put(4, "Abdi");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.getOrDefault(10, "Darshil")); // otherwise .get(10) would return null

        // when you store a value or key, if that key is an object it goes through a hash function that returns the hashcode
        // that is what's used internally by the map as the key.
        // it wouldn't make sense to store a Person object as the key, so it goes through a hash function and internally
        // stores the hashcode as the key.
        // then whenever we grab the Person, our hashcode goes through the hash function and returns our Person.
        // you can print this - new Person("Alex").hashcode()
        // each class will create a random hashcode for every instance if you don't override it
        // the override method allows
    }
}

package com.exercise_will.week04.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // streams give a set of functions you can perform on certain data structures
        // quickly and convenient way to perform bolt-on methods
        // streams are NOT a data structure themselves

        List<Person> people = new ArrayList<>();

        people.add(new Person("Warren Buffett", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerberg", 50));


//        ---------------------------------------------------------------------
//        // FILTER
//
//        // use .stream(). to access methods
//        List <Person> hundredClub = people.stream()
//                .filter(person -> person.billions >= 100)
//                .collect(Collectors.toList());
//
//        hundredClub.forEach(person -> System.out.println(person.name));

//        ---------------------------------------------------------------------
//        // SORTED
//
//        List<Person> sortedList = people.stream().sorted(Comparator.comparing(person -> person.name))
//                .collect(Collectors.toList());
//
//        sortedList.forEach(person -> System.out.println(person.name));

//        ---------------------------------------------------------------------

//        // YOU CAN CHAIN THESE TOGETHER
//
//        List<Person> hundredSortedList = people.stream()
//                .sorted(Comparator.comparing(person -> person.name))
//                .filter(person -> person.billions >= 100)
//                .collect(Collectors.toList());
//
//        hundredSortedList.forEach(person -> System.out.println(person.name));
//
//    //        ---------------------------------------------------------------------



    }
    static class Person{
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }
}

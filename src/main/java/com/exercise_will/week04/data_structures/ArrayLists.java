package com.exercise_will.week04.data_structures;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        // not the proper say to instantiate an arraylist, we normally specify the data type (covered later)
        ArrayList list = new ArrayList<>(); // raw use of parameterised class
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.contains(1));
        list.clear();
        System.out.println(list.isEmpty());
        // add back again
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        // using lambda
//        list.forEach(e -> {
//            System.out.println("e = " + e);
//        });
//
//        // same thing using foreach
//        for (Object e : list) {
//           System.out.println("e = " + e);
//        }

        // SAVING MULTIPLE DATA TYPES
        list.add(3.14);
        list.add("Hello");
        // this is not a good idea.
        // we should always specify our data type,
        // because if we looped through our string, we would have to accommodate each data type using 'if (e instanceof String){}'
        list.forEach(e -> {
            System.out.println("e = " + e);
            // if you had a person you could cast it via 'Person person = (Person) e'
            // we couldn't perform a Person's method on e as e is just an object
        });
        // so we SPECIFY our data type when instantiating our list
        List<String> stringList = new ArrayList<>();
        // The reason we use 'List' at the start, is so if we later decide to switch to a vector,
        // all of our methods will work as they are from the interface 'List'
    }
}

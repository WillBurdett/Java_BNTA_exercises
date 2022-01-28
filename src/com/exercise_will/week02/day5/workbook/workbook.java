package com.exercise_will.week02.day5.workbook;

import java.time.LocalDate;
import java.util.Arrays;

public class workbook {
    // Object Oriented Programming

    // A class is a blueprint used to represent anything in the real world

    // These are made of properties (characteristics) and behaviours (things they can do)

    // A blueprint in OOP is a template so everything created can be identical

    // The object is the real thing, so the blueprint has been used to make an actual thing
    // e.g. A person named Bob with blue eyes

    public static void main(String[] args) {

        Person marcy = new Person(); // this is one constructor (the default).
        // this will only work if you have no other constructors

        marcy.setName("Marcy");
        marcy.setAge(22);
        marcy.setSkinColour(SkinColour.WHITE);

        System.out.println(marcy.getName());
        System.out.println(marcy.getAge());
        System.out.println(marcy.getSkinColour());

        System.out.println("------------------");

        Person alimaa = new Person( // this is the second constructor with all properties
                "Alimaa",
                15,
                SkinColour.BROWN
                );

        System.out.println(alimaa.getName());
        System.out.println(alimaa.getAge());
        System.out.println(alimaa.getSkinColour());

        // java automatically uses toString method found in object class
        System.out.println(alimaa);
        // if we don't specify a toString method, the default method
        // from the parent class will be used.
        // (return getClass().getName() + '@' + Integer.toHexString(hashcode()))

        // the Object class is the parent of all objects
        // because everything is in the Object class
        // all objects have access to the parents (Object class) methods


        System.out.println(alimaa.equals(marcy));


    }
}

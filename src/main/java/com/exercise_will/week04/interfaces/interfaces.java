package com.exercise_will.week04.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class interfaces {
    // INTERFACES
    // List extends all the functionality of Collection.
    // Interface is a class that contain only abstract methods
    // They contain no method body, only the return type, method name and parameters (if any)
    // For example, List's contain a specification, and an Arraylist and Vector apply the implementations

    // Interfaces come under the umbrella of inheritance
    // If you're a subclass, you have all the functionality of the superclass

    // In Java you can only extend ONE class
    // with interfaces you can create as many as you want

    // Interfaces are used more

    // You wouldn't use 'extend' and an interface isn't a parent because you aren't inheriting methods.
    // Interfaces specify which methods YOU must implement.

    // With interfaces, we are after polymorphism (many forms)
    public static void main(String[] args) {
        // System.out.println("1" + "1"); // here the plus sign does different things depending on the data type
        // System.out.println(1 + 1);

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // This is kept as vehicle (the generic) so any vehicle can be added
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);

        Person suraya = new Person("Suraya", vehicles);

        for (Vehicle vehicle : suraya.getVehicles()) {
            vehicle.move();
            System.out.println();
        }
    }
}

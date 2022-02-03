package com.exercise_will.week02.day2.classes_files_exercises.Exercise3;

import java.util.ArrayList;

public class Exercise3 {

//    Model a car garage using classes. Use your imagination and think about the properties and behaviours.
//    Note that you might want to create 2 classes. One for Garage and another for Car. The garage holds a list/array of cars....

    public static void main(String[] args) {
        // create cars
        Car car1 = new Car("A1", "Ford", "White", 5, "YC61 XLU");
        Car car2 = new Car("A2", "Tesla", "Silver", 6, "QB79 HJK");
        Car car3 = new Car("A3", "BMW", "Black", 2, "KN01 CVB");
        Car car4 = new Car("A4", "Ferrari", "Red", 2, "$$$$ $$$");

        // create a garage
        Garage garage = new Garage(new ArrayList<>(), new ArrayList<>(), 3);

        // add cars to available
        GarageService.addCar(garage, car1);
        GarageService.addCar(garage, car2);
        GarageService.addCar(garage, car3);
        // will print "Already reached capacity"
        GarageService.addCar(garage, car4);


        // rent that same car
        GarageService.rentCar(garage, car1);

        System.out.println(garage);
    }
}

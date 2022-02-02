package com.exercise_will.week03.day1.garage_classes_exercises;

import java.util.Arrays;

public class Main {
    // static property, class or field means it belongs to the class itself and not the objects
    // Person public class {
    // public static int count = 0;
    // }
    // count can't be accessed through objects you create,
    // but can be accessed though the class 'Person'.

    // public class Main {
    // public static void main(String[] args)}
    // this must use static as we don't have/need an instance of
    // there isn't an instance of type Main,
    // but because it's static and belongs to the class (and not an instance)
    // it can run.
    // add static to methods because otherwise you'd need to create an instance (object)
    // e.g. Main main = new Main();

    // we don't want statics all around
    // this is for practice

    // you will have three types of classes:
    // 1) POJO - your object
    // 2) Service - a class to perform business logic (code that is invoked into action when an event occurs)
    // 3) classes tha interact with our database

    // fn + f2 takes you to the error in intellij

    // shift + command + v creates instance out of new Car(date,date) etc.

    public static void main(String[] args) {

        // creating cars
        Car car = new Car(
                "Honda",
                "1234",
                false
        );
        Car car2 = new Car(
                "BMW",
                "0909",
                true
        );
        Car car3 = new Car(
                "Tesla",
                "00PS",
                true
        );
        Car car4 = new Car(
                "Saab",
                "1995",
                false
        );

        // Person who owns the Honda
        Car[] connieCars = {car};
        Person connie = new Person(
                "Connie",
                24,
                "connie@gmail.com",
                connieCars
        );

        // Person who owns the Tesla and BMW
        Car[] nasirCars = {car2, car3};
        Person nasir = new Person(
                "Nasir",
                22,
                "nasir@gmail.com",
                nasirCars
        );


        // owner of the Garage
        Person michael = new Person(
                "Michael",
                23,
                "michael@gmail.com",
                null
        );

        // the Garage
        Car[] cars2 = {car2};
        Garage garage = new Garage(
                michael,
                987,
                3,
                cars2,
                true
        );

        // instance of GarageService class
        GarageService garageService = new GarageService();

        // add car
        System.out.println("Add car should add Honda:");
        garageService.addCar(garage, car);
        System.out.println(Arrays.toString(garage.getCars()));

        System.out.println("------------------------");

        // count cars
        System.out.println("Count cars should return 1:");
        System.out.println(garageService.carCount(garage));

        System.out.println("------------------------");

        // free spots
        System.out.println("Spots free should return 2:");
        System.out.println(garageService.freeSpots(garage));

        System.out.println("------------------------");

        // remove car
        System.out.println("Garage should be empty:");
        garageService.removeCar(garage, car);
        System.out.println(Arrays.toString(garage.getCars()));

        System.out.println("------------------------");


        // open and close garage
        System.out.println("Close should cause false:");
        garageService.closeGarage(garage);
        System.out.println(garage.isOpen());

        System.out.println("------------------------");

        System.out.println("Open should cause true:");
        garageService.openGarage(garage);
        System.out.println(garage.isOpen());

        // is full?
        System.out.println("Full should return false:");
        System.out.println(Arrays.toString(garage.getCars()));
        System.out.println(garageService.isFull(garage));

        System.out.println("------------------------");

        // adding cars
        System.out.println("Add should add Honda:");
        garageService.addCar(garage, car);
        System.out.println(Arrays.toString(garage.getCars()));

        System.out.println("Add should add BMW:");
        garageService.addCar(garage, car2);
        System.out.println(Arrays.toString(garage.getCars()));

        System.out.println("------------------------");

        // filter electric cars
        System.out.println("Should return electrics:");
        System.out.println(garageService.filterElectric(garage));

        System.out.println("------------------------");

        // filter non-electric cars
        System.out.println("Should return non-electrics:");
        System.out.println(garageService.filterNonElectric(garage));

        System.out.println("------------------------");

        // clean garage
       garageService.cleanGarage(garage);

        System.out.println("------------------------");

        // writing stored cars data to file
        GarageDAO garageDAO = new GarageDAO();
        garageDAO.postMapping(garage);


        // reading garage
        System.out.println("What's in the garage? :");
        garageDAO.readGarage(garage);
        System.out.println("------------------------");

        // findByManufacturer
        System.out.println("Should find the BMW and return info:");
        System.out.println(garageDAO.findByManufacturer(garage, "bmw"));

        System.out.println("------------------------");

        // findByRegNum
        System.out.println("Should return car not found:");
        System.out.println(garageDAO.findByRegNum(garage, "0905"));
        System.out.println("Should find car reg and return Honda info::");
        System.out.println(garageDAO.findByRegNum(garage, "1234"));

        // deleteMapping
        System.out.println("------------------------");
        System.out.println("Garage before deleting car:");
        System.out.println(Arrays.toString(garage.getCars()));

        System.out.println("------------------------");

        System.out.println("Garage after deleting Honda:");
        garageDAO.deleteByRegNum(garage, "1234");
        System.out.println(Arrays.toString(garage.getCars()));

    }
}

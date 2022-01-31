package com.exercise_will.week03.day1.workbook;

public class workbook {
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

        // Person who owns the Honda
        Car[] connieCars = {car};
        Person connie = new Person(
                "Connie",
                24,
                "connie@gmail.com",
                connieCars
        );

        // Person who owns the Tesla and BMW
        Car[] nasirCars = {car};
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

        //
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
        garageService.addCar(garage, car);
        System.out.println(garage);

        // count cars
        System.out.println(garageService.carCount(garage));

        // free spots
        System.out.println(garageService.freeSpots(garage));

        // remove car
       garageService.removeCar(garage, car);
        System.out.println(garage);

        // open and close garage
        garageService.closeGarage(garage);
        System.out.println(garage);
        garageService.openGarage(garage);
        System.out.println(garage);

        // is full?
        System.out.println(garageService.isFull(garage));

        // adding cars
        garageService.addCar(garage, car);
        garageService.addCar(garage, car2);

        // filter electric cars
        System.out.println(garageService.filterElectric(garage));
        // filter non-electric cars
        System.out.println(garageService.filterNonElectric(garage));

        // clean garage
       garageService.cleanGarage(garage);

        // writing stored cars data to file
        GarageDAO garageDAO = new GarageDAO();
        garageDAO.postMapping(garage);

        // reading garage
        garageDAO.readGarage(garage);


        System.out.println("------------------------");

        // findByManufacturer
        System.out.println(garageDAO.findByManufacturer(garage, "bmw"));

        System.out.println("------------------------");

        //findByRegNum
        System.out.println(garageDAO.findByRegNum(garage, "0905"));
    }
}

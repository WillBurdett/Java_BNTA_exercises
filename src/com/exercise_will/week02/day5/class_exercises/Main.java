package com.exercise_will.week02.day5.class_exercises;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // creating some cars
        Car car1 = new Car(Manufacturer.BMW, 250_000.00, Colour.BLACK, EngineType.PETROL);
        Car car2 = new Car(Manufacturer.TESLA, 500_000.00, Colour.SILVER, EngineType.ELECTRIC);
        Car car3 = new Car(Manufacturer.TOYOTA, 50_000.00, Colour.RED, EngineType.HYBRID);

        // Creates an empty dealership with correct capacity
        CarDealership carDealership = new CarDealership("Trucks and Yucks", "Alabama", 2);
        // sets the dealerships array to the size of the max capacity
        carDealership.setCarsInStock(new Car[carDealership.getMaxCars()]);


        System.out.println("Our empty Car Dealership.");
        System.out.println("There are currently "

                // returns num of cars in dealership
                + CarDealershipService.numCars(carDealership)
                + " car(s) in the dealership");
        System.out.println(carDealership.getName()

                // prints the dealerships garage, which is currently null
                + " garage: " + Arrays.toString(carDealership.getCarsInStock()));
        System.out.println("------------------------------\n");


        System.out.println("Add one car to our dealership:");
        // Adding the first car
        CarDealershipService.addCar(car1, carDealership);
        System.out.println("There are currently "

                // returns num of cars in dealership
                + CarDealershipService.numCars(carDealership)
                + " car(s) in the dealership");
        System.out.println(carDealership.getName()

                // prints the dealerships garage
                + " garage: " + Arrays.toString(carDealership.getCarsInStock()));
        System.out.println("------------------------------\n");


        System.out.println("Add another car:");
        // Adding the second car
        CarDealershipService.addCar(car2, carDealership);
        System.out.println("There are currently "

                // returns num of cars in dealership
                + CarDealershipService.numCars(carDealership)
                + " car(s) in the dealership");
        System.out.println(carDealership.getName()

                // prints the dealerships garage
                + " garage: " + Arrays.toString(carDealership.getCarsInStock()));
        System.out.println("------------------------------\n");


        // Capacity should to allow another car to be added:
        System.out.println("Attempt to add another car:");
        CarDealershipService.addCar(car3, carDealership);
        System.out.println("------------------------------\n");

        // Proof that the previous car was not added
        System.out.println(carDealership.getName()

                // prints the dealerships garage, which is already full
                + " garage: " + Arrays.toString(carDealership.getCarsInStock()));
        System.out.println("------------------------------\n");

        // Find car by manufacturer
        System.out.println("Find car by manufacturer:");
        CarDealershipService.findCar("tesla", carDealership);
        System.out.println("------------------------------\n");

        // Delete car by manufacturer
        System.out.println("Delete car by manufacturer:");
        CarDealershipService.removeCar("bmw", carDealership);
        System.out.println("------------------------------\n");


        // Garage after removing car
        System.out.println(carDealership.getName() + " garage:");
        System.out.println(Arrays.toString(carDealership.getCarsInStock()));

    }
}

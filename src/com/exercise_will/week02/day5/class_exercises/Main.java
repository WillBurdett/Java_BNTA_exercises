package com.exercise_will.week02.day5.class_exercises;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(Manufacturer.BMW, 250_000.00, Colour.BLACK, EngineType.PETROL);
        Car car2 = new Car(Manufacturer.TESLA, 500_000.00, Colour.SILVER, EngineType.ELECTRIC);
        Car car3 = new Car(Manufacturer.TOYOTA, 50_000.00, Colour.RED, EngineType.HYBRID);

        // Creates an empty dealership with correct capacity
        CarDealership emptyCarDealership = new CarDealership("Alabama", "Trucks and Yucks", 2);
        emptyCarDealership.setCarsInStock(new Car[emptyCarDealership.getMaxCars()]);


        System.out.println("Create an empty Car Dealership");
        System.out.println(CarDealershipService.numCars(emptyCarDealership));
        System.out.println(Arrays.toString(emptyCarDealership.getCarsInStock()));
        System.out.println("_____________________\n");

        System.out.println("Add car:");
        CarDealershipService.addCar(car1, emptyCarDealership);

        System.out.println(CarDealershipService.numCars(emptyCarDealership));
        System.out.println(Arrays.toString(emptyCarDealership.getCarsInStock()));
        System.out.println("_____________________\n");

        System.out.println("Add another car:");
        CarDealershipService.addCar(car2, emptyCarDealership);

        System.out.println(CarDealershipService.numCars(emptyCarDealership));
        System.out.println(Arrays.toString(emptyCarDealership.getCarsInStock()));
        System.out.println("_____________________\n");

        System.out.println("Attempt to add another car but reaches max capacity:");
        CarDealershipService.addCar(car2, emptyCarDealership);
        System.out.println(CarDealershipService.numCars(emptyCarDealership));
        System.out.println(Arrays.toString(emptyCarDealership.getCarsInStock()));





    }
}

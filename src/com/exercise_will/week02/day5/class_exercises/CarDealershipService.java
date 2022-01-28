package com.exercise_will.week02.day5.class_exercises;

public class CarDealershipService {

    public static int numCars(CarDealership carDealership){
        int counter = 0;
        for (Car c : carDealership.getCarsInStock()){
            if (c != null){
                counter++;
            }
        }
        return counter;
    }

    public static void addCar(Car car, CarDealership carDealership){
        boolean carAdded = false;
        for (int i = 0; i < carDealership.getCarsInStock().length; i++){
            if (carDealership.getCarsInStock()[i] == null){
                carDealership.getCarsInStock()[i] = car;
                carAdded = true;
                break;
            }
        }
        if (carAdded == false){
            System.out.println(carDealership.getName() + " is full.");
        }
    }

}

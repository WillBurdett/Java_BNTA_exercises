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
                carDealership.getCarsInStock()[i] = car; // getter because you don't want to pass in a new array
                carAdded = true;
                break;
            }
        }
        if (carAdded == false){
            System.out.println(carDealership.getName() + " is full.");
        }
    }

    public static Car findCar(String id, CarDealership carDealership){
        boolean carFound = false;
        for (Car c : carDealership.getCarsInStock()){
            if (id.toUpperCase().equals(c.getManufacturer().toString())){
                carFound = true;
                System.out.println(c);
                return c;
            }
        }
        if (carFound == false){
            System.out.println(carDealership.getName() + " does not have that car in stock.");
        }
        return null;
    }

    public static void removeCar(String id, CarDealership carDealership){
        boolean carFound = false;
        for (int i=0; i < carDealership.getCarsInStock().length; i++){
            try {
                if (carDealership.getCarsInStock()[i].getManufacturer().toString().equals(id.toUpperCase())){
                    carDealership.getCarsInStock()[i] = null;
                    carFound = true;
                }
            } catch (Exception e){
                System.out.println("Empty space");
            }
        }
        if (carFound == false){
            System.out.println(carDealership.getName() + " does not have that car in stock.");
        }
    }
}

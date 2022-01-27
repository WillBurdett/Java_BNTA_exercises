package com.exercise_will.week02.day2.classes_files_exercises.Exercise3;

public class GarageService {
    public static void addCar(Garage garage, Car car){
        if (garage.getAvailableCars().size() < garage.getMaxCapacity()){
            garage.getAvailableCars().add(car);
        } else if (garage.getAvailableCars().size() >= garage.getMaxCapacity()){
            System.out.println("This garage has reached its maximum capacity of " + garage.getMaxCapacity() + ".");
        }
    }
    public static void rentCar(Garage garage, Car car){
        if (garage.getAvailableCars().contains(car)){
            garage.getAvailableCars().remove(car);
            garage.getRentedCars().add(car);
        }
    }
}

package com.exercise_will.week03.day1.garage_classes_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarageService {
    // This class performs all business logic for the following
    // 1. add cars
    // 2. how many cars
    // 3. number of free spots
    // 4. remove car
    // 5. Open and close garage
    // 6. is Garage full?
    // 7. filter electric
    // 8. filter non-electric
    // 9. Clean Garage
    // 10. Create class GarageDAO - store current cars in garage to file
    // 11. create second method to read cars from file

    public void addCar(Garage garage, Car car) {
        boolean carAdded = false;
        for (int i = 0; i < garage.getCars().length; i++) {
            if (garage.getCars()[i] == null) {
                garage.getCars()[i] = car; // getter because you don't want to pass in a new array
                carAdded = true;
                break;
            }
        }
        if (carAdded == false) {
            System.out.println(garage.getGarageNumber() + " is full.");
        }
    }

    public int carCount(Garage garage){
        int count = 0;
        for (Car car : garage.getCars()){
            if (car != null){
                count++;
            }
        }
        return count;
    }

    public int freeSpots(Garage garage){
        return garage.getCapacity() - carCount(garage);
    }

    public void removeCar(Garage garage, Car car){
        boolean carFound = false;
        for (int i = 0; i < garage.getCars().length; i++) {
            if (garage.getCars()[i] == null){
                continue;
            }
            if (garage.getCars()[i].getRegNumber() == car.getRegNumber()){
                garage.getCars()[i] = null;
                carFound = true;
            }
        }
        if (carFound == false){
            System.out.println("Car is not in garage.");
        }
    }

    public void closeGarage(Garage garage){
        garage.setOpen(false);
        System.out.println("Garage " + garage.getGarageNumber() + " closed!");
    }
    public void openGarage(Garage garage){
        garage.setOpen(true);
        System.out.println("Garage " + garage.getGarageNumber() + " open!");
    }

    public boolean isFull(Garage garage){
        if (freeSpots(garage) > 0){
            return false;
        }
        return true;
    }

    public List<Car> filterElectric(Garage garage){
        List<Car> electric = new ArrayList<>();
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            } else if (car.isElectric()){
                electric.add(car);
            }
        }
        return electric;
    }


    public List<Car> filterNonElectric(Garage garage) {
        List<Car> nonElectric = new ArrayList<>();
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            } else if (!car.isElectric()){
                nonElectric.add(car);
            }
        }
        return nonElectric;
    }

    public void cleanGarage(Garage garage){

        System.out.println("Garage " + garage.getGarageNumber() + " before cleaning:\n" + Arrays.toString(garage.getCars()));

        Garage outside = new Garage(
                garage.getOwner(),
                garage.getGarageNumber(),
                garage.getCapacity(),
                null,
                garage.isOpen()
        );

        for (Car car : garage.getCars()){
            if (car != null){
                removeCar(garage, car);
                addCar(outside, car);
            }
        }
        System.out.println("Garage " + garage.getGarageNumber() + " has been cleaned:\n" + Arrays.toString(garage.getCars()));
        for (Car car : outside.getCars()){
            if (car != null){
                removeCar(outside, car);
                addCar(garage, car);
            }
        }
        System.out.println("Garage " + garage.getGarageNumber() + " has been re-populated:\n" + Arrays.toString(garage.getCars()));
    }
}

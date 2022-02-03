package com.exercise_will.week02.day2.classes_files_exercises.Exercise3;

import java.util.List;
import java.util.Objects;

public class Garage {
    private List<Car> availableCars;
    private List<Car> rentedCars;
    private int maxCapacity;

    public Garage(List<Car> availableCars, List<Car> rentedCars, int maxCapacity) {
        this.availableCars = availableCars;
        this.rentedCars = rentedCars;
        this.maxCapacity = maxCapacity;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(List<Car> rentedCars) {
        this.rentedCars = rentedCars;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "availableCars=" + availableCars +
                ", rentedCars=" + rentedCars +
                ", maxCapacity=" + maxCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return maxCapacity == garage.maxCapacity && Objects.equals(availableCars, garage.availableCars) && Objects.equals(rentedCars, garage.rentedCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableCars, rentedCars, maxCapacity);
    }
}

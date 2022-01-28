package com.exercise_will.week02.day5.class_exercises;

import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String name;
    private String location;
    private int maxCars;
    private Car[] carsInStock;

    public CarDealership() {
    }

    public CarDealership(String name, String location, int maxCars) {
        this.name = name;
        this.location = location;
        this.maxCars = maxCars;
    }

    public CarDealership(String name, String location, int maxCars, Car[] carsInStock) {
        this.name = name;
        this.location = location;
        this.maxCars = maxCars;
        this.carsInStock = carsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", maxCars=" + maxCars +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return maxCars == that.maxCars && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, location, maxCars);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }
}

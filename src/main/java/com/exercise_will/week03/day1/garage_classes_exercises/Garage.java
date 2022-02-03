package com.exercise_will.week03.day1.garage_classes_exercises;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private Person owner;
    private int garageNumber;
    private int capacity;
    private boolean isOpen;
    private Car[] cars;

    public Garage() {
    }

    public Garage(Person owner, int garageNumber, int capacity, boolean isOpen) {
        this.owner = owner;
        this.garageNumber = garageNumber;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.cars = new Car[capacity]; // sets the size of the array
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getGarageNumber() {
        return garageNumber;
    }

    public void setGarageNumber(int garageNumber) {
        this.garageNumber = garageNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "owner=" + owner +
                ", garageNumber=" + garageNumber +
                ", capacity=" + capacity +
                ", isOpen=" + isOpen +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return garageNumber == garage.garageNumber && capacity == garage.capacity && isOpen == garage.isOpen && Objects.equals(owner, garage.owner) && Arrays.equals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(owner, garageNumber, capacity, isOpen);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}

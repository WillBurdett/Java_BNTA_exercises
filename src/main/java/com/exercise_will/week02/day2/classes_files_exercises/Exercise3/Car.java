package com.exercise_will.week02.day2.classes_files_exercises.Exercise3;

import java.util.Objects;

public class Car {
    private String id;
    private String make;
    private String colour;
    private int capacity;
    private String licensePlate;

    public Car(String id, String make, String colour, int capacity, String licensePlate) {
        this.id = id;
        this.make = make;
        this.colour = colour;
        this.capacity = capacity;
        this.licensePlate = licensePlate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", capacity=" + capacity +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity && Objects.equals(id, car.id) && Objects.equals(make, car.make) && Objects.equals(colour, car.colour) && Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, colour, capacity, licensePlate);
    }
}

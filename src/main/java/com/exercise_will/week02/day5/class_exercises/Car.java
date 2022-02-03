package com.exercise_will.week02.day5.class_exercises;


import java.util.Objects;

// Create a class to represent a car.
// The car should have properties representing the manufacturer, price,
// and engine type (eg. petrol, electric, etc).
public class Car {
    private Manufacturer manufacturer;
    private Double price;
    private Colour colour;
    EngineType engineType;

    public Car(Manufacturer manufacturer, Double price, Colour colour, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.colour = colour;
        this.engineType = engineType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", colour=" + colour +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturer == car.manufacturer && Objects.equals(price, car.price) && colour == car.colour && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, colour, engineType);
    }
}

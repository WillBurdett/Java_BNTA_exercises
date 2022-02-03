package com.exercise_will.week03.day1.garage_classes_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat; // make sure to import this

class GarageServiceTest {

    @Test
    void canAddCarToGarage() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person person = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(person, 10, 2, true);


        // When

        garageService.addCar(garage,car);

        //Then
        assertThat(garage.getCars()).contains(car);
        assertThat(garage.getCars()).containsNull();

        // can also check containsExactly().
        // containsOnlyNulls
        // isEmpty() is great for lists
    }

    @Test
    void carCount() {
        // Given
        GarageService garageService = new GarageService();
        Car car = new Car("Honda", "1234", false);
        Car[] cars = {car};
        Person person = new Person("Connie", 24, "", cars);
        Garage garage = new Garage(person, 10, 2, true);
        // Add one car to empty garage
       garageService.addCar(garage, car);

        // When
        int actual = garageService.carCount(garage);

        //Then
        int expected = 1;
        assertThat(actual).isEqualTo(expected);


        // can also check containsExactly().
        // containsOnlyNulls
        // isEmpty() is great for lists
    }

    @Test
    void freeSpots() {
    }

    @Test
    void removeCar() {
    }

    @Test
    void closeGarage() {
    }

    @Test
    void openGarage() {
    }

    @Test
    void isFull() {
    }

    @Test
    void filterElectric() {
    }

    @Test
    void filterNonElectric() {
    }

    @Test
    void cleanGarage() {
    }
}
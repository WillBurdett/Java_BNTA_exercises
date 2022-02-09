package com.exercise_will.week04.interfaces;

public class Car implements Vehicle{

    @Override
    public void move() {
        System.out.println("Start engine...");
        System.out.println("Get in gear...");
        System.out.println("Accelerate!");
    }

    @Override
    public void applyBrake() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}

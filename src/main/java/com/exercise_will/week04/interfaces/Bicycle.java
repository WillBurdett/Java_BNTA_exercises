package com.exercise_will.week04.interfaces;

public class Bicycle implements Vehicle{

    @Override
    public void move() {
        System.out.println("Pedal!");
    }

    @Override
    public void applyBrake() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}

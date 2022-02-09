package com.exercise_will.week04.interfaces;

public class ElectricScooter implements Vehicle{

    @Override
    public void move() {
        System.out.println("Push off");
        System.out.println("Press button");
    }

    @Override
    public void applyBrake() {

    }

    @Override
    public double getCurrentSpeed() {
    return 0;
    }
}

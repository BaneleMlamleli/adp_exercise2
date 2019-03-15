package com.adp_exercise2;

public class Bus extends Vehicle {

    @Override
    public void move() {
        System.out.println("Bus is moving very fast");
    }

    @Override
    public void wheels() {
        System.out.println("Bus has eight wheels");
    }
}

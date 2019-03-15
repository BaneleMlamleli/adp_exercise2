package com.adp_exercise2;

public class Vehicle implements VehicleInterface {
    @Override
    public void move() {
        System.out.println("This bitch can move ya'll");
    }

    @Override
    public void wheels() {
        System.out.println("There is wheels up in this bitch!!");
    }
}
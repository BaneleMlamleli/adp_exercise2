package com.adp_exercise2.core_oop_principles;

public class Vehicle implements VehicleInterface {
    @Override
    public void move() {
        System.out.println("This bitch can move y'all");
    }

    @Override
    public void wheels() {
        System.out.println("There is wheels up in this bitch!!");
    }
}
package com.adp_exercise2.core_oop_principles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String busCompanyName = "MyCiti";
        int maximumSpeed = 160;
        Vehicle vehicle = new Vehicle();
        Vehicle bus = new Bus(busCompanyName);
        Vehicle quadbike = new Quadbike(maximumSpeed);

        bus.move();
        bus.wheels();
        quadbike.move();
        quadbike.wheels();
    }
}

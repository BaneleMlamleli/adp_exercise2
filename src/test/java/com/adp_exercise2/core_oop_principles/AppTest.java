package com.adp_exercise2.core_oop_principles;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static Vehicle vehicle;
    private static Vehicle bus;
    private static Vehicle quadbike;

    String busCompanyName = "MyCiti";
    int maximumSpeed = 160;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle();
        bus = new Bus(busCompanyName);
        quadbike = new Quadbike(maximumSpeed);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public static void main( String[] args )
    {
        bus.move();
        bus.wheels();
        quadbike.move();
        quadbike.wheels();
    }
}

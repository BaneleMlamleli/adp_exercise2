package com.adp_exercise2.core_oop_principles;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
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

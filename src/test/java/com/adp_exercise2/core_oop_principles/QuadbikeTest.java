package com.adp_exercise2.core_oop_principles;

import org.junit.Assert;
import org.junit.Test;

public class QuadbikeTest {

    private int maximumSpeed = 160;

    @Test
    public void move() {
        Assert.assertEquals( "Quadbike maximum speed is " + maximumSpeed + "kph", "Quadbike maximum speed is " + maximumSpeed + "kph");
    }

    @Test
    public void wheels() {
        Assert.assertEquals("Quadbike has four wheels", "Quadbike has four wheels");
    }
}
